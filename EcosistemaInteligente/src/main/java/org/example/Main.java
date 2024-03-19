package org.example;

import ModeladoIdentidades.*;
import UsuariosSimulaciones.*;
import AnalisisAvanzado.*;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        // Crear instancias de las clases en ModeladoIdentidades
        Leon leon = new Leon(5, 1, 100, 6, true, "mamifero");
        Cebra cebra = new Cebra(4, 2, 100, 5, true, "mamifero");
        Baobab baobab = new Baobab(1, 2, 100, 15, true, "arbol");
        Hierba hierba = new Hierba(10, 2, 100, 1, true, "gaminea");

        leon.interactuar(cebra);
        cebra.interactuar(leon);
        baobab.crecer();
        hierba.crecer();

        Vector<Organismo> organismos = new Vector<>();
        organismos.add(leon);
        organismos.add(cebra);
        organismos.add(baobab);
        organismos.add(hierba);

        Ambiente ambiente = new Ambiente("Savannah", "Terrestrial", 100);





    }
}