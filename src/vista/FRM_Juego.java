/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.Controlador_FRM_Juego;
import controlador.Hilo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
import modelo.Puntos;
import modelo.RegistroPuntos;
import modelo.Reproductor;

/**
 *
 * @author Yenssy
 */
public class FRM_Juego extends javax.swing.JFrame {

    /**
     * Creates new form FRM_Juego
     */
    Controlador_FRM_Juego controlador_FRM_Juego;
    public Hilo hilo;

    public RegistroPuntos registroPuntos;

    Reproductor reproductor;

    int puntos = 0;
    int opcion = 0;

    Random velocidadAleatorea = new Random();
    Random posicionAleatoria = new Random();

    public FRM_Juego() {
        initComponents();

        //Diseño y ubicacion de la ventana
        setSize(1300, 700);
        setLocationRelativeTo(null);

        System.out.println("trampa 2: " + jl_trampa2.getX());
        System.out.println("trampa 1: " + jl_trampa1.getX());
        System.out.println("trampa 3: " + jl_trampa3.getX());

        controlador_FRM_Juego = new Controlador_FRM_Juego(this);
        this.addKeyListener(controlador_FRM_Juego);

        this.hilo = new Hilo(this);
        this.hilo.start();

        registroPuntos = new RegistroPuntos("RegistroPuntajes.DATA");

        reproductor = new Reproductor();

    }//Fin constructor

    public void estadoInicial() {//Metodo encargado de establecer el inicio de todos los valores y metodos
        puntos = 0;

        jl_Tortuga.setLocation(50, 570);
        jl_boost.setEnabled(true);

        Controlador_FRM_Juego.space = false;
        Controlador_FRM_Juego.up = false;
        Controlador_FRM_Juego.down = false;
    }//Fin metodo estadoInicial

    public void perderVidas() {//Metodo hecho para disminuir las vidas cuando exista una colision con las trampas
        if (jl_Tortuga.getX() + 144 > jl_trampa1.getX() + 70 && jl_Tortuga.getX() < jl_trampa1.getX() + 140
                && jl_Tortuga.getY() + 80 > jl_trampa1.getY() && jl_Tortuga.getY() + 60 < jl_trampa1.getY() + 33) {
            if (opcion == 1) {
                jl_Tortuga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/elementos_juego/tortuga1_triste.png")));
            }//Fin if
            if (opcion == 2) {
                jl_Tortuga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/elementos_juego/tortuga2_triste.png")));
            }//Fin if
            if (opcion == 3) {
                jl_Tortuga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/elementos_juego/tortuga3_triste.png")));
            }//Fin if
            gameOver();
        }//Fin metodo
        if (jl_Tortuga.getX() + 144 > jl_trampa2.getX() + 30 && jl_Tortuga.getX() < jl_trampa2.getX() + 140
                && jl_Tortuga.getY() + 85 > jl_trampa2.getY() && jl_Tortuga.getY() + 60 < jl_trampa2.getY() + 33) {
            if (opcion == 1) {
                jl_Tortuga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/elementos_juego/tortuga1_triste.png")));
            }//Fin if
            if (opcion == 2) {
                jl_Tortuga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/elementos_juego/tortuga2_triste.png")));
            }//Fin if
            if (opcion == 3) {
                jl_Tortuga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/elementos_juego/tortuga3_triste.png")));
            }//Fin if
            gameOver();
        }//Fin metodo
        if (jl_Tortuga.getX() + 144 > jl_trampa3.getX() + 30 && jl_Tortuga.getX() < jl_trampa3.getX() + 140
                && jl_Tortuga.getY() + 85 > jl_trampa3.getY() && jl_Tortuga.getY() + 60 < jl_trampa3.getY() + 33) {
            if (opcion == 1) {
                jl_Tortuga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/elementos_juego/tortuga1_triste.png")));
            }//Fin if
            if (opcion == 2) {
                jl_Tortuga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/elementos_juego/tortuga2_triste.png")));
            }//Fin if
            if (opcion == 3) {
                jl_Tortuga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/elementos_juego/tortuga3_triste.png")));
            }//Fin if
            gameOver();
        }//Fin metodo
        if (jl_Tortuga.getX() + 144 < 0) {
            gameOver();
        }//Fin if
    }//Fin metodo perderVidas

