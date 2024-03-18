package UsuariosSimulaciones;

import java.util.HashMap;
import java.util.Map;


public class Autentificador {
    protected Map<String, Usuario> usuarios = new HashMap<>();

    public void registerUser(String usuario, String contraseña) {
        usuarios.put(usuario, new Usuario(usuario, contraseña));
    }

}
