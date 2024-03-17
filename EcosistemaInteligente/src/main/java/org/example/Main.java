package org.example;

import ModeladoIdentidades.Ambiente;
import ModeladoIdentidades.Animal;
import ModeladoIdentidades.Organismo;
import ModeladoIdentidades.Planta;

public class Main {
    public static void main(String[] args) {

        Organismo leon = new Animal(1, 1, 100, 5, true, "mamifero");
        Organismo baobab = new Planta(2, 2, 100, 15, true, "arbol");
        Ambiente sabana = new Ambiente("calido", "pasto", 100);

        

    }
}