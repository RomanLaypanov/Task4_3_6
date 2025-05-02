import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class AsString {
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        byte[] bytes = inputStream.readAllBytes();

        return new String(bytes, StandardCharsets.US_ASCII);
    }
}
