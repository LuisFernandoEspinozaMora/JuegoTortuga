/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Yenssy
 */
public class FRM_Instrucciones extends javax.swing.JFrame {

    /**
     * Creates new form Instrucciones
     */
    public FRM_Instrucciones() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label2 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        label3 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        label4 = new java.awt.Label();
        btn_Volver = new javax.swing.JButton();

        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label2.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 153, 204));
        label2.setText("Indicaciones del juego");
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/elementos_juego/teclado.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/elementos_juego/puntuacion-mas-alta.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        label1.setText("Tecla arriba, abajo y espacio para avanzar más rápido");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        label3.setText("Comerlas da un pequeño impulso.");
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 200, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/elementos_juego/boost.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        label4.setText("Esquiva trampas para obtener puntos.");
        getContentPane().add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 242, -1));

        btn_Volver.setText("Volver");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_VolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    // End of variables declaration//GEN-END:variables
}
