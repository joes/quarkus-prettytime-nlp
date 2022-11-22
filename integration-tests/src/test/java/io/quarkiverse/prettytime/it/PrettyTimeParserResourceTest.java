package io.quarkiverse.prettytime.it;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class PrettyTimeParserResourceTest {

    @Test
    public void testPrettyTimeParserEndpoint() {
        given()
                .when().get("/prettyTimeParser")
                .then()
                .statusCode(200)
                .body(containsString(new SimpleDateFormat("yyyy").format(new Date())));
    }
}
