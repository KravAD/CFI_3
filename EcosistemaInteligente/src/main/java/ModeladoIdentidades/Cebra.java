package ModeladoIdentidades;

public class Cebra extends Organismo{
    protected String tipo;

    public Cebra(int posicionX, int posicionY, int salud, int edad, boolean estadoReproductivo, String tipo) {
        super(posicionX, posicionY, salud, edad, estadoReproductivo);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void comer(Organismo Hierba) {
        if (this.salud > Hierba.getSalud()) {
            this.salud += Hierba.getSalud();
            Hierba.setSalud(0);
        }
    }
    public void competirPorRecursos(Organismo rival, Ambiente ambiente) {
        if (this.salud > rival.getSalud() && ambiente.getRecursosDisponibles() > 0) {
            this.salud += 10;
            ambiente.setRecursosDisponibles(ambiente.getRecursosDisponibles() - 10);
        }
    }

    @Override
    public Organismo reproducir() {
        if (this.estadoReproductivo) {
            Cebra cria = new Cebra(1,1,50,0,true,"mamifero");
            return cria;
        }
        return null;
    }
}
