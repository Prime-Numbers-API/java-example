//https://www.oracle.com/java/technologies/downloads/  jdk download link for mac/linux/windows
//https://www.youtube.com/watch?v=KwnavHTOBiA  download and install video -- just in case

// vscode needs the Extension Pack for Java, that should do everything. 

// On the left, when you collapse all your files, there's a dropdown "java projects" that has '+' to create a new java project. 
//You select your location, then in VSCode it will prompt you to give it a project name.
// You have to do that for the file to use all the Java stuff.

// package com.company at the top means you MUST have src/com/company/Main.java  (Main.java is the file that uses the package)  
//--> you can mouse over the red error, and there is often a quick fix option that will do this kind of thing for you

//Oh and right click anywhere in the file, and select 'Run Java' or click the play button at the top right
package com.company;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class getRandomPrime {


    public static void main(String[] args) {
        
            //create our client
            HttpClient client = HttpClient.newHttpClient();

            String apiKey = "YOUR_API_KEY";
            String base_url = "http://api.prime-numbers.io";
            String start = "60309232769";
            String end = "60309232769";
            String forced_number = "60309232769";
            String include_explanations = "true";
            String include_prime_types_list = "true";
            String language = "english";

            //build request using our URL
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(base_url + "/get-random-prime.php?key=" + apiKey + "&include_explanations=" + include_explanations + "&include_prime_types_list=" + include_prime_types_list + "&start=" + start + "&end=" + end + "&forced_number=" + forced_number + "&language=" + language)).build();

            //send request, apply methods, return results
            client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
    }
}