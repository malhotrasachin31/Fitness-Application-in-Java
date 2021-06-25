package fittness.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class training extends JFrame implements ActionListener
{
    JScrollPane sp1;
    JPanel ta;
     Font f2=new Font("times new roman",Font.BOLD,26);
    JPanel p1,p2;
    
    JButton b3,b6,b9;
    JButton b,e,h,a,c,d;
    training()
    {
        p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.BLACK);
        p1.setSize(406,1080);
        add(p1);
        
        String quotes=" “The better you get, the less you run around showing off as a muscle guy. You know, you wear regular shirts-not always trying to show off what you have. You talk less about it. It’s like you have a little BMW – you want to race the hell out of this car, because you know it’s just going 110. But if you see guys driving a ferrari or a lamborghini, they slide around at 60 on the freeway because they know if they press on that accelerator they are going to go 170. These things are the same in every field.” \n\n–  Arnold Schwarzenegger";
        
        JTextArea q=new JTextArea(quotes);
        q.setFont(f2);
        q.setWrapStyleWord(true);
        q.setLineWrap(true);
        q.setEditable(false);
        q.setForeground(Color.WHITE);
        q.setBackground(Color.BLACK);
        q.setBounds(55,250,300,800);
        p1.add(q);
        
         /*ImageIcon f=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/home.png"));
          Image f2=f.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
          ImageIcon f3=new ImageIcon(f2);
          JLabel l2=new JLabel("");
          l2.setIcon(i0);
          l2.setBounds(450,20,50,50);
          l2.setLayout(null);
          p2.add(l2);*/
          
         p2=new JPanel();
         p2.setLayout(null);
         p2.setBackground(Color.ORANGE);
         p2.setBounds(398,0,1530,1080);
         add(p2);
         
         
          ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/training.jpg"));
          Image i5=i4.getImage().getScaledInstance(1530,1080,Image.SCALE_DEFAULT);
          ImageIcon i6=new ImageIcon(i5);
          JLabel l=new JLabel("");
          l.setIcon(i6);
          l.setBounds(0,0,1530,1080);
          p2.add(l);     
         
         b=new JButton("Chest Workout");
         b.setLayout(null);
         b.setFont(f2);
         b.setForeground(Color.WHITE);
         b.setFocusable(false);
         b.setBackground(Color.BLACK);
         b.setBounds(1260,350,250,70);
         l.add(b);
         b.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent ae)
             {
                 new chest().setVisible(true);
             }
         });
        
         
         e=new JButton("shoulders Workout");
         e.setLayout(null);
         e.setFont(f2);
         e.setForeground(Color.WHITE);
         e.setFocusable(false);
         e.setBackground(Color.BLACK);
         e.setBounds(1260,450,250,70);
         l.add(e);
         e.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent ae)
             {
                 new shoulder().setVisible(true);
             }
         });
         
          ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/home2.png"));
          Image i9=i.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
          ImageIcon i0=new ImageIcon(i9);
          JLabel l1=new JLabel("");
          l1.setIcon(i0);
          l1.setBounds(20,20,50,50);
          l1.setLayout(null);
          l.add(l1);
          l1.addMouseListener(new MouseAdapter()
          {
              public void mouseClicked(MouseEvent m)
              {
                  new homepage().setVisible(true);
                  dispose();
              }
          });
         
          ImageIcon f0=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/cal.png"));
          Image f1=f0.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
          ImageIcon f3=new ImageIcon(f1);
          JLabel l2=new JLabel("");
          l2.setIcon(f3);
          l2.setBounds(20,90,50,50);
          l2.setLayout(null);
          l.add(l2);
              l2.addMouseListener(new MouseAdapter()
          {
              public void mouseClicked(MouseEvent m)
              {
                  new BMI().setVisible(true);
                
              }
          });
          
         
         h=new JButton("Legs Workout");
         h.setLayout(null);
         h.setFont(f2);
         h.setForeground(Color.WHITE);
         h.setFocusable(false);
         h.setBackground(Color.BLACK);
         h.setBounds(1260,550,250,70);
         l.add(h);
         h.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent ae)
             {
                 new legs().setVisible(true);
             }
         });
         
       
         
         b3=new JButton("Abs Workout");
         b3.setLayout(null);
         b3.setFont(f2);
         b3.setForeground(Color.WHITE);
         b3.setFocusable(false);
         b3.setBackground(Color.BLACK);
         b3.setBounds(1260,250,250,70);
         l.add(b3);
         b3.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent ae)
             {
              new abs().setVisible(true);
             }
         });
        
         
         b6=new JButton("Triceps Workout");
         b6.setLayout(null);
         b6.setFont(f2);
         b6.setForeground(Color.WHITE);
         b6.setFocusable(false);
         b6.setBackground(Color.BLACK);
         b6.setBounds(1260,150,250,70);
         l.add(b6);
         b6.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent ae)
             {
              new tricep().setVisible(true);
             }
         });
       
         
         b9=new JButton("Bicep Workout");
         b9.setLayout(null);
         b9.setFont(f2);
         b9.setForeground(Color.WHITE);
         b9.setFocusable(false);
         b9.setBackground(Color.BLACK);
         b9.setBounds(1260,50,250,70);
         l.add(b9);
         b9.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent ae)
             {
              new biceps().setVisible(true);
             }
         });
         
         a=new JButton("Quarintine");
         a.setLayout(null);
         a.setFont(f2);
         a.setForeground(Color.WHITE);
         a.setFocusable(false);
         a.setBackground(Color.BLACK);
         a.setBounds(1260,650,250,70);
         l.add(a);
         a.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent ae)
             {
               new quarantine().setVisible(true);
             }
         });
         
         c=new JButton("1 week challenege");
         c.setLayout(null);
         c.setFont(f2);
         c.setForeground(Color.WHITE);
         c.setFocusable(false);
         c.setBackground(Color.BLACK);
         c.setBounds(1260,750,250,70);
         l.add(c);
         c.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent ae)
             {
               new challenge().setVisible(true);
             }
         });
         
          d=new JButton("Cardio Workout");
         d.setLayout(null);
         d.setFont(f2);
         d.setForeground(Color.WHITE);
         d.setFocusable(false);
         d.setBackground(Color.BLACK);
         d.setBounds(1260,850,250,70);
         l.add(d);
         d.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent ae)
             {
                 new cardio().setVisible(true);
             }
         });
         
         
         
        /* JLabel quar=new JLabel("Quarantine Workout");
                quar.setBounds(40,25,450,45);
                quar.setFont(f2);
                quar.setForeground(Color.BLACK);
                q.add(quar);
                quar.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                       
                    }
                });
                
                ImageIcon d=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/cardio.jpg"));
                Image d2=d.getImage().getScaledInstance(500, 100,Image.SCALE_SMOOTH);
                ImageIcon d3=new ImageIcon(d2);
                q2=new JButton();
                q2.setLayout(null);
                q2.setIcon(d3);
                q2.setBounds(170,350,450,100);
                ta.add(q2);
                
                JLabel qr=new JLabel("Cardiovascular");
                qr.setBounds(70,25,450,45);
                qr.setFont(f2);
                qr.setForeground(Color.BLACK);
                q2.add(qr);
                q2.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                        new challenge().setVisible(true);
                    }
                });
                
         */
         
          ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/fit.png"));
          Image i2=i1.getImage().getScaledInstance(400,200,Image.SCALE_DEFAULT);
          ImageIcon i3=new ImageIcon(i2);
          JLabel l3=new JLabel("");
          l3.setIcon(i3);
          l3.setBounds(0,5,400,200);
          p1.add(l3);
        
        setLayout(null);
        setSize(1920,1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
    }
    public static void main(String args[])
    {
        new training().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
}
