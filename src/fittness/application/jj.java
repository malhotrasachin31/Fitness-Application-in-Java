package fittness.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class jj extends JFrame
{
      JPanel p1;
      JButton b1,b2;
      JLabel hours,min,sec,msec;
      Font f1=new Font("panton",Font.BOLD,26);
      Font f2=new Font("times new roman",Font.PLAIN,46);
      Font f3=new Font("panton",Font.BOLD,16);
       
        int millisec=0;
        int second=0;
       int minute=0;
       int hour=0;
       boolean state;
    jj()
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
        
        
         ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/jj.gif"));
         Image i0=i.getImage().getScaledInstance(450,450,Image.SCALE_DEFAULT);
         ImageIcon i1=new ImageIcon(i0);
        JLabel l=new JLabel("");
        l.setIcon(i1);
        l.setBounds(20,50,450,450);
        add(l);
        
        JLabel jj=new JLabel("Jumping Jacks for 20 seconds");
        jj.setBounds(60,500,450,40);
        jj.setFont(f1);
        add(jj);
        
        hours=new JLabel("00:");
        hours.setBackground(Color.red);
        hours.setFont(f2);
        hours.setBounds(130,550,90,100);
        add(hours);
        
        min=new JLabel("00:");
        min.setBackground(Color.red);
        min.setFont(f2);
        min.setBounds(200,550,90,100);
        add(min);
       
        sec=new JLabel("00:");
        sec.setBackground(Color.red);
        sec.setFont(f2);
        sec.setBounds(270,550,90,100);
        add(sec);
        
        
        
        msec=new JLabel("00");
        msec.setBackground(Color.red);
        msec.setFont(f3);
        msec.setBounds(340,550,120,100);
        add(msec);
        
        b1=new JButton("Start");
        b1.setFont(f1);
        b1.setFocusable(false);
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(65,105,225));
        b1.setBounds(150,700,200,40);
        add(b1);
        
       
        
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
                new inclinep().setVisible(true);
                dispose();
            }
        });
        
        b1.addActionListener(new ActionListener()
        {
            
            public void actionPerformed(ActionEvent e)
            {
                state =true;
                Thread t1=new Thread()
                {
                    public void run()
                    {
                      
                        for(;;)
                        {
                              if(state==true)
                                {
                                  try{
                                      sleep(1);
                                      if(millisec>1000)
                                      {
                                          millisec=0;
                                          second++;
                                      }
                                      if(second>60)
                                      {
                                          millisec=0;
                                          second=0;
                                          minute++;
                                      }
                                      if(minute>60)
                                      {
                                          millisec=0;
                                          second=0;
                                          minute=0;
                                          hour++;
                                      }
                                      
                                     msec.setText(" : "+millisec);
                                     millisec++;
                                     
                                     sec.setText(" : "+second);
                                     min.setText(" : "+minute);
                                     hours.setText("  "+hour);
                                     
                                    if(second==20)
                                     {
                                        state=false;
                                         msec.setVisible(false);
                                         sec.setVisible(false);
                                         min.setVisible(false);
                                         hours.setVisible(false);
                                         b2.setVisible(true);
                                         b1.setVisible(false);
                                        
                                
                                         
                                     }
                                     
                                      
                                  }  catch(Exception ex)
                                  {
                                      
                                  }
                                }
                              else
                              {
                                  
                              }
                        }
                    }
                };
                t1.start();
                
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
     new jj().setVisible(true);
 }
}
