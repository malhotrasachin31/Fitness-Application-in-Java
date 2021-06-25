package fittness.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class cardio extends JFrame 
{
    JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13;
    Font f1=new Font("times new roman",Font.BOLD,20);
    JButton b1;
    cardio()
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
       
        JLabel l=new JLabel("jumping jacks 100 reps");
        l.setBounds(20,170,200,20);
        l.setForeground(Color.BLUE);
        p2.add(l);
        
        ImageIcon squats=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/jj.gif"));
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
        
         ImageIcon s=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/rn.gif"));
        Image s2=s.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon s3=new ImageIcon(s2);
        JLabel c=new JLabel("");
        c.setIcon(s3);
        c.setBounds(20,20,150,150);
        p3.add(c);
        
        JLabel p=new JLabel("running 500 metre");
        p.setBounds(50,170,150,20);
        p.setForeground(Color.BLUE);
        p3.add(p);
        
         p4=new JPanel();
        p4.setBounds(460,60,200,200);
        p4.setLayout(null);
        p4.setBackground(Color.white);
        add(p4);
        
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/sk.gif"));
        Image i2=i.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel ci=new JLabel("");
        ci.setIcon(i3);
        ci.setBounds(20,20,150,150);
        p4.add(ci);
        
        JLabel pa=new JLabel("skipping 600 reps");
        pa.setBounds(50,170,150,20);
        pa.setForeground(Color.BLUE);
        p4.add(pa);
        
        p5=new JPanel();
        p5.setBounds(20,280,200,200);
        p5.setLayout(null);
        p5.setBackground(Color.WHITE);
        add(p5);
        
         ImageIcon t=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/cy.gif"));
        Image t2=t.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon t3=new ImageIcon(t2);
        JLabel q=new JLabel("");
        q.setIcon(t3);
        q.setBounds(20,20,150,150);
        p5.add(q);
        
        JLabel paa=new JLabel("cycling 5 km");
        paa.setBounds(50,170,150,20);
        paa.setForeground(Color.BLUE);
        p5.add(paa);
        
       
        
       
        
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
                String one="4";
                String two="60.00 min";
                String three="335.345";
                
                Date date=new Date();
                SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
                SimpleDateFormat sdf2=new SimpleDateFormat("E");
                
                
                 try{
                   Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/malhotra","java","java");
                PreparedStatement pst=null;
                String str="insert into cardio values(?,?,?,?,?)";
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
     new cardio().setVisible(true);
 }
}
