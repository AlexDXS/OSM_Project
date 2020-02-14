package openStreetMap;

import io.restassured.RestAssured;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import utils.Sender;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ApiTests {

    @Before
    public void configureRestAssured() {
        RestAssured.baseURI = "http://overpass-api.de/api/interpreter";
        RestAssured.requestSpecification = given()
                .header("Language", "en");
    }

    @Test
    public void checkNearestPlaces() {
        String data = "node\n" +
                "  (around:1000,59.93184935,30.267511449853)\n" +
                "  [\"amenity\"=\"bar\"];\n" +
                "out;";
        List<String> placeIds = new Sender().sendPostRequestXml(data).getList("osm.node.@id");
        Assert.assertTrue("No necessary places in your coordinates", placeIds.size() > 0);
    }
}
