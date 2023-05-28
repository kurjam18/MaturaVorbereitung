/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package themenkorb2.B;

/**
 *
 * @author kurzmann
 */
public class Klassenraum {
    private final String name;
    private final int plaetze;
    private final int fenster;

    public Klassenraum (String name, int plaetze, int fenster) {
        this.name = name;
        this.plaetze = plaetze;
        this.fenster = fenster;
    }

    public String getName() {
        return name;
    }

    public int getPlaetze() {
        return plaetze;
    }

    public int getFenster() {
        return fenster;
    }
}
