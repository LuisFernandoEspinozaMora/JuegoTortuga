/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Yenssy
 */
public class Lector {
    
    private String archivoPuntaje;
    
    public Lector(String archivoPuntaje) {
        this.archivoPuntaje = archivoPuntaje;
    }//Constructor 
    
    public ArrayList<Puntos> getPuntajes(){
        
        ArrayList<Puntos> objetos = new ArrayList<>();
        
        try{
            
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivoPuntaje));
            Puntos ope =  (Puntos)ois.readObject();
            
            while(ope != null){
       
                objetos.add(ope);
                ope = (Puntos)ois.readObject();
            }
            
            ois.close();
            
        }catch(FileNotFoundException ex){
            
            System.out.print("error al BUSCAR archivo LECTOR 25: "+ex.getMessage());
            
        }catch(EOFException eo){
            
            System.out.print("error LECTOR 25: "+eo.getMessage());
            
        }catch(Exception exc){
            
            System.out.print("error GETPUNTAJE LECTOR 25: "+exc.getMessage());
        }
        
        return objetos;
    
    }//Fin metodo
    
}//Fin clase
