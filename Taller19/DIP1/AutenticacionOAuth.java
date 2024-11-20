package Taller19.DIP1;

public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contraseña) {
        // Lógica de autenticación OAuth (ejemplo simplificado)
        return "oauthUsuario".equals(usuario) && "oauthContraseña".equals(contraseña);
    }
}