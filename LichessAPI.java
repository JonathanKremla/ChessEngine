import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class LichessAPI {

    private static String executeGet(final String https_url,String authentication) {
        String ret = "";

        URL url;
        BufferedReader reader = null;
        try {

            url = new URL(https_url) ;
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
            con.setRequestProperty("Authorization", "Bearer " + authentication);
            con.setDoOutput(true);
            con.setRequestMethod("GET");

            reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String line = null;
            StringWriter out = new StringWriter(con.getContentLength() > 0 ? con.getContentLength() : 2048);
            while ((line = reader.readLine()) != null) {
                out.append(line);
            }
            String response = out.toString();
            System.out.println(response);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ret;
    }

    public static void main(String []args){
        String tok = "";
        try {
            File token = new File("token.txt");
            Scanner reader = new Scanner(token);
            tok = reader.nextLine();
            reader.close();
        }
        catch (IOException i){
            System.out.println(i);
        }
        System.out.println(executeGet("https://lichess.org/api/account",tok));
    }

}