package apipost;

import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import utctime.UtcTime;

public class EndPointPost {
    public String loginUserApi() {
    	String accessToken=null;
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            // Create a POST request
            HttpPost postRequest = new HttpPost("https://backend-qa.trukr.live/api/v2/login_user");

            // Set the Content-Type header to application/json
            postRequest.setHeader("Content-Type", "application/json");

            // Create the JSON payload
            String jsonPayload = "{\"username\":\"gps.user.infy\", \"password\":\"5EWYaEjQZc25DqpL\"}";

            // Attach the JSON payload to the request
            StringEntity entity = new StringEntity(jsonPayload);
            postRequest.setEntity(entity);

            // Execute the request and get the response
           
            try (@SuppressWarnings("deprecation")
			CloseableHttpResponse response = httpClient.execute(postRequest)) {
                // Get the status code and reason phrase
                // Get the response body as a string
                String responseString = EntityUtils.toString(response.getEntity(), "UTF-8");
                
                // Print the response details
//                System.out.println("Response Code: " + statusCode);
//                System.out.println("Reason: " + reasonPhrase);
//                System.out.println("Response Body: " + responseString);
                
                ObjectMapper objectMapper = new ObjectMapper();
                JsonNode rootNode = objectMapper.readTree(responseString);
                accessToken= rootNode.path("payload").path("access_token").asText();
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return accessToken;
    }
    public void sendPostRequest(String accessToken,String tripId,String deviceId) {
        // Bearer token obtained from the login response
        // Replace with actual token
    	UtcTime utcTime=new UtcTime();
    	String currentUtcTime = utcTime.getCurrentUTCTime();

        // API endpoint
        String url = "https://backend-qa.trukr.live/api/v2/round_trip/gps/data";

        // JSON body to send
        String jsonBody = "[\n" +
                "    {\n" +
                "        \"device_id\": \""+ deviceId +"\",\n" +
                "        \"latitude\": 14.224,\n" +
                "        \"longitude\": 100.687,\n" +
                "        \"location\": \"Mondelez India Foods Pvt Ltd\",\n" +
                "        \"collected_at\": \"" + currentUtcTime + "\",\n" + // Wrap currentUtcTime in double quotes
                "        \"speed\": \"2\",\n" +
                "        \"engine_status\": \"on\",\n" +
                "        \"equipment_type\": \"Truck\",\n" +
                "        \"odometer\": \"450\",\n" +
                "        \"temperature\": \"25\",\n" +
                "        \"driver_name\": \"JohnDoe\",\n" +
                "        \"driver_phone\": \"9999999999\",\n" +
                "        \"trip_id\": \"" + tripId + "\",\n" +
                "        \"device_imei\": \"7484378909769\",\n" +
                "        \"vehicle_number\": \"MH04HD9211\",\n" +
                "        \"event\": \"Stopped\",\n" +
                "        \"reference_a_value\": \"Testnote\"\n" +
                "    }\n" +
                "]";

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            // Create HTTP POST request
            HttpPost postRequest = new HttpPost(url);

            // Set the Authorization header with Bearer token
            postRequest.setHeader("Authorization", "Bearer " + accessToken);

            // Set the Content-Type header
            postRequest.setHeader("Content-Type", "application/json");

            // Attach the JSON body to the request
            StringEntity entity = new StringEntity(jsonBody);
            postRequest.setEntity(entity);

            // Execute the request
            try (@SuppressWarnings("deprecation")
			CloseableHttpResponse response = httpClient.execute(postRequest)) {
                // Get the response body as a string
                String responseString = EntityUtils.toString(response.getEntity(), "UTF-8");

                // Print the status code
                System.out.println("Status Code: " + response.getCode());

                // Print the response body
                System.out.println("Response Body: " + responseString);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}






















