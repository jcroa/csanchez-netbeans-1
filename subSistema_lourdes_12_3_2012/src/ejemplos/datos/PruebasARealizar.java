/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplos.datos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Ejemplo de Datos de inscripciones.
 * USado para la tabla de ejemplo de inscripciones
 */
public class PruebasARealizar {

    public String NombrePrueba;
    public int NumPreguntas;
    public Date FechaInicioInscripcion;
    public Date FechaFinInscripcion;
    public int DiasQueQuedan;
    public String Nombre;

    public PruebasARealizar(String nombrePrueba,int numPreguntas, String fechaInicioInscripcion,
            String fechaFinInscripcion, int diasQueQuedan) {
        this.NombrePrueba = nombrePrueba;
        this.NumPreguntas = numPreguntas;
        this.FechaInicioInscripcion = parseFecha_yyyy_mm_dd(fechaInicioInscripcion);
        this.FechaFinInscripcion = parseFecha_yyyy_mm_dd(fechaFinInscripcion);
        this.DiasQueQuedan = diasQueQuedan;
    }

    private static Date parseFecha_yyyy_mm_dd(String text) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(text);
        } catch (ParseException ex) {
            return new Date();
        }
    }

    public static PruebasARealizar[] CrearEjemplo1() {
        return new PruebasARealizar[] {
           new PruebasARealizar("Prueba 2", 5, "2012-04-12", "2012-04-19", 6),
           new PruebasARealizar("Prueba 3", 6, "2012-04-16", "2012-04-23", 4),
           new PruebasARealizar("Prueba 4", 8, "2012-04-19", "2012-04-26", 1)
        };
    }

    public static PruebasARealizar[] CrearEjemplo2() {
        return new PruebasARealizar[] {
           new PruebasARealizar("Prueba 2", 5, "2012-04-12", "2012-04-19", 6),
           new PruebasARealizar("Prueba 3", 6, "2012-04-16", "2012-04-23", 4),
           new PruebasARealizar("Prueba 4", 8, "2012-04-19", "2012-04-26", 1)
        };
    }


}
