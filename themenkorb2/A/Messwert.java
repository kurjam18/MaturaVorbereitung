/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package themenkorb2.A;

/**
 *
 * @author kurzmann
 */
public class Messwert {
	private final double time;
    private final double value;

    public Messwert( double value) {
        time = System.currentTimeMillis();
        this.value = value;
    }

    public double getTime() {
        return time;
    }
    public double getValue() {
        return value;
    }
}
