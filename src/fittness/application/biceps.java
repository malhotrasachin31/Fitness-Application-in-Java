package fittness.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class biceps extends JFrame 
{
    JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13;
    Font f1=new Font("times new roman",Font.BOLD,20);
    JButton b1;
    biceps()
    {
        p1=new JPanel();
        p1.setBounds(0,0,700,40);
        p1.setLayout(null);
        p1.setBackground(Color.YELLOW);
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
        
        JLabel l=new JLabel("Incline Dumbell Curl  12*3 sets");
        l.setBounds(20,170,200,20);
        l.setForeground(Color.BLUE);
        p2.add(l);
        
        ImageIcon squats=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/idc.gif"));
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
        
         ImageIcon s=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/bs2.gif"));
        Image s2=s.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon s3=new ImageIcon(s2);
        JLabel c=new JLabel("");
        c.setIcon(s3);
        c.setBounds(20,20,150,150);
        p3.add(c);
        
        JLabel p=new JLabel("Incline Inner Bicep Curl 12*3 sets");
        p.setBounds(20,170,200,20);
        p.setForeground(Color.BLUE);
        p3.add(p);
        
         p4=new JPanel();
        p4.setBounds(460,60,200,200);
        p4.setLayout(null);
        p4.setBackground(Color.white);
        add(p4);
        
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/bs3.gif"));
        Image i2=i.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel ci=new JLabel("");
        ci.setIcon(i3);
        ci.setBounds(20,20,150,150);
        p4.add(ci);
        
        JLabel pa=new JLabel("Statnding Biceps curl 12*3 sets");
        pa.setBounds(0,170,200,20);
        pa.setForeground(Color.BLUE);
        p4.add(pa);
        
        p5=new JPanel();
        p5.setBounds(20,280,200,200);
        p5.setLayout(null);
        p5.setBackground(Color.WHITE);
        add(p5);
        
         ImageIcon t=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/bs4.gif"));
        Image t2=t.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon t3=new ImageIcon(t2);
        JLabel q=new JLabel("");
        q.setIcon(t3);
        q.setBounds(20,20,150,150);
        p5.add(q);
        
        JLabel paa=new JLabel("EZ Bar Curl 12*4 sets");
        paa.setBounds(20,170,200,20);
        paa.setForeground(Color.BLUE);
        p5.add(paa);
        
        p6=new JPanel();
        p6.setBounds(240,280,200,200);
        p6.setLayout(null);
        p6.setBackground(Color.white);
        add(p6);
        
        ImageIcon n=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/bs5.gif"));
        Image n2=n.getImage().getScaledInstance(200, 150, Image.SCALE_DEFAULT);
        ImageIcon n3=new ImageIcon(n2);
        JLabel nci=new JLabel("");
        nci.setIcon(n3);
        nci.setBounds(0,20,200,150);
        p6.add(nci);
       
        JLabel pan=new JLabel("Wide Grip Standing Barbell 12*3set");
        pan.setBounds(0,170,200,20);
        pan.setForeground(Color.BLUE);
        p6.add(pan);
        
        p7=new JPanel();
        p7.setBounds(460,280,200,200);
        p7.setLayout(null);
        p7.setBackground(Color.white);
        add(p7);
        
         
        ImageIcon j=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/bs6.gif"));
        Image j2=j.getImage().getScaledInstance(200, 150, Image.SCALE_DEFAULT);
        ImageIcon j3=new ImageIcon(j2);
        JLabel jj=new JLabel("");
        jj.setIcon(j3);
        jj.setBounds(0,20,200,150);
        p7.add(jj);
        
        JLabel panj=new JLabel("Zottman Curl 12*3 sets");
        panj.setBounds(20,170,200,20);
        panj.setForeground(Color.BLUE);
        p7.add(panj);
        
        p8=new JPanel();
        p8.setBounds(20,500,200,200);
        p8.setLayout(null);
        p8.setBackground(Color.white);
        add(p8);
        
         
        ImageIcon jump=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/bs7.gif"));
        Image jump2=jump.getImage().getScaledInstance(200, 150, Image.SCALE_DEFAULT);
        ImageIcon jump3=new ImageIcon(jump2);
        JLabel ju=new JLabel("");
        ju.setIcon(jump3);
        ju.setBounds(0,20,200,150);
        p8.add(ju);
        
        JLabel jn=new JLabel("Regular Bisep Curl 12*3 sets");
        jn.setBounds(20,170,200,20);
        jn.setForeground(Color.BLUE);
        p8.add(jn);
        
        p9=new JPanel();
        p9.setBounds(240,500,200,200);
        p9.setLayout(null);
        p9.setBackground(Color.white);
        add(p9);
        
         
        ImageIcon nc=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/bs8.gif"));
        Image nc2=nc.getImage().getScaledInstance(200, 150, Image.SCALE_DEFAULT);
        ImageIcon nc3=new ImageIcon(nc2);
        JLabel ncci=new JLabel("");
        ncci.setIcon(nc3);
        ncci.setBounds(0,20,200,150);
        p9.add(ncci);
        
        JLabel panc=new JLabel("Dumbell Bicep Curl 12*3 sets");
        panc.setBounds(20,170,200,20);
        panc.setForeground(Color.BLUE);
        p9.add(panc);
        
        p10=new JPanel();
        p10.setBounds(460,500,200,200);
        p10.setLayout(null);
        p10.setBackground(Color.white);
        add(p10);
        
         
        ImageIcon sm=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/bs9.gif"));
        Image sm2=sm.getImage().getScaledInstance(200, 150, Image.SCALE_DEFAULT);
        ImageIcon sm3=new ImageIcon(sm2);
        JLabel ph=new JLabel("");
        ph.setIcon(sm3);
        ph.setBounds(0,20,200,150);
        p10.add(ph);
        
        JLabel pank=new JLabel("Hammer Curl 12*3 sets");
        pank.setBounds(50,170,150,20);
        pank.setForeground(Color.BLUE);
        p10.add(pank);
        
        p11=new JPanel();
        p11.setBounds(20,720,200,200);
        p11.setLayout(null);
        p11.setBackground(Color.white);
        add(p11);
        
         
        ImageIcon f=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/bs10.gif"));
        Image f2=f.getImage().getScaledInstance(200, 150, Image.SCALE_DEFAULT);
        ImageIcon f3=new ImageIcon(f2);
        JLabel fk=new JLabel("");
        fk.setIcon(f3);
        fk.setBounds(0,20,200,150);
        p11.add(fk);
        
        JLabel fk2=new JLabel("overheaded extension 12*3");
        fk2.setBounds(20,170,200,20);
        fk2.setForeground(Color.BLUE);
        p11.add(fk2);
       
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
                String one="10";
                String two="12.34";
                String three="155.345";
                
                Date date=new Date();
                SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
                SimpleDateFormat sdf2=new SimpleDateFormat("E");
                
                
                 try{
                   Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/malhotra","java","java");
                PreparedStatement pst=null;
                String str="insert into biceps values(?,?,?,?,?)";
                pst=conn.prepareStatement(str);
                pst.setString(1, one);
                pst.setString(2,two);
                pst.setString(3, three);
                 pst.setString(4, sdf2.format(date));
                pst.setString(5,sdf.format(date));
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
     new biceps().setVisible(true);
 }
}
