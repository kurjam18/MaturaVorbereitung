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
public class d9 {
	public static String decrypt(byte[] bEnc, String password)
    throws NoSuchAlgorithmException, NoSuchPaddingException,
    InvalidKeyException, IllegalBlockSizeException, BadPaddingException
  {
    //Schritt 1: Passwort in Bytes umwandeln
    final byte[] bPasswort = password.getBytes(StandardCharsets.UTF_8),
    //Schritt 2: Poasswort in dei richitge Länge bringen
                 bkey = MessageDigest.getInstance("md5").digest(bPasswort);
    //Schritt 3: Schlüsselobjekt erzeugen
    final SecretKeySpec key = new SecretKeySpec(bkey, "aes");
    //Schritt 4: Alghorithmusobjekt erzeugen
    final Cipher cipher = Cipher.getInstance("aes");
    //Schritt 5: Alghorithmus initialisieren
    cipher.init(Cipher.DECRYPT_MODE, key);
    //Schritt 6: Entschlüsseln
    final byte[] bKlartext = cipher.doFinal(bEnc);
    //Schritt 7: String aus ByteFeld erzeugen
    return new String(bKlartext, StandardCharsets.UTF_8);
  }
}
