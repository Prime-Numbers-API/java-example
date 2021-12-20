package com.company;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class getIsolatedRandomPrime {

    public static void main(String[] args) {
        
        //create our client
        HttpClient client = HttpClient.newHttpClient();

        String apiKey = "YOUR_API_KEY";
        String base_url = "http://api.prime-numbers.io";
        String minimum_combined_prime_gap = "500";
        String forced_number = "60309232769";
        String include_explanations = "true";
        String include_prime_types_list = "true";
        String language = "english";

        //build request using our URL
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(base_url + "/get-isolated-random-prime.php?key=" + apiKey + "&include_explanations=" + include_explanations + "&include_prime_types_list=" + include_prime_types_list + "&minimum_combined_prime_gap=" + minimum_combined_prime_gap + "&language=" + language)).build();

        //send request, apply methods, return results
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
            .thenApply(HttpResponse::body)
            .thenAccept(System.out::println)
            .join();
}
    
}
