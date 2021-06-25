package fittness.application;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;


public class congo extends JFrame
{
    JPanel p1;
    JButton b2;
     JTextField st,sa;
    static SimpleDateFormat sdf;
    
    JTextField c,ca,tm,da;
     Font f1=new Font("panton",Font.BOLD,46);
      Font f2=new Font("times new roman",Font.PLAIN,46);
      Font f3=new Font("panton",Font.BOLD,26);
 
      
    congo()
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

          JLabel cal=new JLabel("Total Workouts :");
          cal.setBounds(20,530,210,30);
          cal.setFont(f3);
          cal.setForeground(Color.BLACK);
          add(cal);
        
          c=new JTextField();
          c.setEditable(false);
          c.setText("     10");
          c.setBounds(300,530,170,30);
          c.setFont(f3);
          c.setForeground(Color.BLACK);
          add(c);
        
          
          JLabel cal2=new JLabel("Total Calories :");
          cal2.setBounds(20,570,210,30);
          cal2.setFont(f3);
          cal2.setForeground(Color.BLACK);
          add(cal2);
          
          ca=new JTextField();
          ca.setEditable(false);
          ca.setText("    120.543");
          ca.setBounds(300,570,170,30);
          ca.setFont(f3);
          ca.setForeground(Color.BLACK);
          add(ca);
          
          JLabel t=new JLabel("Total Time  :");
          t.setBounds(20,610,210,30);
          t.setFont(f3);
          t.setForeground(Color.BLACK);
          add(t);
        
          tm=new JTextField();
          tm.setEditable(false);
          tm.setText("    12.00.min");
          tm.setBounds(300,610,170,30);
          tm.setFont(f3);
          tm.setForeground(Color.BLACK);
          add(tm);
          
         JLabel day=new JLabel("Day");
          day.setBounds(20,650,250,30);
          day.setFont(f3);
          day.setForeground(Color.BLACK);
          add(day);
        
          Date d=new Date();
          SimpleDateFormat  sdf=new SimpleDateFormat("E");
          SimpleDateFormat  sdf2=new SimpleDateFormat("dd/MM/yyyy");
          
                  
          st=new JTextField();
          st.setEditable(false);
          st.setText("        "+sdf.format(d));
          st.setBounds(300,650,170,30);
          st.setFont(f3);
          st.setForeground(Color.BLACK);
          add(st);
        
          JLabel date=new JLabel("Date");
          date.setBounds(20,690,250,30);
          date.setFont(f3);
          date.setForeground(Color.BLACK);
          add(date);
        
          sa=new JTextField();
          sa.setEditable(false);
          sa.setText("  "+sdf2.format(d));
          sa.setBounds(300,690,170,30);
          sa.setFont(f3);
          sa.setForeground(Color.BLACK);
          add(sa);
        
          
          
          
         ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/congo.gif"));
         Image i0=i.getImage().getScaledInstance(450,450,Image.SCALE_DEFAULT);
         ImageIcon i1=new ImageIcon(i0);
        JLabel l=new JLabel("");
        l.setIcon(i1);
        l.setBounds(20,50,450,450);
        add(l);
        
            b2=new JButton("DONE");
        b2.setFont(f3);
        b2.setFocusable(false);
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65,105,225));
        b2.setBounds(150,750,200,40);
        add(b2);
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/malhotra","java","java");
                PreparedStatement pst=null;
                String str="insert into report values(?,?,?,?,?)";
                pst=conn.prepareStatement(str);
                pst.setString(1, c.getText());
                pst.setString(2,ca.getText());
                pst.setString(3, tm.getText());
                pst.setString(4, st.getText());
                pst.setString(5, sa.getText());
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
          
        setSize(500,800);
        setLocation(850,50);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setUndecorated(true);
        getContentPane().setBackground(new Color(255,255,204));
    }
  public static void main(String args[])
  { 		
    new congo().setVisible(true);
  }
}
