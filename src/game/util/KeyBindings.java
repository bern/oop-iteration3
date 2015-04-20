/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.util;

import game.Game;
import game.model.menu.GameMenu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import javax.swing.ComponentInputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

/**
 *
 * @author Aidan
 */
public class KeyBindings {
    private HashMap<String, String> nameMap;
    private HashMap<String, KeyStroke> strokeMap;
    private static KeyBindings instance = null;
    
    public static KeyBindings getInstance() {
        if(instance != null) return instance;
        instance = new KeyBindings();
        return instance;
    }
    
    private KeyBindings() {
        nameMap = new HashMap<String, String>();
        nameMap.put("Move North / Up", "N");
        nameMap.put("Move NorthWest", "NW");
        nameMap.put("Move NorthEast", "NE");
        nameMap.put("Move SouthEast", "SE");
        nameMap.put("Move SouthWest", "SW");
        nameMap.put("Move South / Down", "S");
        nameMap.put("Interact / Confirm", "select");
        nameMap.put("Pause / Back", "pause");
        
        strokeMap = new HashMap<String, KeyStroke>();
        strokeMap.put("N", KeyStroke.getKeyStroke("W"));
        strokeMap.put("S", KeyStroke.getKeyStroke("X"));
        strokeMap.put("NW", KeyStroke.getKeyStroke("Q"));
        strokeMap.put("NE", KeyStroke.getKeyStroke("E"));
        strokeMap.put("SE", KeyStroke.getKeyStroke("C"));
        strokeMap.put("SW", KeyStroke.getKeyStroke("Z"));
        strokeMap.put("select", KeyStroke.getKeyStroke("S"));
        strokeMap.put("pause", KeyStroke.getKeyStroke("ESCAPE"));
                
    }
    
    public ComponentInputMap loadInputMap(JComponent view) {
        ComponentInputMap inputMap = new ComponentInputMap( view );
        inputMap.put(strokeMap.get("N"), "N");
        inputMap.put(strokeMap.get("S"), "S");
        inputMap.put(strokeMap.get("NW"), "NW");
        inputMap.put(strokeMap.get("NE"), "NE");
        inputMap.put(strokeMap.get("SW"), "SW");
        inputMap.put(strokeMap.get("SE"), "SE");
        inputMap.put(strokeMap.get("select"), "select");
        inputMap.put(strokeMap.get("pause"), "pause");
        return inputMap;
    }
    
    /*
    public ComponentInputMap loadDefaultMenuInputMap(JComponent view) {
        inputMap = new ComponentInputMap( view );
        inputMap.put(KeyStroke.getKeyStroke("W"), "N");
        inputMap.put(KeyStroke.getKeyStroke("X"), "S");
        inputMap.put(KeyStroke.getKeyStroke("S"), "select");
        return inputMap;
    }
    */
    
    public boolean bindKey(KeyStroke k, String fullName) {
        if(strokeMap.containsValue(k)) {
            return false;
        }
        String partName = nameMap.get(fullName);
        strokeMap.put(partName, k);
        return true;
    }
    
    public String[] getBindingNames() {
        Set<String> set = nameMap.keySet();
        List<String> list = new ArrayList<String>(set);
        String[] array = new String[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
            String[] keysplit = strokeMap.get(nameMap.get(list.get(i))).toString().split(" ");
            array[i] = array[i] + " = " + keysplit[1];
        }
        
        return array;
    }
}
