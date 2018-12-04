/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicate;

import java.util.LinkedList;

/**
 *
 * @author talk2
 */
public class Duplicate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Object> items = new LinkedList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        dup(items);
        
        for(int i = 0; i < items.size(); ++i) {
            System.out.print(items.get(i));
        }
        System.out.println("");
    }
    
    static void dup(LinkedList<Object> items) {
        for (int i = 0; i < items.size(); i += 2) {
            items.add(i + 1, items.get(i));
        }
    }
}
