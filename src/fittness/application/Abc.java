package fittness.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


   
public class Abc extends JFrame 
{
    Abc()
    {
         Font f1=new Font("times new roman",Font.BOLD,20);
    JButton b1;
 
     ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/sachin.png"));
     Image i5=i4.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
     ImageIcon i6=new ImageIcon(i5);
     JLabel l2=new JLabel("");
     l2.setIcon(i6);
     l2.setBounds(950,15,30,30);
     add(l2);     
     l2.addMouseListener(new MouseAdapter()
     {
         public void mouseClicked(MouseEvent me)
         {
             System.exit(0);
         }
     });
     
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/fit.png"));
     Image i2=i1.getImage().getScaledInstance(500,250,Image.SCALE_DEFAULT);
     ImageIcon i3=new ImageIcon(i2);
     JLabel l1=new JLabel("");
     l1.setIcon(i3);
     l1.setBounds(250,50,500,300);
     add(l1);
     
     JLabel l3=new JLabel("EXCERSICE NOT ONLY CHANGES YOUR BODY , IT ALSO CHANGES YOUR MIND");
     l3.setForeground(Color.white);
     l3.setFont(f1);
     l3.setBounds(120,350,800,30);
     add(l3);
     
     b1=new JButton("Next");
     b1.setBounds(750,550,100,30);
     b1.setFocusable(false);
     b1.setBackground(Color.white);
     b1.setForeground(Color.BLACK);
     b1.setFont(f1);
     add(b1);
     b1.addActionListener(new ActionListener()
             {
                 public void actionPerformed(ActionEvent ae)
             {
                  new softinfo().setVisible(true);
            dispose();
             }
             });
     
     setLayout(null);
     setSize(1000,600);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setResizable(true);
     getContentPane().setBackground(new Color(7,89,67));
     setLocation(500,200);
     setUndecorated(true);
 }
 
 public static void main(String args[])
 {
     new Abc().setVisible(true);
 }
}
