package fittness.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class challenge extends JFrame
{
    JPanel p1;
    Font f1=new Font("panton",Font.BOLD,26);
    Font f2=new Font("times new roman",Font.BOLD,40);
    JTextArea t1;
    challenge()
    {
        p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.cyan);
        p1.setBounds(0,0,600,30);
        add(p1);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/sachin.png"));
        Image i5=i4.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l2=new JLabel("");
        l2.setIcon(i6);
        l2.setBounds(570,6,20,20);
        p1.add(l2);     
        l2.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                dispose();
            }
        });
        
        JLabel l1=new JLabel("Welcome to 1 week challenge");
        l1.setFont(f2);
        l1.setBounds(50,50,500,50);
        l1.setForeground(Color.BLACK);
        add(l1);
        
       
      
        
        JLabel l0=new JLabel("1");
        l0.setFont(f1);
        l0.setBounds(40,120,30,30);
        l0.setForeground(Color.BLACK);
        add(l0);
        l0.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
               new firstday().setVisible(true);
                dispose();
            }
        });
        
        JLabel l4=new JLabel("2");
        l4.setFont(f1);
        l4.setBounds(120,120,30,30);
        l4.setForeground(Color.BLACK);
        add(l4);
        l4.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                new secondday().setVisible(true);
                 dispose();
            }
        });
        
        JLabel a1=new JLabel("3");
        a1.setFont(f1);
        a1.setBounds(200,120,30,30);
        a1.setForeground(Color.BLACK);
        add(a1);
        a1.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
              new thirdday().setVisible(true);
               dispose();
            }
        });
        
        JLabel a2=new JLabel("4");
        a2.setFont(f1);
        a2.setBounds(280,120,30,30);
        a2.setForeground(Color.BLACK);
        add(a2);
        a2.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                   new fourthday().setVisible(true);
                    dispose();
            }
        });
        
        JLabel a3=new JLabel("5");
        a3.setFont(f1);
        a3.setBounds(360,120,30,30);
        a3.setForeground(Color.BLACK);
        add(a3);
        a3.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                new fifthday().setVisible(true);
                 dispose();
            }
        });
        
       JLabel a4=new JLabel("6");
        a4.setFont(f1);
        a4.setBounds(440,120,30,30);
        a4.setForeground(Color.BLACK);
        add(a4);
       a4.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                new sixthday().setVisible(true);
                 dispose();
            }
        });
        
        JLabel l=new JLabel("7");
        l.setFont(f1);
        l.setBounds(520,120,30,30);
        l.setForeground(Color.BLACK);
        add(l);
        l.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                new seventhday().setVisible(true);
                dispose();
            }
        });
        
       
        setSize(600,250);
        setLocation(700,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setUndecorated(true);
    }
 public static void main(String args[])
 {
     new challenge().setVisible(true);
 }
}
