package com.conversormonedas.consumirapi;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;

//imports para la conexión de la api
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumirApi {

    String apiKey = "f16d2fdeceaa60f461b91e1a";

    public void convertirMonedas(String monedaOrigen, String monedaDestino, double monto) throws IOException {
        System.out.println("usted ha seleccionado convertir: "+monedaOrigen+" a "+monedaDestino+" el monto: "+monto);

        //construye la url de conexión
        String urlApi = "https://v6.exchangerate-api.com/v6/"+apiKey+"/pair/"+monedaOrigen+"/"+monedaDestino+"/"+monto;
        System.out.println("Creando URL de conexión...: "+urlApi);

        // Crear cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        // Crear solicitud HTTP GET
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlApi))
                .GET()
                .build();

        try {
            // Enviar solicitud y obtener respuesta como String
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Imprimir código de estado
            System.out.println("Código de respuesta: " + response.statusCode());

            // Procesar JSON con Gson
            Gson gson = new Gson();
            JsonObject json = gson.fromJson(response.body(), JsonObject.class);

            // Extraer campos relevantes para presentarlos en la respuesta al cliente
            String baseCode = json.get("base_code").getAsString();
            String targetCode = json.get("target_code").getAsString();
            double rate = json.get("conversion_rate").getAsDouble();
            double result = json.get("conversion_result").getAsDouble();

            // Imprimir resultados en orden
            System.out.println("\n--- Resultado de Conversión ---");
            System.out.println("Moneda Origen     : " + baseCode);
            System.out.println("Moneda Destino    : " + targetCode);
            System.out.println("Tasa de Conversión: " + rate);
            System.out.println("Resultado         : " + result);

        } catch (IOException | InterruptedException e) {
            System.err.println("Error al conectar con la API: " + e.getMessage());
        }

        /*inicio de código de prueba*/
        /*// Crear cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        // Crear solicitud HTTP GET
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlApi))
                .GET()
                .build();

        try {
            // Enviar solicitud y obtener respuesta como String
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Imprimir código de estado
            System.out.println("Código de respuesta: " + response.statusCode());

            // Imprimir cuerpo de la respuesta (JSON)
            System.out.println("Respuesta JSON:");
            System.out.println(response.body());

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }*/
        /*fin código de prueba*/

    }
}
