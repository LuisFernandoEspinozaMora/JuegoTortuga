/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Yenssy
 */
public class RegistroPuntos {
    
    ArrayList<Puntos> arregloPuntos;
    private Lector lector;
    private Escritor escritor;
    private String fileName;

    public RegistroPuntos(String fileName) {
        this.fileName = fileName;
        this.escritor = new Escritor(fileName);
        this.lector = new Lector(fileName);
        this.arregloPuntos = new ArrayList<>();
    }//Fin constructor
    
    public String agregarPuntaje(Puntos puntos){
        arregloPuntos.add(puntos);
        Collections.sort(arregloPuntos);
        this.escritor.insertarPuntaje(arregloPuntos);
        return "Puntaje registrado correctamente";
    }//Fin metodo agregarPuntaje
    
    public String[][] getDataMatriz(){
    
        arregloPuntos = lector.getPuntajes();
        
        String [][] matrizData = new String[arregloPuntos.size()][Puntos.TBL_ETIQUETAS.length];
        
        for (int x = 0; x < arregloPuntos.size(); x++) {
            
            matrizData[x][0] = arregloPuntos.get(x).getNombre();
            matrizData[x][1] = arregloPuntos.get(x).getApellido();
            matrizData[x][2] = arregloPuntos.get(x).getNickname();
            matrizData[x][3] = arregloPuntos.get(x).getFecha();
            matrizData[x][4] = arregloPuntos.get(x).getPuntos() + "";
            
        }//Fin for
        
        return matrizData;
        
    }//Fin metodo
    
}//Fin clase
