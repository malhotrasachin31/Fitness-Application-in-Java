package fittness.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class r1 extends JFrame
{
    JPanel p1;
    JButton b1,b2,b3,b4,b5,b6,b7;
    Font f1=new Font("arial",Font.BOLD,16);
    r1()
    {
         p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(0,0,700,30);
        p1.setBackground(Color.GREEN);
        add(p1);
        
        ImageIcon a=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/sachin.png"));
        Image a2=a.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon a3=new ImageIcon(a2);
        JLabel a4=new JLabel();
        a4.setIcon(a3);
        a4.setBounds(670,4,20,20);
        p1.add(a4);
        a4.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                dispose();
                new report().setVisible(true);
            }
        });
        
            ImageIcon s=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/r2.jpg"));
            Image t=s.getImage().getScaledInstance(800,700,Image.SCALE_DEFAULT);
            ImageIcon u=new ImageIcon(t);
           JLabel inc=new JLabel("");
           inc.setIcon(u);
           inc.setBounds(0,30,700,700);
           add(inc);
        
         b1=new JButton("First Day Workout Report");
         b1.setBounds(20,100,300,40);
         b1.setBackground(Color.BLACK);
         b1.setFont(f1);
         b1.setForeground(Color.GREEN);
         b1.setFocusable(false);
         inc.add(b1);
         b1.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent ae)
             {
                 new firstdayreport().setVisible(true);
                 dispose();
             }
         });
           
         b2=new JButton("Second Day Workout Report");
         b2.setBounds(20,170,300,40);
         b2.setBackground(Color.BLACK);
         b2.setFont(f1);
         b2.setForeground(Color.GREEN);
         b2.setFocusable(false);
         inc.add(b2);
          b2.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent ae)
             {
                 new seconddayreport().setVisible(true);
                 dispose();
             }
         });
           
         
         
         b3=new JButton("Third Day Workout Report");
         b3.setBounds(20,240,300,40);
         b3.setBackground(Color.BLACK);
         b3.setFont(f1);
         b3.setForeground(Color.GREEN);
         b3.setFocusable(false);
         inc.add(b3);
         b3.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent ae)
             {
                 new thirddayreport().setVisible(true);
                 dispose();
             }
         });
           
         
         
         b4=new JButton("Fourth Day Workout Report");
         b4.setBounds(20,310,300,40);
         b4.setBackground(Color.BLACK);
         b4.setFont(f1);
         b4.setForeground(Color.GREEN);
         b4.setFocusable(false);
         inc.add(b4);
          b4.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent ae)
             {
                 new fourthdayreport().setVisible(true);
                 dispose();
             }
         });
           
         
         
         b5=new JButton("Fifth Day Workout Report");
         b5.setBounds(20,380,300,40);
         b5.setBackground(Color.BLACK);
         b5.setFont(f1);
         b5.setForeground(Color.GREEN);
         b5.setFocusable(false);
         inc.add(b5);
         b5.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent ae)
             {
                 new fifthdayreport().setVisible(true);
                 dispose();
             }
         });
           
         
         
         b6=new JButton("Sixth Day Workout Report");
         b6.setBounds(20,450,300,40);
         b6.setBackground(Color.BLACK);
         b6.setFont(f1);
         b6.setForeground(Color.GREEN);
         b6.setFocusable(false);
         inc.add(b6);
          b6.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent ae)
             {
                 new sixthdayreport().setVisible(true);
                 dispose();
             }
         });
           
         
         
         b7=new JButton("Seventh Day Workout Report");
         b7.setBounds(20,520,300,40);
         b7.setBackground(Color.BLACK);
         b7.setFont(f1);
         b7.setForeground(Color.GREEN);
         b7.setFocusable(false);
         inc.add(b7);
          b7.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent ae)
             {
                 new seventhdayreport().setVisible(true);
                 dispose();
             }
         });
           
         
        setSize(700,700);
        setLocation(600,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setUndecorated(true);
        
    }
 public static void main(String args[])
 {
     new r1().setVisible(true);
 }
}
