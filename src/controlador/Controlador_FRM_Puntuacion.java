/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.FRM_Puntuacion;

/**
 *
 * @author Yenssy
 */
public class Controlador_FRM_Puntuacion implements ActionListener{
    
    FRM_Puntuacion fRM_Puntuacion;

    public Controlador_FRM_Puntuacion(FRM_Puntuacion fRM_Puntuacion) {
        this.fRM_Puntuacion = fRM_Puntuacion;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Volver")){
            fRM_Puntuacion.setVisible(false);
        }//Fin if
    }
    
    
    
}//Fin clase
