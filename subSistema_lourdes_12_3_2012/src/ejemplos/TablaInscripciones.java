package ejemplos;

import eOlympics.Config;
import ejemplos.modeloDatos.ModeloInscripcion;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.DefaultCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.TableModel;

public class TablaInscripciones extends JTable {
    private boolean DEBUG = true;

    public TablaInscripciones() {

        TableModel myModel = new ModeloInscripcion();
        this.setModel(myModel);
        this.setPreferredScrollableViewportSize(new Dimension(500, 70));

        this.setFont(new Font("Verdana", Font.PLAIN, 14));
        //Set up column sizes.
        initColumnSizes();

        //Fiddle with the Sport column's cell editors/renderers.
        //this.PonerComboEnColumna(table.getColumnModel().getColumn(2));
     
    }


    /*
     * This method picks good column sizes.
     * If all column heads are wider than the column's cells' 
     * contents, then you can just use column.sizeWidthToFit().
     */
    private void initColumnSizes() {
        TableColumn column = null;
        Component comp = null;
        int headerWidth = 0;
        int cellWidth = 0;

        // Se ajustan las columnas al ancho que ocuparían estos valores.
        Object[] longValues = {
            "pppppppp prueba ",
            "303030 20120101",
            "apapapapapapapepeldios",
            "nombre nombre "};

        int cc = this.getColumnModel().getColumnCount();
        
        for (int i = 0; i < cc; i++) {
            column = this.getColumnModel().getColumn(i);

            TableCellRenderer renderer = column.getHeaderRenderer();

            if (renderer==null) {
                headerWidth = 0;
            } else {
                comp = renderer.
                             getTableCellRendererComponent(
                                 null, column.getHeaderValue(), 
                                 false, false, 0, 0);
                headerWidth = comp.getPreferredSize().width;
            }

            comp = this.getDefaultRenderer(this.getColumnClass(i)).
                             getTableCellRendererComponent(
                                 this, longValues[i],
                                 false, false, 0, i);
            cellWidth = comp.getPreferredSize().width;

            //XXX: Before Swing 1.1 Beta 2, use setMinWidth instead.
            column.setPreferredWidth(Math.max(headerWidth, cellWidth));
        }
    } 

    private void PonerComboEnColumna(TableColumn sportColumn) {
        //Set up the editor for the sport cells.
        JComboBox comboBox = new JComboBox();
        comboBox.addItem("Snowboarding");
        comboBox.addItem("Rowing");
        comboBox.addItem("Chasing toddlers");
        comboBox.addItem("Speed reading");
        comboBox.addItem("Teaching high school");
        comboBox.addItem("None");
        sportColumn.setCellEditor(new DefaultCellEditor(comboBox));

        //Set up tool tips for the sport cells.
        DefaultTableCellRenderer renderer =
                new DefaultTableCellRenderer();
        renderer.setToolTipText("Click for combo box");
        sportColumn.setCellRenderer(renderer);

        //Set up tool tip for the sport column header.
        TableCellRenderer headerRenderer = sportColumn.getHeaderRenderer();
        if (headerRenderer instanceof DefaultTableCellRenderer) {
            ((DefaultTableCellRenderer)headerRenderer).setToolTipText(
                     "Click the sport to see a list of choices");
        } 
    }


    public static void main(String[] args) {

        Config.LF_windows();

        JFrame frame = new JFrame();

        TablaInscripciones table = new TablaInscripciones();
        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);
        //Add the scroll pane to this window.
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        frame.pack();

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}
