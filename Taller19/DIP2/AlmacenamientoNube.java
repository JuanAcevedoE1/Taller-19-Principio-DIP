package Taller19.DIP2;

import java.util.HashMap;
import java.util.Map;

public class AlmacenamientoNube implements Almacenamiento {
    private Map<String, String> baseDatosNube = new HashMap<>();

    @Override
    public void guardarArchivo(String nombreArchivo, String contenido) {
        baseDatosNube.put(nombreArchivo, contenido);
        System.out.println("Archivo guardado en la nube: " + nombreArchivo);
    }

    @Override
    public String recuperarArchivo(String nombreArchivo) {
        return baseDatosNube.get(nombreArchivo);
    }
}
