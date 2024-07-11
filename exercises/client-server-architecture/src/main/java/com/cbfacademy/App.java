package com.cbfacademy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello World!");
    try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
        URL myURL = new URL ("https://codingblackfemales.com/academy");
        URLConnection myURLConnection = myURL.openConnection();
        myURLConnection.connect();
        String contentType = myURLConnection.getContentType();
        System.out.println(contentType);
    }
    catch (MalformedURLException e){
        System.out.println(e.getMessage());
    }
    catch (IOException e){
        System.out.println(e.getMessage());
    }

    
    
    }
}
