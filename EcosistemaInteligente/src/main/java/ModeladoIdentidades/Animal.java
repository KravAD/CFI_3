package ModeladoIdentidades;

public class Animal extends Organismo{
    protected String tipo;

    public Animal(int posicionX, int posicionY, int salud, int edad, boolean estadoReproductivo, String tipo) {
        super(posicionX, posicionY, salud, edad, estadoReproductivo);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
