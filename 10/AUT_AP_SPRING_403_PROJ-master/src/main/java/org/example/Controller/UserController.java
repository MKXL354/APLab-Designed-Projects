package org.example.Controller;

import com.sun.net.httpserver.HttpExchange;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class UserController extends Controller{
    // get all
    // get one specific entity
    // create
    // update
    // delete
    public static void getUser(HttpExchange exchange) throws IOException {
        String response = "here is all Users";
        exchange.sendResponseHeaders(200, response.length());

        try (OutputStream stream = exchange.getResponseBody()) {
            stream.write(response.getBytes());
        }
    }

    public static void getAUser(HttpExchange exchange) throws IOException {
        String response = "here is userName ";
        exchange.sendResponseHeaders(200, 0);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(exchange.getRequestBody()));
             OutputStream stream = exchange.getResponseBody()) {
            StringBuilder requestBody = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                requestBody.append(line);
            }
            response += requestBody.toString();
            stream.write(response.getBytes());
        }
    }

    public static void creatUser(HttpExchange exchange) throws IOException {
        // create user in db
        String response = "User Created Successfully";
        exchange.sendResponseHeaders(200, response.length());

        try (OutputStream stream = exchange.getResponseBody()) {
            stream.write(response.getBytes());
        }
    }

}
