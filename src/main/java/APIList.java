import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class APIList {

    void APIOne() {

        Response response = get("https://reqres.in/api/users?page=2");

        System.out.println("Response: " + response.asString());
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Body: " + response.getBody().asString());
        System.out.println("Time taken: " + response.getTime());
        System.out.println("Header: " + response.getHeader("content-type"));

        int statusCode = response.statusCode();
        Assert.assertEquals(statusCode, 200);
    }

    void APITwo() {
        given().
                get("https://reqres.in/api/users?page=2").
                then().
                statusCode(200);
        System.out.println("Success!");
    }

}
