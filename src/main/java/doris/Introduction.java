/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package doris;

import static doris.Constants.pathToNamespase;
import static doris.DORIS.replaceWithNS;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mary
 */
public class Introduction extends javax.swing.JFrame {

    public static String function;
    public static String api;
    public static String kb;
    public static int SamplesNumber = 20;

    /**
     * Creates new form newFunction
     */
    public Introduction() {
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
        url = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputDomain = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        queryArea = new javax.swing.JTextArea();
        getInputValuesButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        inputValues = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        kbCombBox = new javax.swing.JComboBox();
        computeAlignmentsButton = new javax.swing.JButton();
        goButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DORIS - Add New Web Service Method");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel1.setText("URL:");

        url.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        url.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urlActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel2.setText("Input Type:");

        inputDomain.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        inputDomain.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Author", "Singer", "Book", "Song", "Actor", "Album" }));
        inputDomain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDomainActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel3.setText("Query for Input Type:");

        queryArea.setColumns(20);
        queryArea.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        queryArea.setRows(5);
        jScrollPane2.setViewportView(queryArea);

        getInputValuesButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        getInputValuesButton.setText("Get Input Domain Values!");
        getInputValuesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getInputValuesButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel4.setText("Input Domain Values (i,x):");

        inputValues.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        inputValues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputValuesActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel6.setText("Target KB:");

        jButton2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jButton2.setText("Transform WS to KB!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        kbCombBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "YAGO", "DBpedia", "BNF" }));
        kbCombBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbCombBoxActionPerformed(evt);
            }
        });

        computeAlignmentsButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        computeAlignmentsButton.setText("Compute Alignments!");
        computeAlignmentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeAlignmentsButtonActionPerformed(evt);
            }
        });

        goButton.setText("Go!");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel4)
                        .add(18, 18, 18)
                        .add(inputValues, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jSeparator4)
                            .add(layout.createSequentialGroup()
                                .add(jLabel3)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jScrollPane2))
                            .add(layout.createSequentialGroup()
                                .add(jLabel2)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(inputDomain, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 113, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(96, 96, 96)
                                .add(jLabel6)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(kbCombBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(82, 230, Short.MAX_VALUE))
                            .add(jSeparator1)
                            .add(layout.createSequentialGroup()
                                .add(jLabel1)
                                .add(18, 18, 18)
                                .add(url)))
                        .addContainerGap())
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(getInputValuesButton)
                                .add(76, 76, 76))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(computeAlignmentsButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 202, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 202, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(23, 23, 23))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(goButton)
                                .add(101, 101, 101))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(13, 13, 13)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(url, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(19, 19, 19)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(kbCombBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2)
                    .add(inputDomain))
                .add(18, 18, 18)
                .add(goButton)
                .add(4, 4, 4)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 131, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(39, 39, 39)
                        .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 57, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(10, 10, 10)
                .add(getInputValuesButton)
                .add(18, 18, 18)
                .add(jSeparator4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(22, 22, 22)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(inputValues, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 62, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(computeAlignmentsButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputValuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputValuesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputValuesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transformation().setVisible(true);
            }
        });

    }//GEN-LAST:event_jButton2ActionPerformed

    private void getInputValuesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getInputValuesButtonActionPerformed
        // TODO add your handling code here:

        inputValues.removeAllItems();
        
        if (!url.getText().isEmpty()) {
            String pathToInputsfile = Constants.projectFolder + kb + "/inputs/" + inputDomain.getSelectedItem().toString() + ".txt";
            BufferedReader br = null;
            try {
                br = new BufferedReader(new InputStreamReader(new FileInputStream(pathToInputsfile), "UTF8"));
                String line;
                String query = new String();
                int i = 0;
                while ((line = br.readLine()) != null) {
                    if (i < SamplesNumber) {
                        if (line.contains("-->")) {
                            String[] parts = line.split("-->");
                            inputValues.addItem(parts[0] + ", " + replaceWithNS(parts[1]));
                            i++;
                        } else {
                            String[] parts = line.split("<http:");
                            inputValues.addItem(parts[0].trim() + ", " + replaceWithNS("<http:"+parts[1]));
                            i++;
                        }
                    } else {
                        break;
                    }

                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Introduction.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Introduction.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Introduction.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(Introduction.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {

            JOptionPane.showMessageDialog(this,
                    "Give first a URL.",
                    "DORIS warning",
                    JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_getInputValuesButtonActionPerformed

    private void computeAlignmentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeAlignmentsButtonActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new alignmentInterface().setVisible(true);
            }
        });
    }//GEN-LAST:event_computeAlignmentsButtonActionPerformed

    private void kbCombBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbCombBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kbCombBoxActionPerformed

    private void inputDomainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDomainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDomainActionPerformed

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed

        if (!url.getText().isEmpty()) {

            kb = kbCombBox.getSelectedItem().toString();

            BufferedReader br = null;
            try {
                // TODO add your handling code here:

                String pathToQuery = Constants.queries + kbCombBox.getSelectedItem().toString() + "/" + inputDomain.getSelectedItem().toString() + ".txt";
                //System.out.println(pathToQuery);
                br = new BufferedReader(new InputStreamReader(new FileInputStream(pathToQuery), "UTF8"));
                String line;
                String query = new String();
                while ((line = br.readLine()) != null) {
                    query += line + "\n";
                }
                queryArea.setText(query);
                // queryArea.append(query);
                //read file with urls...
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Introduction.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Introduction.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Introduction.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(Introduction.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            //Parse url file to keep the api and the function
            String functionPLUSAPI = parseUrlFile();
//            System.out.println("\n\n Function Value: " + functionPLUSAPI);
            String[] tmp_functionPLUSAPI=functionPLUSAPI.split("\\+");
            function = tmp_functionPLUSAPI[0];
            api = tmp_functionPLUSAPI[1];

            System.out.println(function + " " + api);

        } else {

            JOptionPane.showMessageDialog(this,
                    "Give first a URL.",
                    "DORIS warning",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_goButtonActionPerformed

    public String parseUrlFile() {
        BufferedReader br = null;
        String functionAndAPI = null;
        try {
            // TODO add your handling code here:

            String pathToURLFile = Constants.config + "urls.txt";
            //System.out.println(pathToQuery);
            br = new BufferedReader(new InputStreamReader(new FileInputStream(pathToURLFile), "UTF8"));
            String line;
            int i = 0;

            while ((line = br.readLine()) != null) {
                if (i == 0) {
                    i++;
                    continue;
                } else {
                    //   System.out.println("mpike 1");
                    String[] parts = line.split(Constants.separatorSpace);
                    //   System.out.println(parts[2] + "  "+url.getText());
                    if (parts[2].equals(url.getText())) {
                        //    System.out.println("mpike");
                        functionAndAPI = parts[0] + "+" + parts[1];
                        return functionAndAPI;
                    }
                }
            }

                // queryArea.append(query);
            //read file with urls...
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Introduction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Introduction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Introduction.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(Introduction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return functionAndAPI;
    }

    private void urlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urlActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    /*try {
     for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
     if ("Nimbus".equals(info.getName())) {
     javax.swing.UIManager.setLookAndFeel(info.getClassName());
     break;
     }
     }
     } catch (ClassNotFoundException ex) {
     java.util.logging.Logger.getLogger(Introduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (InstantiationException ex) {
     java.util.logging.Logger.getLogger(Introduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (IllegalAccessException ex) {
     java.util.logging.Logger.getLogger(Introduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
     java.util.logging.Logger.getLogger(Introduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     }*/
        //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Introduction().setVisible(true);
//            }
//        });
//}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton computeAlignmentsButton;
    private javax.swing.JButton getInputValuesButton;
    private javax.swing.JButton goButton;
    private javax.swing.JComboBox inputDomain;
    private javax.swing.JComboBox inputValues;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox kbCombBox;
    private javax.swing.JTextArea queryArea;
    private javax.swing.JTextField url;
    // End of variables declaration//GEN-END:variables
}
