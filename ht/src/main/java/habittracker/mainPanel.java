package habittracker;

import java.io.IOException;
import java.time.LocalDate;

public class mainPanel extends javax.swing.JPanel {
    /*
     * Creates new form Check
     */
    public mainPanel(String habitName, 
    boolean monEnabled,
    boolean tueEnabled,
    boolean wedEnabled,
    boolean thuEnabled,
    boolean friEnabled,
    boolean satEnabled,
    boolean sunEnabled,
    boolean monChecked,
    boolean tueChecked,
    boolean wedChecked,
    boolean thuChecked,
    boolean friChecked,
    boolean satChecked,
    boolean sunChecked
    ) {
        initComponents(habitName, monEnabled, tueEnabled, wedEnabled, thuEnabled, friEnabled, satEnabled, sunEnabled, monChecked, tueChecked, wedChecked, thuChecked, friChecked, satChecked, sunChecked);
        
    }     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents(String habitName, 
    boolean monEnabled,
    boolean tueEnabled,
    boolean wedEnabled,
    boolean thuEnabled,
    boolean friEnabled,
    boolean satEnabled,
    boolean sunEnabled,
    boolean monChecked,
    boolean tueChecked,
    boolean wedChecked,
    boolean thuChecked,
    boolean friChecked,
    boolean satChecked,
    boolean sunChecked) {

        habitNameLabel = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        monCheckBox = new javax.swing.JCheckBox();
        tueCheckBox = new javax.swing.JCheckBox();
        wedCheckBox = new javax.swing.JCheckBox();
        thuCheckBox = new javax.swing.JCheckBox();
        friCheckBox = new javax.swing.JCheckBox();
        satCheckBox = new javax.swing.JCheckBox();
        sunCheckBox = new javax.swing.JCheckBox();

        monCheckBox.setFocusable(monEnabled);
        monCheckBox.setEnabled(monEnabled);
        monCheckBox.setSelected(monChecked);
        
        tueCheckBox.setFocusable(tueEnabled);
        tueCheckBox.setEnabled(tueEnabled);
        tueCheckBox.setSelected(tueChecked);

        wedCheckBox.setFocusable(wedEnabled);
        wedCheckBox.setEnabled(wedEnabled);
        wedCheckBox.setSelected(wedChecked);

        thuCheckBox.setFocusable(thuEnabled);
        thuCheckBox.setEnabled(thuEnabled);
        thuCheckBox.setSelected(thuChecked);
        
        friCheckBox.setFocusable(friEnabled);
        friCheckBox.setEnabled(friEnabled);
        friCheckBox.setSelected(friChecked);
        
        satCheckBox.setFocusable(satEnabled);
        satCheckBox.setEnabled(satEnabled);
        satCheckBox.setSelected(satChecked);;
        
        sunCheckBox.setFocusable(sunEnabled);
        sunCheckBox.setEnabled(sunEnabled);
        sunCheckBox.setSelected(sunChecked);

        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(51, 51, 51));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(800, 60));

        habitNameLabel.setBackground(new java.awt.Color(51, 51, 51));
        habitNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        habitNameLabel.setForeground(new java.awt.Color(204, 204, 204));
        habitNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        habitNameLabel.setText(habitName);
        habitNameLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        habitNameLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        habitNameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        habitNameLabel.setMaximumSize(new java.awt.Dimension(146, 34));
        habitNameLabel.setMinimumSize(new java.awt.Dimension(146, 34));
        habitNameLabel.setOpaque(true);
        habitNameLabel.setPreferredSize(new java.awt.Dimension(146, 34));

        monCheckBox.setBackground(new java.awt.Color(51, 51, 51));
        monCheckBox.setForeground(new java.awt.Color(153, 153, 153));
        monCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        monCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        monCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        monCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(51, 51, 51));
        editButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editButton.setForeground(new java.awt.Color(204, 204, 204));
        editButton.setText("Edit");
        editButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        editButton.setOpaque(true);
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(51, 51, 51));
        saveButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saveButton.setForeground(new java.awt.Color(204, 204, 204));
        saveButton.setText("Save");
        saveButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        saveButton.setOpaque(true);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton2ActionPerformed(evt);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        tueCheckBox.setBackground(new java.awt.Color(51, 51, 51));
        tueCheckBox.setForeground(new java.awt.Color(153, 153, 153));
        tueCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        tueCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tueCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tueCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        wedCheckBox.setBackground(new java.awt.Color(51, 51, 51));
        wedCheckBox.setForeground(new java.awt.Color(153, 153, 153));
        wedCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        wedCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        wedCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wedCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        thuCheckBox.setBackground(new java.awt.Color(51, 51, 51));
        thuCheckBox.setForeground(new java.awt.Color(153, 153, 153));
        thuCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        thuCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        thuCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thuCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });

        friCheckBox.setBackground(new java.awt.Color(51, 51, 51));
        friCheckBox.setForeground(new java.awt.Color(153, 153, 153));
        friCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        friCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        friCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        friCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });

        satCheckBox.setBackground(new java.awt.Color(51, 51, 51));
        satCheckBox.setForeground(new java.awt.Color(153, 153, 153));
        satCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        satCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        satCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        satCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });

        sunCheckBox.setBackground(new java.awt.Color(51, 51, 51));
        sunCheckBox.setForeground(new java.awt.Color(153, 153, 153));
        sunCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        sunCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sunCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sunCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(habitNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tueCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wedCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thuCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(friCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(satCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sunCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(monCheckBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(habitNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tueCheckBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wedCheckBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thuCheckBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(friCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(satCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sunCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
    }             

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           

    }                                          

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        main.showForm(new editpanel(habitNameLabel.getText()));
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                         
        excelManager.insertHabitTrack(habitNameLabel.getText(),monCheckBox.isSelected(), tueCheckBox.isSelected(), wedCheckBox.isSelected(), thuCheckBox.isSelected(), friCheckBox.isSelected(), satCheckBox.isSelected(), sunCheckBox.isSelected());
        
    }                                        

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {                                           
    }                                          

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           


    // Variables declaration                  
    private javax.swing.JButton editButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JCheckBox wedCheckBox;
    private javax.swing.JCheckBox thuCheckBox;
    private javax.swing.JCheckBox friCheckBox;
    private javax.swing.JCheckBox satCheckBox;
    private javax.swing.JCheckBox sunCheckBox;
    private javax.swing.JCheckBox monCheckBox;
    private javax.swing.JCheckBox tueCheckBox;
    private javax.swing.JLabel habitNameLabel;
    // End of variables declaration                   
}
