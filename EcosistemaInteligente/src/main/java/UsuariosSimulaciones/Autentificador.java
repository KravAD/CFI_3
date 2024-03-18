package UsuariosSimulaciones;

import java.util.HashMap;
import java.util.Map;


public class Autentificador {
    protected Map<String, Usuario> usuarios = new HashMap<>();

    public void registroUsuario(String usuario, String contraseña) {
        usuarios.put(usuario, new Usuario(usuario, contraseña));
    }
    public boolean autentificador(String username, String password) {
        Usuario usuario = usuarios.get(username);
        return usuario != null && usuario.getContraseña().equals(password);
    }

}
