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
    @Override
    public void interactuar(Organismo organismo) {
        if (organismo instanceof Leon) {
            huir((Leon) organismo);
        } else if (organismo instanceof Hierba) {
            comer((Hierba) organismo);
        }
    }

    public void huir(Leon leon) {
        if (this.salud > leon.getSalud()) {
            this.salud -= 10;
        } else {
            this.salud = 0;
        }
    }

    public void comer(Hierba hierba) {
        this.salud += hierba.getSalud();
        hierba.setSalud(0);
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
