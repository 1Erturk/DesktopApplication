/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package favoritesites;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author enese
 */
public class InformationVisits extends javax.swing.JFrame {

    Connection connection;
    Statement statement = null;
    ResultSet resultSet1 = null;
    static String username;
    private ImageIcon imageIcon;
    private Image image;
    
    /**
     * Creates new form InformationVisits
     */
    public InformationVisits(String username) {
        initComponents();
        try {
            this.username = username;
            connection = new DBConnection().dbConnection();
            fillTable();
        } catch(Exception e) {
            System.out.println("Error! " + e.getMessage());
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVisits = new javax.swing.JTable();
        jButtonFood = new javax.swing.JButton();
        jButtonMostVisited = new javax.swing.JButton();
        jButtonSpring = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldYear = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldImage = new javax.swing.JTextField();
        jButtonImage = new javax.swing.JButton();
        jLabelImage = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FavoriteSites");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jTableVisits.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "username", "Country Name", "City Name", "Year", "Season", "Best Feature", "Comment", "Rating"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableVisits);

        jButtonFood.setText("Display countries that best feature is food");
        jButtonFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFoodActionPerformed(evt);
            }
        });

        jButtonMostVisited.setText("Display countries that user visited the most");
        jButtonMostVisited.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostVisitedActionPerformed(evt);
            }
        });

        jButtonSpring.setText("Display countries that are visited only in spring");
        jButtonSpring.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSpringActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter year :");

        jTextFieldYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldYearActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID :");

        jButtonImage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonImage.setText("Show image");
        jButtonImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1229, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldYear, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSpring, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonMostVisited, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldImage, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonImage, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldYear))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonImage, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jButtonFood, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonMostVisited, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonSpring, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jMenu1.setText("Menu");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        dispose();
        new MainFrame(username).setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jTextFieldYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldYearActionPerformed
        try {
            String year = jTextFieldYear.getText();
            String sql = "SELECT * FROM visits WHERE year_visited = ? and username = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, year);
            statement.setString(2, username);
            ResultSet resultSet = statement.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel) jTableVisits.getModel();
            model.setRowCount(0);
            
            if (!resultSet.isBeforeFirst()) {  
                JOptionPane.showMessageDialog(this, "No visits found for given year: " + year);
                return;
            }
            
            fillRow(resultSet, model);
            
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_jTextFieldYearActionPerformed

    private void jButtonFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFoodActionPerformed
        try {
            String feature = "food";
            String sql = "SELECT * FROM visits WHERE best_feature = ? and username = ? ORDER BY rating DESC";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, feature);
            statement.setString(2, username);
            ResultSet resultSet = statement.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel) jTableVisits.getModel();
            model.setRowCount(0);
            
            if (!resultSet.isBeforeFirst()) {  
                JOptionPane.showMessageDialog(this, "No visits found for best features is " + feature);
                return;
            }
            
            fillRow(resultSet, model);
            
            String sqlTextArea = "SELECT DISTINCT country_name FROM visits WHERE username = ? and best_feature = ?";
            PreparedStatement statementTextArea = connection.prepareStatement(sqlTextArea);
            statementTextArea.setString(1, username);
            statementTextArea.setString(2, feature);
            ResultSet resultSetTextArea = statementTextArea.executeQuery();
            jLabel2.setText("Country Names that best feature is food");
            jTextArea1.setText("");
            while(resultSetTextArea.next()) {
                jTextArea1.append(resultSetTextArea.getString("country_name") + "\n");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_jButtonFoodActionPerformed

    private void jButtonMostVisitedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostVisitedActionPerformed
        try {
            String sql = "SELECT * FROM visits WHERE username = ? and country_name = "
                    + "(SELECT country_name FROM visits GROUP BY country_name ORDER BY COUNT(*) DESC LIMIT 1);";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel) jTableVisits.getModel();
            model.setRowCount(0);
            
            if (!resultSet.isBeforeFirst()) {  
                JOptionPane.showMessageDialog(this, "No visits found");
                return;
            }
            
            fillRow(resultSet, model);
            
            String sqlTextArea = "SELECT DISTINCT country_name FROM visits WHERE username = ? and country_name = " 
                    + "(SELECT country_name FROM visits GROUP BY country_name ORDER BY COUNT(*) DESC LIMIT 1);";
            PreparedStatement statementTextArea = connection.prepareStatement(sqlTextArea);
            statementTextArea.setString(1, username);
            ResultSet resultSetTextArea = statementTextArea.executeQuery();
            jLabel2.setText("Country Names that user visited the most");
            jTextArea1.setText("");
            while(resultSetTextArea.next()) {
                jTextArea1.append(resultSetTextArea.getString("country_name") + "\n");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_jButtonMostVisitedActionPerformed

    private void jButtonSpringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSpringActionPerformed
        try {
            String season = "spring";
            String sql = "SELECT * FROM visits WHERE season_visited = ? and username = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, season);
            statement.setString(2, username);
            ResultSet resultSet = statement.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel) jTableVisits.getModel();
            model.setRowCount(0);
            
            if (!resultSet.isBeforeFirst()) {  
                JOptionPane.showMessageDialog(this, "No visits found for season is " + season);
                return;
            }
            
            fillRow(resultSet, model);
            
            String sqlTextArea = "SELECT DISTINCT country_name FROM visits WHERE username = ? and season_visited = ?";
            PreparedStatement statementTextArea = connection.prepareStatement(sqlTextArea);
            statementTextArea.setString(1, username);
            statementTextArea.setString(2, season);
            ResultSet resultSetTextArea = statementTextArea.executeQuery();
            jLabel2.setText("Country Names that are visited only in spring");
            jTextArea1.setText("");
            while(resultSetTextArea.next()) {
                jTextArea1.append(resultSetTextArea.getString("country_name") + "\n");
            }
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_jButtonSpringActionPerformed

    private void jButtonImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImageActionPerformed
        try {
            String sql = "SELECT * FROM visits WHERE visit_id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, jTextFieldImage.getText());
            ResultSet resultSet = statement.executeQuery();
            
            if(!resultSet.isBeforeFirst()) {
                jLabelImage.setIcon(null);
                JOptionPane.showMessageDialog(this, "No visits found");
            } else {
                
                try {
                    String sqlImage = "SELECT city_name FROM visits WHERE visit_id = ?";
                    PreparedStatement statementImage = connection.prepareStatement(sql);
                    statement.setString(1, jTextFieldImage.getText());
                    ResultSet resultSetImage = statement.executeQuery();
                    String city = null;
                    while(resultSetImage.next()) {
                        city = resultSetImage.getString("city_name");
                    }
                    imageIcon = new ImageIcon("D:\\NetBeansProjects\\FavoriteSites\\src\\image\\" + city + ".jpg");
                    
                    Image orgImage = imageIcon.getImage();
                    int width = jLabelImage.getWidth();
                    int height = jLabelImage.getHeight();
                    Image scaleImage = orgImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
                    imageIcon = new ImageIcon(scaleImage);
                    
                    jLabelImage.setIcon(imageIcon);
                } catch (SQLException e) {
                    e.printStackTrace();
                } 
                
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
       
    }//GEN-LAST:event_jButtonImageActionPerformed

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
            java.util.logging.Logger.getLogger(InformationVisits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformationVisits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformationVisits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformationVisits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformationVisits(username).setVisible(true);
            }
        });
    }
    
    private void fillTable() {
        try {
            String sql = "SELECT * FROM visits WHERE username = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel) jTableVisits.getModel();
            model.setRowCount(0);
            
            fillRow(resultSet, model);
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void fillRow(ResultSet resultSet, DefaultTableModel model) {
        try {
            while (resultSet.next()) {
                Object[] row = {
                resultSet.getInt("visit_id"),
                resultSet.getString("username"),
                resultSet.getString("country_name"),
                resultSet.getString("city_name"),
                resultSet.getInt("year_visited"),
                resultSet.getString("season_visited"),
                resultSet.getString("best_feature"),
                resultSet.getString("user_comment"),
                resultSet.getInt("rating")};
                model.addRow(row);
        }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFood;
    private javax.swing.JButton jButtonImage;
    private javax.swing.JButton jButtonMostVisited;
    private javax.swing.JButton jButtonSpring;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableVisits;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldImage;
    private javax.swing.JTextField jTextFieldYear;
    // End of variables declaration//GEN-END:variables
}
