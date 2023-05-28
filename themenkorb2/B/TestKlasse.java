/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package themenkorb2.B;

/**
 *
 * @author kurzmann
 */
public class TestKlasse {
    public static void main(String[] args) {
        Klassenraum raum1 = new Klassenraum("1AHME", 36, 3);
        Klassenraum raum2 = new Klassenraum("2AHME", 25, 2);
        Klassenraum raum3 = new Klassenraum("3AHME", 18, 3);
        Klassenraum raum4 = new Klassenraum("4AHME", 14, 2);
        Klassenraum raum5 = new Klassenraum("5AHME", 7, 3);
        
        Klassenraeume raeume = new Klassenraeume();
        raeume.add(raum1);
        raeume.add(raum2);
        raeume.add(raum3);
        raeume.add(raum4);
        raeume.add(raum5);
        raeume.remove(raum5);
        
        System.out.println("Anzahl an Klassen: " + raeume.getSize());
    }
}
