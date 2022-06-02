/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import vista.FRM_Juego;

/**
 *
 * @author Yenssy
 */
public class Controlador_FRM_Juego extends KeyAdapter implements ActionListener, KeyListener{
    
    FRM_Juego fRM_Juego;
    public static boolean up, down, space;

    public Controlador_FRM_Juego(FRM_Juego fRM_Juego) {
        this.fRM_Juego = fRM_Juego;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }//Fin keyTyped

    @Override
    public void keyPressed(KeyEvent e) {
        
        int code = e.getKeyCode();
        
        if(code == KeyEvent.VK_SPACE){
            space = true;
        }//Fin if
        if(code == KeyEvent.VK_UP){
            up = true;
        }//Fin if
        if(code == KeyEvent.VK_DOWN){
            down = true;
        }//Fin if
        
    }//Fin keyPressed

    @Override
    public void keyReleased(KeyEvent e) {
        
        int code = e.getKeyCode();
        
        if(code == KeyEvent.VK_SPACE){
            space = false;
        }//Fin if
        if(code == KeyEvent.VK_UP){
            up = false;
        }//Fin if
        if(code == KeyEvent.VK_DOWN){
            down = false;
        }//Fin if
        
    }//Fin keyReleased
    
}//Fin clase
