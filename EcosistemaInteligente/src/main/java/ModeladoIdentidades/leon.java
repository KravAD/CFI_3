package ModeladoIdentidades;

public class leon extends Organismo{
protected String tipo;

public leon(int posicionX, int posicionY, int salud, int edad, boolean estadoReproductivo, String tipo) {
    super(posicionX, posicionY, salud, edad, estadoReproductivo);
    this.tipo = tipo;
}

public String getTipo() {
    return tipo;
}

public void setTipo(String tipo) {
    this.tipo = tipo;
}
public void depredar(Organismo presa) {
    if (this.salud > presa.getSalud()) {
        this.salud += presa.getSalud();
        presa.setSalud(0);
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
        Animal cria = new Animal(1,1,50,0,true,"mamifero");
        return cria;
    }
    return null;
}

}
