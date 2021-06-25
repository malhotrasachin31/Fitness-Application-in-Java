package fittness.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BMI extends JFrame implements ActionListener
{
    JPanel p1;
     double num1,num2;
     JRadioButton l4,l5;
     JLabel ax,bx,cx,dx;
    Font f1=new Font("Arial",Font.BOLD,20);
    Font f2=new Font("Arial",Font.BOLD,40);
    Font f3=new Font("Arial",Font.BOLD,16);
    JTextField t3,t4,t5,t6,t7,ta,tb;
    JButton add,calculate1,calculate;
    int calculation;
    double result=0;
    
    
    BMI()
    { 
        
        p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.ORANGE);
        p1.setBounds(0,0,1100,40);
        add(p1);
        
        t3=new JTextField();
        t3.setBounds(560,50,530,80);
        t3.setFont(f2);
        t3.setEditable(false);
        t3.setBackground(new Color(7,84,95));
        t3.setForeground(Color.WHITE);
        add(t3);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/sachin.png"));
        Image i2=i1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel("first");
        l1.setIcon(i3);
        l1.setBounds(1070,10,20,20);
        p1.add(l1);
        l1.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                dispose();
            }
        });
        
        JLabel h=new JLabel("BODY MASS INDEX DETAILS");
        h.setBounds(5,60,570,60);
        h.setFont(f2);
        h.setForeground(Color.ORANGE);
        add(h);
        
        String str="Keep your Fat low and muscle always High";
                
        ImageIcon i8=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/3.png"));
     Image i9=i8.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
     ImageIcon i10=new ImageIcon(i9);
     JLabel lh=new JLabel("");
     lh.setIcon(i10);
     lh.setBounds(10,510,30,30);
     add(lh);     
     lh.addMouseListener(new MouseAdapter()
     {
         public void mouseClicked(MouseEvent me)
         {
            dispose();
         }
     });
        
        JLabel in=new JLabel(str);
        in.setBounds(80,100,570,60);
        in.setFont(f1);
        in.setForeground(Color.ORANGE);
        add(in);
        
        JLabel name=new JLabel("Name of the Indiviual");
        name.setBounds(100,350,300,30);
        name.setFont(f1);
        name.setForeground(Color.white);
        add(name);
        
        ta=new JTextField();
        ta.setBounds(370,350,120,30);
        ta.setFont(f1);
        ta.setForeground(Color.WHITE);
        ta.setBackground(new Color(7,84,95));
        add(ta);
        
        JLabel Age=new JLabel("Age of the Indiviual");
        Age.setBounds(100,400,300,30);
        Age.setFont(f1);
        Age.setForeground(Color.white);
        add(Age);
        
        tb=new JTextField();
        tb.setBounds(370,400,120,30);
        tb.setFont(f1);
        tb.setForeground(Color.WHITE);
        tb.setBackground(new Color(7,84,95));
        add(tb);
        
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/fit.png"));
        Image i0=i.getImage().getScaledInstance(450,200,Image.SCALE_DEFAULT);
        ImageIcon ig=new ImageIcon(i0);
        JLabel l3=new JLabel("");
        l3.setIcon(ig);
        l3.setBounds(50,150,450,200);
        add(l3);
        
        
        add=new JButton("Add");
        add.setBounds(250,500,120,30);
        add.setFont(f1);
        add.setFocusable(false);
        add.setBackground(Color.ORANGE);
        add.setForeground(Color.BLACK);
        add(add);
        add.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/malhotra", "java","java");
                PreparedStatement pst=null;
                String insert="insert into BMI values (?,?,?,?,?,?)";
                pst=conn.prepareStatement(insert);
                pst.setString(1, ta.getText());
                pst.setString(2,tb.getText());
                if(l4.isSelected())
                {
                    pst.setString(3,t4.getText());
                    pst.setString(4, t5.getText());
                }
                if(l5.isSelected())
                {
                     pst.setString(3,t6.getText());
                    pst.setString(4, t7.getText()); 
                }
                pst.setString(5, t3.getText());
                if(l4.isSelected())
                {
                    pst.setString(6,l4.getText());
                }
                if(l5.isSelected())
                {
                    pst.setString(6,l5.getText());
                }
                int a=pst.executeUpdate();
                
                ta.setText(null);
                tb.setText(null);
                if(l4.isSelected())
                {
                t4.setText(null);
                t5.setText(null);
                }
                if(l5.isSelected())
                {
                     t6.setText(null);
                     t7.setText(null);
                }
                t3.setText(null);
                
                pst.close();
                conn.close();
                
                }catch(Exception ex){System.out.println(ex);};
            }
        });
        
        l4=new JRadioButton("METRIC");
        l4.setBounds(580,160,150,30);
        l4.setFocusable(false);
        l4.setFont(f1);
        l4.setBackground(Color.BLACK);
        l4.setForeground(Color.white);
        add(l4);
        l4.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me1)
            {
                if(l4.isSelected())
               {
                   t6.setEnabled(false);
                   t7.setEnabled(false);
                  calculate1.setEnabled(false);
               }
               if(!l4.isSelected())
               {
                      t6.setEnabled(true);
                   t7.setEnabled(true);
                  calculate1.setEnabled(true);
               }
            }
        });
        
        JLabel l6=new JLabel("Height (in cm)");
        l6.setBounds(580,214,150,30);
        l6.setFont(f1);
        l6.setForeground(Color.white);
        add(l6);
        
        t4=new JTextField();
        t4.setBounds(750,214,70,30);
        t4.setBackground(new Color(7,86,95));
        t4.setForeground(Color.white);
        t4.setFont(f1);
        add(t4);
        
        JLabel l7=new JLabel("Weight (in Kg)");
        l7.setBounds(580,254,150,30);
        l7.setFont(f1);
        l7.setForeground(Color.white);
        add(l7);
        
        t5=new JTextField();
        t5.setBounds(750,254,70,30);
        t5.setBackground(new Color(7,86,95));
        t5.setForeground(Color.white);
        t5.setFont(f1);
        add(t5);
        
        calculate=new JButton("Calculate");
        calculate.setBounds(625,320,150,30);
        calculate.setForeground(Color.BLACK);
        calculate.setBackground(Color.ORANGE);
        calculate.setFont(f1);
        calculate.setFocusable(false);
        add(calculate);
         calculate.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                Double height=Double.parseDouble(t4.getText());
                Double weight=Double.parseDouble(t5.getText());
                double height2=height/100;
                double bmi1=weight/Math.pow(height2, 2);
                if(bmi1<=18.5)
                {
                    ax.setForeground(Color.red);
                    bx.setForeground(Color.white);
                    cx.setForeground(Color.white);
                    dx.setForeground(Color.white);
                }
                if(bmi1>=18.5 && bmi1<=24.9)
                {
                    ax.setForeground(Color.white);
                    bx.setForeground(Color.green);
                    cx.setForeground(Color.white);
                    dx.setForeground(Color.white);
                }
                if(bmi1>=25 && bmi1<=29.9)
                {
                    ax.setForeground(Color.white);
                    bx.setForeground(Color.white);
                    cx.setForeground(Color.red);
                    dx.setForeground(Color.white);
                }
                if(bmi1>=30)
                {
                    dx.setForeground(Color.red);
                    bx.setForeground(Color.white);
                    cx.setForeground(Color.white);
                    ax.setForeground(Color.white);
                }
                t3.setText(String.valueOf(bmi1));
            }
        });
        
        l5=new JRadioButton("IMPERIAL");
        l5.setBounds(580,370,150,30);
        l5.setFocusable(false);
        l5.setFont(f1);
        l5.setBackground(Color.BLACK);
        l5.setForeground(Color.white);
        add(l5);
        l5.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me1)
            {
               if(l5.isSelected())
               {
                   t4.setEnabled(false);
                   t5.setEnabled(false);
                   calculate.setEnabled(false);
               }
               if(!l5.isSelected())
               {
                   t4.setEnabled(true);
                   t5.setEnabled(true);
                   calculate.setEnabled(true);
               }
            }
        });
        
         JLabel l8=new JLabel("Height (in Inch)");
        l8.setBounds(580,414,150,30);
        l8.setFont(f1);
        l8.setForeground(Color.white);
        add(l8);
        
        t6=new JTextField();
        t6.setBounds(750,414,70,30);
        t6.setBackground(new Color(7,86,95));
        t6.setForeground(Color.white);
        t6.setFont(f1);
        add(t6);
        
        JLabel l9=new JLabel("Weight (in Lbs)");
        l9.setBounds(580,454,150,30);
        l9.setFont(f1);
        l9.setForeground(Color.white);
        add(l9);
        
        t7=new JTextField();
        t7.setBounds(750,454,70,30);
        t7.setBackground(new Color(7,86,95));
        t7.setForeground(Color.white);
        t7.setFont(f1);
        add(t7);
        
        calculate1=new JButton("Calculate");
        calculate1.setBounds(625,500,150,30);
        calculate1.setForeground(Color.BLACK);
        calculate1.setBackground(Color.ORANGE);
        calculate1.setFont(f1);
        calculate1.setFocusable(false);
        add(calculate1);
        calculate1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                  Double height=Double.parseDouble(t6.getText());
                  Double weight=Double.parseDouble(t7.getText());
                  double bmi2=703*weight/Math.pow(height, 2);
                    if(bmi2<=18.5)
                {
                    ax.setForeground(Color.red);
                    bx.setForeground(Color.white);
                    cx.setForeground(Color.white);
                    dx.setForeground(Color.white);
                }
                if(bmi2>=18.5 && bmi2<=24.9)
                {
                    ax.setForeground(Color.white);
                    bx.setForeground(Color.green);
                    cx.setForeground(Color.white);
                    dx.setForeground(Color.white);
                }
                if(bmi2>=25 && bmi2<=29.9)
                {
                    ax.setForeground(Color.white);
                    bx.setForeground(Color.white);
                    cx.setForeground(Color.red);
                    dx.setForeground(Color.white);
                }
                if(bmi2>=30)
                {
                    dx.setForeground(Color.red);
                    bx.setForeground(Color.white);
                    cx.setForeground(Color.white);
                    ax.setForeground(Color.white);
                }
                t3.setText(String.valueOf(bmi2));
            }
        });
        
        ax=new JLabel("Underweight = <18.5");
        ax.setBounds(870,214,200,30);
        ax.setFont(f3);
        ax.setForeground(Color.white);
        add(ax);
        
        bx=new JLabel("Normal weight = 18.5-24.9");
        bx.setBounds(870,244,200,30);
        bx.setFont(f3);
        bx.setForeground(Color.white);
        add(bx);
        
        cx=new JLabel("Overerweight = 25-29.9");
        cx.setBounds(870,274,200,30);
        cx.setFont(f3);
        cx.setForeground(Color.white);
        add(cx);
        
        dx=new JLabel("Obesity = BMI of 30 or greater");
        dx.setBounds(870,304,250,30);
        dx.setFont(f3);
        dx.setForeground(Color.white);
        add(dx);
        
        setLayout(null);
        setSize(1100,550);
        setLocation(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);
        setUndecorated(true);
    }
  
    public static void main(String args[])
    {
        new BMI().setVisible(true);
    }
   
    @Override
    public void actionPerformed(ActionEvent e1) 
    {
    
     
   
     
   
    }
}