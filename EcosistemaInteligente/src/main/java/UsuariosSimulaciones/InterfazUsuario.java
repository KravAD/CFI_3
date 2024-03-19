package UsuariosSimulaciones;

import AnalisisAvanzado.Visualizador;
import ModeladoIdentidades.Ambiente;
import ModeladoIdentidades.Organismo;

import java.util.List;
import java.util.Scanner;

public class InterfazUsuario {
    private Scanner scanner;
    private Simulador simulador;
    private Visualizador visualizador;

    public InterfazUsuario(List<Organismo> organismos, Ambiente ambiente) {
        this.scanner = new Scanner(System.in);
        this.simulador = new Simulador(organismos, ambiente);
        this.visualizador = new Visualizador(organismos);
    }

    public void mostrarMenu(){
        System.out.println("Bienvenido al simulador de ecosistema. Por favor, elige una opción:");
        System.out.println("1. Iniciar nueva simulación");
        System.out.println("2. Ver resultados de simulación anterior");
        System.out.println("3. Salir");

        String opcion = scanner.nextLine();

        switch (opcion) {
            case "1":
                iniciarSimulacion();
                break;
            case "2":
                verResultados();
                break;
            case "3":
                System.out.println("Saliendo del simulador...");
                System.exit(0);
                break;
            default:
                System.out.println("Opción no reconocida. Por favor, elige una opción válida.");
                mostrarMenu();
                break;
        }
    }

    private void iniciarSimulacion() {
        System.out.println("Iniciando nueva simulación...");
        simulador.simular();
    }

    private void verResultados() {
        System.out.println("Mostrando resultados de la simulación anterior...");
        visualizador.visualizarDatos();
    }
}