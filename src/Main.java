import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        byte[] array = new byte[]{48, 49, 50, 51};
        Charset charset = null;

        try (InputStream inputStream = new ByteArrayInputStream(array)) {
            AsString.readAsString(inputStream, charset);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}