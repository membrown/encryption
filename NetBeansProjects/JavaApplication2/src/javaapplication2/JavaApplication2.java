/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author mohsenWorking
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
        // TODO code application logic here
        System.err.println("Ali YA Ali");
        
        
        byte[] sessionKey = null; //Where you get this from is beyond the scope of this post
        byte[] iv = null ; //Ditto
        byte[] plaintext = null; //Whatever you want to encrypt/decrypt
        Cipher cipher = null;
        try {
                cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(sessionKey, "AES"), new IvParameterSpec(iv));
                byte[] ciphertext = cipher.doFinal(plaintext);
        } 
        catch (NoSuchAlgorithmException ex) 
        {
            Logger.getLogger(JavaApplication2.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (NoSuchPaddingException ex) 
        {
            Logger.getLogger(JavaApplication2.class.getName()).log(Level.SEVERE, null, ex);
        }
    //You can use ENCRYPT_MODE or DECRYPT_MODE
   
        
        
    }
}
