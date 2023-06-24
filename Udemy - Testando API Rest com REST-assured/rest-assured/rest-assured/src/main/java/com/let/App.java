package com.let;
import org.junit.Assert;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class App {
    public static void main(String[] args) {
        Response response = RestAssured.request(Method.GET, "http://restapi.wcaquino.me/ola");
        Assert.assertTrue(response.getBody().asString().equals("Ola Mundo!"));
        Assert.assertTrue(response.statusCode() == 200);
       // Assert.assertTrue("O status code deveria ser 201" , response.statusCode() == 201);
        Assert.assertEquals(201, response.statusCode() == 201); // compara o esperado da response
        ValidatableResponse validacao = response.then(); // criando um objeto ValidatableResponse para usar os artificios do then() e fazer verificações com mais facilidade
        validacao.statusCode(200); // usando o objeto para validar o retorno do status code 200
    }
}

