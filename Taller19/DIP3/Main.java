package Taller19.DIP3;

public class Main {
    public static void main(String[] args) {

        GeneradorReporte reportePDF = new ReportePDF();
        GestorReportes gestorPDF = new GestorReportes(reportePDF);
        gestorPDF.crearReporte("Datos del reporte en PDF");

        GeneradorReporte reporteExcel = new ReporteExcel();
        GestorReportes gestorExcel = new GestorReportes(reporteExcel);
        gestorExcel.crearReporte("Datos del reporte en Excel");
    }
}