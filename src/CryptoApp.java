import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CryptoApp {

	
	public static void main(String[] args) {
		Crypto crypto = new BasicCrypto();
		
		String data = "Hello World";
		String enc = new String(crypto.encrypt(data.getBytes()));
		String dec = new String(crypto.decrypt(enc.getBytes()));
		
		System.out.println("Original:  " 	+ data);
		System.out.println("Encrypted: " 	+ enc);
		System.out.println("Decrypted: "	+ dec);
		
		System.out.println(System.getProperty("user.dir"));
		
		try {
			byte[] data1 = Files.readAllBytes(Paths.get(System.getProperty("user.dir")+"/src/data1.txt"));
			byte[] data2 = crypto.encrypt(data1);
			byte[] data3 = crypto.decrypt(data2);
			
			Files.write(Paths.get(System.getProperty("user.dir") + "/src/data2.txt"), data2);
			Files.write(Paths.get(System.getProperty("user.dir") + "/src/data3.txt"), data3);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
