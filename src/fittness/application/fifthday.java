package fittness.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class fifthday extends JFrame implements ActionListener
{
    JPanel p1;
    JTextArea ta;
    JButton b1;
    JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11;
     Font f1=new Font("panton",Font.BOLD,26);
     Font f2=new Font("panton",Font.BOLD,16);
     Font f3=new Font("times new roman",Font.BOLD,70);
    fifthday() 
    {
        
        super("Fifth Day");
        
        p1=new JPanel();
        p1.setBounds(0,0,400,1080);
        p1.setLayout(null);
        p1.setBackground(new Color(67,89,56));
        add(p1);
        
      
       
        
          ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/fit.png"));
         Image i2=i1.getImage().getScaledInstance(400,200,Image.SCALE_DEFAULT);
         ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel("");
        l3.setIcon(i3);
        l3.setBounds(0,5,400,200);
        p1.add(l3);
        
        r1=new JRadioButton("SKIPPING ROPE");
        r1.setBounds(80,250,300,30);
        r1.setForeground(Color.WHITE);
        r1.setFocusable(false);
        r1.setBackground(new Color(67,89,56));
        r1.setFont(f1);
        p1.add(r1);
        
        r2=new JRadioButton("CYCLING 3 KM");
        r2.setBounds(80,300,300,30);
        r2.setForeground(Color.WHITE);
        r2.setFocusable(false);
        r2.setBackground(new Color(67,89,56));
        r2.setFont(f1);
        p1.add(r2);
        
        r3=new JRadioButton("RUNNING 1 KM");
        r3.setBounds(80,350,300,30);
        r3.setForeground(Color.WHITE);
        r3.setFocusable(false);
        r3.setBackground(new Color(67,89,56));
        r3.setFont(f1);
        p1.add(r3);
        
        r4=new JRadioButton("LUNGES");
        r4.setBounds(80,400,300,30);
        r4.setForeground(Color.WHITE);
        r4.setFocusable(false);
        r4.setBackground(new Color(67,89,56));
        r4.setFont(f1);
        p1.add(r4);
        
        r5=new JRadioButton("SQUATS");
        r5.setBounds(80,450,400,30);
        r5.setForeground(Color.WHITE);
        r5.setFocusable(false);
        r5.setBackground(new Color(67,89,56));
        r5.setFont(f1);
        p1.add(r5);
        
        r6=new JRadioButton("BABY POSE");
        r6.setBounds(80,500,300,30);
        r6.setForeground(Color.WHITE);
        r6.setFocusable(false);
        r6.setBackground(new Color(67,89,56));
        r6.setFont(f1);
        p1.add(r6);
        
      
       JLabel l5=new JLabel("FIFTH DAY 6 WORKOUTS");
       l5.setBounds(700,10,1200,50);
       l5.setFont(f3);
       add(l5);
        
        // adding gifs
        
         ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/sk3.gif"));
         Image i0=i.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
         ImageIcon i5=new ImageIcon(i0);
        JLabel l=new JLabel("");
        l.setIcon(i5);
        l.setBounds(420,70,200,200);
        add(l);
        
        JLabel jj=new JLabel("Skipping rope 500 reps");
        jj.setBounds(460,270,300,20);
        jj.setFont(f2);
        add(jj);
        
        
         ImageIcon i8=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/3.png"));
         Image i9=i8.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
         ImageIcon i10=new ImageIcon(i9);
         JLabel l4=new JLabel("");
         l4.setIcon(i10);
         l4.setBounds(10,900,50,50);
         p1.add(l4);     
         l4.addMouseListener(new MouseAdapter()
         {
             public void mouseClicked(MouseEvent me)
             {
                new challenge().setVisible(true);
                dispose();
             }
         });
        
        ImageIcon a=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/cy.gif"));
        Image b=a.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon c=new ImageIcon(b);
       JLabel ip=new JLabel("");
       ip.setIcon(c);
       ip.setBounds(700,70,200,200);
       add(ip);
        
       JLabel ip2=new JLabel("Cycling 3 km");
        ip2.setBounds(750,270,200,20);
        ip2.setFont(f2);
        add(ip2);
       
         ImageIcon d=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/rn.gif"));
        Image e=d.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon f=new ImageIcon(e);
       JLabel kp=new JLabel("");
       kp.setIcon(f);
       kp.setBounds(950,70,200,200);
       add(kp);
        
       JLabel kp2=new JLabel("Running 1 km");
        kp2.setBounds(970,270,200,20);
        kp2.setFont(f2);
        add(kp2);
        
         ImageIcon x=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/lunges.gif"));
        Image y=x.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon z=new ImageIcon(y);
       JLabel pu=new JLabel("");
       pu.setIcon(z);
       pu.setBounds(1200,70,250,200);
       add(pu);
        
       JLabel pu2=new JLabel("Lunges 12*4 reps");
        pu2.setBounds(1250,270,250,20);
        pu2.setFont(f2);
        add(pu2);
        
        ImageIcon p=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/squats.gif"));
        Image q=p.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon r=new ImageIcon(q);
       JLabel wap=new JLabel("");
       wap.setIcon(r);
       wap.setBounds(1450,70,250,200);
       add(wap);
        
       JLabel wp=new JLabel("Squats 15*4 reps");
        wp.setBounds(1480,270,350,20);
        wp.setFont(f2);
        add(wp);
        
          ImageIcon s=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/cp.gif"));
        Image t=s.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon u=new ImageIcon(t);
       JLabel inc=new JLabel("");
       inc.setIcon(u);
       inc.setBounds(1700,70,250,200);
       add(inc);
        
       JLabel inc2=new JLabel("Child Pose 30 second");
        inc2.setBounds(1700,270,350,20);
        inc2.setFont(f2);
        add(inc2);
        
         
        String str="It's important to consider a few things before you start an exercise routine." +
"Check Your Health. It's important to consult your doctor and get a physical medical examination before starting an exercise routine" +
"Make a Plan and Set Realistic Goals." +
"Make It a Habit.";
        
        ta=new JTextArea();
        ta.setBounds(420,670,1480,350);
        ta.setText(str);
        ta.setWrapStyleWord(true);
        ta.setLineWrap(true);
        ta.setForeground(Color.WHITE);
        ta.setFont(f1);
        ta.setLayout(null);
        ta.setEditable(false);
        ta.setBackground(new Color(67,89,56));
        add(ta);
        
        b1=new JButton("DONE");
        b1.setFont(f1);
        b1.setFocusable(false);
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(600,200,200,30);
        ta.add(b1);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                     String one="6";
                String two="90.00 min";
                String three="345.345 kcal";
                
                Date date=new Date();
                SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
                SimpleDateFormat sdf2=new SimpleDateFormat("E");
                
                
                 try{
                   Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/malhotra","java","java");
                PreparedStatement pst=null;
                String str="insert into fifthday values(?,?,?,?,?)";
                pst=conn.prepareStatement(str);
                pst.setString(1, one);
                pst.setString(2,two);
                pst.setString(3, three);
                pst.setString(4,sdf2.format(date));
                pst.setString(5, sdf.format(date));
                int a=pst.executeUpdate();
                pst.close();
                conn.close();
                new challenge().setVisible(true);
                dispose();
                }catch(Exception ex)
                {
                    System.out.println(ex);
                }
            }
        });
        
        setSize(1920,1080);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
    }
    public static void main(String args[])
    {
        new fifthday().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        
        
    }
}
