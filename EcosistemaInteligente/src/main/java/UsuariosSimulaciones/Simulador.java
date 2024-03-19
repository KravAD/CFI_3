package UsuariosSimulaciones;
import ModeladoIdentidades.Ambiente;
import ModeladoIdentidades.Organismo;

import java.util.List;

public class Simulador {
    private List<Organismo> organismos;
    private Ambiente ambiente;
    public Simulador(List<Organismo> organismos, Ambiente ambiente) {
        this.organismos = organismos;
        this.ambiente = ambiente;
    }
    public void simular() {
        Organismo[] organismosArray = organismos.toArray(new Organismo[0]);
        ambiente.simularInteracciones(organismosArray);
        ambiente.simularEventosAleatorios(organismosArray);    }

    public void calcularEstadisticas() {
        int totalSalud = 0;
        int totalEdad = 0;
        int totalReproductivos = 0;

        for (Organismo organismo : organismos) {
            totalSalud += organismo.getSalud();
            totalEdad += organismo.getEdad();
            if (organismo.isEstadoReproductivo()) {
                totalReproductivos++;
            }
        }

        double promedioSalud = (double) totalSalud / organismos.size();
        double promedioEdad = (double) totalEdad / organismos.size();
        double porcentajeReproductivos = (double) totalReproductivos / organismos.size() * 100;

        System.out.println("Promedio de salud: " + promedioSalud);
        System.out.println("Promedio de edad: " + promedioEdad);
        System.out.println("Porcentaje de organismos en estado reproductivo: " + porcentajeReproductivos + "%");
    }

    public void presentarEstadisticas() {
        calcularEstadisticas();
    }
}
