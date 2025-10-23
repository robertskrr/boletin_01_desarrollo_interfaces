/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_06_ranking.logica;

import ej_06_ranking.dto.Jugador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Robert
 */
public class LogicaRanking {
     private static List<Jugador> listaJugadores = new ArrayList<>();
     
     public static void addJugador(Jugador jugador){
         listaJugadores.add(jugador);
     }
     
     public static List<Jugador> getListaJugadores(){
         return listaJugadores;
     }
}
