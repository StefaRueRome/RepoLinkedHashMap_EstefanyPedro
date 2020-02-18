
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estefany Rueda
 */
public class Main {
    
    public static void main(String[]args){
        
        Map<String,Integer > linkedHashMap = new LinkedHashMap<String,Integer>();
        linkedHashMap.put("James",10 );	
        linkedHashMap.put("Falcao",12 );		
        linkedHashMap.put("Messi",8 );	
        linkedHashMap.put("Cuadrado",9 );	
        
        //Se recorren los elementos
        Iterator it;
        it = linkedHashMap.keySet().iterator();
        while(it.hasNext()){
          String key = (String) it.next();
          System.out.println("Jugador: " + key + " -> Número Goles:  " + linkedHashMap.get(key));
        //Imprime en el orden en el que fueron agregados los elementos
        } 
        
        
        
        
        
        
        
        
        
        
    }
}
