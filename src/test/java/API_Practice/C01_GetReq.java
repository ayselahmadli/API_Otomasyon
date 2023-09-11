package API_Practice;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C01_GetReq {

    @Test
    public void test01(){

        /*
        url : https://reqres.in/api/users/
        get request
        cevabı yazdırın
         */

        //api'den donen cevap response objesi icine kaydolur

        Response response = given().when().get("https://reqres.in/api/users/");
        response.prettyPrint();
    }

}
