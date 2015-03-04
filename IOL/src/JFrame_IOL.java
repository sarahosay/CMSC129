
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        
        super("CLS Compiler");
        initComponents();
        this.commands = new FileOptions();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        quitBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        save_asBtn = new javax.swing.JButton();
        compileBtn = new javax.swing.JButton();
        runBtn = new javax.swing.JButton();
        variablesTextArea = new javax.swing.JTextArea();
        consoleTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        sourceTextArea = new javax.swing.JTextArea();
        openBtn1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        newBtn = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));

        quitBtn.setBackground(new java.awt.Color(204, 204, 255));
        quitBtn.setText("Quit");
        quitBtn.setPreferredSize(new java.awt.Dimension(60, 25));
        quitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitBtnActionPerformed(evt);
            }
        });

        saveBtn.setBackground(new java.awt.Color(204, 204, 255));
        saveBtn.setText("Save");
        saveBtn.setPreferredSize(new java.awt.Dimension(60, 25));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        save_asBtn.setBackground(new java.awt.Color(204, 204, 255));
        save_asBtn.setText("Save As");
        save_asBtn.setPreferredSize(new java.awt.Dimension(76, 25));
        save_asBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_asBtnActionPerformed(evt);
            }
        });

        compileBtn.setBackground(new java.awt.Color(204, 204, 255));
        compileBtn.setText("Compile");
        compileBtn.setPreferredSize(new java.awt.Dimension(70, 25));
        compileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compileBtnActionPerformed(evt);
            }
        });

        runBtn.setBackground(new java.awt.Color(204, 204, 255));
        runBtn.setText("Run");
        runBtn.setPreferredSize(new java.awt.Dimension(60, 25));
        runBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runBtnActionPerformed(evt);
            }
        });

        variablesTextArea.setEditable(false);
        variablesTextArea.setBackground(new java.awt.Color(204, 255, 204));
        variablesTextArea.setColumns(20);
        variablesTextArea.setRows(5);
        variablesTextArea.setText("var1\nvar2\nnum1\nnum2\nanswer");
        variablesTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Table of Variables"));
        variablesTextArea.setMaximumSize(new java.awt.Dimension(256, 192));

        consoleTextArea.setEditable(false);
        consoleTextArea.setBackground(new java.awt.Color(204, 255, 153));
        consoleTextArea.setColumns(20);
        consoleTextArea.setRows(5);
        consoleTextArea.setMaximumSize(new java.awt.Dimension(768, 576));

        sourceTextArea.setBackground(new java.awt.Color(255, 204, 204));
        sourceTextArea.setColumns(20);
        sourceTextArea.setRows(5);
        sourceTextArea.setMaximumSize(new java.awt.Dimension(768, 576));
        jScrollPane2.setViewportView(sourceTextArea);

        openBtn1.setBackground(new java.awt.Color(204, 204, 255));
        openBtn1.setText("Open");
        openBtn1.setPreferredSize(new java.awt.Dimension(60, 25));
        openBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openBtn1ActionPerformed(evt);
            }
        });

        jTable2.setBackground(new java.awt.Color(255, 255, 204));
        jTable2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"ADD", "Addition"},
                {"MOD", "Modulus"},
                {"GT?", "Greater than"},
                {"AND?", "And"}
            },
            new String [] {
                "Lexemes", "Tokens"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setEnabled(false);
        jScrollPane3.setViewportView(jTable2);

        newBtn.setBackground(new java.awt.Color(204, 204, 255));
        newBtn.setText("New");
        newBtn.setPreferredSize(new java.awt.Dimension(60, 25));
        newBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(openBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(save_asBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(compileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(runBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                        .addComponent(quitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(consoleTextArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(variablesTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save_asBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(runBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(variablesTextArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(consoleTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        commands.saveFile();
    }//GEN-LAST:event_saveBtnActionPerformed

    private void compileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compileBtnActionPerformed
        String filename;
        compileFile comp = new compileFile();
        filename="variables.out";
        comp.saveFile(filename);
        filename="lexstoks.out";
        comp.saveFile(filename);
    }//GEN-LAST:event_compileBtnActionPerformed

    private void quitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitBtnActionPerformed

    private void save_asBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_asBtnActionPerformed
        try {
            commands.saveFile_as();}
        catch(IOException ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_save_asBtnActionPerformed

    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtnActionPerformed
        commands.newFile(sourceTextArea.getText());
    }//GEN-LAST:event_newBtnActionPerformed

    private void openBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openBtn1ActionPerformed
        try {
            consoleTextArea.setText(commands.openFile().toString());
            sourceTextArea.setText(commands.getSourceCode());
        } catch (Exception ex) {
            Logger.getLogger(JFrame_IOL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_openBtn1ActionPerformed

    private void runBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runBtnActionPerformed
        compileFile comp = new compileFile();
        comp.saveFile("runningFile.out");
    }//GEN-LAST:event_runBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_IOL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton compileBtn;
    private javax.swing.JTextArea consoleTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton newBtn;
    private javax.swing.JButton openBtn1;
    private javax.swing.JButton quitBtn;
    private javax.swing.JButton runBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton save_asBtn;
    private javax.swing.JTextArea sourceTextArea;
    private javax.swing.JTextArea variablesTextArea;
    // End of variables declaration//GEN-END:variables
}
