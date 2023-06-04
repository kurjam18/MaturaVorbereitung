package ue_08.data;

/**
 * Datenhlatungsklasse zur Darstellung eines pythagoreischen Triples
 * design pattern "immutable"
 * @author ruffe
 */
public class PytTrip
{
  //Datenelemente
  private final int a, b, c;
  //Konstruktor
  public PytTrip(int a, int b, int c)
  {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public int getA()
  {
    return a;
  }

  public int getB()
  {
    return b;
  }

  public int getC()
  {
    return c;
  }
  
  @Override
  public String toString()
  {
    return String.format("a=%4d b=%4d c=%4d",a,b,c);
  }
  
}
