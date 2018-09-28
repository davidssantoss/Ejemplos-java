/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

/**
 *
 * @author Estudiantes
 */
public class Colecciones /* implements Queue */ {
    static Queue queue = new LinkedList();
    static String s;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * ArrayList ejemplo
         */
        /*
        ArrayList obj = new ArrayList();
        obj.add("uno");
        obj.add("dos");
        obj.add(0, "tres");
        obj.add(1, "cuatro");
        obj.remove("dos");
        for(Object cad : obj){
            System.out.println(cad);
        }
*/
        /**
         * ArrayList Ejemplo2
         */
        /*
        List lista1 = new ArrayList();
        lista1.add("uno");
        lista1.add("dos");
        lista1.add("tres");
        lista1.add("cuatro");
        Iterator iterator = lista1.iterator();
        while (iterator.hasNext()) {
            String ele = (String)iterator.next();
            System.out.println(ele);
            
        }
*/
        /**
         * LinkedList ejemplo
         */
        /*
        
        
        List lista = new LinkedList();
        lista.add("cinco");
        lista.add("seis");
        lista.add("siete");
        lista.add("ocho");
        Iterator iterator = lista.iterator();
        while (iterator.hasNext()) {
            String ele = (String)iterator.next();
            System.out.println(ele);
            
        }
*/
        /**
         * HashMap ejemplo
         */
        /*
        HashMap hm = new HashMap();
        hm.put("123", "camila");
        hm.put("453", "jorge");
        hm.put("2345", "paulina");
        Set set = hm.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            String s = (String)iterator.next();
            String val = (String) hm.get(s);
            System.out.println(s + " " + val);
            
        }
*/
        /**
         * Queue ejemplo
         */
        /*
        queue.add("primero");
        queue.add("segundo");
        queue.add("tercero");
        queue.poll(); //retira
        int tam = queue.size();
        //Escribe y retira
        while(tam > 0 ){
            String x = (String)queue.peek();
            System.out.println(tam);
            System.out.println(x);
            tam--;
            queue.poll();
        }
*/
        /**
         * Llamada a clase Cad para ejemplo vector
         */
        /*
        Cad c = new Cad(s);
        c.usoVector();
        */
        /**
         * Stack ejemplo
         */
        /*
        Stack pila = new Stack();
        pila.push("a");
        pila.push("b");
        pila.push("c");
        for(Object aux: pila){
            String str =(String) aux;
            System.out.println(str + " ");
        }
*/
        /**
         * TreeMap Ejemplo
         */
        /*
        TreeMap tmap = new TreeMap();
        tmap.put (1,"uno");
        tmap.put (23,"dos3");
        tmap.put (70,"siete0");
        tmap.put (4,"cuatro");
        tmap.put (2,"dos");
        tmap.put (0,"cero");
        
        Set conj = tmap.entrySet();
        Iterator it = conj.iterator();
        while (it.hasNext()) {
            Map.Entry nodo = (Map.Entry)it.next();
            System.out.println(nodo.getKey());
            System.out.println(" " + nodo.getValue());
            
        }
*/
    }
    
}
