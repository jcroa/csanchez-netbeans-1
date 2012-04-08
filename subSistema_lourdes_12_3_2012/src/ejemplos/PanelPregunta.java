/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelPregunta.java
 *
 * Created on 18-mar-2012, 20:10:06
 */

package ejemplos;

/**
 *
 * @author Juan Carlos
 */
public class PanelPregunta extends javax.swing.JPanel {

    private String m_enunciado = "";
    private int m_numRespuesta = 0;

    /** Creates new form PanelPregunta */
    public PanelPregunta() {
        initComponents();

    }

      public int getNumRespuesta() {
        return m_numRespuesta;
    }

    public void setNumRespuesta(int n) {
        m_numRespuesta = n;
        this.jLabelTitulo.setText("Pregunta " + n);
    }

    public void setEnunciado(String text) {
        this.m_enunciado = text;
         this.jLabelEnunciado.setText("<html>" + m_enunciado + "</html>");
    }

    public String getEnunciado() {
        return this.m_enunciado;
    }


    public String getValorRespuesta() {
       // ButtonMode bm = this.buttonGroup1.getSelection();
        // TODO
        return "X";
    }

     public void setValorRespuesta(String s) {
       // ButtonMode bm = this.buttonGroup1.getSelection();
        // TODO modificar los radio buttons

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jRadioA = new javax.swing.JRadioButton();
        jRadioB = new javax.swing.JRadioButton();
        jRadioC = new javax.swing.JRadioButton();
        jRadioD = new javax.swing.JRadioButton();
        jRadio0 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelEnunciado = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(280, 28));
        jPanel1.setMinimumSize(new java.awt.Dimension(280, 28));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(280, 281));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jPanel3.setName("jPanel3"); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jRadioA.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jRadioA.setText("A ");
        jRadioA.setName("jRadioA"); // NOI18N
        jPanel3.add(jRadioA);

        jRadioB.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jRadioB.setText("B");
        jRadioB.setName("jRadioB"); // NOI18N
        jPanel3.add(jRadioB);

        jRadioC.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jRadioC.setText("C");
        jRadioC.setName("jRadioC"); // NOI18N
        jPanel3.add(jRadioC);

        jRadioD.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jRadioD.setText("D");
        jRadioD.setName("jRadioD"); // NOI18N
        jPanel3.add(jRadioD);

        jRadio0.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jRadio0.setLabel("En Blanco");
        jRadio0.setName("jRadio0"); // NOI18N
        jPanel3.add(jRadio0);

        jPanel1.add(jPanel3);

        add(jPanel1, java.awt.BorderLayout.EAST);

        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTitulo.setText("Cuestión 1");
        jLabelTitulo.setName("jLabelTitulo"); // NOI18N
        jPanel2.add(jLabelTitulo);

        jLabelEnunciado.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabelEnunciado.setText("<html>fds fg ggfgfd gd fjdsjf fjdsjf fdjsfds fjdksfjds jfdkslfjdsl fjdsklfjds fdkslfjdls fjdsfds jfdkslfjds fjdsklfd sjkl</html>");
        jLabelEnunciado.setName("jLabelEnunciado"); // NOI18N
        jPanel2.add(jLabelEnunciado);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabelEnunciado;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadio0;
    private javax.swing.JRadioButton jRadioA;
    private javax.swing.JRadioButton jRadioB;
    private javax.swing.JRadioButton jRadioC;
    private javax.swing.JRadioButton jRadioD;
    // End of variables declaration//GEN-END:variables

}
