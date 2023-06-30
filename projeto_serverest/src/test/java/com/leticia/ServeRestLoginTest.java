package com.leticia;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ServeRestLoginTest {

    @Before
    public void beforeAllTests() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3000;
    }

    @Test
    public void deveLogarUsuario() throws Exception {

        // Criação de um objeto Map para armazenar o email e senha
        Map<String, String> payload = new HashMap<String, String>();
        payload.put("email", "fulano@qa.com");
        payload.put("password", "1234567");

        // Fazendo o post e armazenando a response na variavel response
        Response response = given()
                .body(payload)
                .contentType(ContentType.JSON)
                .when()
                .post("/login")
                .then()
                .log().all()
                .statusCode(200) 
                .body("authorization", notNullValue()) // Verificar se o token é retornado corretamente
                .extract().response();

        // Armazenando o token na variavel token
        String token = response.then()
                .statusCode(200)
                .body("authorization", notNullValue())
                .extract()
                .path("authorization");

        System.out.println("O token aqui: " + token);
    }

    @Test
    public void deveRetornarErroAoLogarComCredenciaisInvalidas() {

        // Criação de um objeto Map para armazenar o email e senha
        Map<String, String> payload = new HashMap<String, String>();
        payload.put("email", "fulano@naoexisto.com");
        payload.put("password", "1234567");

        given()
                .body(payload)
                .contentType(ContentType.JSON)
                .when()
                .post("/login")
                .then()
                .body("message", equalTo("Email e/ou senha inv\u00E1lidos"))
                .log().all()
                .statusCode(401); // Verificar se o status code esperado é 200 OK

    }

    @Test
    public void deveGerarTokenComPermissaoPCadastrarProdutos() {

        // Criação de um objeto Map para armazenar o email e senha
        Map<String, String> payload = new HashMap<String, String>();
        payload.put("email", "fulano@qa.com");
        payload.put("password", "1234567");

        // Fazendo o post e armazenando a response na variavel response
        Response response = given()
                .body(payload)
                .contentType(ContentType.JSON)
                .when()
                .post("/login")
                .then()
                .log().all()
                .statusCode(200)
                .body("authorization", notNullValue())
                .extract().response();

        // Armazenando o token na variavel token
        String token = response.then()
                .statusCode(200)
                .body("authorization", notNullValue())
                .extract()
                .path("authorization");

        // Realizando uma requisição usando o token para cadastrar um produto
        Map<String, String> produtoPayload = new HashMap<String, String>();
        Faker faker = new Faker();

        produtoPayload.put("nome", faker.commerce().productName());
        produtoPayload.put("preco", String.valueOf(faker.number().randomNumber()));
        produtoPayload.put("descricao", faker.lorem().sentence());
        produtoPayload.put("quantidade", String.valueOf(faker.number().randomNumber()));

        given()
                .header("Authorization", token)
                .body(produtoPayload)
                .contentType(ContentType.JSON)
                .when()
                .post("/produtos")
                .then()
                .log().all()
                .statusCode(201);
    }

    @Test
    public void deveGerarTokenSemPermissaoPCadastrarProdutos() {

        // Criação de um objeto Map para armazenar o email e senha
        Map<String, String> payload = new HashMap<String, String>();
        payload.put("email", "teste@teste.com");
        payload.put("password", "test123");

        // Fazendo o post e armazenando a response na variavel response
        Response response = given()
                .body(payload)
                .contentType(ContentType.JSON)
                .when()
                .post("/login")
                .then()
                .log().all()
                .statusCode(200)
                .body("authorization", notNullValue())
                .extract().response();

        // Armazenando o token na variavel token
        String token = response.then()
                .statusCode(200)
                .body("authorization", notNullValue())
                .extract()
                .path("authorization");

        // Realizando uma requisição usando o token para cadastrar um produto
        Map<String, String> produtoPayload = new HashMap<String, String>();
        Faker faker = new Faker();

        produtoPayload.put("nome", faker.commerce().productName());
        produtoPayload.put("preco", String.valueOf(faker.number().randomNumber()));
        produtoPayload.put("descricao", faker.lorem().sentence());
        produtoPayload.put("quantidade", String.valueOf(faker.number().randomNumber()));

        given()
                .header("Authorization", token)
                .body(produtoPayload)
                .contentType(ContentType.JSON)
                .when()
                .post("/produtos")
                .then()
                .log().all()
                .statusCode(403)
                .body("message", equalTo("Rota exclusiva para administradores"));
    }

}
