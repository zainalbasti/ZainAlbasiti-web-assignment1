/*
 *
 * *****************************************************************************
 *  * Copyright ©2020 Mawdoo3. All rights reserved
 *  *  —————————————————————————————————
 *  *  NOTICE: All information contained herein is a property of Mawdoo3.
 *  *****************************************************************************
 *
 *
 */

package org.maf.utils.rest_assured;

import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.HashMap;

public class PutApiHelper {

    public static Response put(String apiUrl, JsonObject requestBody) throws InvalidResponseException {
        if (ResponseHandler.isNotNullOrEmpty(apiUrl)) {
            return RestAssured.given().that().header("content-type", "application/json")
                    .body(requestBody.toString()).when().put(apiUrl);
        } else {
            throw new InvalidResponseException(ApiConstants.INVALID_EMPTY_URL_ERROR);
        }
    }

    public static Response put(String apiUrl, HashMap<String, String> headers, JsonObject requestBody) throws InvalidResponseException {
        if (ResponseHandler.isNotNullOrEmpty(apiUrl)) {
            return RestAssured.given().that()
                    .headers(headers)
                    .body(requestBody.toString()).when().put(apiUrl).thenReturn();
        } else {
            throw new InvalidResponseException(ApiConstants.INVALID_EMPTY_URL_ERROR);
        }
    }

    public static Response put(String apiUrl, HashMap<String, String> headers, HashMap<String, String> params) throws InvalidResponseException {
        if (ResponseHandler.isNotNullOrEmpty(apiUrl)) {
            return RestAssured.given().that()
                    .headers(headers)
                    .params(params)
                    .when().put(apiUrl).thenReturn();
        } else {
            throw new InvalidResponseException(ApiConstants.INVALID_EMPTY_URL_ERROR);
        }
    }
}
