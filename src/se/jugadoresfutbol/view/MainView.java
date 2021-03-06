/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.jugadoresfutbol.view;

import javax.swing.JOptionPane;
import se.jugadoresfutbol.OperacionArchivo;
import se.jugadoresfutbol.models.Jugador;
import se.jugadoresfutbol.models.Persona;
import se.jugadoresfutbol.motor.MotorController;

/**
 *
 * @author VELOCI
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        heightCombo = new javax.swing.JComboBox<>();
        positionCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        styleCombo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        regionCombo = new javax.swing.JComboBox<>();
        username = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("SE de Selección de jugador de fútbol según caracteristicas");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("Estilo de juego:");

        heightCombo.setBackground(new java.awt.Color(255, 0, 0));
        heightCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cualquiera", "Cualquiera - 1.79", "1.80 - 1.89", "1.90 - 2.05", " " }));
        heightCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightComboActionPerformed(evt);
            }
        });

        positionCombo.setBackground(new java.awt.Color(255, 0, 0));
        positionCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cualquiera", "Delantero", "Defensa central", "Lateral izquierdo", "Lateral derecho", "Mediocampista defensivo", "Mediocampista ofensivo", "Extremo derecho", "Extremo izquierdo", "Arquero" }));
        positionCombo.setSelectedItem("");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText("Región:");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setText("Posición:");

        styleCombo.setBackground(new java.awt.Color(255, 0, 0));
        styleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cualquiera", "Tecnico", "Rematador", "Veloz", "Regateador", "Anticipo" }));

        jButton1.setText("Obtener resultado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setText("Altura: ");

        regionCombo.setBackground(new java.awt.Color(255, 0, 0));
        regionCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cualquiera", "Sudamerica", "Europa", "Asia" }));
        regionCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionComboActionPerformed(evt);
            }
        });

        username.setToolTipText("Usuario");
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setText("Usuario:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel5)))
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(heightCombo, 0, 300, Short.MAX_VALUE)
                                            .addComponent(positionCombo, 0, 300, Short.MAX_VALUE)
                                            .addComponent(styleCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(regionCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(regionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heightCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(positionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(styleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void heightComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightComboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //
        if(username.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un nombre de usuario para continuar", "Nombre de usuario", JOptionPane.PLAIN_MESSAGE);
        } else {
            MotorController motor = MotorController.getInstance();
            int height = 0;
            if (heightCombo.getSelectedItem().toString() == "Cualquiera") {
                height = 0;
            }else if(heightCombo.getSelectedItem().toString() == "Cualquiera - 1.79"){
                height = 179;
            }else if(heightCombo.getSelectedItem().toString() == "1.80 - 1.89"){
                height = 189;
            }else if (heightCombo.getSelectedItem().toString() == "1.90 - 2.05") {
                height = 199;
            }

            String region = regionCombo.getSelectedItem().toString();
            String position = positionCombo.getSelectedItem().toString();
            String style = styleCombo.getSelectedItem().toString();
            // Create objects
            Persona persona = new Persona(region, height);            
            Jugador jugador = new Jugador(position, style);
            String respuesta = motor.ejecutar(persona, jugador);
            //
            if(respuesta.length() == 0) {
                respuesta = "No se ha podido encontrar un jugador con las caracteristicas especificadas";
            }
            String fileData = "Region: "+region+"- Altura: "+ height +"- Posicion: "+ position + "- Estilo de juego: "+ style;
            JOptionPane.showMessageDialog(null, respuesta, "Jugador a elegir", JOptionPane.PLAIN_MESSAGE);
            // Add data to file
            OperacionArchivo.aniadirArchivo(username.getText(), fileData);
            motor.clearAndReset();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void regionComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regionComboActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> heightCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> positionCombo;
    private javax.swing.JComboBox<String> regionCombo;
    private javax.swing.JComboBox<String> styleCombo;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
