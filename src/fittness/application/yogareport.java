package fittness.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

public class yogareport extends JFrame
{
    JPanel p1;
    JButton b1;
    JLabel l1,l2,l3,l4,l5,l6;
     Font f1=new Font("panton",Font.BOLD,26);
      Font f2=new Font("times new roman",Font.PLAIN,46);
      Font f3=new Font("panton",Font.PLAIN,16);
    JTable t;
    yogareport()
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
                new yoga().setVisible(true);
            }
        });
        
        t=new JTable();
        t.setBounds(0,120,900,650);
        t.setBackground(Color.BLACK);
        t.setForeground(Color.WHITE);
        t.setFont(f3);
        add(t);
        
        l1=new JLabel("Asanas");
        l1.setBounds(20,45,200,30);
        l1.setFont(f1);
        l1.setForeground(Color.WHITE);
        add(l1);
        
        l2=new JLabel("Time");
        l2.setBounds(160,45,200,30);
        l2.setForeground(Color.WHITE);
        l2.setFont(f1);
        add(l2);
        
        l3=new JLabel("Day");
        l3.setBounds(280,45,200,30);
        l3.setFont(f1);
        l3.setForeground(Color.WHITE);
        add(l3);
        
        l4=new JLabel("Date");
        l4.setBounds(420,45,200,30);
        l4.setForeground(Color.WHITE);
        l4.setFont(f1);
        add(l4);
        
        
        JLabel l7=new JLabel("Meal 4");
        l7.setBounds(540,45,200,30);
        l7.setForeground(Color.WHITE);
        l7.setFont(f1);
        add(l7);
        
        l5=new JLabel("Meal 5");
        l5.setBounds(670,45,200,30);
        l5.setForeground(Color.WHITE);
        l5.setFont(f1);
        add(l5);
        
      
        
        b1=new JButton("Load Details");
        b1.setBounds(370,800,200,40);
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
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
                String str="select * from yogareport";
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
        getContentPane().setBackground(Color.BLACK);
        setUndecorated(true);
    }
    public static void main(String args[])
    {
        new yogareport().setVisible(true);
    }
}
