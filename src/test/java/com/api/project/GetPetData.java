
package com.api.project;

import gherkin.deps.com.google.gson.JsonArray;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;


public class GetPetData {


    public void getPetData() throws IOException {

        CloseableHttpClient httpClient = HttpClients.createDefault();

        try {
            HttpGet request = new HttpGet("https://petstore.swagger.io/v2/pet/findByStatus?status=available");
            // add request header
            CloseableHttpResponse response = httpClient.execute(request);
            try {
                // Get HttpResponse Status
                HttpEntity entity = (HttpEntity) response.getEntity();
                if (entity != null) {
                    // return it as a String
                    String result = EntityUtils.toString(entity);
                    //JSONObject result = new JSONObject(retSrc); //Convert String to JSON Object
                    //
                    //             JSONArray tokenList = result.getJSONArray("names");
                    System.out.println(result.toString());
                    return ;
                }

            } finally {
                response.close();
            }
        } finally {
            httpClient.close();
        }

    }



}




