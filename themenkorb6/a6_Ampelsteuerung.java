package themenkorb6;

import java.util.*;

/**
 *
 * @author Philipp
 */
public class a6_Ampelsteuerung extends Thread
{
  private final int rot,gelb,gruen;

  public a6_Ampelsteuerung(int rotms, int gelbms, int gruenms)
  {
    this.rot = rotms;
    this.gelb = gelbms;
    this.gruen = gruenms;
  }
  

  @Override
  public void run()
  {
    try
    {
      System.out.format("rot%n");
      Thread.sleep(rot);
      System.out.format("gelb%n");
      Thread.sleep(gelb);
      System.out.format("grÃ¼n%n");
      Thread.sleep(gruen);
    }
    catch (Exception ignore)
    {
    }
  }
  public static void main(String[] args)
  {
    new a6_Ampelsteuerung(3000, 2000, 5000).start();
  }
}
