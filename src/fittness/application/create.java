package fittness.application;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class create extends JFrame 
{
    JTextField t1,t2,t3,t4,t5,tc5,tb5;
   
    JLabel meal1,meal2,meal3,meal4,meal5,Days;
   
    JButton b1;
  
   
    JPanel p1;
    Font f1=new Font("times new roman",Font.BOLD,40);
    Font f3=new Font("times new roman",Font.BOLD,20);
    Font f2=new Font("Arial",Font.BOLD,22);
    create()
    {
        p1=new JPanel();
      p1.setLayout(null);
      p1.setBounds(0,0,1100,30);
      p1.setBackground(new Color(65,105,225));
      add(p1);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/sachin.png"));
        Image i5=i4.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l2=new JLabel("");
        l2.setIcon(i6);
        l2.setBounds(1075,5,20,20);
        p1.add(l2);     
        l2.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                dispose();
            }
        });
        
           
          ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/img2.png"));
         Image i0=i.getImage().getScaledInstance(1100,400,Image.SCALE_DEFAULT);
         ImageIcon i1=new ImageIcon(i0);
        JLabel l=new JLabel("");
        l.setIcon(i1);
        l.setBounds(0,150,1100,400);
        add(l);
        
        meal1=new JLabel("Meal 1");
        meal1.setBounds(300,70,200,20);
        meal1.setForeground(Color.BLACK);
        add(meal1);
        
        Days=new JLabel("Day");
        Days.setBounds(30,70,200,20);
        Days.setForeground(Color.BLACK);
        add(Days);
        
        tb5=new JTextField();
        tb5.setBounds(20,100,200,30);
        tb5.setFont(f2);
        add(tb5);
        
        t1=new JTextField();
        t1.setBounds(250,100,130,30);
        t1.setFont(f2);
        add(t1);
        
        t2=new JTextField();
        t2.setBounds(430,100,130,30);
        t2.setFont(f2);
        add(t2);
        
        t3=new JTextField();
        t3.setBounds(610,100,130,30);
        t3.setFont(f2);
        add(t3);  
        
        t4=new JTextField();
        t4.setBounds(780,100,130,30);
        t4.setFont(f2);
        add(t4);
        
        t5=new JTextField();
        t5.setBounds(950,100,130,30);
        t5.setFont(f2);
        add(t5);
        
        meal2=new JLabel("Meal 2");
        meal2.setBounds(480,70,200,20);
        meal2.setForeground(Color.BLACK);
        add(meal2);
        
        meal3=new JLabel("Meal 3");
        meal3.setBounds(650,70,200,20);
        meal3.setForeground(Color.BLACK);
        add(meal3);
        
        meal4=new JLabel("Meal 4");
        meal4.setBounds(820,70,200,20);
        meal4.setForeground(Color.BLACK);
        add(meal4);
        
         meal5=new JLabel("Meal 5");
        meal5.setBounds(1000,70,200,20);
        meal5.setForeground(Color.BLACK);
        add(meal5);
       
        b1=new JButton("Add Plan");
        b1.setBounds(60,200,150,30);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLUE);
        b1.setFocusable(false);
        b1.setFont(f3);
        add(b1);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                 
                Date d=new Date();
                SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
                
                String sunday="Sunday";
                String monday="Monday";
                String tuesday="Tuesday";
                String wednesday="Wednesday";
                String thursday="Thursday";
                String friday="Friday";
                String saturday="Saturday";
                                
                try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/malhotra","java","java");
                PreparedStatement pst=null;
                String str="insert into dietplan values(?,?,?,?,?,?,?)";
                pst=conn.prepareStatement(str);
                pst.setString(1,tb5.getText());
                pst.setString(2,t1.getText());
                pst.setString(3,t2.getText());
                pst.setString(4,t3.getText());
                pst.setString(5,t4.getText());
                pst.setString(6,t5.getText());
                pst.setString(7,sdf.format(d));
                int a=pst.executeUpdate();
                pst.setString(1,tb5.getText());
                tb5.setText(null);
                t1.setText(null);
                t2.setText(null);
                t3.setText(null);
                t4.setText(null);
                t5.setText(null);
                
                pst.close();
                conn.close();
                }catch(Exception ex)
                {
                    System.out.println(ex);
                }
            }
        });
        
        setSize(1100,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(500,200);
        getContentPane().setBackground(Color.WHITE);
        setResizable(false);
        setUndecorated(true);
    }
    public static void main(String args[])
    {
        new create().setVisible(true);
    }
}
