package com.let;

//import static org.junit.Assert.assertThat;

//import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;


public class AppTest {

    @Test
    public void teste() {
        Response response = RestAssured.request(Method.GET, "http://restapi.wcaquino.me/ola");
        Assert.assertTrue(response.getBody().asString().equals("Ola Mundo!"));
        Assert.assertTrue(response.statusCode() == 200);
        Assert.assertTrue("O status code deveria ser 201" , response.statusCode() == 200);
       // Assert.assertEquals(200, response.statusCode() == 200); // compara o esperado da response
        ValidatableResponse validacao = response.then(); // criando um objeto ValidatableResponse para usar os artificios do then() e fazer verificações com mais facilidade
        validacao.statusCode(200); // usando o objeto para validar o retorno do status code 200
    }

    @Test
    public void devoConhecerOutrasFormasRestAssured(){
        Response response = RestAssured.request(Method.GET, "http://restapi.wcaquino.me/ola");
        ValidatableResponse validacao = response.then();
        validacao.statusCode(200);

        //RestAssured.get("http://restapi.wcaquino.me/ola").then().statusCode(200);

        // given() DADO
        // when()  QUANDO
        // then() ENTÃO

        given().when().get("http://restapi.wcaquino.me/ola").then().statusCode(200);
    }

    @Test
    public void devoConhecerMatchersHamcrest(){
      //  assertThat("Maria", Matchers.is("Mariaa"));
    }
}

