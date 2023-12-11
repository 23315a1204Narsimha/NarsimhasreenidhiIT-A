import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
public class DSAKeyGen 
{
public static void main(String[] args) throws Exception
{
KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DSA"); 
keyGen.initialize(1024);
KeyPair keypair = keyGen.genKeyPair(); 
PrivateKey privateKey = keypair.getPrivate(); 
System.out.println(privateKey); 
PublicKey publicKey = keypair.getPublic();
System.out.println(publicKey);
}
}
