/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package themenkorb9;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author kurzmann
 */
public class b9 {
	
	
	public static byte[] encrypt(String text, String password)
    throws 
    NoSuchAlgorithmException, NoSuchPaddingException, 
    InvalidKeyException, IllegalBlockSizeException, BadPaddingException
  {
    //UTF-8 hat variable länge, chinesische zeichen haben 4 bytes
    //Schritt 1: Text in bytes umwandeln
    final byte[] bText = text.getBytes(StandardCharsets.UTF_8),
    //Schritt 2: Password in ByteFeld umwandeln
                 bPassword = password.getBytes(StandardCharsets.UTF_8),
    //Schriit 3: Passwort in richtige länge bringen/ MD5 über das Passwort 
                 bKey = MessageDigest.getInstance("md5").digest(bPassword);
    //Schritt 4: Schlüsselobjekt erzeugen
    SecretKeySpec key = new SecretKeySpec(bKey, "aes");
    //Schritt 5: Alghorithmusobjekt erzeugen
    final Cipher cipher = Cipher.getInstance("aes");
    //Schritt 6: Alghorithmus initialisieren
    cipher.init(Cipher.ENCRYPT_MODE, key);
    //Schritt 7: Encrypting the data
    return cipher.doFinal(bText);
    //Im Falle von arbeiten mit Chunks, Cypher.update() verwenden
  }
  
}
