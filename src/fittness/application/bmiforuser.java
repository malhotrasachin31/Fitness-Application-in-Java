package fittness.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class bmiforuser extends JFrame 
{
    JPanel p1;
    JTextField t4,t5;
    JButton add;
    Font f1=new Font("Arial",Font.BOLD,22);
    Font f2=new Font("Times new roman",Font.BOLD,34);
    bmiforuser()
    {
         p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.ORANGE);
        p1.setBounds(0,0,550,30);
        add(p1);
        
        JLabel head=new JLabel("Please Enter the Details Below ");
        head.setBounds(20,50,600,30);
        head.setFont(f2);
        head.setForeground(Color.white);
        add(head);
        
          JLabel l6=new JLabel("Height (in cm)");
        l6.setBounds(20,100,150,30);
        l6.setFont(f1);
        l6.setForeground(Color.white);
        add(l6);
        
        t4=new JTextField();
        t4.setBounds(170,100,70,30);
        t4.setBackground(new Color(7,86,95));
        t4.setForeground(Color.white);
        t4.setFont(f1);
        add(t4);
        
        JLabel l7=new JLabel("Weight (in Kg)");
        l7.setBounds(300,100,150,30);
        l7.setFont(f1);
        l7.setForeground(Color.white);
        add(l7);
        
        t5=new JTextField();
        t5.setBounds(460,100,70,30);
        t5.setBackground(new Color(7,86,95));
        t5.setForeground(Color.white);
        t5.setFont(f1);
        add(t5);
        
          ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/sachin.png"));
        Image i2=i1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel("first");
        l1.setIcon(i3);
        l1.setBounds(520,7,20,20);
        p1.add(l1);
        l1.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                System.exit(0);
            }
        });
        
        add=new JButton("Submit");
        add.setBounds(220,150,120,30);
        add.setFont(f1);
        add.setFocusable(false);
        add.setBackground(Color.ORANGE);
        add.setForeground(Color.BLACK);
        add(add);
         add.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent ae)
             {
                double height=Double.parseDouble(t4.getText());
                double weight=Double.parseDouble(t5.getText());
                double height2=height/100;
                double bmi1=weight/Math.pow(height2, 2);
                String s=Double.toString(bmi1);
                String sachin="one";
                try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/malhotra", "java","java");
                PreparedStatement pst=null;
                String insert="insert into USERINFO values (?,?,?,?)";
                pst=conn.prepareStatement(insert);
                pst.setString(1, t4.getText());
                pst.setString(2, t5.getText());
                pst.setString(3, s);
                pst.setString(4, sachin);
                int a = pst.executeUpdate();
                new welcome().setVisible(true);
                dispose();
                pst.close();
                conn.close();
               }catch(Exception ex)
               {
                   System.out.println(ex);
               }
            }
         });
    
     setSize(550,200);
     setLayout(null);
     setLocation(700,200);
     getContentPane().setBackground(Color.BLACK);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setUndecorated(true);
    }
 public static void main(String args[])
 {
     new bmiforuser().setVisible(true);
 }
}
