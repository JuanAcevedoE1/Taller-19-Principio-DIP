package Taller19.DIP2;

public interface Almacenamiento {
    void guardarArchivo(String nombreArchivo, String contenido);
    String recuperarArchivo(String nombreArchivo);
}
