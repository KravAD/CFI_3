package org.example;

import ModeladoIdentidades.Ambiente;
import ModeladoIdentidades.Organismo;
import ModeladoIdentidades.Baobab;
import ModeladoIdentidades.Cebra;
import ModeladoIdentidades.Hierba;
import ModeladoIdentidades.Leon;


public class Main {
    public static void main(String[] args) {

        Leon leon = new Leon(1,1,100,6,true,"mamifero");
        Cebra cebra = new Cebra(2,2,100,5,true,"mamifero");
        Baobab baobab = new Baobab(2,2,100,15,true,"arbol");
        Hierba hierba = new Hierba(2,2,100,1,true,"gaminea");
        

    }
}