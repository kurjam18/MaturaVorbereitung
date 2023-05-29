package Thema_5.A;

import Thema_4.A.*;

public class Messwert
{
  private final double temp, nutrient;
  private final String messwert;

  public Messwert(double temp, double nutrient) 
    throws Exception
  {
    this.temp = temp;
    this.nutrient = nutrient;
    if(temp < -10)
      throw new Exception("Temperatur kann nicht unter -10°C sein");
    if(temp < 0)
      throw new Exception("Nährstoffgehalt kann nicht unter 0ppm sein");
    this.messwert = null;
  }

  public Messwert(String messwert) 
    throws Exception
  {
    this.messwert = messwert;
    String[] token = messwert.split(":");
    temp = Double.parseDouble(token[0]);
    nutrient = Double.parseDouble(token[1]);
    if(temp < -10)
      throw new Exception("Temperatur kann nicht unter -10°C sein");
    if(temp < 0)
      throw new Exception("Nährstoffgehalt kann nicht unter 0ppm sein");
  }

  public double getTemp()
  {
    return temp;
  }

  public double getNutrient()
  {
    return nutrient;
  }
  
  
}
