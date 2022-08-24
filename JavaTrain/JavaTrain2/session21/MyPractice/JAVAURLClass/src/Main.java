import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
       URL url=new URL("http://www.google.com");
        System.out.println(url.getContent().getClass().getName());

    }
}