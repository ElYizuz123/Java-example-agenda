
package tap_u1t1;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author chuy-
 */
public class Agenda extends javax.swing.JFrame {

    int tar=0, tarC=0;
    public Agenda() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrarC.setState(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        newTaskB = new java.awt.Button();
        elTaskB = new java.awt.Button();
        compTaskB = new java.awt.Button();
        tareas = new java.awt.List();
        taskName = new java.awt.TextField();
        mostrarC = new java.awt.Checkbox();
        tareasCompletas = new java.awt.List();
        vaciarB = new java.awt.Button();
        compTasks = new java.awt.Label();
        label3 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setText("Agenda");

        newTaskB.setLabel("Añadir tarea");
        newTaskB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                newTaskBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newTaskBMouseExited(evt);
            }
        });
        newTaskB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTaskBActionPerformed(evt);
            }
        });

        elTaskB.setLabel("Eliminar");
        elTaskB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                elTaskBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                elTaskBMouseExited(evt);
            }
        });
        elTaskB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elTaskBActionPerformed(evt);
            }
        });

        compTaskB.setLabel("Completar");
        compTaskB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                compTaskBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                compTaskBMouseExited(evt);
            }
        });
        compTaskB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compTaskBActionPerformed(evt);
            }
        });

        taskName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        mostrarC.setLabel("Mostrar tareas completadas");
        mostrarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarCMouseClicked(evt);
            }
        });

        vaciarB.setLabel("Vaciar");
        vaciarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vaciarBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vaciarBMouseExited(evt);
            }
        });
        vaciarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaciarBActionPerformed(evt);
            }
        });

        compTasks.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        compTasks.setForeground(new java.awt.Color(0, 153, 0));
        compTasks.setText("0/0");

        label3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label3.setText("Tareas completadas: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(taskName, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newTaskB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(mostrarC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tareasCompletas, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vaciarB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(compTasks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tareas, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(compTaskB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(elTaskB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(newTaskB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taskName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tareas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(elTaskB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(compTaskB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mostrarC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tareasCompletas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(compTasks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vaciarB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newTaskBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTaskBActionPerformed
        if(taskName.getText().length()>0){
            tareas.add(taskName.getText());
            tar++;
        }    
        else 
            JOptionPane.showMessageDialog(null, "Inserte un nombre de tarea");
        taskName.setText("");
        compTasks.setText(String.valueOf(tarC)+"/"+String.valueOf(tar));
    }//GEN-LAST:event_newTaskBActionPerformed

    private void elTaskBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elTaskBActionPerformed
        tareas.remove(tareas.getSelectedItem());
        tar--;
        compTasks.setText(String.valueOf(tarC)+"/"+String.valueOf(tar));
    }//GEN-LAST:event_elTaskBActionPerformed

    private void compTaskBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compTaskBActionPerformed
        tareasCompletas.add(tareas.getSelectedItem());
        tareas.remove(tareas.getSelectedItem());
        tarC++;
        compTasks.setText(String.valueOf(tarC)+"/"+String.valueOf(tar));
    }//GEN-LAST:event_compTaskBActionPerformed

    private void mostrarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarCMouseClicked
        if(mostrarC.getState()){
            tareasCompletas.setVisible(true);
            vaciarB.setVisible(true);
        }
        else{
            tareasCompletas.setVisible(false);
            vaciarB.setVisible(false);
        }
    }//GEN-LAST:event_mostrarCMouseClicked

    private void vaciarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaciarBActionPerformed
        tar=tar-tareasCompletas.getItemCount();
        tarC=tarC-tareasCompletas.getItemCount();
        tareasCompletas.removeAll();
        compTasks.setText(String.valueOf(tarC)+"/"+String.valueOf(tar));
    }//GEN-LAST:event_vaciarBActionPerformed

    private void newTaskBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newTaskBMouseEntered
        newTaskB.setBackground(Color.green);
    }//GEN-LAST:event_newTaskBMouseEntered

    private void newTaskBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newTaskBMouseExited
        newTaskB.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_newTaskBMouseExited

    private void elTaskBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elTaskBMouseEntered
        elTaskB.setBackground(Color.green);
    }//GEN-LAST:event_elTaskBMouseEntered

    private void elTaskBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elTaskBMouseExited
        elTaskB.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_elTaskBMouseExited

    private void compTaskBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compTaskBMouseEntered
        compTaskB.setBackground(Color.green);
    }//GEN-LAST:event_compTaskBMouseEntered

    private void compTaskBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compTaskBMouseExited
        compTaskB.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_compTaskBMouseExited

    private void vaciarBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vaciarBMouseExited
        vaciarB.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_vaciarBMouseExited

    private void vaciarBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vaciarBMouseEntered
        vaciarB.setBackground(Color.green);
    }//GEN-LAST:event_vaciarBMouseEntered

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button compTaskB;
    private java.awt.Label compTasks;
    private java.awt.Button elTaskB;
    private java.awt.Label label1;
    private java.awt.Label label3;
    private java.awt.Checkbox mostrarC;
    private java.awt.Button newTaskB;
    private java.awt.List tareas;
    private java.awt.List tareasCompletas;
    private java.awt.TextField taskName;
    private java.awt.Button vaciarB;
    // End of variables declaration//GEN-END:variables
}
