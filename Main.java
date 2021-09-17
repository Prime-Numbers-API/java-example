//https://www.oracle.com/java/technologies/downloads/  jdk download link for mac/linux/windows
//https://www.youtube.com/watch?v=KwnavHTOBiA  download and install video -- just in case

// package com.company at the top means you MUST have src/com/company/Main.java  (Main.java is the file that uses the package)  
// vscode needs the Extension Pack for Java, that should do everything. 

// On the left, when you collapse all your files, there's a dropdown "java projects" that has '+' to create a new java project. 
//You select your location, then in VSCode it will prompt you to give it a project name.
// You have to do that for the file to use all the Java stuff.

//Oh and right click anywhere in the file, and select 'Run Java' or click the play button at the top right
package com.company;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Main {


    public static void main(String[] args) {
        
            //create our client
            HttpClient client = HttpClient.newHttpClient();

            //build request using our URL
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/albums")).build();

            //send request, apply methods, return results
            client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
    }
}