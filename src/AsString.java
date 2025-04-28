import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class AsString {
    public static void readAsString(InputStream inputStream, Charset charset) throws IOException {
        byte[] bytes = inputStream.readAllBytes();

        charset = StandardCharsets.US_ASCII;

        String s = new String(bytes, charset);

        System.out.println(s);
    }
}
