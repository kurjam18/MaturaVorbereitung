package themenkorb6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author ruffe
 */
public class c6_Executors implements Runnable
{
  private final int start;
  private int aktuell;
  private final String name;

  public c6_Executors(int start, String name)
  {
    this.start = start;
    this.name = name;
    aktuell=start;
  }

  
  
  @Override
  public void run()
  {
    if(aktuell>=0)
      System.out.format(name+": %d%n",aktuell--);
    if(aktuell<0)
      aktuell = start;
  }
  
  
  public static void main(String[] args)
  {
    final ScheduledExecutorService exe = Executors.newScheduledThreadPool(4);
    exe.scheduleAtFixedRate(new c6_Executors(10,"100ms Zyklus"), 10, 100, TimeUnit.MILLISECONDS);
    exe.scheduleAtFixedRate(new c6_Executors(10,"1s Zyklus"), 10, 1000, TimeUnit.MILLISECONDS);
    exe.scheduleAtFixedRate(new c6_Executors(10,"10s Zyklus"), 10, 10000, TimeUnit.MILLISECONDS);
    
    
  }
}
