package fittness.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class report extends JFrame
{
    JPanel p1;
    report()
    {
     p1=new JPanel();
     p1.setLayout(null);
     p1.setBounds(0,0,700,40);
     p1.setBackground(Color.GREEN);
     add(p1);
        
        ImageIcon a=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/sachin.png"));
        Image a2=a.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon a3=new ImageIcon(a2);
        JLabel a4=new JLabel();
        a4.setIcon(a3);
        a4.setBounds(500,4,30,30);
        p1.add(a4);
        a4.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                dispose();
            }
        });
     
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/ab.png"));
        Image i2=i.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel im=new JLabel("");
        im.setIcon(i3);
        im.setBounds(20,60,150,150);
        add(im);
         im.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent ae)
            {
                new absR().setVisible(true);
                 dispose();
            }
        });
        
        
       ImageIcon squats=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/chest.png"));
        Image squats2=squats.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon squats3=new ImageIcon(squats2);
        JLabel l1=new JLabel("");
        l1.setIcon(squats3);
        l1.setBounds(200,60,150,150);
        add(l1);
          l1.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent ae)
            {
                new chestR().setVisible(true);
                 dispose();
            }
        });
        
       ImageIcon s=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/leg.png"));
        Image s2=s.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon s3=new ImageIcon(s2);
        JLabel c=new JLabel("");
        c.setIcon(s3);
        c.setBounds(380,60,150,150);
        add(c);
         c.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent ae)
            {
                new legR().setVisible(true);
                 dispose();
            }
        });
        
        
       ImageIcon ii=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/sw.png"));
        Image ii2=ii.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon ii3=new ImageIcon(ii2);
        JLabel ci=new JLabel("");
        ci.setIcon(ii3);
        ci.setBounds(20,240,150,150);
        add(ci);
         ci.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent ae)
            {
                new shoulderR().setVisible(true);
                 dispose();
            }
        });
        
        
       ImageIcon t=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/b.jpg"));
        Image t2=t.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon t3=new ImageIcon(t2);
        JLabel q=new JLabel("");
        q.setIcon(t3);
        q.setBounds(200,240,150,150);
        add(q);
         q.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent ae)
            {
                new tricepR().setVisible(true);
                 dispose();
            }
        });
        
        
         ImageIcon n=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/tru.png"));
        Image n2=n.getImage().getScaledInstance(200, 150, Image.SCALE_DEFAULT);
        ImageIcon n3=new ImageIcon(n2);
        JLabel nci=new JLabel("");
        nci.setIcon(n3);
        nci.setBounds(380,240,150,150);
        add(nci);
        nci.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent ae)
            {
                new bicepR().setVisible(true);
                 dispose();
            }
        });
        
         ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/qw2.jpg"));
        Image i5=i4.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l2=new JLabel("");
        l2.setIcon(i6);
        l2.setBounds(20,420,150,150);
        add(l2);     
        l2.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                new quarintineR().setVisible(true);
                dispose();
            }
        });
        
         ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/cardio.jpg"));
         Image i0=i11.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
         ImageIcon i1=new ImageIcon(i0);
        JLabel l=new JLabel("");
        l.setIcon(i1);
        l.setBounds(200,420,150,150);
        add(l);
         l.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                new cardioR().setVisible(true);
                 dispose();
                
            }
        });
        
        
          ImageIcon ir4=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/fb.png"));
          Image ir5=ir4.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
          ImageIcon ir6=new ImageIcon(ir5);
          JLabel lr2=new JLabel("");
          lr2.setIcon(ir6);
          lr2.setBounds(380,420,150,150);
          add(lr2);
             lr2.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                new r1().setVisible(true);
                dispose();
            }
        });
        
     setSize(550,600);
     setLayout(null);
     setLocation(700,200);
     getContentPane().setBackground(new Color(255,255,205));
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setUndecorated(true);
    }
 public static void main(String args[]) 
 {
     new report().setVisible(true);
 }
}
