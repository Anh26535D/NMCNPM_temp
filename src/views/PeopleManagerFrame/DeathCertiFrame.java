package views.PeopleManagerFrame;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;

public class DeathCertiFrame extends javax.swing.JFrame {


    private JFrame parentJFrame = null;
    
    public DeathCertiFrame(JFrame parentJFrame) {
    	getContentPane().setBackground(new Color(255, 255, 255));
        initComponents();
        this.parentJFrame = parentJFrame;
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        parentJFrame.setEnabled(false);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                close();
            }
            
        });
    }
    
    private void close() {
        if (JOptionPane.showConfirmDialog(this, "Are you sure to close??", "Confirm", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            this.parentJFrame.setEnabled(true);
            dispose();
        }
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel1.setEnabled(false);
        jPanel1.setBackground(new Color(240, 248, 255));
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds(10, 10, 143, 30);
        jTextField1 = new javax.swing.JTextField();
        jTextField1.setBounds(163, 11, 274, 30);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setBounds(10, 114, 110, 30);
        jTextField2 = new javax.swing.JTextField();
        jTextField2.setBackground(new Color(255, 255, 255));
        jTextField2.setBounds(138, 115, 418, 30);
        jButton2 = new javax.swing.JButton();
        jButton2.setBounds(450, 380, 106, 25);
        jButton3 = new javax.swing.JButton();
        jButton3.setBounds(321, 380, 106, 25);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(12, 175, 74, 30);
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser1.setEnabled(false);
        jDateChooser1.setOpaque(false);
        jDateChooser1.getCalendarButton().setBackground(new Color(255, 255, 255));
        jDateChooser1.setBackground(new Color(255, 255, 255));
        jDateChooser1.setBounds(138, 175, 418, 30);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setBounds(10, 223, 76, 30);
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser2.setEnabled(false);
        jDateChooser2.getCalendarButton().setBackground(new Color(255, 255, 255));
        jDateChooser2.setBackground(new Color(255, 255, 255));
        jDateChooser2.setBounds(138, 223, 418, 30);
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setBounds(10, 271, 79, 30);
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane1.setBounds(137, 271, 419, 91);
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton1.setBounds(450, 10, 76, 30);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setBounds(536, 10, 32, 32);
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setBounds(10, 60, 140, 30);
        jTextField3 = new javax.swing.JTextField();
        jTextField3.setBounds(163, 61, 274, 30);
        jButton4 = new javax.swing.JButton();
        jButton4.setBounds(450, 60, 76, 30);
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setBounds(536, 58, 32, 32);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tohama", 1, 14));  
        jLabel1.setText("S??? CMT ng?????i khai:");

        jTextField1.setFont(new java.awt.Font("Tohama", 0, 14));  

        jLabel2.setFont(new java.awt.Font("Tohama", 1, 14));  
        jLabel2.setText("S??? gi???y khai t???:");

        jTextField2.setFont(new java.awt.Font("Tohama", 0, 14));  
        jTextField2.setEnabled(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton2.setText("X??c nh???n");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBackground(new Color(147, 112, 219));
		jButton2.setFont(new Font("Tahoma", Font.BOLD, 15));
		jButton2.setForeground(new Color(255, 255, 255));
		jButton2.setBorderPainted(false);

        
        jButton3.setText("H???y");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.setBackground(new Color(147, 112, 219));
		jButton3.setFont(new Font("Tahoma", Font.BOLD, 15));
		jButton3.setForeground(new Color(255, 255, 255));
		jButton3.setBorderPainted(false);
	
      

        jLabel4.setFont(new java.awt.Font("Tohama", 1, 14));  
        jLabel4.setText("Ng??y khai:");

        jLabel5.setFont(new java.awt.Font("Tohama", 1, 14));  
        jLabel5.setText("Ng??y ch???t:");

        jLabel6.setFont(new java.awt.Font("Tohama", 1, 14));  
        jLabel6.setText("L?? do ch???t:");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tohama", 0, 14));  
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setBorderPainted(false);
		jButton1.setForeground(new Color(255, 255, 255));
		jButton1.setBackground(new Color(147, 112, 219));
        jButton1.setFont(new java.awt.Font("Tohama", 0, 14));  
        jButton1.setText("Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/checked.png")));  
        jLabel3.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tohama", 1, 14));  
        jLabel7.setText("S??? CMT ng?????i ch???t:");

        jTextField3.setFont(new java.awt.Font("Tohama", 0, 14));  

        jButton4.setBorderPainted(false);
		jButton4.setForeground(new Color(255, 255, 255));
		jButton4.setBackground(new Color(147, 112, 219));
        jButton4.setFont(new java.awt.Font("Tohama", 0, 14));  
        jButton4.setText("Check");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });


        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/checked.png")));  
        jLabel8.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 586, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);
        jPanel1.setLayout(null);
        jPanel1.add(jButton3);
        jPanel1.add(jButton2);
        jPanel1.add(jLabel4);
        jPanel1.add(jLabel5);
        jPanel1.add(jLabel2);
        jPanel1.add(jDateChooser1);
        jPanel1.add(jTextField2);
        jPanel1.add(jDateChooser2);
        jPanel1.add(jLabel6);
        jPanel1.add(jScrollPane1);
        jPanel1.add(jLabel1);
        jPanel1.add(jTextField1);
        jPanel1.add(jLabel7);
        jPanel1.add(jTextField3);
        jPanel1.add(jButton1);
        jPanel1.add(jLabel3);
        jPanel1.add(jButton4);
        jPanel1.add(jLabel8);

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        close();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
    	 close();
    }
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}