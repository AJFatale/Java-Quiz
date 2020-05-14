import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.Color;

public class Result extends JFrame 
{
	public int result;
	public int count;
	private JPanel Result;
	
	Connection con=null;
    PreparedStatement pst=null;
    protected String uname;
	protected String subject;
	int i;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Result frame = new Result();
					frame.Result1();
					frame.setVisible(true);
					frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void Result1()
	{
		setTitle("Result");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 972, 788);
		Result = new JPanel();
		Result.setForeground(new Color(255, 255, 255));
		Result.setBackground(new Color(236, 226, 32));
		Result.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Result);
		Result.setLayout(null);
		
		JLabel l1=new JLabel("SCORE: "+result+"/"+count);
		l1.setForeground(new Color(114, 61, 12));
		l1.setFont(new Font("Verdana", Font.ITALIC, 50));
		l1.setBounds(300, 200, 500, 50);
		Result.add(l1);
		
		// will insert our score here
		
		JLabel l2=new JLabel();
		l2.setForeground(new Color(114, 61, 12));
		l2.setFont(new Font("Verdana", Font.BOLD, 50));
		l2.setBounds(100, 150, 500, 50);
		Result.add(l2);
		
		JLabel l3=new JLabel("ScoreBoard");
		l3.setForeground(new Color(114, 61, 12));
		l3.setFont(new Font("Verdana", Font.BOLD, 30));
		l3.setBounds(450, 70, 500, 50);
		Result.add(l3);
		
		JLabel l4 = new JLabel("");
		l4.setBackground(new Color(0, 0, 0));
		l4.setIcon(new ImageIcon("C:\\Users\\lenovo\\Desktop\\Java Practical\\Project\\images\\quiz.jpg"));
		l4.setBounds(1000,20, 500, 250);
		Result.add(l4);
		
		JLabel l5=new JLabel("Congratulations for successfully completing your test! ");
		l5.setForeground(new Color(114, 61, 12));
		l5.setFont(new Font("Verdana", Font.ITALIC, 30));
		l5.setBounds(300,350, 1000, 50);
		Result.add(l5);
		
		JLabel l6=new JLabel("Way more to go..");
		l6.setForeground(new Color(114, 61, 12));
		l6.setFont(new Font("Verdana", Font.ITALIC, 30));
		l6.setBounds(300,450, 1000, 50);
		Result.add(l6);
		
		JLabel l7 = new JLabel("");
		l7.setBackground(new Color(0, 0, 0));
		l7.setIcon(new ImageIcon("bestoflucknew.jpg"));
		l7.setBounds(650,400,220,220);
		Result.add(l7);
		
		JButton button = new JButton("Home Page");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			   String clear="update submittedanswers set sa = null";
			  
			   try {
				   Class.forName("oracle.jdbc.driver.OracleDriver"); 
		            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abhi"); 
				pst=con.prepareStatement(clear);
				 pst.executeUpdate();
				 
				 
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(Result,e1.getMessage());
			}
			    
				dispose();
				Select s=new Select();
				
				s.setVisible(true);
				s.setExtendedState(s.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBounds(809,650, 121, 34);
		Result.add(button);
		result=0;
	}
}
