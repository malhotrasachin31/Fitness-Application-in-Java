package fittness.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class yoga extends JFrame
{
    JButton b1,b2,b3;
     Font f1=new Font("Times New Roman",Font.BOLD,95);
     Font f2=new Font("arial",Font.BOLD,18);
     JButton a,b,c;
    JPanel p1;
    yoga()
    {
        p1=new JPanel();
        p1.setBounds(0,0,900,30);
        p1.setBackground(Color.BLACK);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/sachin.png"));
        Image i5=i4.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l2=new JLabel("");
        l2.setIcon(i6);
        l2.setBounds(875,5,20,20);
        p1.add(l2);     
        l2.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                dispose();
            }
        });
        
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/y5.jpg"));
        Image i2=i.getImage().getScaledInstance(900, 570, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel ci=new JLabel("");
        ci.setIcon(i3);
        ci.setBounds(0,30,900,570);
        add(ci);
        
        a=new JButton("Yoga Time");
        a.setBounds(50,100,250,40);
        a.setFocusable(false);
        a.setFont(f2);
        a.setBackground(Color.BLACK);
        a.setForeground(Color.ORANGE);
        ci.add(a);
        a.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new yogavibes().setVisible(true);
                dispose();
            }
        });
      
        
        b=new JButton("My Yoga Report");
        b.setBounds(50,170,250,40);
        b.setFocusable(false);
        b.setFont(f2);
        b.setBackground(Color.BLACK);
        b.setForeground(Color.ORANGE);
        ci.add(b);
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new yogareport().setVisible(true);
                dispose();
            }
        });
      
        
        setSize(900,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(null);
       setLocation(550,200);
        getContentPane().setBackground(new Color(50,205,50));
        setUndecorated(true);
    }
 public static void main(String args[])
 {
     new yoga().setVisible(true);
 }
}
