package habittracker;

import java.io.IOException;
import java.util.ArrayList;

public class datachooser extends javax.swing.JPanel {

    /**
     * Creates new form chooseData
     */
    public datachooser(String habitName) {
        initComponents(habitName);
    }

    /**
     * The initComponents method initializes the jButton1 component with custom
     * formatting and adds an ActionListener to this button that calls another
     * method named jButton1ActionPerformed when clicked.
     */
    @SuppressWarnings("unchecked")
    private void initComponents(String habitName) {

        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setOpaque(false);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText(habitName);
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton1ActionPerformed(evt);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator1)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 288,
                                                Short.MAX_VALUE))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)));
    }// </editor-fold>

    /**
     * Event handler for the "jButton1" button in a graphical user interface.
     * Retrieves organized data using the "excelManager" object based on the text of
     * the button.
     * Displays the data in a new "datapanel" object using the "main" object to show
     * the form.
     * 
     * @param evt an ActionEvent object representing the event that occurred
     * @throws IOException if an I/O error occurs while retrieving the data
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        ArrayList<Integer> odata = excelManager.getOrgonizeData(jButton1.getText());
        main.showForm(new datapanel(jButton1.getText(), odata));
    }

    // Variables declaration
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration
}
