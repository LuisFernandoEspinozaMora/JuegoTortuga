/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Yenssy
 */
public class Escritor {
    
     private String archivoPuntaje;
     
     public Escritor(String archivoPuntaje) {
        this.archivoPuntaje = archivoPuntaje;
    }//Constructor
     
    public void crear(){
        ObjectOutputStream oos;
        try{
            oos = new ObjectOutputStream(new FileOutputStream(archivoPuntaje));
            oos.close();
            System.out.print("Archivo creado");     
        }catch(FileNotFoundException ex){
            System.out.println("error al CREAR/buscar archivo ESCRTOR 25: "+ex.getMessage());
        }catch(IOException ioex){
            System.out.println("error al CREAR archivo ESCRTOR 25: "+ioex.getMessage());
        }
    }//Fin metodo
    
    public void insertarPuntaje(ArrayList<Puntos>elementos){
        try{
            ObjectOutputStream oos;
            oos = new ObjectOutputStream(new FileOutputStream(archivoPuntaje));
            
            for(int i = 0; i < elementos.size(); i++) {
                oos.writeUnshared(elementos.get(i));
                oos.flush();
                oos.reset();
            }
            
            oos.close();
        
        }catch(IOException ioex){
             System.out.println("error al insertar puntaje ESCRTOR 38: "+ioex.getMessage());
        }
    }//Fin metodo
    
}//Fin clase
