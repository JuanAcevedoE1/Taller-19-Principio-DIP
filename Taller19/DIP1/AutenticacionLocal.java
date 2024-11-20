package Taller19.DIP1;

public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contraseña) {
        // Lógica de autenticación local (ejemplo simplificado)
        return "usuario".equals(usuario) && "contraseña".equals(contraseña);
    }
}
