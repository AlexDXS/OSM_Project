package utils;

import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Sender {
    public Sender() {
    }

    public XmlPath sendPostRequestXml(String data) {
        Response response = given().
                body(data).
                post("/post_request");
        String xml = response.body().asString();
        XmlPath xmlPath = new XmlPath(xml);
        return xmlPath;
    }
}
