package fittness.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class setup extends JFrame implements ActionListener
{
    JButton b2,b3,b1;
    JRadioButton r1,r2,r3,r4,r5,r6;
    JTextArea ta;
    JTextField t1,t2,t3,t7,t8;
    JTextField t4,t6;
    
      Font f2=new Font("verdana",Font.BOLD,12);
    setup()
    {
     ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/sachin.png"));
     Image i5=i4.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
     ImageIcon i6=new ImageIcon(i5);
     JLabel l2=new JLabel("");
     l2.setIcon(i6);
     l2.setBounds(950,8,30,30);
     add(l2);     
     l2.addMouseListener(new MouseAdapter()
     {
         public void mouseClicked(MouseEvent me)
         {
             System.exit(0);
         }
     });
      
      ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/fit.png"));
     Image i2=i1.getImage().getScaledInstance(350,200,Image.SCALE_DEFAULT);
     ImageIcon i3=new ImageIcon(i2);
     JLabel l3=new JLabel("");
     l3.setIcon(i3);
     l3.setBounds(10,10,350,200);
     add(l3);
   
     
     r2=new JRadioButton("INTRODUCTION");
     r2.setFont(f2);
     r2.setFocusable(true);
     r2.setBackground(new Color(7,89,67));
     r2.setForeground(Color.WHITE);
     r2.setBounds(50,250,150,30);
     r2.setSelected(true);
     add(r2);
      
      r3=new JRadioButton("SOME INSTRUCTIONS");
      r3.setFont(f2);
      r3.setFocusable(true);
      r3.setBackground(new Color(7,89,67));
      r3.setForeground(Color.WHITE);
      r3.setBounds(50,280,200,30);
      r3.setSelected(true);
      add(r3);
      
     r4=new JRadioButton("SETTING UP YOUR SOFTWARE");
     r4.setFont(f2);
     r4.setFocusable(true);
     r4.setBackground(new Color(7,89,67));
     r4.setForeground(Color.WHITE);
     r4.setBounds(50,310,250,30);
     r4.setSelected(true);
     add(r4);
        
     r1=new JRadioButton("WELCOME");
     r1.setFont(f2);
     r1.setFocusable(true);
     r1.setBackground(new Color(7,89,67));
     r1.setForeground(Color.WHITE);
     r1.setBounds(50,340,250,30);
     r1.setSelected(false);
     add(r1);
     
     
     b2=new JButton("Next");
     b2.setBounds(710,550,100,30);
     b2.setFocusable(false);
     b2.setBackground(Color.white);
     b2.setForeground(Color.BLACK);
     b2.setFont(f2);
     b2.setEnabled(false);
     add(b2);
     b2.addActionListener(new ActionListener()
     {
         public void actionPerformed(ActionEvent ae)
         {
             String one="one";
           String country=t4.getText();
           String OS=t6.getText();
           try{
               Class.forName("org.apache.derby.jdbc.ClientDriver");
               Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/malhotra", "java","java");
               PreparedStatement pst=null;
               String str="Insert into projectfitness values (?,?,?,?,?,?)";
               pst=conn.prepareStatement(str);
               pst.setString(1, t1.getText());
               pst.setString(2, t2.getText());
               pst.setString(3, t3.getText());
               pst.setString(4, country);
               pst.setString(5, OS);
                 pst.setString(6, one);
               int a=pst.executeUpdate();
               t1.setText(null);
               t2.setText(null);
               t3.setText(null);
               pst.close();
               conn.close();
               new bmiforuser().setVisible(true);
               dispose();
           }catch(Exception ex)
           {
               System.out.println(ex);
           }
         }
     });
     
     b3=new JButton("Cancel");
     b3.setBounds(820,550,100,30);
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
             System.exit(0);
         }
     });
        
      ImageIcon i8=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/3.png"));
     Image i9=i8.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
     ImageIcon i10=new ImageIcon(i9);
     JLabel l4=new JLabel("");
     l4.setIcon(i10);
     l4.setBounds(10,560,30,30);
     add(l4);     
     l4.addMouseListener(new MouseAdapter()
     {
         public void mouseClicked(MouseEvent me)
         {
            new softinfo().setVisible(true);
         }
     });
     
     String information="\t\tSETTING UP YOUR APPLICATION.\n\n\nThis software is generally used for Workout and staying healthy which gives you \nmental as well as internal strength"
     + "You are first time user of this application so kindly\n fill these for future purposes.";
         
     ta=new JTextArea();
     ta.setBackground(new Color(48,80,67));
     ta.setForeground(Color.WHITE);
     ta.setBounds(400,60,580,470);
     ta.setEditable(false);
     ta.setFont(f2);
     ta.setText(information);
     add(ta);
     
     JLabel a=new JLabel("NAME *");
     a.setFont(f2);
     a.setBounds(10,150,100,20);
     a.setForeground(Color.WHITE);
     ta.add(a);
     
     t1=new JTextField();
     t1.setBounds(130,150,150,20);
     t1.setFont(f2);
     t1.setBackground(Color.GRAY);
     ta.add(t1);
     
     JLabel b=new JLabel("PASSWORD *");
     b.setFont(f2);
     b.setBounds(10,190,100,20);
     b.setForeground(Color.WHITE);
     ta.add(b);
     
     
     t2=new JPasswordField();
     t2.setBounds(130,190,150,20);
     t2.setFont(f2);
     t2.setBackground(Color.GRAY);
     ta.add(t2);
    
     JLabel c=new JLabel("E-MAIL *");
     c.setFont(f2);
     c.setBounds(10,230,100,20);
     c.setForeground(Color.WHITE);
     ta.add(c);
     
     t3=new JTextField();
     t3.setBounds(130,230,300,20);
     t3.setFont(f2);
     t3.setBackground(Color.GRAY);
     ta.add(t3);
     
     JLabel d=new JLabel("COUNTRY *");
     d.setFont(f2);
     d.setBounds(10,270,100,20);
     d.setForeground(Color.WHITE);
     ta.add(d);
     
     t4=new JTextField();
     /*t4.addItem("AUSTRALIA");
     t4.addItem("EUROPE");
     t4.addItem("PAKISTAN");
     t4.addItem("ENGLAND");
     t4.addItem("NEW ZEALAND");
     t4.addItem("AFGANISTAN");
     t4.addItem("SRI LANKA");
     t4.addItem("SPAIN");
     t4.addItem("CANADA");
     t4.addItem("DUBAI");
     t4.addItem("AFRICA");
     t4.addItem("AMERICA");
     t4.addItem("KENYA");*/
     t4.setBounds(130,270,100,20);
     t4.setFont(f2);
     t4.setForeground(Color.white);
     t4.setBackground(Color.GRAY);
     ta.add(t4);
     
     JLabel e=new JLabel("OP.SYSTEM *");
     e.setFont(f2);
     e.setBounds(10,310,100,20);
     e.setForeground(Color.WHITE);
     ta.add(e);
     
     t6=new JTextField();
     /*t6.addItem("WINDOWS");
     t6.addItem("LINUX");
     t6.addItem("MS DOS");*/
     t6.setBounds(130,310,150,20);
     t6.setFont(f2);
     t6.setForeground(Color.white);
     t6.setBackground(Color.GRAY);
     ta.add(t6);
     
     r6=new JRadioButton("I ACCEPT ALL THE CONDITIONS AND READY TO USE THIS APPLICATION");
     r6.setFont(f2);
     r6.setBackground(new Color(48,80,67));
     r6.setForeground(Color.WHITE);
     r6.setBounds(30,400,520,20);
     ta.add(r6);
     r6.addActionListener(this);
     
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
    new setup().setVisible(true);
 }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(r6.isSelected())
       {
           b2.setEnabled(true);
       }
       if(!r6.isSelected())
       {
           b2.setEnabled(false);
       }
    
    }
}
