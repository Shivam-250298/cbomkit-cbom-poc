import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CryptoDemo {
    public static void main(String[] args)
            throws NoSuchAlgorithmException {

        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(
            "CBOM POC".getBytes(StandardCharsets.UTF_8)
        );

        System.out.println(java.util.HexFormat.of().formatHex(hash));
    }
}
