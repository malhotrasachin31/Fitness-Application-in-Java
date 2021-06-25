package fittness.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.lang.Thread.sleep;

public class timer2 extends JFrame
{
     JLabel hours,min,sec,msec;
      Font f1=new Font("panton",Font.BOLD,26);
      Font f2=new Font("times new roman",Font.PLAIN,46);
      Font f3=new Font("panton",Font.BOLD,16);
       
        int millisec=0;
        JButton b2,b1;
        int second=0;
       int minute=0;
       int hour=0;
       boolean state;
       JPanel p1;
    timer2()
    {
        p1=new JPanel();
        p1.setBounds(0,0,400,30);
        p1.setLayout(null);
        p1.setBackground(Color.GREEN);
        add(p1);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/sachin.png"));
        Image i5=i4.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l2=new JLabel("");
        l2.setIcon(i6);
        l2.setBounds(360,6,20,20);
        p1.add(l2);     
        l2.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                dispose();
            }
        });
        
         hours=new JLabel("00:");
        hours.setBackground(Color.red);
        hours.setFont(f2);
        hours.setBounds(50,50,80,80);
        add(hours);
        
        min=new JLabel("00:");
        min.setBackground(Color.red);
        min.setFont(f2);
        min.setBounds(130,50,80,80);
        add(min);
       
        sec=new JLabel("00:");
        sec.setBackground(Color.red);
        sec.setFont(f2);
        sec.setBounds(210,50,80,80);
        add(sec);
        
        
        
        msec=new JLabel("00");
        msec.setBackground(Color.red);
        msec.setFont(f3);
        msec.setBounds(340,50,80,80);
        add(msec);
        
         b2=new JButton("Start");
        b2.setFont(f1);
        b2.setFocusable(false);
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65,105,225));
        b2.setBounds(130,125,150,30);
        add(b2);
     
         b1=new JButton("Next");
        b1.setFont(f1);
        b1.setFocusable(false);
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(65,105,225));
        b1.setBounds(130,125,150,30);
        add(b1);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                dispose();
            }
        });
        
        b2.addActionListener(new ActionListener()
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
                                     
                                    if(second==30)
                                     {
                                        state=false;
                                        
                                         b1.setVisible(true);
                                         
                                        
                                
                                         
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
        
       
        
        setSize(400,170);
        setLocation(800,400);
        setLayout(null);
        setUndecorated(true);
        getContentPane().setBackground(Color.ORANGE);
    }
 public static void main(String args[]) 
 {
     new timer().setVisible(true);
 }
}
