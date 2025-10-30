/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_07_ranking.dto;

/**
 *
 * @author Robert
 */
public class Jugador {

    private String nombre;
    private int puntuacion;
    private int nivel;
    private String prioridad;

    public Jugador(String nombre, int puntuacion, int nivel, String prioridad) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.nivel = nivel;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String mostrarInfo(){
        return "- Nombre: " + this.getNombre() + " - Nivel: " + this.getNivel() + " - Puntuación: " + this.getPuntuacion() + " - Prioridad: " + this.getPrioridad().toUpperCase();
    }
}
