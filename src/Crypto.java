

/**
 * Crypto Interface
 * It provides two methods: 
 * 1. to encrypt data
 * 2. to decrypt data
 * @author Wayne Poon
 *
 */
public interface Crypto {

	abstract byte[] encrypt(byte[] data);
	
	abstract byte[] decrypt(byte[] data);
}
