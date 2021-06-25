package fittness.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class fourthday extends JFrame implements ActionListener
{
    JPanel p1;
    JTextArea ta;
    JButton b1;
    JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11;
     Font f1=new Font("panton",Font.BOLD,26);
     Font f2=new Font("panton",Font.BOLD,16);
     Font f3=new Font("times new roman",Font.BOLD,70);
    fourthday() 
    {
        
        super("Fourth Day");
        
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
        
        r1=new JRadioButton("JUMPING JACKS");
        r1.setBounds(80,250,300,30);
        r1.setForeground(Color.WHITE);
        r1.setFocusable(false);
        r1.setBackground(new Color(67,89,56));
        r1.setFont(f1);
        p1.add(r1);
        
        r2=new JRadioButton("INCLINE PUSH-UPS");
        r2.setBounds(80,300,300,30);
        r2.setForeground(Color.WHITE);
        r2.setFocusable(false);
        r2.setBackground(new Color(67,89,56));
        r2.setFont(f1);
        p1.add(r2);
        
        r3=new JRadioButton("KNEE PUSH-UPS");
        r3.setBounds(80,350,300,30);
        r3.setForeground(Color.WHITE);
        r3.setFocusable(false);
        r3.setBackground(new Color(67,89,56));
        r3.setFont(f1);
        p1.add(r3);
        
        r4=new JRadioButton("PUSH-UPS");
        r4.setBounds(80,400,300,30);
        r4.setForeground(Color.WHITE);
        r4.setFocusable(false);
        r4.setBackground(new Color(67,89,56));
        r4.setFont(f1);
        p1.add(r4);
        
        r5=new JRadioButton("WIDE ARM PUSH-UPS");
        r5.setBounds(80,450,400,30);
        r5.setForeground(Color.WHITE);
        r5.setFocusable(false);
        r5.setBackground(new Color(67,89,56));
        r5.setFont(f1);
        p1.add(r5);
        
        r6=new JRadioButton("INCLINE PUSH-UPS");
        r6.setBounds(80,500,300,30);
        r6.setForeground(Color.WHITE);
        r6.setFocusable(false);
        r6.setBackground(new Color(67,89,56));
        r6.setFont(f1);
        p1.add(r6);
        
        r7=new JRadioButton("KNEE PUSH-UPS");
        r7.setBounds(80,550,300,30);
        r7.setForeground(Color.WHITE);
        r7.setFocusable(false);
        r7.setBackground(new Color(67,89,56));
        r7.setFont(f1);
        p1.add(r7);
        
        r8=new JRadioButton("PUSH-UPS");
        r8.setBounds(80,600,300,30);
        r8.setForeground(Color.WHITE);
        r8.setFocusable(false);
        r8.setBackground(new Color(67,89,56));
        r8.setFont(f1);
        p1.add(r8);
        
        r9=new JRadioButton("WIDE ARM PUSH-UPS");
        r9.setBounds(80,650,400,30);
        r9.setForeground(Color.WHITE);
        r9.setFocusable(false);
        r9.setBackground(new Color(67,89,56));
        r9.setFont(f1);
        p1.add(r9);
        
        r10=new JRadioButton("COBRA STRECH");
        r10.setBounds(80,700,300,30);
        r10.setForeground(Color.WHITE);
        r10.setFocusable(false);
        r10.setBackground(new Color(67,89,56));
        r10.setFont(f1);
        p1.add(r10);
        
       JLabel l5=new JLabel("FOURTH DAY 10 WORKOUTS");
       l5.setBounds(700,10,1200,50);
       l5.setFont(f3);
       add(l5);
        
        // adding gifs
        
         ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/jj.gif"));
         Image i0=i.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
         ImageIcon i5=new ImageIcon(i0);
        JLabel l=new JLabel("");
        l.setIcon(i5);
        l.setBounds(420,70,200,200);
        add(l);
        
        JLabel jj=new JLabel("Jumping Jacks  00.20");
        jj.setBounds(460,270,200,20);
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
        
        ImageIcon a=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/ip2.gif"));
        Image b=a.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon c=new ImageIcon(b);
       JLabel ip=new JLabel("");
       ip.setIcon(c);
       ip.setBounds(670,70,200,200);
       add(ip);
        
       JLabel ip2=new JLabel("Incline push-ups  *16");
        ip2.setBounds(690,270,200,20);
        ip2.setFont(f2);
        add(ip2);
       
         ImageIcon d=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/kp.gif"));
        Image e=d.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon f=new ImageIcon(e);
       JLabel kp=new JLabel("");
       kp.setIcon(f);
       kp.setBounds(950,70,200,200);
       add(kp);
        
       JLabel kp2=new JLabel("Knee push-ups  *10");
        kp2.setBounds(970,270,200,20);
        kp2.setFont(f2);
        add(kp2);
        
         ImageIcon x=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/pu2.gif"));
        Image y=x.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon z=new ImageIcon(y);
       JLabel pu=new JLabel("");
       pu.setIcon(z);
       pu.setBounds(1200,70,250,200);
       add(pu);
        
       JLabel pu2=new JLabel("push-ups  *8");
        pu2.setBounds(1250,270,250,20);
        pu2.setFont(f2);
        add(pu2);
        
        ImageIcon p=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/wa.gif"));
        Image q=p.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon r=new ImageIcon(q);
       JLabel wap=new JLabel("");
       wap.setIcon(r);
       wap.setBounds(1450,70,250,200);
       add(wap);
        
       JLabel wp=new JLabel("Wide Arm push-ups  *8");
        wp.setBounds(1450,270,350,20);
        wp.setFont(f2);
        add(wp);
        
          ImageIcon s=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/ip2.gif"));
        Image t=s.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon u=new ImageIcon(t);
       JLabel inc=new JLabel("");
       inc.setIcon(u);
       inc.setBounds(1700,70,250,200);
       add(inc);
        
       JLabel inc2=new JLabel("Incline push-ups  *16");
        inc2.setBounds(1700,270,350,20);
        inc2.setFont(f2);
        add(inc2);
        
          ImageIcon de=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/kp.gif"));
        Image ed=de.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon fe=new ImageIcon(ed);
       JLabel kpe=new JLabel("");
       kpe.setIcon(f);
       kpe.setBounds(700,300,200,200);
       add(kpe);
        
       JLabel kpe2=new JLabel("Knee push-ups  *10");
        kpe2.setBounds(720,500,200,20);
        kpe2.setFont(f2);
        add(kpe2);
        
      
       JLabel p2=new JLabel("");
       p2.setIcon(z);
       p2.setBounds(1000,300,250,200);
       add(p2);
        
       JLabel push=new JLabel("push-ups  *8");
        push.setBounds(1050,500,250,20);
        push.setFont(f2);
        add(push);
        
     
       JLabel wap2=new JLabel("");
       wap2.setIcon(r);
       wap2.setBounds(1250,300,250,200);
       add(wap2);
        
        JLabel push2=new JLabel("Wide Arm push-ups  *8");
        push2.setBounds(1280,520,350,20);
        push2.setFont(f2);
        add(push2); 
       
       ImageIcon cs=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/cs.gif"));
        Image cs2=cs.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon cs3=new ImageIcon(cs2);
       JLabel cs4=new JLabel("");
       cs4.setIcon(cs3);
       cs4.setBounds(1500,300,250,200);
       add(cs4);
       
       JLabel cs1=new JLabel("Cobra Strectch  00.20");
        cs1.setBounds(1540,520,350,20);
        cs1.setFont(f2);
        add(cs1); 
       
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
              String one="10";
                String two="45.00 min";
                String three="345.345 kcal";
                
                Date date=new Date();
                SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
                SimpleDateFormat sdf2=new SimpleDateFormat("E");
                
                
                 try{
                   Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/malhotra","java","java");
                PreparedStatement pst=null;
                String str="insert into fourthday values(?,?,?,?,?)";
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
        new fourthday().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        
        
    }
}
