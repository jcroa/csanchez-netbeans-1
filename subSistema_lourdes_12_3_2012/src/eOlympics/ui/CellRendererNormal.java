/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eOlympics.ui;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;


// This renderer extends a component. It is used each time a
// cell must be displayed.
public class CellRendererNormal extends JLabel implements TableCellRenderer {
    // This method is called each time a cell in a column
    // using this renderer needs to be rendered.
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int rowIndex, int vColIndex) {
        // 'value' is value contained in the cell located at
        // (rowIndex, vColIndex)

        if (isSelected) {
            // cell (and perhaps other cells) are selected
        }

        if (hasFocus) {
            // this cell is the anchor and the table has the focus
        }

        if ((rowIndex % 2)==1) {
            this.setOpaque(true);
            this.setBackground(Color.YELLOW);
        }
        // Configure the component with the specified value
        setText(value.toString());

        // Set tool tip if desired
        setToolTipText((String)value);

        // Since the renderer is a component, return itself
        return this;
    }

    // The following methods override the defaults for performance reasons
    public void validate() {}
    public void revalidate() {}
    protected void firePropertyChange(String propertyName, Object oldValue, Object newValue) {}
    public void firePropertyChange(String propertyName, boolean oldValue, boolean newValue) {}
}