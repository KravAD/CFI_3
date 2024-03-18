package ModeladoIdentidades;

import java.util.Random;

public class Ambiente {
    protected String clima;
    protected String terreno;
    protected int recursosDisponibles;
    private Random random;


    public Ambiente(String clima, String terreno, int recursosDisponibles) {
        this.clima = clima;
        this.terreno = terreno;
        this.recursosDisponibles = recursosDisponibles;
        this.random = new Random();
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getTerreno() {
        return terreno;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    public int getRecursosDisponibles() {
        return recursosDisponibles;
    }

    public void setRecursosDisponibles(int recursosDisponibles) {
        this.recursosDisponibles = recursosDisponibles;
    }

    public void simularInteracciones(Organismo[] organismos) {
        for (int i = 0; i < organismos.length; i++) {
            for (int j = i + 1; j < organismos.length; j++) {
                organismos[i].interactuar(organismos[j]);
                organismos[j].interactuar(organismos[i]);
            }
        }
    }
    public void simularEventosAleatorios(Organismo[] organismos) {
        for (Organismo organismo : organismos) {
            int evento = random.nextInt(3);
            switch (evento) {
                case 0: // Desastre natural
                    organismo.setSalud(organismo.getSalud() - 50);
                    break;
                case 1: // Enfermedad
                    organismo.setSalud(organismo.getSalud() - 10);
                    break;
                case 2: // Cambio climático
                    if (!clima.equals("Ideal")) {
                        organismo.setSalud(organismo.getSalud() - 5);
                    }
                    break;
            }
        }
    }


}
