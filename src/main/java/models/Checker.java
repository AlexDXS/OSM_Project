package models;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.junit.Test;

public class Checker {
    @Test
    public void sendPost() {
        RestAssured.baseURI = "http://overpass-api.de/api/interpreter";
        RequestSpecification request = RestAssured.given();

        JSONObject paramsForRequest = new JSONObject();
        paramsForRequest.put("amenity", "bar");
        paramsForRequest.put("radius", "1000");
        paramsForRequest.put("lat", "59.9404594");
        paramsForRequest.put("lon", "30.2698457");

        request.body(paramsForRequest.toJSONString());
        Response response = request.post("/post");

        //get("/tags").then().assertThat().body("tags.name", equalTo("красин"));

        //ResponseBody body = response.getBody();
        //CheckerResponse responseBody = body.as(CheckerResponse.class);

        //System.out.println("Response :" + response.asString());
        //System.out.println("Status Code :" + response.getStatusCode());
    }
}

