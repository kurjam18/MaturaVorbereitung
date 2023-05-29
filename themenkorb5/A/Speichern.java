/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thema_5.A;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.*;

/**
 *
 * @author danih
 */
public class Speichern
{
  private static final List<Messwert> liste = new ArrayList<>();
  public static void main(String[] args) 
  {
    File file = new File("C:/Users/danih/Desktop/Info-Matura/messwert.txt");
    try (final BufferedWriter writer = new BufferedWriter(
          new OutputStreamWriter(
            new FileOutputStream(file), "utf8")))
    {
      liste.add(new Messwert(13.9, 20.8));
      liste.add(new Messwert(13.7, 20.87));
      
      for (Messwert messwert : liste)
      {
        writer.write(String.format("%f;%f", messwert.getTemp(), messwert.getNutrient()));
        writer.newLine();
      }
        
    }
    catch (Exception e)
    {
      System.out.println(e.getMessage());
    }
    
  }
}
