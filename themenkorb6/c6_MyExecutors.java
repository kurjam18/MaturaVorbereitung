package themenkorb6;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author schueler
 */
public class c6_MyExecutors {
    
    public c6_MyExecutors () throws InterruptedException {
        LinkedList<Future<String>> futures = new LinkedList<>();
        // ExecutorService executor = Executors.newFixedThreadPool(10);
        // ExecutorService executor = Executors.newSingleThreadExecutor();
        
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
        executor.scheduleAtFixedRate(new MyThread("1"), 0, 1, TimeUnit.SECONDS);
        
        executor.submit(new MyThread("2"));
        executor.submit(new MyThread("3"));
        executor.submit(new MyThread("4"));
        futures.add(executor.submit(new MyCallable("5")));
        Future<String> f = executor.submit(new MyCallable("6"));
        executor.submit(new MyCallable("7"));
        executor.submit(new MyCallable("8"));
        executor.submit(new MyCallable("9"));
        executor.submit(new MyCallable("10"));
        executor.submit(new MyCallable("11"));
        executor.submit(new MyCallable("12"));
        
        try {
            String rv = f.get(2, TimeUnit.SECONDS);
            System.out.println("Resultata: " + rv);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        TimeUnit.SECONDS.sleep(10);
        executor.shutdown();
        System.exit(0);
    }
    
    public static void main (String[] args) throws InterruptedException {
        new c6_MyExecutors();
    }
    
    private class MyThread implements Runnable {

        private final String name;
        private final JLabel label;

        public MyThread (String name) {
            this.name = name;
            this.label = null;
        }
        
        @Override
        public void run () {
            try {
                System.out.println("MyThread " + name + " gestartet ID " + Thread.currentThread().getId());
    
    SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run () {
                        label.setText(("Hallo"));
                    }

                });
            } finally {
                System.out.println("MyThread " + name + " beendet");
            }
        }
        
    }
    
    private class MyCallable implements Callable<String> {

        private final String name;

        public MyCallable (String name) {
            this.name = name;
        }
        
        @Override
        public String call () throws Exception {
            try {
                System.out.println("Callable " + name + " gestartet ID " + Thread.currentThread().getId());
                return name + ": RÜCKGABE";
            } finally {
                System.out.println("Callable " + name + " beendet");
            }
        }
        
    }
}