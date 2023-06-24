package com.let;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.AfterParam;
import org.junit.runners.Parameterized.BeforeParam;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.util.Date;

public class ServeRestTest {

    @BeforeParam
    public static void setUp(){
        System.out.println("Estou rodando apenas uma vez antes de todos os testes");
    }

    @Before
    public void rodaVariasVezes(){
        System.out.println("Estou rodando uma vez antes de cada teste");
    }

    @AfterParam
    public static void tearDown() {
        System.out.println("Estou rodando uma vez depois de todos os testes");
    }

    @After
    public void rodaVariasVezesDepois(){
        System.out.println("Estou rodando varias vezes depois de todos os testes");
    }


    

    @Test
    public void deveRetornarListaDeUsuarios(){
        when().
        get("http://localhost:3000/usuarios").
        then().
        assertThat().
        statusCode(200).and().log().all();
    }

    @Test
    public void deveRetornarUsuarioPorId(){
        when().
            get("http://localhost:3000/usuarios/{id}", "0uxuPY0cbmQhpEz1").
        then().
            assertThat().statusCode(200)
            .and()
                .body("nome", equalTo("Fulano da Silva"))
            .and()
                .body("email", equalTo("fulano@qa.com")).log().all();
    }


    @Test
    public void deveCriarNovoUsuario(){
        Date date = new Date();
        String email = date.getTime() + "@qa.com.br";

        String payload = "{ \"nome\": \"Emanoel da Silva\", \"email\":\"" + email + "\", \"password\": \"teste\", \"administrador\": \"true\" }";
  
    given().
        body(payload).contentType(ContentType.JSON).
    when().
        post("http://localhost:3000/usuarios").
    then()
        .log().all().assertThat().statusCode(201).
    and().
        body("message", equalTo("Cadastro realizado com sucesso"));
    }


    @Test
    public void deveAlterarCadastroDeUsuario(){
        String payload = "{ \"nome\": \"Eoooo da rosa\", \"email\": \"emassso@qa.com.br\", \"password\": \"teste\", \"administrador\": \"true\" }";
        given().
            body(payload).
            contentType(ContentType.JSON).
        when().
            put("http://localhost:3000/usuarios/{id}","NAT45Zvdrx8svO4Q").
        then().
            assertThat().
            statusCode(201).
            log().all().
        and().
        body("message", equalTo("Cadastro realizado com sucesso"));
    }


    
    @Test
    public void deveExcluirUsuario(){
        //Gerando usuario para exclusão
        Date date = new Date();
        String email = date.getTime() + "@qa.com.br";

        String payload = "{ \"nome\": \"Emanoel da Silva\", \"email\":\"" + email + "\", \"password\": \"teste\", \"administrador\": \"true\" }";

    String id_para_excluir = 
    given().
        body(payload).contentType(ContentType.JSON).
    when().
        post("http://localhost:3000/usuarios").
    then()
        .log().all().assertThat().statusCode(201).
    and().
        body("message", equalTo("Cadastro realizado com sucesso")).
        and().
        extract().
        path("_id");


        // Lógica do delete 
        when().
            delete("http://localhost:3000/usuarios/{id}",id_para_excluir).
        then().
            assertThat().
            statusCode(200)
        .and().
        body("message",equalTo("Registro excluído com sucesso")).log().all();   
    }

    
}


