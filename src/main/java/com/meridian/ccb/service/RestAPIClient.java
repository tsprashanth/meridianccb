package com.meridian.ccb.service;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class RestAPIClient {

    private String baseUrl = "https://stg.utilities-cloud.oracleindustry.com:443/c215e1/dev01/ccs/rest/apis/customer/v-model";
    private String username = "VS_PTIRU";
    private String password = "Meridianintg10#";


    public String get(String endpoint) throws IOException {
        return executeRequest("GET", endpoint, null);
    }

    public String post(String endpoint, String requestBody) throws IOException {
        return executeRequest("POST", endpoint, requestBody);
    }

    public String put(String endpoint, String requestBody) throws IOException {
        return executeRequest("PUT", endpoint, requestBody);
    }

    public String delete(String endpoint) throws IOException {
        return executeRequest("DELETE", endpoint, null);
    }

    private String executeRequest(String method, String endpoint, String requestBody) throws IOException {
        URL url = new URL(baseUrl + endpoint);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod(method);
        conn.setRequestProperty("Authorization", getBasicAuthHeader());
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestProperty("Accept", "application/json");
        conn.setDoOutput(true);

        if (requestBody != null) {
            try (OutputStream os = conn.getOutputStream()) {
                byte[] input = requestBody.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }
        }

        int responseCode = conn.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            try (Scanner scanner = new Scanner(conn.getInputStream())) {
                StringBuilder response = new StringBuilder();
                while (scanner.hasNextLine()) {
                    response.append(scanner.nextLine());
                }
                return response.toString();
            }
        } else {
            throw new IOException("HTTP error code: " + responseCode);
        }
    }

    private String getBasicAuthHeader() {
        String credentials = username + ":" + password;
        String encodedCredentials = Base64.getEncoder().encodeToString(credentials.getBytes());
        return "Basic " + "VkNfUFRJUlU6TWVyaWRpYW5pbnRnMTAj";
    }

    // You can further extend this class to handle other types of requests or customize as needed
}
