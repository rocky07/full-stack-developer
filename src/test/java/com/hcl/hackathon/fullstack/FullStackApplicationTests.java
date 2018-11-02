

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FullStackApplicationTests {

	@Test
	public void contextLoads() {
		loadURL("http://localhost:8080/region&region=NA");
	}

	public InputStream loadURL( String uri){
		
		HttpURLConnection connection = null;

        try {
            URL url = new URL(uri);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/xml");

            return connection.getInputStream();
        } catch (MalformedURLException e) {
        } catch (IOException e) {
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
		return null;
	}
}
