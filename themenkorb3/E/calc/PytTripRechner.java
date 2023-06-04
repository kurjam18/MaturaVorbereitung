/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue_08.calc;

import java.util.*;
import ue_08.data.PytTrip;

/**
 *
 * @author ruffe
 */
public class PytTripRechner
{
  //Eingangsgröße
  private final int obergrenze;
  //Ausgangsgröße
  private final List<PytTrip> pytTrips = new ArrayList<>();
  private long rechenzeitInMillis;

  public PytTripRechner(int obergrenze)
    throws Exception
  {
    this.obergrenze = obergrenze;
    if(obergrenze < 1)
      throw new Exception("Obergrenze muss größer 0 sein!");
    rechnen();
  }

  private void rechnen()
  {
    final long t1 = System.currentTimeMillis();
    for (int a=1; a<=obergrenze; a++)
      for (int b=a+1; b<=obergrenze; b++)
        for (int c=b+1; c<=obergrenze; c++)
          if (a*a+b*b == c*c)
            pytTrips.add(new PytTrip(a,b,c));
    final long t2 = System.currentTimeMillis();
    rechenzeitInMillis = t2 - t1;
  }

  public List<PytTrip> getPytTrips()
  {
    return pytTrips;
  }

  public long getRechenzeitInMillis()
  {
    return rechenzeitInMillis;
  }
  
  public static void main(String[] args)
  {
    try
    {
      final PytTripRechner rechner = new PytTripRechner(1000);
      for (PytTrip pytTrip : rechner.getPytTrips())
      {
        System.out.println(pytTrip);
        //System.out.format("a=%5d b=%5d c=%5d %n", 
          //pytTrip.getA(), pytTrip.getB(), pytTrip.getC());
      }
        System.out.format("%d Tripel gefunden und für die Obergrenze %d%n",
        rechner.getPytTrips().size(), 1000);
      System.out.format("%d ms Rechenzeit verbraucht", rechner.getRechenzeitInMillis());
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
}
