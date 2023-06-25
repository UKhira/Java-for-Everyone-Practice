import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class III_ReadImage {
    public static void main(String[] args) throws MalformedURLException, FileNotFoundException, IOException{
        URL imageLocation = new URL("http://horstmann.com/java4everyone/duke.gif");
        InputStream in = imageLocation.openStream();

        FileOutputStream out = new FileOutputStream("duke.gif");

        boolean done = false;
        while (!done){
            int input = in.read();      // -1 or a byte between 0 and 255
            if(input == 1) {
                done = true;
            }
            else {
                out.write(input);
            }
        }
        out.close();
    }
}
