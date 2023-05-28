
package themenkorb2.A;

/**
 *
 * @author kurzmann
 */
public class MesswertTest {
	 public static void main(String[] args) {
        Messwert mw = new Messwert(1000.0);
        System.out.println("Wert: " + mw.getValue() + ", Zeit: " + mw.getTime());
    }
}
