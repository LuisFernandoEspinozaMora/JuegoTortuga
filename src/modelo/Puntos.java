/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author Yenssy
 */
public class Puntos implements Comparable<Puntos>, Serializable  { //Esta implementacion nos permite comparar valores

    private String nombre, apellido, nickname, fecha;
    private int puntos;
    
    public static final String[] TBL_ETIQUETAS = {"Nombre", "Apellido", "Nickname", "Fecha", "Puntos"};

    public Puntos(String nombre, String apellido, String nickname, String fecha, int puntos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nickname = nickname;
        this.fecha = fecha;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "\nPuntos{" + "nombre=" + nombre + ", apellido=" + apellido + ", nickname=" + nickname + ", fecha=" + fecha + ", puntos=" + puntos + '}';
    }

    @Override
    public int compareTo(Puntos o) {//Metodo encargado de comparar puntos y darle orden de mayor a menor
        if (o.getPuntos() < puntos) {
            return -1;
        }//Fin if
        else if (o.getPuntos() < puntos) {
            return 0;
        }//Fin else if
        else {
            return 1;
        }//Fin else
    }//Fin metodo compareTo

}//Fin clase