/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package themenkorb2.B;

/**
 *
 * @author kurzmann
 */
import java.util.LinkedList;

public class Klassenraeume {
    private final LinkedList<Klassenraum> raeume = new LinkedList<>();
    
    public void add(Klassenraum raum){
        raeume.add(raum);
    }
    
    public void remove(Klassenraum raum){
        raeume.remove(raum);
    }
    
    public int getSize(){
        return raeume.size();
    }
}