    public void puntos() {//Metodo hecho para ganar puntos dependiento del tiempo que se dure jugando
        System.out.println(puntos);
        if (jl_Tortuga.getX() >= jl_trampa1.getX() + 153) {
            puntos += 5;
        }//Fin if
        if (jl_Tortuga.getX() >= jl_trampa2.getX() + 153) {
            puntos += 5;
        }//Fin if
        if (jl_Tortuga.getX() >= jl_trampa3.getX() + 153) {
            puntos += 5;
        }//Fin if
        //jl_Puntos.setText(String.valueOf(puntos));
    }//Fin metodo puntos

    public void moverFondo() { //Metodo encargado de mover el fondo, mover la torturga hacia atras.
        if (jl_FondoJuego.getX() > -5100) {
            jl_Tortuga.setLocation(jl_Tortuga.getX() - 4, jl_Tortuga.getY());
            jl_FondoJuego.setLocation(jl_FondoJuego.getX() - 8, jl_FondoJuego.getY());
        }//Fin 
        else {
            jl_FondoJuego.setLocation(0, jl_FondoJuego.getY());
        }//Fin else
    }//Fin metodo moverFondo

    public void moverTortuga() { //Metodo hecho para controlar el avance de la tortuga y las teclas para esquivar los peligros
        if (Controlador_FRM_Juego.space && jl_Tortuga.getX() + 144 < 1270) {
            jl_Tortuga.setLocation(jl_Tortuga.getX() + 9, jl_Tortuga.getY());
        }//Fin if
        if (Controlador_FRM_Juego.up && jl_Tortuga.getY() > 478) {
            jl_Tortuga.setLocation(jl_Tortuga.getX(), jl_Tortuga.getY() - 4);
        }//Fin if
        if (Controlador_FRM_Juego.down && jl_Tortuga.getY() < 574) {
            jl_Tortuga.setLocation(jl_Tortuga.getX(), jl_Tortuga.getY() + 4);
        }//Fin if
    }//Fin metodo moverPersonaje

    public void moverTortugaBoost() { //Metodo hecho para controlar el avance de la tortuga y las teclas para esquivar los peligros
        if (Controlador_FRM_Juego.space && jl_Tortuga.getX() + 144 < 1270) {
            jl_Tortuga.setLocation(jl_Tortuga.getX() + 20, jl_Tortuga.getY());
        }//Fin if
        if (Controlador_FRM_Juego.up && jl_Tortuga.getY() > 478) {
            jl_Tortuga.setLocation(jl_Tortuga.getX(), jl_Tortuga.getY() - 7);
        }//Fin if
        if (Controlador_FRM_Juego.down && jl_Tortuga.getY() < 574) {
            jl_Tortuga.setLocation(jl_Tortuga.getX(), jl_Tortuga.getY() + 7);
        }//Fin if
    }//Fin metodo moverPersonaje

    public void moverConejo() {//Metodo encargado del moviento y velocidad del conejo
        int x = velocidadAleatorea.nextInt(5 - 0 + 1) + 0;
        jl_Conejo.setLocation(jl_Conejo.getX() + x, jl_Conejo.getY());

        if (jl_Conejo.getX() > 1270) {
            jl_Conejo.setLocation(-190, jl_Conejo.getY());
        }//Fin if
    }//Fin metodo moverConejo

    public void moverTrampas() { //Metodo encargado de mover las trampas y generar mas trampas
        int x1 = posicionAleatoria.nextInt(1400 - 1270 + 1) + 1270;
        int x2 = posicionAleatoria.nextInt(1500 - 1270 + 1) + 1270;
        int x3 = posicionAleatoria.nextInt(2300 - 1270 + 1) + 1270;
        if (jl_trampa2.getX() + 115 <= 0) {
            jl_trampa2.setLocation(x1, jl_trampa2.getY());
        }//Fin if
        if (jl_trampa1.getX() + 115 <= 0) {
            jl_trampa1.setLocation(x2, jl_trampa1.getY());
        }//Fin if
        if (jl_trampa3.getX() + 115 <= 0) {
            jl_trampa3.setLocation(x3, jl_trampa3.getY());
        }//Fin if

        jl_trampa1.setLocation(jl_trampa1.getX() - 8, jl_trampa1.getY());
        jl_trampa2.setLocation(jl_trampa2.getX() - 8, jl_trampa2.getY());
        jl_trampa3.setLocation(jl_trampa3.getX() - 8, jl_trampa3.getY());
    }//Fin metodo

