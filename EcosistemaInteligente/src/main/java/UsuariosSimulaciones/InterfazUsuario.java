package UsuariosSimulaciones;
import java.util.Scanner;
public class InterfazUsuario {
    private Scanner scanner;


    public InterfazUsuario() {
        this.scanner = new Scanner(System.in);
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
    }

    private void verResultados() {
        System.out.println("Mostrando resultados de la simulación anterior...");
    }
}



