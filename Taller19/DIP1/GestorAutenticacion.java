package Taller19.DIP1;

public class GestorAutenticacion {
    private ServicioAutenticacion servicioAutenticacion;

    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }

    public boolean autenticarUsuario(String usuario, String contraseña) {
        return servicioAutenticacion.autenticar(usuario, contraseña);
    }
}