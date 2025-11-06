/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_final_gestion_heroes.logica;

import ej_final_gestion_heroes.dto.Heroe;
import java.util.*;

/**
 *
 * @author Robert
 */
public class LogicaHeroes {

    private static List<Heroe> listaHeroes = new ArrayList<>();

    public static boolean existeHeroe(Heroe heroe) {
        if (listaHeroes.contains(heroe)) {
            return true;
        } else {
            return false;
        }
    }

    public static void addHeroe(Heroe heroe) {
        listaHeroes.add(heroe);
    }

    public static List<Heroe> getListaHeroes() {
        return listaHeroes;
    }
}
