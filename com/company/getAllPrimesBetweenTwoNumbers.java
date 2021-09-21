package com.company;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class getAllPrimesBetweenTwoNumbers {
    public static void main(String[] args) {
        
        //create our client
        HttpClient client = HttpClient.newHttpClient();

        String apiKey = "123";
        String base_url = "http://api.prime-numbers.io";
        String start = "350";
        String end = "450";
        String forced_number = "401";
        String include_explanations = "true";
        String include_prime_types_list = "true";
        String language = "english";

        //build request using our URL
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(base_url + "/get-all-primes-between-two-numbers.php?key=" + apiKey + "&include_explanations=" + include_explanations + "&include_prime_types_list=" + include_prime_types_list + "&start=" + start + "&end=" + end + "&forced_number=" + forced_number + "&language=" + language)).build();

        //send request, apply methods, return results
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
            .thenApply(HttpResponse::body)
            .thenAccept(System.out::println)
            .join();
}
}
