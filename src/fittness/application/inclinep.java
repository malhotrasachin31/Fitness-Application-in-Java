package fittness.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class inclinep extends JFrame
{
    JPanel p1;
    JButton b2;
     Font f1=new Font("panton",Font.BOLD,26);
      Font f2=new Font("times new roman",Font.PLAIN,46);
      Font f3=new Font("panton",Font.BOLD,16);
    inclinep()
    {
        p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(0,0,500,40);
        p1.setBackground(new Color(65,105,225));
        add(p1);

          ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/sachin.png"));
          Image i5=i4.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
          ImageIcon i6=new ImageIcon(i5);
          JLabel l2=new JLabel("");
          l2.setIcon(i6);
          l2.setBounds(460,8,20,20);
          p1.add(l2);     
          l2.addMouseListener(new MouseAdapter()
          {
              public void mouseClicked(MouseEvent me)
              {
                  dispose();
              }
          });

          ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/ip2.gif"));
         Image i0=i.getImage().getScaledInstance(450,450,Image.SCALE_DEFAULT);
         ImageIcon i1=new ImageIcon(i0);
        JLabel l=new JLabel("");
        l.setIcon(i1);
        l.setBounds(20,50,450,450);
        add(l);
        
        JLabel jj=new JLabel("Incline Push-ups of 16 reps");
        jj.setBounds(60,500,450,40);
        jj.setFont(f1);
        add(jj);
        
            b2=new JButton("Next");
        b2.setFont(f1);
        b2.setFocusable(false);
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65,105,225));
        b2.setBounds(150,700,200,40);
        add(b2);
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new kneepush().setVisible(true);
                dispose();
            }
        });
          
        setSize(500,800);
        setLocation(850,50);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setUndecorated(true);
        getContentPane().setBackground(new Color(255,255,204));
    }
    public static void main(String args[])
    {
        new inclinep().setVisible(true);
    }
}
