
import java.awt.event.MouseEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chathura
 */
public class booking extends javax.swing.JFrame implements MouseListener {

    /**
     * Creates new form booking
     */
    public booking() {
        initComponents();
        lbl1.addMouseListener(this);
        lbl2.addMouseListener(this);
        lbl3.addMouseListener(this);
        lbl4.addMouseListener(this);
        lbl5.addMouseListener(this);
        lbl6.addMouseListener(this);
        lbl7.addMouseListener(this);
        lbl8.addMouseListener(this);
        lbl9.addMouseListener(this);
        lbl10.addMouseListener(this);
        lbl11.addMouseListener(this);
        lbl12.addMouseListener(this);
        connect();
    }

      int seatno=0;
      Connection con;
      PreparedStatement pst;
      ResultSet rs;
      
      public void connect() 
      {
          try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con= DriverManager.getConnection("jdbc:mysql://localhost/buss", "root", "");
          }catch (ClassNotFoundException ex){
               
                Logger.getLogger(booking.class.getName()).log(Level.SEVERE, null ,ex);
          
          } catch (SQLException ex) {
            Logger.getLogger(booking.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lbl2 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtcust = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtdate = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtbill = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Advanced Bus Booking System");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Seats");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, 30));

        txtprice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 180, 30));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl2.setText("2");
        jPanel1.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        lbl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl1.setText("1");
        jPanel1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        lbl4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl4.setText("4");
        jPanel1.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        lbl3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl3.setText("3");
        jPanel1.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        lbl6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl6.setText("6");
        jPanel1.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        lbl5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl5.setText("5");
        jPanel1.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        lbl12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl12.setText("12");
        jPanel1.add(lbl12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        lbl11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl11.setText("11");
        jPanel1.add(lbl11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        lbl10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl10.setText("10");
        jPanel1.add(lbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        lbl9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl9.setText("9");
        jPanel1.add(lbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        lbl8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl8.setText("8");
        jPanel1.add(lbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        lbl7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl7.setText("7");
        jPanel1.add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 250, 140));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Price");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Customer");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 30));

        txtcust.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtcust, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 180, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 110, 50));
        getContentPane().add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 360, 170));

        txtbill.setColumns(20);
        txtbill.setRows(5);
        jScrollPane1.setViewportView(txtbill);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, 350, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String customer = txtcust.getText();
        int seats1 = seatno;
        String price = txtprice.getText();
        
        SimpleDateFormat date_form = new SimpleDateFormat("yyyy-MM-dd");
        String date = date_form.format(txtdate.getDate());
        
        try {
            pst = con.prepareStatement("select * from book where date = ? and seatno = ?");
            pst.setString(1, date);
            pst.setInt(2,seats1);
            rs = pst.executeQuery();
            
           if(rs.next() ==true)
           {
               JOptionPane.showMessageDialog(this, "This Seat No Already Booked!!!");
           }
           else
           {
            pst = con.prepareStatement("insert into book(cname,seatno,price,date)values(?,?,?,?)");
            pst.setString(1, customer);
            pst.setInt(2, seats1);
            pst.setString(3, price);
            pst.setString(4, date);
            int k = pst.executeUpdate();
            
            if(k==1)
            {
               JOptionPane.showMessageDialog(this, "Seat Booked ");

            }else
            {
              JOptionPane.showMessageDialog(this, "Some this wrong");               
            
            }
            
           }
            

        } catch (SQLException ex) {
            Logger.getLogger(booking.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JTextArea txtbill;
    private javax.swing.JTextField txtcust;
    private com.toedter.calendar.JCalendar txtdate;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource() == lbl1)
        {
           seatno = 1;
        }    
        else if(e.getSource() == lbl2)        
        {
           seatno = 2;
        }
        else if(e.getSource() == lbl3)        
        {
           seatno = 3;
        }
        else if(e.getSource() == lbl4)        
        {
           seatno = 4;
        }
        else if(e.getSource() == lbl5)        
        {
           seatno = 5;
        }
        else if(e.getSource() == lbl6)        
        {
           seatno = 6;
        }
        else if(e.getSource() == lbl7)        
        {
           seatno = 7;
        }
        else if(e.getSource() == lbl8)        
        {
           seatno = 8;
        }
        else if(e.getSource() == lbl9)        
        {
           seatno = 9;
        }
        else if(e.getSource() == lbl10)        
        {
           seatno = 10;
        }
        else if(e.getSource() == lbl1)        
        {
           seatno = 11;
        }
        else if(e.getSource() == lbl12)        
        {
           seatno = 12;
        }
       
      JOptionPane.showMessageDialog(this, seatno);
        
        
        
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
