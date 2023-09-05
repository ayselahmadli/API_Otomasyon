package API_Testing;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;

public class C13_ResponseBodyTestiListKullanimi {
    /*  http://dummy.restapiexample.com/api/v1/employees url’ine bir GET request yolladigimizda
donen Response’in
status code’unun 200,
ve content type’inin Aplication.JSON, ve response body’sindeki
employees sayisinin 24
ve employee’lerden birinin “Ashton Cox”
    ve girilen yaslar icinde 61,21 ve 35 degerinin oldugunu test edin test edin.
     */
    @Test
    public void ListKullanimi(){
        String url="http://dummy.restapiexample.com/api/v1/employees";
        Response response=given().when().get(url);
        response.then().assertThat()
                .statusCode(200)
                .contentType("application/json")
                .body("data.employee_age",hasSize(24),
                        "data.employee_name",hasItem("Ashton Cox"),
                        "data.employee_age",hasItems(61,21,35)
                );
    }
}