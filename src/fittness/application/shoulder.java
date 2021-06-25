package fittness.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class shoulder extends JFrame 
{
    JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13;
    Font f1=new Font("times new roman",Font.BOLD,20);
    JButton b1;
    shoulder()
    {
        p1=new JPanel();
        p1.setBounds(0,0,700,40);
        p1.setLayout(null);
        p1.setBackground(Color.LIGHT_GRAY);
        add(p1);
        
        ImageIcon a=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/sachin.png"));
        Image a2=a.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon a3=new ImageIcon(a2);
        JLabel a4=new JLabel();
        a4.setIcon(a3);
        a4.setBounds(650,7,30,30);
        p1.add(a4);
        a4.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                dispose();
            }
        });
        
        p2=new JPanel();
        p2.setBounds(20,60,200,200);
        p2.setLayout(null);
        p2.setBackground(Color.WHITE);
        add(p2);
       
        JLabel l=new JLabel("Knee Pushups 12*3 sets");
        l.setBounds(50,170,150,20);
        l.setForeground(Color.BLUE);
        p2.add(l);
        
        ImageIcon squats=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/kp.gif"));
        Image squats2=squats.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon squats3=new ImageIcon(squats2);
        JLabel l1=new JLabel("");
        l1.setIcon(squats3);
        l1.setBounds(20,20,150,150);
        p2.add(l1);
        
        p3=new JPanel();
        p3.setBounds(240,60,200,200);
        p3.setLayout(null);
        p3.setBackground(Color.WHITE);
        add(p3);
        
         ImageIcon s=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/pu2.gif"));
        Image s2=s.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon s3=new ImageIcon(s2);
        JLabel c=new JLabel("");
        c.setIcon(s3);
        c.setBounds(20,20,150,150);
        p3.add(c);
        
        JLabel p=new JLabel("Push ups 15*4 sets");
        p.setBounds(50,170,150,20);
        p.setForeground(Color.BLUE);
        p3.add(p);
        
         p4=new JPanel();
        p4.setBounds(460,60,200,200);
        p4.setLayout(null);
        p4.setBackground(Color.white);
        add(p4);
        
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/wa.gif"));
        Image i2=i.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel ci=new JLabel("");
        ci.setIcon(i3);
        ci.setBounds(20,20,150,150);
        p4.add(ci);
        
        JLabel pa=new JLabel("Wide arm pushups 10*4");
        pa.setBounds(50,170,150,20);
        pa.setForeground(Color.BLUE);
        p4.add(pa);
        
        p5=new JPanel();
        p5.setBounds(20,280,200,200);
        p5.setLayout(null);
        p5.setBackground(Color.WHITE);
        add(p5);
        
         ImageIcon t=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/ip2.gif"));
        Image t2=t.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon t3=new ImageIcon(t2);
        JLabel q=new JLabel("");
        q.setIcon(t3);
        q.setBounds(20,20,150,150);
        p5.add(q);
        
        JLabel paa=new JLabel("Incline Push-ups 12*4");
        paa.setBounds(50,170,150,20);
        paa.setForeground(Color.BLUE);
        p5.add(paa);
        
        p6=new JPanel();
        p6.setBounds(240,280,200,200);
        p6.setLayout(null);
        p6.setBackground(Color.white);
        add(p6);
        
        ImageIcon n=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/jj.gif"));
        Image n2=n.getImage().getScaledInstance(200, 150, Image.SCALE_DEFAULT);
        ImageIcon n3=new ImageIcon(n2);
        JLabel nci=new JLabel("");
        nci.setIcon(n3);
        nci.setBounds(0,20,200,150);
        p6.add(nci);
        nci.addMouseListener(new MouseAdapter()
                {
                    public void mouseClicked(MouseEvent me)
                    {
                        new timer().setVisible(true);
                    }
                });
        
        JLabel pan=new JLabel("Jumping Jacks 45 seconds*3 set");
        pan.setBounds(50,170,150,20);
        pan.setForeground(Color.BLUE);
        p6.add(pan);
        
        p7=new JPanel();
        p7.setBounds(460,280,200,200);
        p7.setLayout(null);
        p7.setBackground(Color.white);
        add(p7);
        
         
        ImageIcon j=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/ccp.gif"));
        Image j2=j.getImage().getScaledInstance(200, 150, Image.SCALE_DEFAULT);
        ImageIcon j3=new ImageIcon(j2);
        JLabel jj=new JLabel("");
        jj.setIcon(j3);
        jj.setBounds(0,20,200,150);
        p7.add(jj);
        
        JLabel panj=new JLabel("cat cow pose for 30 seconds");
        panj.setBounds(20,170,200,20);
        panj.setForeground(Color.BLUE);
        p7.add(panj);
        jj.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent ae)
            {
                new timer2().setVisible(true);
            }
        });
        
        p8=new JPanel();
        p8.setBounds(20,500,200,200);
        p8.setLayout(null);
        p8.setBackground(Color.white);
        add(p8);
        
         
        ImageIcon jump=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/cp.gif"));
        Image jump2=jump.getImage().getScaledInstance(200, 150, Image.SCALE_DEFAULT);
        ImageIcon jump3=new ImageIcon(jump2);
        JLabel ju=new JLabel("");
        ju.setIcon(jump3);
        ju.setBounds(0,20,200,150);
        p8.add(ju);
          ju.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent ae)
            {
                new timer2().setVisible(true);
            }
        });
        
        
        JLabel jn=new JLabel("child pose for 20 seconds");
        jn.setBounds(20,170,200,20);
        jn.setForeground(Color.BLUE);
        p8.add(jn);
       
        p9=new JPanel();
        p9.setBounds(240,500,200,200);
        p9.setLayout(null);
        p9.setBackground(Color.white);
        add(p9);
        
         
        
        b1=new JButton("Done");
        b1.setBounds(270,940,200,50);
        b1.setFocusable(false);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.white);
        b1.setFont(f1);
        add(b1);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String one="7";
                String two="12.34";
                String three="155.345";
                
                Date date=new Date();
                SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
                SimpleDateFormat sdf2=new SimpleDateFormat("E");
                
                
                 try{
                   Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/malhotra","java","java");
                PreparedStatement pst=null;
                String str="insert into shoulder values(?,?,?,?,?)";
                pst=conn.prepareStatement(str);
                pst.setString(1, one);
                pst.setString(2,two);
                pst.setString(3, three);
                pst.setString(4,sdf2.format(date));
                pst.setString(5, sdf.format(date));
                int a=pst.executeUpdate();
                pst.close();
                conn.close();
                dispose();
                }catch(Exception ex)
                {
                    System.out.println(ex);
                }
            }
        });
        
        setSize(680,1000);
        setLocation(600,40);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setUndecorated(true);
        getContentPane().setBackground(Color.WHITE);
    }
 public static void main(String args[])
 {
     new shoulder().setVisible(true);
 }
}
