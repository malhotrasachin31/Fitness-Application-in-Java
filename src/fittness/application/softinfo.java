package fittness.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class softinfo extends JFrame implements ActionListener
{
    Font f1=new Font("verdana",Font.BOLD,24);
     Font f2=new Font("verdana",Font.BOLD,12);
    JTextArea ta;
    JButton b1,b2,b3;
    JRadioButton r1,r2,r3,r4,r5;
    softinfo()
    { 
       ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/sachin.png"));
     Image i5=i4.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
     ImageIcon i6=new ImageIcon(i5);
     JLabel l2=new JLabel("");
     l2.setIcon(i6);
     l2.setBounds(950,8,30,30);
     add(l2);     
     l2.addMouseListener(new MouseAdapter()
     {
         public void mouseClicked(MouseEvent me)
         {
             System.exit(0);
         }
     });
      
      ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/fit.png"));
     Image i2=i1.getImage().getScaledInstance(350,200,Image.SCALE_DEFAULT);
     ImageIcon i3=new ImageIcon(i2);
     JLabel l3=new JLabel("");
     l3.setIcon(i3);
     l3.setBounds(10,10,350,200);
     add(l3);
     
     String information="\t............SOFTWARE INSTRUCTIONS.............\n\n\n This is the Fitness Application developed by Project Fitness in 2020. This is made with \n a thought that every one needs to be fit. This software is used for checking BMI and \n also guide you to make you healthy"
     + "\n\n\n You can Trust this application for your physical development."
     + "\n\nFor rxploring this applicatio kindly install this software";
     
     ta=new JTextArea();
     ta.setBackground(new Color(7,89,67));
     ta.setForeground(Color.WHITE);
     ta.setBounds(400,70,580,400);
     ta.setEditable(false);
     ta.setFont(f2);
     ta.setText(information);
     add(ta);
     
     r1=new JRadioButton("I Accept all the policies");
     r1.setBounds(10,260,200,30);
     r1.setFont(f2);
     r1.setFocusable(true);
     r1.setBackground(new Color(7,89,67));
     r1.setForeground(Color.WHITE);
     ta.add(r1);
     r1.addActionListener(this);
     
     b2=new JButton("Next");
     b2.setBounds(710,550,100,30);
     b2.setFocusable(false);
     b2.setBackground(Color.white);
     b2.setForeground(Color.BLACK);
     b2.setFont(f2);
     b2.setEnabled(false);
     add(b2);
     b2.addActionListener(new ActionListener()
     {
         public void actionPerformed(ActionEvent ae)
         {
             new setup().setVisible(true);
             dispose();
         }
     });
     
     
     b3=new JButton("Cancel");
     b3.setBounds(820,550,100,30);
     b3.setFocusable(false);
     b3.setEnabled(true);
     b3.setBackground(Color.white);
     b3.setForeground(Color.BLACK);
     b3.setFont(f2);
     add(b3);
     b3.addActionListener(new ActionListener()
     {
         public void actionPerformed(ActionEvent ae)
         {
             System.exit(0);
         }
     });
     
     r2=new JRadioButton("INTRODUCTION");
     r2.setFont(f2);
     r2.setFocusable(true);
     r2.setBackground(new Color(7,89,67));
     r2.setForeground(Color.WHITE);
     r2.setBounds(50,250,150,30);
     r2.setSelected(true);
     add(r2);
      
      r3=new JRadioButton("SOME INSTRUCTIONS");
      r3.setFont(f2);
      r3.setFocusable(true);
      r3.setBackground(new Color(7,89,67));
      r3.setForeground(Color.WHITE);
      r3.setBounds(50,280,200,30);
      r3.setSelected(true);
      add(r3);
      
     r4=new JRadioButton("SETTING UP YOUR SOFTWARE");
     r4.setFont(f2);
     r4.setFocusable(true);
     r4.setBackground(new Color(7,89,67));
     r4.setForeground(Color.WHITE);
     r4.setBounds(50,310,250,30);
     r4.setSelected(false);
     add(r4);
     
     r5=new JRadioButton("WELCOME");
     r5.setFont(f2);
     r5.setFocusable(true);
     r5.setBackground(new Color(7,89,67));
     r5.setForeground(Color.WHITE);
     r5.setBounds(50,340,250,30);
     r5.setSelected(false);
     add(r5);
     
 
         
     
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
        new softinfo().setVisible(true);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
       if(r1.isSelected())
       {
           b2.setEnabled(true);
       }
       if(!r1.isSelected())
       {
           b2.setEnabled(false);
       }
    }
}
