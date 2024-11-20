package Taller19.DIP3;

public class ReporteExcel implements GeneradorReporte {
    @Override
    public void generarReporte(String datos) {
        System.out.println("Generando reporte en Excel con los siguientes datos: " + datos);
    }
}