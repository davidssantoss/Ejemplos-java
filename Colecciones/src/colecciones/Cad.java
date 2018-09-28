/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author Estudiantes
 */
public class Cad {
    private String s;
    
    Cad(String s){
        this.s=s;
    }
    String f(){
        return s;
    }
    public void usoVector(){
        Vector v = new Vector();
        v.addElement(new Cad("primero A"));
        v.addElement(new Cad("segundo B"));
        v.addElement(new Cad("tercero C"));
        String s1;
        Iterator it = v.iterator();
        while (it.hasNext()) {
            s1 =((Cad) it.next()).f();
            System.out.println(s1);
            
        }
    }
    
    
}
