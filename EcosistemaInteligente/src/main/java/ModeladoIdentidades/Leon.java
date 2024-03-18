package ModeladoIdentidades;

public class Leon extends Organismo{
protected String tipo;

public Leon(int posicionX, int posicionY, int salud, int edad, boolean estadoReproductivo, String tipo) {
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
        if (organismo instanceof Cebra) {
            cazar((Cebra) organismo);
        } else if (organismo instanceof Leon) {
            competir((Leon) organismo);
        }
    }

    public void cazar(Cebra cebra) {
        if (this.salud > cebra.getSalud()) {
            this.salud += cebra.getSalud();
            cebra.setSalud(0);
        }
    }

    public void competir(Leon otroLeon) {
        if (this.salud > otroLeon.getSalud()) {
            this.salud += 10;
            otroLeon.setSalud(otroLeon.getSalud() - 10);
        }
    }

@Override
public Organismo reproducir() {
    if (this.estadoReproductivo) {
        Leon cria = new Leon(1,1,50,0,true,"mamifero");
        return cria;
    }
    return null;
}

}
