package UsuariosSimulaciones;

import java.io.FileWriter;
import java.io.IOException;

public class Registrador {
    protected String nombreArchivo;

    public Registrador(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void registrar(String mensaje) {
        try (FileWriter escritor = new FileWriter(nombreArchivo, true)) {
            escritor.write(mensaje + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
