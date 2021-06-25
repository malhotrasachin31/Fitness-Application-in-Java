package fittness.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class dpi extends JFrame
{
    JButton b1,b2,b3;
     Font f1=new Font("Times New Roman",Font.BOLD,100);
    JPanel p1;
    dpi()
    {
        p1=new JPanel();
        p1.setBounds(0,0,1920,40);
        p1.setBackground(Color.ORANGE);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/sachin.png"));
        Image i5=i4.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l2=new JLabel("");
        l2.setIcon(i6);
        l2.setBounds(1885,9,20,20);
        p1.add(l2);     
        l2.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                dispose();
            }
        });
        
        JPanel p2=new JPanel();
        p2.setBounds(0,40,1920,145);
        p2.setLayout(null);
        p2.setBackground(Color.WHITE);
        add(p2);
        
        JLabel l=new JLabel("Basic Information About What to Eat ");
        l.setBounds(150,40,1780,100);
        l.setBackground(Color.BLACK);
        l.setFont(f1);
        p2.add(l);
        
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/dp2.png"));
        Image i2=i.getImage().getScaledInstance(1870, 1080, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel ci=new JLabel("");
        ci.setIcon(i3);
        ci.setBounds(20,20,1920,1080);
        add(ci);
        
        setSize(1920,1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setUndecorated(true);
    }
 public static void main(String args[])
 {
     new dpi().setVisible(true);
 }
}
