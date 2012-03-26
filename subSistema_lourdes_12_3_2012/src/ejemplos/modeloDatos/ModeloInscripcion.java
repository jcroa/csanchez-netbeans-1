/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.modeloDatos;

import ejemplos.datos.Inscripcion;
import javax.swing.table.AbstractTableModel;

public class ModeloInscripcion extends AbstractTableModel {

    final String[] nombreColumnas = {
        "Nombre de la prueba",
        "Fecha inscripción",
        "Apellidos",
        "Nombre"};
    final Inscripcion[] DATOS = Inscripcion.CrearEjemplo1();

    public int getColumnCount() {
        return nombreColumnas.length;
    }

    public int getRowCount() {
        return DATOS.length;
    }

    @Override
    public String getColumnName(int col) {
        return nombreColumnas[col];
    }

    public Object getValueAt(int row, int col) {
        Inscripcion x = DATOS[row];
        // comprobar que coincide con los nombres de columnas
        switch (col) {
            case 0:
                return x.NombrePrueba;
            case 1:
                return x.FechaInscripcion;
            case 2:
                return x.Apellidos;
            case 3:
                return x.Nombre;
        }
        return "";
    }

    /*
     * JTable uses this method to determine the default renderer/
     * editor for each cell.  If we didn't implement this method,
     * then the last column would contain text ("true"/"false"),
     * rather than a check box.
     */
    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    /*
     * Don't need to implement this method unless your table's
     * editable.
     */
    @Override
    public boolean isCellEditable(int row, int col) {
        //Note that the data/cell address is constant,
        //no matter where the cell appears onscreen.

        return false;

    }

    /*
     * Don't need to implement this method unless your table's
     * data can change.
     */
    @Override
    public void setValueAt(Object value, int row, int col) {
        // no cambia nada
    }
    
}
