package ModeladoIdentidades;
import java.util.List;

public class Simulador {
    private List<Organismo> organismos;
    private Ambiente ambiente;
    public Simulador(List<Organismo> organismos, Ambiente ambiente) {
        this.organismos = organismos;
        this.ambiente = ambiente;
    }
}
