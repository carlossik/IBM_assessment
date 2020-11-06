package com.api.project;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;


public class PetDataUnirest {


    public void petDataUnirest() throws UnsupportedEncodingException, UnirestException {

        // Host url
        String host = "https://petstore.swagger.io/v2/pet/findByStatus?status=available";
        String charset = "UTF-8";
        // Headers for a request
        String s = "Pulp";
        String query = String.format("s=%s",URLEncoder.encode(s, charset));

        // Params

        // Format query for preventing encoding problems
       // String query = String.format("s=%s",URLEncoder.encode(s, charset));
        HttpResponse <JsonNode> response = Unirest.get(host + query).asJson();
        System.out.println(response.getStatus());
        System.out.println(response.getHeaders().get("Content-Type"));

    }
}
