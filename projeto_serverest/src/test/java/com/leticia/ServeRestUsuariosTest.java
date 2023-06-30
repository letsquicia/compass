package com.leticia;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

public class ServeRestUsuariosTest {

        @Before
        public void beforeAllTests() {
                RestAssured.baseURI = "http://localhost";
                RestAssured.port = 3000;
        }

        @Test
        public void deveRetornarListaDeUsuarios() {

                Response response = when()
                                .get("/usuarios")
                                .then()
                                .statusCode(200)
                                .log()
                                .all()
                                .extract()
                                .response();

                // Extraindo a lista de usuarios da response e armazenando na variavel
                // 'usuarios'
                List<Map<String, Object>> usuarios = response.jsonPath().getList("usuarios");

                // for each para percorrer a lista e realizar a validação se há campos nulos com
                // assertNotNull
                for (Map<String, Object> usuario : usuarios) {
                        assertNotNull(usuario.get("nome"));
                        assertNotNull(usuario.get("email"));
                        assertNotNull(usuario.get("password"));
                        assertNotNull(usuario.get("administrador"));
                }

                // Verificando se a lista não está vazia
                int quantidade = response.jsonPath().getInt("quantidade");
                assertTrue(quantidade > 0);
                assertEquals(quantidade, usuarios.size());
                System.out.println("Quantidade de usuários validados:" + quantidade);

        }

        @Test
        public void deveRetornarQuantidadeUsuariosCampoNomeEmBranco() {

                // Buscando todos os usuarios e guardando na variavel response
                Response response = when()
                                .get("/usuarios");

                // procurando os usuarios com nome em branco ou nulo e obtendo quantidade
                List<String> usuariosCampoNomeBranco = response
                                .path("usuarios.findAll { it.nome.isBlank() }.nome");

                int qtdUsuariosCampoNomeBranco = usuariosCampoNomeBranco.size();
                assertTrue(qtdUsuariosCampoNomeBranco >= 0);

                // verificação do status code
                response.then()
                                .statusCode(200)
                                .log().all();

                System.out.println("Quantidade de usuários com o campo nome em branco: " + qtdUsuariosCampoNomeBranco);

        }

        @Test
        public void deveRetornarQuantidadeUsuariosCampoPasswordInvalido() {

                // Fazendo a requisição e armazenando na response
                Response response = given()
                                .get("/usuarios")
                                .then()
                                .statusCode(200)
                                .extract()
                                .response();
                // criando objeto JsonPath para receber a response
                JsonPath jsonPath = response.jsonPath();

                // Lógica para obter a lista de senhas invalidas (em branco, maior que 10 ou
                // menor que 5)
                List<String> usuariosCampoPasswordBranco = jsonPath
                                .getList("usuarios.findAll { it.password.isBlank() }.password");
                List<String> usuariosSenhaMaiorQue10Carac = jsonPath
                                .getList("usuarios.findAll { it.password.length() > 10 }.password");
                List<String> usuariosSenhaMenorQue5Carac = jsonPath
                                .getList("usuarios.findAll { it.password.length() < 5 }.password");

                // Pegando a quantidade e armazenando em uma variavel
                int qtdUsuariosCampoPasswordBranco = usuariosCampoPasswordBranco.size();
                int qtdUsuariosSenhaMaiorQue10Carac = usuariosSenhaMaiorQue10Carac.size();
                int qtdUsuariosSenhaMenorQue5Carac = usuariosSenhaMenorQue5Carac.size();

                System.out.println("Quantidade de usuários com o campo senha em branco: "
                                + qtdUsuariosCampoPasswordBranco);
                System.out.println(
                                "Quantidade de usuários com a senha maior que 10 caracteres: "
                                                + qtdUsuariosSenhaMaiorQue10Carac);
                System.out.println(
                                "Quantidade de usuários com a senha menor que 5 caracteres: "
                                                + qtdUsuariosSenhaMenorQue5Carac);

                // Verificação se as quantidades são maiores que zero
                assertTrue(qtdUsuariosCampoPasswordBranco > 0);
                assertTrue(qtdUsuariosSenhaMaiorQue10Carac > 0);
                assertTrue(qtdUsuariosSenhaMenorQue5Carac > 0);

        }

        @Test
        public void deveRetornarQuantidadeUsuariosCampoEmailInvalido() {

                // Fazendo a requisição e armazenando na response
                Response response = given()
                                .get("/usuarios")
                                .then()
                                .statusCode(200)
                                .extract()
                                .response();
                // criando objeto JsonPath para receber a response
                JsonPath jsonPath = response.jsonPath();

                // Lógica para obter os emails hotmail e gmail utilizando uma expressão regular
                List<String> usuariosEmailHotmail = jsonPath
                                .getList("usuarios.findAll { it.email =~ /.*@hotmail\\.com/ }.email");
                List<String> usuariosEmailGmail = jsonPath
                                .getList("usuarios.findAll { it.email =~ /.*@gmail\\.com/ }.email");

                // Armazenando a quantidade em uma variavel
                int qtdUsuariosEmailHotmail = usuariosEmailHotmail.size();
                int qtdUsuariosEmailGmail = usuariosEmailGmail.size();

                System.out.println("Quantidade de usuarios com email hotmail: " + qtdUsuariosEmailHotmail);
                System.out.println("Quantidade de usuários com email gmail: " + qtdUsuariosEmailGmail);
        }

