package fittness.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class dietPlan extends JFrame
{
    JPanel p1;
    JButton b1,b2,b3;
    Font f1=new Font("Times New Roman",Font.BOLD,20);
    dietPlan()
    {
      p1=new JPanel();
      p1.setLayout(null);
      p1.setBounds(0,0,700,30);
      p1.setBackground(new Color(65,105,225));
      add(p1);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/sachin.png"));
        Image i5=i4.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l2=new JLabel("");
        l2.setIcon(i6);
        l2.setBounds(675,5,20,20);
        p1.add(l2);     
        l2.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                dispose();
            }
        });
     
        
           ImageIcon ie4=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/diet.png"));
          Image ie5=ie4.getImage().getScaledInstance(700,300,Image.SCALE_DEFAULT);
          ImageIcon ie6=new ImageIcon(ie5);
          JLabel le2=new JLabel("");
          le2.setIcon(ie6);
          le2.setBounds(0,0,700,300);
          add(le2);     
        
        b1=new JButton("Diet Plan Information");
        b1.setFocusable(false);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.setBounds(420,80,230,40);
        b1.setFont(f1);
        le2.add(b1);
         b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new dpi().setVisible(true);
            }
        });
        
        
        b3=new JButton("Show My Diet Plan");
        b3.setFocusable(false);
        b3.setBackground(Color.BLUE);
        b3.setForeground(Color.WHITE);
        b3.setBounds(420,130,230,40);
        b3.setFont(f1);
        le2.add(b3);
         b3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new show().setVisible(true);
            }
        });
        
        
        
        b2=new JButton("Create A Diet Plan");
        b2.setFocusable(false);
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        b2.setBounds(420,180,230,40);
        b2.setFont(f1);
        le2.add(b2);
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new create().setVisible(true);
            }
        });
        
        setSize(700,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(600,200);
        setLayout(null);
        setUndecorated(true);
    }
 public static void main(String args[])
 {
     new dietPlan().setVisible(true);
 }
}
