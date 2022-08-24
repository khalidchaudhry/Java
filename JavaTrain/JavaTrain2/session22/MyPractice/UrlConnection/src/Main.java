import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void main(String[] args) throws IOException {

        URL url=new URL("https://www.javapoint.com/java-tutorial");
        URLConnection connection=url.openConnection();
        InputStream stream=connection.getInputStream();
        int i;
        while ((i=stream.read())!=-1){
            System.out.print((char)i);
        }
    }
}