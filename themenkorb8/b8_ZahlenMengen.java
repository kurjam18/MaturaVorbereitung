package themenkorb8;

import java.util.Scanner;

/**
 *
 * @author kurzmann
 */
public class b8_ZahlenMengen {
	
    public static void main(String[] args) {
        
		final Scanner scanner = new Scanner(System.in);
		int value;
		System.out.print("Zahl: ");
		value = scanner.nextInt();
		
        
        String hexValue = Integer.toHexString(value);
        String binaryValue = Integer.toBinaryString((int) value);
        
        System.out.println("Hex: " + hexValue);
        System.out.println("Binary: " + binaryValue);
        System.out.println("Double: " + value);
    }
}

