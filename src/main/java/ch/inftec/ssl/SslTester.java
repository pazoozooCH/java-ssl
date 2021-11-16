package ch.inftec.ssl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class SslTester {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java ch.inftec.ssl.SslTester <URL>");
            System.exit(1);
        }

        String url = args[0];
        System.out.println("Reading from: " + url);

        new SslTester().readFromUrl(url);
    }

    private void readFromUrl(String urlString) {
        try {
            URL url = new URL(urlString);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();
        } catch (Exception ex) {
            System.err.println("Couldn't read from URL");
            ex.printStackTrace();
        }
    }
}
