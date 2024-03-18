package ModeladoIdentidades;

public class Ambiente {
    protected String clima;
    protected String terreno;
    protected int recursosDisponibles;

    public Ambiente(String clima, String terreno, int recursosDisponibles) {
        this.clima = clima;
        this.terreno = terreno;
        this.recursosDisponibles = recursosDisponibles;
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

}