        @Test
        public void deveRetornarUsuarioPorId() {
                String id = "0uxuPY0cbmQhpEz1";

                given()
                .pathParam("id", id).when().get("/usuarios/{id}").then().assertThat().statusCode(200)
                .and()
                .body("nome", equalTo("Fulano da Silva"))
                .body("email", equalTo("fulano@qa.com"))
                .body("nome", not(blankOrNullString())) // verifica se o campo nome está em branco
                .body("email", matchesRegex("^\\S+@\\S+\\.\\S+$")) // verifica se o email é valido c expressão regular
                .and()
                .body("password.length()", greaterThanOrEqualTo(5)) // verifica tamanho da senha
                .body("password.length()", lessThanOrEqualTo(10))
                .body("password", matchesRegex("^[a-zA-Z0-9!@#$%^&*()-_=+]+$")) // verifica se a senha contem caracteres  alfanumericos e simbolos
                .log().all();

        }

        @Test
        public void deveCriarNovoUsuario() {

                // instanciamento da classe faker e geração de valores aleatorios armazenados em
                // variaveis
                Faker faker = new Faker();
                String nome = faker.name().fullName();
                String email = faker.internet().emailAddress();
                String password = faker.internet().password();
                boolean administrador = true;

                // setando os campos na classe UsuarioPayload
                UsuarioPayload payload = new UsuarioPayload();
                payload.setNome(nome);
                payload.setEmail(email);
                payload.setPassword(password);
                payload.setAdministrador(administrador);

                // Criando um usuario e armazenando retorno no objeto 'response'
                Response response = given()
                                .body(payload)
                                .contentType(ContentType.JSON)
                                .when()
                                .post("/usuarios")
                                .then()
                                .log().all()
                                .statusCode(201)
                                .body("message", equalTo("Cadastro realizado com sucesso"))
                                .extract().response();

                // IdUsuario recebe Id gerado na criação do usuario
                String IdUsuario = response.jsonPath().getString("_id");

                // Verificação se o novo usuário foi criado corretamente, armazenando a response
                // na variavel getUsuarioCriado
                Response getUsuarioCriado = given()
                                .pathParam("_id", IdUsuario)
                                .when()
                                .get("/usuarios/{_id}")
                                .then()
                                .log().all()
                                .statusCode(200)
                                .extract().response();

                // armazenando valor dos campos em uma variavel para realizar as validações
                String nomeDoUsuario = getUsuarioCriado.jsonPath().getString("nome");
                String emailDoUsuario = getUsuarioCriado.jsonPath().getString("email");
                String passwordDoUsuario = getUsuarioCriado.jsonPath().getString("password");
                boolean administradorDoUsuario = getUsuarioCriado.jsonPath().getBoolean("administrador");

                // Realizando as validações
                assertEquals(nome, nomeDoUsuario);
                assertEquals(email, emailDoUsuario);
                assertEquals(password, passwordDoUsuario);
                assertEquals(administrador, administradorDoUsuario);

        }

        @Test
        public void deveAlterarCadastroDeUsuario() throws JsonProcessingException {

                // Criando objeto payload e setando variaveis
                UsuarioPayload payload = new UsuarioPayload();
                payload.setNome("Fulano da Silva");
                payload.setEmail("fulano@qa.com");
                payload.setPassword("1234567");
                payload.setAdministrador(true);

                // Variavel que armazena o ID do usuário que sera alterado ou criado
                String idUsuario = "0uxuPY0cbmQhpEz1";

                // Configurando ObjectMapper para serializar o payload em formato JSON
                ObjectMapper objectMapper = new ObjectMapper();
                objectMapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
                String jsonPayload = objectMapper.writeValueAsString(payload); // objeto payload é convertido em uma
                                                                               // string JSON

                // Envio da requisição para alterar o usuario a partir do ID estatico
                given().body(jsonPayload).contentType(ContentType.JSON).when().put("/usuarios/{id}", idUsuario).then()
                                .statusCode(anyOf(equalTo(201), equalTo(200), equalTo(400))).log().all().and()
                                .body("message", anyOf(equalTo("Cadastro realizado com sucesso"),
                                                equalTo("Registro alterado com sucesso"),
                                                equalTo("Este email já está sendo usado")));
        }

        @Test
        public void deveDeletarUsuario() {

                // Gerando um usuario para exclusão
                // instanciamento da classe faker e geração de valores aleatorios armazenados em
                // variaveis
                Faker faker = new Faker();
                String nome = faker.name().fullName();
                String email = faker.internet().emailAddress();
                String password = faker.internet().password();
                boolean administrador = false;

                // setando os campos na classe UsuarioPayload
                UsuarioPayload payload = new UsuarioPayload();
                payload.setNome(nome);
                payload.setEmail(email);
                payload.setPassword(password);
                payload.setAdministrador(administrador);

                // Criando um usuário e armazenando o id na variavel idParaExcluir
                String idParaExcluir = given()
                                .body(payload).contentType(ContentType.JSON)
                                .when().post("/usuarios").then()
                                .log().all()
                                .statusCode(201)
                                .and()
                                .body("message", equalTo("Cadastro realizado com sucesso"))
                                .and()
                                .extract()
                                .path("_id");

                // Realizando exclusão
                given()
                                .pathParam("id", idParaExcluir)
                                .when()
                                .delete("/usuarios/{id}")
                                .then()
                                .log().all()
                                .statusCode(200)
                                .body("message", equalTo("Registro excluído com sucesso"));
        }

        @Test
        public void deveRetornarErroAoDeletarUsuarioComCarrinho() {
                String idParaExcluir = "0uxuPY0cbmQhpEz1";

                given()
                                .pathParam("id", idParaExcluir)
                                .when()
                                .delete("/usuarios/{id}")
                                .then()
                                .log().all()
                                .statusCode(400)
                                .body("message", equalTo("Não é permitido excluir usuário com carrinho cadastrado"));
        }
}
