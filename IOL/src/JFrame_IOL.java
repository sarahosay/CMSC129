
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author xiandalisay
 */
public class JFrame_IOL extends javax.swing.JFrame {
    
    FileOptions commands;
    
    /**
     * Creates new form JFrame_IOL
     */
    public JFrame_IOL() {
        initComponents();
        this.commands = new FileOptions();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        quitBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        save_asBtn = new javax.swing.JButton();
        newBtn = new javax.swing.JButton();
        compileBtn = new javax.swing.JButton();
        runBtn = new javax.swing.JButton();
        variablesTextArea = new javax.swing.JTextArea();
        lexemesTextArea = new javax.swing.JTextArea();
        consoleTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        sourceTextArea = new javax.swing.JTextArea();
        openBtn = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        quitBtn.setText("Quit");
        quitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitBtnActionPerformed(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        save_asBtn.setText("Save As");
        save_asBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    save_asBtnActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(JFrame_IOL.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        newBtn.setText("New");
        newBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBtnActionPerformed(evt);
            }
        });

        compileBtn.setText("Compile");
        compileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compileBtnActionPerformed(evt);
            }
        });

        runBtn.setText("Run");

        variablesTextArea.setEditable(false);
        variablesTextArea.setColumns(20);
        variablesTextArea.setRows(5);

        lexemesTextArea.setEditable(false);
        lexemesTextArea.setColumns(20);
        lexemesTextArea.setRows(5);

        consoleTextArea.setEditable(false);
        consoleTextArea.setColumns(20);
        consoleTextArea.setRows(5);

        sourceTextArea.setColumns(20);
        sourceTextArea.setRows(5);
        jScrollPane2.setViewportView(sourceTextArea);

        openBtn.setText("Open");
        openBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(consoleTextArea)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(variablesTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lexemesTextArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(openBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(save_asBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(compileBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(runBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(quitBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quitBtn)
                    .addComponent(saveBtn)
                    .addComponent(save_asBtn)
                    .addComponent(newBtn)
                    .addComponent(compileBtn)
                    .addComponent(runBtn)
                    .addComponent(openBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(variablesTextArea, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lexemesTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(consoleTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        
        commands.saveFile();
        
    }//GEN-LAST:event_saveBtnActionPerformed
            
     private void save_asBtnActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
                JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory( new File( "./") );
        int actionDialog;
        actionDialog = chooser.showSaveDialog(this);
        if ( actionDialog == JFileChooser.APPROVE_OPTION )
        {
            File fileName;
            fileName = new File( chooser.getSelectedFile( ) + "" );
            if(fileName == null)
                return;
            if(fileName.exists())
            {
                actionDialog = JOptionPane.showConfirmDialog(this,
                                   "Replace existing file?");
                // may need to check for cancel option as well
                if (actionDialog == JOptionPane.NO_OPTION)
                    return;
            }
            // okay to write file
            BufferedWriter outFile = new BufferedWriter( new FileWriter( fileName ) );
            outFile.write( sourceTextArea.getText( ) ); //put in textfile
            outFile.flush( ); // redundant, done by close()
            outFile.close( );
            //AttestDialog.getInstance( ).showErrorDialog(languageBundle.getString(
                               //"LogFil eAlreadyExists"));
        
            }
    }
    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtnActionPerformed
        // TODO add your handling code here:
        commands.newFile(sourceTextArea.getText());

    }//GEN-LAST:event_newBtnActionPerformed

    private void compileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compileBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compileBtnActionPerformed

    private void quitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quitBtnActionPerformed

    private void openBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openBtnActionPerformed

        // TODO add your handling code here:
        try {
            consoleTextArea.setText(commands.openFile().toString());
            sourceTextArea.setText(commands.getSourceCode());
        } catch (Exception ex) {
            Logger.getLogger(JFrame_IOL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_openBtnActionPerformed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyTyped

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
            java.util.logging.Logger.getLogger(JFrame_IOL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_IOL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_IOL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_IOL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFrame_IOL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton compileBtn;
    private javax.swing.JTextArea consoleTextArea;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea lexemesTextArea;
    private javax.swing.JButton newBtn;
    private javax.swing.JButton openBtn;
    private javax.swing.JButton quitBtn;
    private javax.swing.JButton runBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton save_asBtn;
    private javax.swing.JTextArea sourceTextArea;
    private javax.swing.JTextArea variablesTextArea;
    // End of variables declaration//GEN-END:variables
}
