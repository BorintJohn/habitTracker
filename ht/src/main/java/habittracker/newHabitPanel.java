
package habittracker;

import java.io.IOException;

import org.apache.poi.hssf.record.PageBreakRecord.Break;

public class newHabitPanel extends javax.swing.JPanel {

    /**
     * Creates new form newHabit
     */
    public newHabitPanel() {
        initComponents();
    }

    /**
     * 
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(102, 102, 102));

        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("Enter Habit name");
        jTextField1.setOpaque(true);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Habit Name : ");

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton1ActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Repeat day :");

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox1.setText("Every day");
        jCheckBox1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox2.setText("Monday");
        jCheckBox2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox3.setText("Tuesday");
        jCheckBox3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox4.setText("Wednesday");
        jCheckBox4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox5.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox5.setText("Thursday");
        jCheckBox5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox6.setText("Saturday");
        jCheckBox6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox7.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox7.setText("Friday");
        jCheckBox7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jCheckBox9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox9.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox9.setText("Sunday");
        jCheckBox9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jCheckBox6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox7))
                                    .addComponent(jCheckBox9))))
                        .addContainerGap(103, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox9)
                    .addComponent(jCheckBox6))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(75, 75, 75)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        ));
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
     
    }

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBox2.setSelected(true);
        jCheckBox3.setSelected(true);
        jCheckBox4.setSelected(true);
        jCheckBox5.setSelected(true);
        jCheckBox6.setSelected(true);
        jCheckBox7.setSelected(true);
        jCheckBox9.setSelected(true);
    }

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {
        checkAllbox();
    }

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {
        checkAllbox();
    }

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {
        checkAllbox();
    }

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {
        checkAllbox();
    }

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {
        checkAllbox();
    }

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {
        checkAllbox();
    }

    private void checkAllbox(){
        if (jCheckBox2.isSelected()&&jCheckBox3.isSelected()&&jCheckBox4.isSelected()&&jCheckBox5.isSelected()&&jCheckBox6.isSelected()&&jCheckBox7.isSelected()&&jCheckBox9.isSelected()){
            jCheckBox1.setSelected(true);
        } else {
            jCheckBox1.setSelected(false);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        
        String habitName = jTextField1.getText();
        boolean repeatMon = jCheckBox2.isSelected();
        boolean repeatTue = jCheckBox3.isSelected();
        boolean repeatWed = jCheckBox4.isSelected();
        boolean repeatThu = jCheckBox5.isSelected();
        boolean repeatFri = jCheckBox6.isSelected();
        boolean repeatSat = jCheckBox7.isSelected();
        boolean repeatSun = jCheckBox9.isSelected();
        if (excelManager.isReachMaxHabitNum()){
            return;
        } else if (excelManager.isHabitExisted(habitName)){
            return;
        }
        excelManager.insertNewHabit(habitName,repeatMon,repeatTue,repeatWed,repeatThu,repeatFri,repeatSat,repeatSun);
        excelManager.createNewHabit(habitName, repeatMon, repeatTue, repeatWed, repeatThu, repeatFri, repeatSat, repeatSun);
        mainFrame.clearBody();
    }


    // Variables declaration 
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    
    private javax.swing.JTextField jTextField1;
    // End of variables declaration
}
