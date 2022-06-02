/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vista.FRM_Juego;

/**
 *
 * @author Yenssy
 */
public class Hilo extends Thread{
    
    FRM_Juego fRM_Juego;
    public boolean play = false;    

    public Hilo(FRM_Juego fRM_Juego) {
        this.fRM_Juego = fRM_Juego;
    }//Fin constructor
    
    public void run(){
        try{
            while(true){
                if(play){
                    fRM_Juego.moverFondo();
                    fRM_Juego.moverTortuga();
                    fRM_Juego.moverConejo();
                    fRM_Juego.moverTrampas();
                    fRM_Juego.boost();
                    fRM_Juego.puntos();
                    fRM_Juego.perderVidas();
                    
                }//Fin if
                sleep(60);
            }//Fin while
        }//Fin try
        catch(Exception e){
            System.out.println("Error en la ejecucion del metodo RUN: " + e.getMessage());
        }//Fin catch
    }//Fin run
    
}//Fin clase 