import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
// import java.util.Scanner;
import java.io.BufferedReader;

public class II_ReadWeb {
    public static void main(String[] args) throws IOException{
        // String address = "http://horstmann.com/index.html";
        // URL pageLocation = new URL(address);
        // Scanner in = new Scanner(pageLocation.openStream());
        // in.close();
        var url = new URL("http://webcode.me");
        try (var br = new BufferedReader(new InputStreamReader(url.openStream()))) {

            String line;

            var sb = new StringBuilder();

            while ((line = br.readLine()) != null) {

                sb.append(line);
                sb.append(System.lineSeparator());
            }

            System.out.println(sb);
        }
    }
}