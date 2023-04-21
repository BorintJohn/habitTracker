package habittracker;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;

public class main extends javax.swing.JFrame {
    
    /**
     * Creates main frame of the this software
     */
    public main() {
        initComponents();
        getContentPane().setBackground(new Color(200,200,200));
        menuPanel.setOpaque(false);
    }
    /**
     * Creates new form main
     */
    public static void showForm(Component com){
        bodyPanel.removeAll();
        bodyPanel.add(com);
        bodyPanel.revalidate();
        bodyPanel.repaint();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     */
    
    private void initComponents() {

        framePanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        bodyPanel = new javax.swing.JPanel();
        dataButton = new javax.swing.JButton();
        otherButton = new javax.swing.JButton();
        mainButton = new javax.swing.JButton();
        newHabitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        framePanel.setBackground(new java.awt.Color(50, 50, 50));
        
        dataButton.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        dataButton.setForeground(new java.awt.Color(204, 204, 204));
        dataButton.setText("Data");
        dataButton.setContentAreaFilled(false);
        dataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    dataButtonActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        
        otherButton.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        otherButton.setForeground(new java.awt.Color(204, 204, 204));
        otherButton.setText("Other");
        otherButton.setContentAreaFilled(false);
        otherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherButtonActionPerformed(evt);
            }
        });


        mainButton.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        mainButton.setForeground(new java.awt.Color(204, 204, 204));
        mainButton.setText("Main");
        mainButton.setContentAreaFilled(false);
        mainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    mainButtonActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        newHabitButton.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        newHabitButton.setForeground(new java.awt.Color(204, 204, 204));
        newHabitButton.setText("New Habit");
        newHabitButton.setContentAreaFilled(false);
        newHabitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newHabitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newHabitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(otherButton, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(otherButton)
                    .addComponent(dataButton)
                    .addComponent(mainButton)
                    .addComponent(newHabitButton))
                .addContainerGap())
        );

        bodyPanel.setOpaque(false);
        bodyPanel.setLayout(new javax.swing.BoxLayout(bodyPanel, javax.swing.BoxLayout.Y_AXIS));

        javax.swing.GroupLayout framePanelLayout = new javax.swing.GroupLayout(framePanel);
        framePanel.setLayout(framePanelLayout);
        framePanelLayout.setHorizontalGroup(
            framePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(framePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(framePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bodyPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        framePanelLayout.setVerticalGroup(
            framePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(framePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(framePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(framePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );
        pack();
        setLocationRelativeTo(null);
    }

    
    /*
     * Action Performed when clicking main button
     */

     private void mainButtonActionPerformed(ActionEvent evt) throws IOException {        
        bodyPanel.removeAll();
        bodyPanel.add(new datepanel());
        ArrayList<String> habitNames = excelManager.readHabitList();
        for (String name : habitNames){
            System.out.println(name);
            excelManager.getHabitEnableDay(name);
            ArrayList<Boolean> habitEnableDay = excelManager.getHabitEnableDay(name);
            ArrayList<Boolean> habitTrackData = excelManager.getThisWeekTrackData(name);
            System.out.println("trackdata monday : "+habitTrackData.get(0));
            bodyPanel.add(new mainPanel(name,habitEnableDay.get(0),habitEnableDay.get(1),habitEnableDay.get(2),habitEnableDay.get(3),habitEnableDay.get(4),habitEnableDay.get(5),habitEnableDay.get(6),habitTrackData.get(0),habitTrackData.get(1),habitTrackData.get(2),habitTrackData.get(3),habitTrackData.get(4),habitTrackData.get(5),habitTrackData.get(6)));
        }
        bodyPanel.revalidate();
        bodyPanel.repaint();
    }

    /*
     * Action Performed when clicking new Habit button
     */

    private void newHabitButtonActionPerformed(ActionEvent evt) {
        showForm(new newHabitPanel());
    }

    /*
     * Action Performed when clicking data button
     */

    private void dataButtonActionPerformed(ActionEvent evt) throws IOException {
        bodyPanel.removeAll();
        ArrayList<String> habitNames = excelManager.readHabitList();
        for (String name : habitNames){
            bodyPanel.add(new datachooser(name));
        }
        bodyPanel.revalidate();
        bodyPanel.repaint();
    }
    
    /*
     * Action Performed when clicking other button
     */

    private void otherButtonActionPerformed(ActionEvent evt) {
        showForm(new otherpanel());
    }

    private static javax.swing.JPanel bodyPanel;
    private javax.swing.JButton mainButton;
    private javax.swing.JButton dataButton;
    private javax.swing.JButton newHabitButton;
    private javax.swing.JButton otherButton;
    private javax.swing.JPanel framePanel;
    private javax.swing.JPanel menuPanel;
    
}
