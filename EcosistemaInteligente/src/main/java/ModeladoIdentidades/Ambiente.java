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
}
