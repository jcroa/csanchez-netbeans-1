/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplos.datos;

/**
 * Ejemplo de Datos de inscripciones.
 * USado para la tabla de ejemplo de inscripciones
 */
public class Inscripcion {

    public String NombrePrueba;
    public String FechaInscripcion;
    public String Apellidos;
    public String Nombre;

    public Inscripcion(String nombrePrueba, String fechaInscripcion, String apellidos, String nombre) {
        this.NombrePrueba = nombrePrueba;
        this.FechaInscripcion = fechaInscripcion;
        this.Apellidos = apellidos;
        this.Nombre = nombre;
    }

    public static Inscripcion[] CrearEjemplo1() {
        return new Inscripcion[] {
           new Inscripcion("Prueba 2", "2-4-2012", "López", "Antonio"),
           new Inscripcion("Prueba 3", "22-4-2012", "Sánchez", "Pedro"),
           new Inscripcion("Prueba 4", "2-5-2012", "Salt", "Luis")
        };
    }

    public static Inscripcion[] CrearEjemplo2() {
        return new Inscripcion[] {
           new Inscripcion("Prueba 2", "2-4-2012", "López", "Antonio"),
           new Inscripcion("Prueba 3", "22-4-2012", "Etcher", "Pedro"),
           new Inscripcion("Prueba 4", "2-5-2012", "Salt", "Luis"),
           new Inscripcion("Prueba 2", "2-4-2012", "Núeñez", "Dumas"),
           new Inscripcion("Prueba 3", "22-4-2012", "Thomas", "Pedrez"),
           new Inscripcion("Prueba 4", "2-5-2012", "Hulk", "Luisa"),
        };
    }


}
