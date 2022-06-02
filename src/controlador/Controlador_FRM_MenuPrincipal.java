/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Puntos;
import modelo.RegistroPuntos;
import vista.FRM_Instrucciones;
import vista.FRM_Juego;
import vista.FRM_MenuPrincipal;
import vista.FRM_Puntuacion;

/**
 *
 * @author Yenssy
 */
public class Controlador_FRM_MenuPrincipal implements ActionListener{
    
    FRM_MenuPrincipal fRM_MenuPrincipal;
    FRM_Instrucciones fRM_Instrucciones;
    FRM_Juego fRM_Juego;
    FRM_Puntuacion fRM_Puntuacion;

    public Controlador_FRM_MenuPrincipal(FRM_MenuPrincipal fRM_MenuPrincipal) {
        this.fRM_MenuPrincipal = fRM_MenuPrincipal;
        this.fRM_Juego = new FRM_Juego();
        this.fRM_Puntuacion = new FRM_Puntuacion();
        this.fRM_Instrucciones = new FRM_Instrucciones();
    }//Fin controlador

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Jugar")){
            fRM_Juego.eleccionPersonaje();
            fRM_Juego.setVisible(true);
            fRM_Juego.reproducir();
            fRM_Juego.hilo.play=true;
        }//Fin if
        if(e.getActionCommand().equals("Puntuacion")){
            fRM_Puntuacion.setVisible(true);
            fRM_Puntuacion.setDatosTabla(fRM_Juego.registroPuntos.getDataMatriz(), Puntos.TBL_ETIQUETAS);
        }//Fin if
        if(e.getActionCommand().equals("Instrucciones")){
            fRM_Instrucciones.setVisible(true);
        }//Fin if
    }
    
}//Fin clase 
