package fittness.application;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class chestR extends JFrame
{
    
    JPanel p1;
    JButton b1;
    JLabel l1,l2,l3,l4,l5;
     Font f1=new Font("panton",Font.BOLD,26);
      Font f2=new Font("times new roman",Font.PLAIN,46);
      Font f3=new Font("panton",Font.PLAIN,16);
    JTable t;
    
    chestR()
    {
        

  
        p1=new JPanel();
        p1.setBounds(0,0,900,40);
        p1.setBackground(Color.darkGray);
        p1.setLayout(null);
        add(p1);
                
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/sachin.png"));
        Image i2=i1.getImage().getScaledInstance(30, 30,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel();
        l1.setBounds(860,7,30,30);
        l1.setIcon(i3);
        p1.add(l1);
        l1.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                dispose();
                new report().setVisible(true);
            }
        });
        
        t=new JTable();
        t.setBounds(0,120,900,700);
        t.setBackground(new Color(255,255,205));
        t.setForeground(Color.BLACK);
        t.setFont(f3);
        add(t);
        
        l1=new JLabel("Total Workout");
        l1.setBounds(0,45,200,30);
        l1.setFont(f1);
        add(l1);
        
        l2=new JLabel("Total Time");
        l2.setBounds(220,45,200,30);
        l2.setFont(f1);
        add(l2);
        
        l3=new JLabel("Total Calories");
        l3.setBounds(370,45,200,30);
        l3.setFont(f1);
        add(l3);
        
        l4=new JLabel("Day");
        l4.setBounds(580,45,200,30);
        l4.setFont(f1);
        add(l4);
        
        l5=new JLabel("Date");
        l5.setBounds(740,45,200,30);
        l5.setFont(f1);
        add(l5);
        
    
        
        b1=new JButton("Load Details");
        b1.setBounds(370,800,200,40);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(f3);
        b1.setFocusable(false);
        add(b1);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/malhotra","java","java");
                PreparedStatement pst=null;
                ResultSet rs=null;
                String str="select * from chest";
                pst=conn.prepareStatement(str);
                rs=pst.executeQuery();
                t.setModel(DbUtils.resultSetToTableModel(rs));
                
                     }catch(Exception ex)
                     {
                         System.out.println(ex);
                     }
            }
        });
        
        setSize(900,900);
        setLayout(null);
        setLocation(550,60);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(255,255,205));
        setUndecorated(true);
    }

    
 public static void main(String args[])
 {
     new chestR().setVisible(true);
 }
}

