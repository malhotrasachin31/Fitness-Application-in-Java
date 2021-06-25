package fittness.application;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class welcome extends JFrame implements Runnable
{
    JButton b3,b2;
    JRadioButton r1,r2,r3,r4,r5;
    JTextArea ta;
    
     Font f2=new Font("verdana",Font.BOLD,12);
    public void run()
    {
        Thread t1=new Thread();
        
    }
     welcome()
    {
            ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/fit.png"));
            Image i2=i1.getImage().getScaledInstance(350,200,Image.SCALE_DEFAULT);
            ImageIcon i3=new ImageIcon(i2);
            JLabel l3=new JLabel("");
            l3.setIcon(i3);
            l3.setBounds(10,10,350,200);
            add(l3);
            
            String information="\n\t\tWELCOME TO FITNESS PROJECTS\n\n\nYOU ARE NOW READY TO GO WITH THIS APPLICATION MAKE SURE YOU DO ALL \nYOUR EXCERSICES AND MAKE YOURSELF BETTER";
            
            ta=new JTextArea();
            ta.setBackground(new Color(30,80,67));
            ta.setForeground(Color.WHITE);
            ta.setBounds(400,55,580,400);
            ta.setEditable(false);
            ta.setFont(f2);
            ta.setText(information);
            add(ta);
            
            b2=new JButton("PREVIOUS");
            b2.setBounds(650,550,150,30);
            b2.setFocusable(false);
            b2.setEnabled(false);
            b2.setBackground(Color.white);
            b2.setForeground(Color.BLACK);
            b2.setFont(f2);
            add(b2);
            
           /* Voice voice;
            try{
            VoiceManager vm=VoiceManager.getInstance();
            String speakstring=ta.getText();
            System.setProperty("mbrola.base", "mbrola");
            vm=VoiceManager.getInstance();
            voice=vm.getVoice("mbrola_usi");
            voice.allocate();
            voice.speak(speakstring);
            }catch(Exception e)
            {
               System.out.println(e);
            }*/
            
            r2=new JRadioButton("INTRODUCTION");
            r2.setFont(f2);
            r2.setFocusable(false);
            r2.setBackground(new Color(7,89,67));
            r2.setForeground(Color.WHITE);
            r2.setBounds(50,250,150,30);
            r2.setSelected(true);
            add(r2);

             r3=new JRadioButton("SOME INSTRUCTIONS");
             r3.setFont(f2);
             r3.setFocusable(false);
             r3.setBackground(new Color(7,89,67));
             r3.setForeground(Color.WHITE);
             r3.setBounds(50,280,200,30);
             r3.setSelected(true);
             add(r3);

            r4=new JRadioButton("SETTING UP YOUR SOFTWARE");
            r4.setFont(f2);
            r4.setFocusable(false);
            r4.setBackground(new Color(7,89,67));
            r4.setForeground(Color.WHITE);
            r4.setBounds(50,310,250,30);
            r4.setSelected(true);
            add(r4);

            r5=new JRadioButton("WELCOME");
            r5.setFont(f2);
            r5.setFocusable(false);
            r5.setBackground(new Color(7,89,67));
            r5.setForeground(Color.WHITE);
            r5.setBounds(50,340,250,30);
            r5.setSelected(true);
            add(r5);
            
            b3=new JButton("FINISH");
            b3.setBounds(820,550,150,30);
            b3.setFocusable(false);
            b3.setEnabled(true);
            b3.setBackground(Color.white);
            b3.setForeground(Color.BLACK);
            b3.setFont(f2);
            add(b3);
            b3.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    new homepage().setVisible(true);
                    dispose();
                }
            });
            
            

                setLayout(null);
                setSize(1000,600);
               setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               setResizable(true);
               getContentPane().setBackground(new Color(7,89,67));
               setLocation(500,200);
               setUndecorated(true);
    }
 public static void main(String args[])
 {
     new welcome().setVisible(true);
 }
}
