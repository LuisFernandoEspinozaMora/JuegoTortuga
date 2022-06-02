/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Yenssy
 */
public class Reproductor { //Clase encargada de leer, reproducir y pausar los sonidos del juego

    Clip start_Game, playing, game_Over, boost;
    String direccionArchivo = "";

    public Reproductor() {
        System.out.println("" + getClass().getResource(".").getPath());

        direccionArchivo = "" + getClass().getResource(".").getPath();

        direccionArchivo = direccionArchivo.substring(1, direccionArchivo.length() - 21) + "src/assets/";
        System.out.println("" + direccionArchivo);
    }//Fin constructor

    public void reproducirSonido(String nombreArchivo) {//Este metodo identifica cual audio se quiere reproducir, se ajusta para ser leido y reproducido
        try {
            if (nombreArchivo.equals("start_Game")) {
                start_Game = AudioSystem.getClip();
                start_Game.open(AudioSystem.getAudioInputStream(new File(direccionArchivo + nombreArchivo + ".wav")));
                start_Game.start();
            }//Fin if
            if (nombreArchivo.equals("playing")) {
                playing = AudioSystem.getClip();
                playing.open(AudioSystem.getAudioInputStream(new File(direccionArchivo + nombreArchivo + ".wav")));
                playing.start();
            }//Fin if
            if (nombreArchivo.equals("game_Over")) {
                game_Over = AudioSystem.getClip();
                game_Over.open(AudioSystem.getAudioInputStream(new File(direccionArchivo + nombreArchivo + ".wav")));
                game_Over.start();
            }//Fin if
            if (nombreArchivo.equals("boost")) {
                boost = AudioSystem.getClip();
                boost.open(AudioSystem.getAudioInputStream(new File(direccionArchivo + nombreArchivo + ".wav")));
                boost.start();
            }//Fin if
        }//Fin try
        catch (Exception e) {
            System.out.println("" + e);
        }//Fin catch
    }//Fin metodo

    public void stop(String nombreArchivo) {//Metodo encargado de detener la reproduccion de un audio
        try {
            if (nombreArchivo.equals("start_Game")) {
                start_Game.stop();
            }//Fin if
            if (nombreArchivo.equals("playing")) {
                playing.stop();
            }//Fin if
            if (nombreArchivo.equals("game_Over")) {
                game_Over.stop();
            }//Fin if
            if (nombreArchivo.equals("boost")) {
                boost.stop();
            }//Fin if
        }//Fin try
        catch (Exception e) {
            System.out.println("" + e);
        }//Fin catch
    }//Fin metodo

    public void loop(String nombreArchivo) {//Metodo encargado de hacer que la reproduccion de un audio sea continua
        try {
            if (nombreArchivo.equals("start_Game")) {
                start_Game.loop(Clip.LOOP_CONTINUOUSLY);
            }//Fin if
            if (nombreArchivo.equals("playing")) {
                playing.loop(Clip.LOOP_CONTINUOUSLY);
            }//Fin if
            if (nombreArchivo.equals("game_Over")) {
                game_Over.loop(Clip.LOOP_CONTINUOUSLY);
            }//Fin if
            if (nombreArchivo.equals("boost")) {
                boost.loop(Clip.LOOP_CONTINUOUSLY);
            }//Fin if
        }//Fin try
        catch (Exception e) {
            System.out.println("" + e);
        }//Fin catch
    }//Fin metodo

}//Fin clase
