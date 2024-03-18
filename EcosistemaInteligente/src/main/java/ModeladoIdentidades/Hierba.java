package ModeladoIdentidades;

public class Hierba extends Organismo{
protected String tipo;

public Hierba(int posicionX, int posicionY, int salud, int edad, boolean estadoReproductivo, String tipo) {
    super(posicionX, posicionY, salud, edad, estadoReproductivo);
    this.tipo = tipo;
}

public String getTipo() {
    return tipo;
}

public void setTipo(String tipo) {
    this.tipo = tipo;
}

@Override
public void interactuar(Organismo organismo) {
    if (organismo instanceof Hierba) {
        polenizar((Hierba) organismo);
    } else if (organismo instanceof Cebra) {
        serComida((Cebra) organismo);
    }
}
    public void polenizar(Hierba otraHierba) {
        if (this.estadoReproductivo && otraHierba.isEstadoReproductivo()) {
            this.salud += 10;
            otraHierba.setSalud(otraHierba.getSalud() + 10);
        }
    }
    public void serComida(Cebra cebra) {
        this.salud -= 10;
    }
@Override
public Organismo reproducir() {
    if (this.estadoReproductivo) {
        Hierba semilla = new Hierba(1,1,50,0,true,"gaminea");
        return semilla;
    }
    return null;
}
}
