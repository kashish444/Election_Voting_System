/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.votingsystem;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author hp
 */

public class Form10 extends javax.swing.JFrame {

    /**
     * Creates new form Form10
     */
    int v;
    ImageIcon icon;
    Statement stmt;
    Connection con;
    public Form10() throws ClassNotFoundException, SQLException {
        initComponents();
        icon=new ImageIcon("C:/Users/Oem/Documents/NetBeansProjects/com.mycompany_VotingSystem_jar_1.0-SNAPSHOT/src/main/java/com/mycompany/votingsystem/Images/images.png");
        setIconImage(icon.getImage());
         setExtendedState(JFrame.MAXIMIZED_BOTH);
          getContentPane().setBackground(new Color(51,255,153));
        addWindowListener(new WinClose());
        
           Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem","root","Pritpal@1999");
        stmt=con.createStatement();
        
         ResultSet rs=stmt.executeQuery("select * from passwords");
         int b = 0;
        while(rs.next())
        {
            if(rs.getString(2).equals("BA"))
            {
                b=Integer.parseInt(rs.getString(3));    
            }
        }
        
        rs=stmt.executeQuery("select * from booths");
        while(rs.next())
        {
            if(rs.getInt(3)==b)
            {
                String s=rs.getString(4);
                 v=rs.getInt(5);
                jLabel1.setText("Booth NO: "+b);
                jLabel2.setText("Booth Name: "+s);
                jLabel3.setText("Number of votes on this booth: "+v);
            }
        }
          int total=0;
             rs =stmt.executeQuery("Select * from result");
            while(rs.next())
             {
                       total=total+rs.getInt(1);                     
             }
            
            double d=(total/(double)v)*100;
            jLabel4.setText("Total Votes Polled: "+total);
                jLabel5.setText("Vote %AGE: "+d);
    }
    class WinClose extends WindowAdapter
	{
               
                @Override
                public void windowOpened(WindowEvent e) 
                {
                    ResultSet rs=null;
                    try {
                        rs = stmt.executeQuery("select * from result");
                    } catch (SQLException ex) {
                        Logger.getLogger(Form10.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    int v1=0,v2=0,v3=0,v4=0,v5=0;
                    try {
                        rs.next();
                    } catch (SQLException ex) {
                        Logger.getLogger(Form10.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        v1=rs.getInt(1);
                    } catch (SQLException ex) {
                        Logger.getLogger(Form10.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    try {
                        rs.next();
                    } catch (SQLException ex) {
                        Logger.getLogger(Form10.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        v2=rs.getInt(1);
                    } catch (SQLException ex) {
                        Logger.getLogger(Form10.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    try {
                        rs.next();
                    } catch (SQLException ex) {
                        Logger.getLogger(Form10.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        v3=rs.getInt(1);
                    } catch (SQLException ex) {
                        Logger.getLogger(Form10.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    try {
                        rs.next();
                    } catch (SQLException ex) {
                        Logger.getLogger(Form10.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        v4=rs.getInt(1);
                    } catch (SQLException ex) {
                        Logger.getLogger(Form10.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    try {
                        rs.next();
                    } catch (SQLException ex) {
                        Logger.getLogger(Form10.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        v5=rs.getInt(1);
                    } catch (SQLException ex) {
                        Logger.getLogger(Form10.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    jTextArea1.setText("**********************************************"+
                            "\n1. RAHUL GANDHI VOTES CASTED = "+v1+"\n\n2. NARENDER MODI VOTES CASTED = "+v2+
                            "\n\n3. KEJRIWAL VOTES CASTED = "+v3+"\n\n4. SUKHBIR BADAL VOTES CASTED = "+v4
                    +"\n\n5. NOTA VOTES CASTED = "+v5+"\n**********************************************");
                }
		public void windowClosing(WindowEvent e)
		{
                    try {
                        new Form2().setVisible(true);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Form10.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(Form10.class.getName()).log(Level.SEVERE, null, ex);
                    }
                      
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RESULT FORM");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 102), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Booth Name: NO SELECTED ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 912, 47));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Number of votes on this Booth: X");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 427, 50));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Booth No: NO SELECTED");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 320, 47));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 142, 596, 340));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Total Votes Polled: X");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 293, 51));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Vote %age: X");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 275, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 760, 570));

        jLabel6.setBackground(new java.awt.Color(255, 51, 204));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel6.setText("                   RESULTS");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 540, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Form10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Form10().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Form10.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Form10.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
