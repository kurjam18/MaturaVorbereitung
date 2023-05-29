package Thema_4.A;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import javax.swing.JFileChooser;


public class Einlesen
{
  public static void main(String[] args)
  {
    File file = new File("C:/Users/danih/Desktop/Info-Matura/messwert.txt");
    try (BufferedReader reader = new BufferedReader(
          new InputStreamReader(
            new FileInputStream(file), "utf8")))
    {
      while(true)
      {
        String line = reader.readLine();
        Messwert messwert = new Messwert(line);
        System.out.println(messwert.getTemp());
        System.out.println(messwert.getNutrient());
      }
      
    }
    catch(Exception ex)
    {
      System.out.println(ex.getMessage());
    }
  }
}