    public void boost() {//Metodo encargado de mover y generar boost
        int x4 = posicionAleatoria.nextInt(2500 - 1700 + 1) + 1700;
        int y4 = posicionAleatoria.nextInt(574 - 478 + 1) + 478;
        if (jl_boost.getX() <= 0) {
            jl_boost.setLocation(x4, y4);
            jl_boost.setEnabled(true);
            //moverTortuga();
        }//Fin if
        jl_boost.setLocation(jl_boost.getX() - 8, jl_boost.getY());

        if (jl_Tortuga.getX() + 130 > jl_boost.getX() && jl_Tortuga.getX() < jl_boost.getX() + 72
                && jl_Tortuga.getY() + 85 > jl_boost.getY() && jl_Tortuga.getY() + 40 < jl_boost.getY() + 45) {
            jl_boost.setEnabled(false);
            moverTortugaBoost();
            reproductor.reproducirSonido("boost");
        }//Fin if
    }//Fin metodo

    public void eleccionPersonaje() {//Metodo hecho para permitir al jugador seleccionar el color de la tortuga
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Selecciones un personaje\n1. Verde\n2. Amarillo\n3. Rojo"));
            switch (opcion) {
                case 1:
                    jl_Tortuga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/elementos_juego/tortuga1_normal.gif")));
                    break;
                case 2:
                    jl_Tortuga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/elementos_juego/tortuga2_normal.gif")));
                    break;
                case 3:
                    jl_Tortuga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/elementos_juego/tortuga3_normal.gif")));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
            }//Fin switch
        } while (opcion > 3);
    }//Fin metodo eleccionPersonaje

    public void registrarPuntaje() { // Metodo encargado de registrar la informacion del jugador una vez finalice el juego
        String nombre = JOptionPane.showInputDialog("Digite su nombre");
        String apellido = JOptionPane.showInputDialog("Digite su apellido");
        String nickname = JOptionPane.showInputDialog("Digite su nickname");
        
        Date fecha = new Date();
        SimpleDateFormat FechaActual = new SimpleDateFormat("dd/MM/yyyy    HH:mm:ss");
        String fechaPuntos = "" + FechaActual.format(fecha);

        Puntos puntosObtenidos = new Puntos(nombre, apellido, nickname, fechaPuntos, puntos);
        String mensaje = registroPuntos.agregarPuntaje(puntosObtenidos);
        JOptionPane.showMessageDialog(null, mensaje);
    }//Fin metodo

    public void gameOver() {
        hilo.play = false;
        reproductor.stop("playing");
        reproductor.reproducirSonido("game_Over");
        JOptionPane.showMessageDialog(null, "PUNTOS OBTENIDOS: " + puntos);
        this.setVisible(false);
        registrarPuntaje();
        estadoInicial();
    }//Fin metodo

    public void reproducir() {
        reproductor.reproducirSonido("playing");
        reproductor.loop("playing");
    }//Fin metodo

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Tortuga = new javax.swing.JLabel();
        jl_Conejo = new javax.swing.JLabel();
        jl_boost = new javax.swing.JLabel();
        jl_trampa1 = new javax.swing.JLabel();
        jl_trampa3 = new javax.swing.JLabel();
        jl_trampa2 = new javax.swing.JLabel();
        jl_FondoJuego = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1300, 700));
        setPreferredSize(new java.awt.Dimension(1300, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_Tortuga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/elementos_juego/tortuga1_normal.gif"))); // NOI18N
        getContentPane().add(jl_Tortuga, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, -1, -1));

        jl_Conejo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/elementos_juego/conejo_rapido.gif"))); // NOI18N
        getContentPane().add(jl_Conejo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        jl_boost.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/elementos_juego/boost.png"))); // NOI18N
        getContentPane().add(jl_boost, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 600, -1, -1));

        jl_trampa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/elementos_juego/trampa1.png"))); // NOI18N
        getContentPane().add(jl_trampa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 610, -1, -1));

        jl_trampa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/elementos_juego/trampa1.png"))); // NOI18N
        getContentPane().add(jl_trampa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 530, -1, -1));

        jl_trampa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/elementos_juego/trampa1.png"))); // NOI18N
        getContentPane().add(jl_trampa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, -1, -1));

        jl_FondoJuego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/elementos_juego/fondo.png"))); // NOI18N
        getContentPane().add(jl_FondoJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jl_Conejo;
    private javax.swing.JLabel jl_FondoJuego;
    private javax.swing.JLabel jl_Tortuga;
    private javax.swing.JLabel jl_boost;
    private javax.swing.JLabel jl_trampa1;
    private javax.swing.JLabel jl_trampa2;
    private javax.swing.JLabel jl_trampa3;
    // End of variables declaration//GEN-END:variables

}
