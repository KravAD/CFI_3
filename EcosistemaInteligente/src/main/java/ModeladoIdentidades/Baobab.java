package ModeladoIdentidades;

public class Baobab extends Organismo{

    protected String tipo;

    public Baobab(int posicionX, int posicionY, int salud, int edad, boolean estadoReproductivo, String tipo) {
        super(posicionX, posicionY, salud, edad, estadoReproductivo);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void polinizar(Baobab otroBaobab) {
        if (this.estadoReproductivo && otroBaobab.isEstadoReproductivo()) {
            this.salud += 10;
            otroBaobab.setSalud(otroBaobab.getSalud() + 10);
        }
    }
    @Override
    public void interactuar(Organismo organismo) {
        if (organismo instanceof Baobab) {
            polinizar((Baobab) organismo);
        }
    }
    @Override
    public Organismo reproducir() {
        if (this.estadoReproductivo) {
            Baobab semilla = new Baobab(1,1,50,0,true,"arbol");
            return semilla;
        }
        return null;
    }

}
