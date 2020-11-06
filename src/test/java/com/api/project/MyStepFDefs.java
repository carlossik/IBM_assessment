package com.api.project;

import com.mashape.unirest.http.exceptions.UnirestException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.deps.com.google.gson.JsonArray;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;


public class MyStepFDefs {

        @Given("I request pet information from the API")
        public void i_request_pet_information_from_the_API() throws IOException, UnirestException {

                PetDataUnirest unirest = new PetDataUnirest();
                unirest.petDataUnirest();


//                GetPetData getdata = new GetPetData();
//                getdata.getPetData();


        }

        @When("I request for the number of available pets with status {string}")
        public void i_request_for_the_number_of_available_pets_with_status(String string) throws IOException {








        }

        @Then("I receive a response with the number of pets with statuses  {string}")
        public void i_receive_a_response_with_the_number_of_pets_with_statuses(String string) {

        }

        @When("I request for name of pets available")
        public void i_request_for_name_of_pets_available() {

        }

        @Then("I receive a response with the number of pets")
        public void i_receive_a_response_with_the_number_of_pets() {

        }

        @Then("The name of the pet  should be {string}")
        public void the_name_of_the_pet_should_be(String string) {

        }

}


