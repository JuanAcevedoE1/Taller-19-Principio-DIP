package Taller19.DIP2;

import java.util.HashMap;
import java.util.Map;

public class AlmacenamientoLocal implements Almacenamiento {
    private Map<String, String> baseDatos = new HashMap<>();

    @Override
    public void guardarArchivo(String nombreArchivo, String contenido) {
        baseDatos.put(nombreArchivo, contenido);
        System.out.println("Archivo guardado localmente: " + nombreArchivo);
    }

    @Override
    public String recuperarArchivo(String nombreArchivo) {
        return baseDatos.get(nombreArchivo);
    }
}
