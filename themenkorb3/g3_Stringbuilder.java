package themenkorb3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author ruffe
 */
public class g3_Stringbuilder
{
  public static String getTelegram(BufferedReader reader)
  {
    final StringBuilder sb = new StringBuilder();
    try
    {
      while(reader.ready())
        sb.append(reader.readLine());//.append("\n");
    }
    catch (Exception ignore) { }
    
    return sb.toString();
  }
  
  public static void main(String[] args)
  {
      final File file = new File("C:\\Java\\Uebungen\\test\\filme.csv");
      try (final BufferedReader reader = new BufferedReader(
            new InputStreamReader(
              new FileInputStream(file), "utf8")))
      {
        System.out.println(getTelegram(reader));
      }
      catch (Exception ex)
      {
        ex.printStackTrace();
      }
    
  }
}
