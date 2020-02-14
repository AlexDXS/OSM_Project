package utils;

import io.restassured.path.xml.XmlPath;
import static io.restassured.RestAssured.given;

public class Sender {
    public Sender() {
    }

    public XmlPath sendPostRequestXml(String data) {
        XmlPath xmlPath = given()
                .body(data)
                .when()
                .post("/post_request")
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .xmlPath();
        return xmlPath;
    }
}
