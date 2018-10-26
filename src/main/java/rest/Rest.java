package rest;


import io.restassured.response.Response;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class Rest {

    public static void main(String[] args) {
        Response rs = get("http:/www.cbr.ru/scripts/XML_daily.asp");

    }
}
