
/**
 * It provides encryption to a data by adding 4 if the element number is even. Otherwise
 * it subtracts 3.
 * 
 * @author Wayne Poon
 *
 */
public class BasicCrypto implements Crypto {

	// f(x) = y
	@Override
	public byte[] encrypt(byte[] data) {
		
		byte[] enc = new byte[data.length];
		
		for(int i=0;i<data.length;i++) {
			enc[i] = (byte) (((i % 2) == 0) ? data[i] + 4 : data[i] - 3);
		}
		return enc;
	}

	// g(y) = x
	@Override
	public byte[] decrypt(byte[] data) {
		
		byte[] dec = new byte[data.length];
		
		for(int i = 0; i < data.length; i++) {
			dec[i] = (byte)(((i % 2) == 0) ? data[i] - 4 : data[i] + 3);
		}
		
		return dec;
	}

}
