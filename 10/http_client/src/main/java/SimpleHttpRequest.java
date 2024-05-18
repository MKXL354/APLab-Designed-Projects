import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SimpleHttpRequest {

    public static void main(String[] args) {
        try {
            // Specify the URL to send the GET request to
            URL url = new URL("http://localhost:8888/users");

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Read the response from the server
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Output the response
            System.out.println("Response:");
            System.out.println(response.toString());

            // Disconnect the connection
            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}