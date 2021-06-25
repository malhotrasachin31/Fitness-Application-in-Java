
package fittness.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/*Import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;*/

public class homepage extends JFrame implements ActionListener
{
    JPanel p1;
   JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Font f1=new Font("arial",Font.PLAIN,30);
    JLabel bmi;
    JButton a,q,q2;
    Font f2=new Font("san-serif",Font.BOLD,40);
    Font f3=new Font("times new roman",Font.BOLD,220);
     Font f4=new Font("times new roman",Font.BOLD,20);
    
    homepage()
    {
                super("FITNESS PROJECT");
                
              /*  p1=new JPanel();
                p1.setBounds(0,0,410,1080);
                p1.setLayout(null);
                p1.setBackground(Color.BLACK);
                add(p1);*/
                
                ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/gym.jpg"));
                Image i5=i4.getImage().getScaledInstance(1920,1080,Image.SCALE_DEFAULT);
                ImageIcon i6=new ImageIcon(i5);
                JLabel l1=new JLabel("");
                l1.setIcon(i6);
                l1.setLayout(null);
                l1.setBounds(0,0,1920,1080);
                add(l1);
                
                ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/fit.png"));
                Image i2=i1.getImage().getScaledInstance(400,200,Image.SCALE_DEFAULT);
                ImageIcon i3=new ImageIcon(i2);
                JLabel l3=new JLabel("");
                l3.setIcon(i3);
                l3.setBounds(0,5,400,200);
                l1.add(l3);
                
                b1=new JButton("Training Plans");
                b1.setBackground(Color.BLACK);
                b1.setForeground(Color.WHITE);
                b1.setBounds(50,300,300,50);
                b1.setFont(f1);
                b1.setFocusable(false);
                l1.add(b1);
                   b1.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                        new training().setVisible(true);
                        dispose();
                    }
                });
                
                b2=new JButton("BMI Calculator");
                b2.setBackground(Color.BLACK);
                b2.setForeground(Color.WHITE);
                b2.setBounds(50,380,300,50);
                b2.setFont(f1);
                b2.setFocusable(false);
                l1.add(b2);
                b2.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                        new BMI().setVisible(true);
                    }
                });
                
                bmi=new JLabel();
                bmi.setBounds(1520,990,500,30);
                bmi.setForeground(Color.WHITE);
                bmi.setFont(f2);
                l1.add(bmi);
                
                  try{
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/malhotra","java","java");
                    ResultSet rs1=null;
                    PreparedStatement pst1=null;
                    String q1="select * from USERINFO";
                    pst1=conn.prepareStatement(q1);
                    rs1 = pst1.executeQuery();
                    if(rs1.next())
                        bmi.setText(rs1.getString("bmi"));
                    
         }catch(Exception ex){System.out.println(ex);};
             
     
                
                b3=new JButton("My Report Chart");
                b3.setBackground(Color.BLACK);
                b3.setForeground(Color.WHITE);
                b3.setBounds(50,460,300,50);
                b3.setFont(f1);
                b3.setFocusable(false);
                l1.add(b3);
                b3.addActionListener(new ActionListener()
                {
                    double a=Double.parseDouble(bmi.getText());
                    public void actionPerformed(ActionEvent ae)
                    {
                      
                DefaultCategoryDataset dcd=new DefaultCategoryDataset();
                dcd.setValue(a, "height", "weight");
        
                JFreeChart jfc=ChartFactory.createBarChart("Body  Mass Index","Weight","Height",dcd,PlotOrientation.VERTICAL,true,true,false);
               // JFreeChart jfc=ChartFactory.createLineChart("Body  Mass Index","Weight","Height",dcd,PlotOrientation.VERTICAL,true,true,true);
                CategoryPlot cp=jfc.getCategoryPlot();
                cp.setRangeMinorGridlinePaint(Color.BLACK);
        
                ChartFrame cf=new ChartFrame("Body Mass Index",jfc,true);
                cf.setVisible(true);
                cf.setSize(1000,700);
                cf.setLocation(500,200);
                cf.setResizable(false);
                
                
            
                    }
                });
                
                b4=new JButton("Workout Reports");
                b4.setBackground(Color.BLACK);
                b4.setForeground(Color.WHITE);
                b4.setBounds(50,540,300,50);
                b4.setFont(f1);
                b4.setFocusable(false);
                l1.add(b4);
                b4.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                        new report().setVisible(true);
                    }
                });
                
                b5=new JButton("All About Yoga");
                b5.setBackground(Color.BLACK);
                b5.setForeground(Color.WHITE);
                b5.setBounds(50,620,300,50);
                b5.setFont(f1);
                b5.setFocusable(false);
                l1.add(b5);
                b5.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                         new yoga().setVisible(true);
                    }
                });
                
                
                 JLabel user=new JLabel("");
                user.setBounds(100,990,500,30);
                user.setForeground(Color.CYAN);
                user.setFont(f2);
                l1.add(user);
                
                    ImageIcon s=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/un.png"));
                    Image s2=s.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
                    ImageIcon s3=new ImageIcon(s2);
                    JLabel c1=new JLabel("");
                    c1.setIcon(s3);
                    c1.setBounds(30,990,40,40);
                    l1.add(c1);
                
                  try{
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/malhotra","java","java");
                    ResultSet rs=null;
                    PreparedStatement pst=null;
                    String q="select * from PROJECTFITNESS";
                    pst=conn.prepareStatement(q);
                    rs = pst.executeQuery();
                    if(rs.next())
                        user.setText(rs.getString("name"));
                    
         }catch(Exception ex){System.out.println(ex);};
             
         
      
                
               
                
                b7=new JButton("Diet Plans");
                b7.setBackground(Color.BLACK);
                b7.setForeground(Color.WHITE);
                b7.setBounds(50,700,300,50);
                b7.setFont(f1);
                b7.setFocusable(false);
                l1.add(b7);
                 b7.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                        new dietPlan().setVisible(true);
                    }
                });
                
                b8=new JButton("BMI Records");
                b8.setBackground(Color.BLACK);
                b8.setForeground(Color.WHITE);
                b8.setBounds(50,780,300,50);
                b8.setFont(f1);
                b8.setFocusable(false);
                l1.add(b8);
                b8.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                        new bmireports().setVisible(true);
                    }
                });
                
                b9=new JButton("Log-Out");
                b9.setBackground(Color.BLACK);
                b9.setForeground(Color.WHITE);
                b9.setBounds(50,860,300,50);
                b9.setFont(f1);
                b9.setFocusable(false);
                l1.add(b9);
                b9.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                         
                        try{
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/malhotra","java","java");
                    PreparedStatement pst=null;
                   String str="DELETE FROM PROJECTFITNESS WHERE SNO = 'one' ";
                   String str2="DELETE FROM USERINFO WHERE SNO = 'one' ";
                   pst=conn.prepareStatement(str);
                   int a=pst.executeUpdate();
                   pst=conn.prepareStatement(str2);
                   pst.executeUpdate();
                    new setup().setVisible(true);
                    dispose();
                   pst.close();
                   conn.close();
                   }catch(Exception ex){System.out.println(ex);};
             
                    }
                });
                
                JTextArea ta=new JTextArea();
                ta.setBounds(420,0,1500,1080);
                ta.setEditable(false);
                ta.setBackground(new Color(0,0,0,0));
                l1.add(ta);
                
               JLabel label1=new JLabel("Never");
               label1.setBounds(1200,40,900,180);
               label1.setForeground(Color.WHITE);
               label1.setFont(f3);
               l1.add(label1);
                
               JLabel give1=new JLabel("Give");
               give1.setBounds(1200,240,900,180);
               give1.setForeground(Color.WHITE);
               give1.setFont(f3);
               l1.add(give1);
                
               JLabel up1=new JLabel("Up Too");
               up1.setBounds(1200,420,900,250);
               up1.setForeground(Color.WHITE);
               up1.setFont(f3);
               l1.add(up1);
               
                JLabel up=new JLabel("Soon");
               up.setBounds(1200,670,900,250);
               up.setForeground(Color.WHITE);
               up.setFont(f3);
               l1.add(up);
               
             
                
               
                ImageIcon h=new ImageIcon(ClassLoader.getSystemResource("fittness/application/images/home2.png"));
                Image h2=h.getImage().getScaledInstance(60, 60,Image.SCALE_SMOOTH);
                ImageIcon h3=new ImageIcon(h2);
                JLabel home=new JLabel("");
                home.setForeground(Color.WHITE);
                home.setBounds(35,10,60,60);
                home.setFont(f2);
                home.setIcon(h3);
                ta.add(home);
                
                
                setLayout(null);
                setSize(1920,1080);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setResizable(true);
                getContentPane().setBackground(Color.WHITE);
     //           setUndecorated(true);
    }
    public static void main(String args[])
    {
        new homepage().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
