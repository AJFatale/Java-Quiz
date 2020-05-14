import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.DebugGraphics;

public class RegistrationForm extends JFrame {
	private JTextField newusername;
	private JTextField name;
	private JTextField midname;
	private JTextField lastname;
	private JTextField mobilenumber;
	private JTextField emailid;
	private JTextField collagename;
	private JPasswordField newpassword;
	private JRadioButton femal;
	private JRadioButton mal;
	private JButton submit,reset;
	private JFrame frame=new JFrame();
	int gender;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationForm frame = new RegistrationForm();
					frame.setVisible(true);
					frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("unchecked")
	public RegistrationForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 744);
		JPanel form2 = new JPanel();
		form2.setBackground(new Color( 136, 97, 197));
		form2.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(form2);
		form2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration Form");
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 20));
		lblNewLabel.setBounds(272, 11,250, 35);
		form2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setForeground(Color.YELLOW);
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_1.setBounds(34, 82, 94, 21);
		form2.add(lblNewLabel_1);
		
		newusername = new JTextField();
		newusername.setBackground(new Color(240, 255, 240));
		newusername.setBounds(107, 83, 143, 21);
		form2.add(newusername);
		newusername.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setForeground(Color.YELLOW);
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_2.setBounds(329, 85, 65, 14);
		form2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setForeground(Color.YELLOW);
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_3.setBounds(34, 148, 46, 14);
		form2.add(lblNewLabel_3);
		
		name = new JTextField();
		name.setBackground(new Color(240, 255, 240));
		name.setBounds(107, 146, 143, 21);
		form2.add(name);
		name.setColumns(10);
		
		midname = new JTextField();
		midname.setBackground(new Color(240, 255, 240));
		midname.setColumns(10);
		midname.setBounds(272, 146, 143, 21);
		form2.add(midname);
		
		lastname = new JTextField();
		lastname.setBackground(new Color(240, 255, 240));
		lastname.setColumns(10);
		lastname.setBounds(444, 146, 143, 21);
		form2.add(lastname);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setForeground(Color.YELLOW);
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_4.setBounds(34, 209, 111, 14);
		form2.add(lblNewLabel_4);
		
		femal = new JRadioButton("Female");
		femal.setForeground(Color.YELLOW);
		femal.setBackground(new Color( 136, 97, 197));
		femal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(femal.isSelected())
				{
					gender=2;
					mal.setSelected(false);
				}
				
			}
		});
		femal.setFont(new Font("Verdana", Font.BOLD, 14));
		femal.setBounds(107, 205, 109, 23);
		form2.add(femal);
		
		mal = new JRadioButton("Male");
		mal.setForeground(Color.YELLOW);
		mal.setBackground(new Color( 136, 97, 197));
		mal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(mal.isSelected())
				{
					gender=1;
					femal.setSelected(false);
					
				}
			}
		});
		mal.setFont(new Font("Verdana", Font.BOLD, 14));
		mal.setBounds(225, 205, 109, 23);
		form2.add(mal);
		
		JLabel lblNewLabel_5 = new JLabel("Mobile Number");
		lblNewLabel_5.setForeground(Color.YELLOW);
		lblNewLabel_5.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_5.setBounds(34, 268, 111, 14);
		form2.add(lblNewLabel_5);
		
		mobilenumber = new JTextField("+91");
		mobilenumber.setBackground(new Color(240, 255, 240));
		mobilenumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mobilenumber.setBounds(155, 266, 120, 21);
		form2.add(mobilenumber);
		mobilenumber.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Email Id");
		lblNewLabel_6.setForeground(Color.YELLOW);
		lblNewLabel_6.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_6.setBounds(34, 322, 111, 14);
		form2.add(lblNewLabel_6);
		
		emailid = new JTextField();
		emailid.setBackground(new Color(240, 255, 240));
		emailid.setFont(new Font("Tahoma", Font.PLAIN, 12));
		emailid.setBounds(107, 320, 317, 21);
		form2.add(emailid);
		emailid.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Date Of Birth");
		lblNewLabel_7.setForeground(Color.YELLOW);
		lblNewLabel_7.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_7.setBounds(34, 390, 111, 14);
		form2.add(lblNewLabel_7);
		
		JComboBox birthdate = new JComboBox();
		//birthdate.setBackground(new Color( 136, 97, 197));
		birthdate.setModel(new DefaultComboBoxModel(new String[] {"Select Date", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		birthdate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		birthdate.setBounds(155, 387, 95, 22);
		form2.add(birthdate);
		
        
        
		
		JComboBox birthmonth = new JComboBox();
		birthmonth.setModel(new DefaultComboBoxModel(new String[] {"Select Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		birthmonth.setFont(new Font("Tahoma", Font.PLAIN, 12));
		birthmonth.setBounds(265, 386, 100, 22);
		form2.add(birthmonth);
		
		
		JComboBox birthyear = new JComboBox();
		birthyear.setFont(new Font("Tahoma", Font.PLAIN, 12));
		birthyear.setModel(new DefaultComboBoxModel(new String[] {"Select Year", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005"}));
		birthyear.setBounds(387, 387, 101, 22);
		form2.add(birthyear);
		
		JLabel lblNewLabel_8 = new JLabel("College Name");
		lblNewLabel_8.setForeground(Color.YELLOW);
		lblNewLabel_8.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_8.setBounds(34, 455, 111, 14);
		form2.add(lblNewLabel_8);
		
		collagename = new JTextField();
		collagename.setBackground(new Color(240, 255, 240));
		collagename.setFont(new Font("Tahoma", Font.PLAIN, 12));
		collagename.setBounds(144, 453, 417, 21);
		form2.add(collagename);
		collagename.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Address");
		lblNewLabel_9.setForeground(Color.YELLOW);
		lblNewLabel_9.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_9.setBounds(34, 515, 111, 14);
		form2.add(lblNewLabel_9);
		
		JTextArea addres = new JTextArea();
		addres.setBackground(new Color(240, 255, 240));
		addres.setBounds(144, 511, 417, 71);
		form2.add(addres);
		
		newpassword = new JPasswordField();
		newpassword.setBackground(new Color(240, 255, 240));
		newpassword.setBounds(400, 83, 143, 21);
		form2.add(newpassword);
		
		submit = new JButton("Submit");
		submit.setBackground(new Color(204, 204, 255));
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String s1=newusername.getText();
				char[] s2=newpassword.getPassword();
				String s3=new String(s2);
				String s4=name.getText();
				String s5=midname.getText();
				String s6=lastname.getText();
				String s7=mobilenumber.getText();
				String s8=emailid.getText();
				String s9=collagename.getText();
				String s10=addres.getText();
				String s11;
				String d=(String) birthdate.getSelectedItem();
				String m=(String) birthmonth.getSelectedItem();
				String y=(String) birthyear.getSelectedItem();
				String bdate=d+"/"+m+"/"+y ;
				if(gender==1) {
					s11="male";
					
				}else {
					s11="female";
				}

				
						try {
					    int x = 0;
	                    Class.forName("oracle.jdbc.driver.OracleDriver");
	                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abhi");
	                    PreparedStatement ps = con.prepareStatement("INSERT INTO registration(username,passsword, FNAME, MNAME, LNAME, GENDER , MOBILE_NO , EMAIL ,date_of_birth, COLLEGE_NAME, ADDRESS) VALUES (?, ?,?,?,?,?,?,?, TO_DATE(?, 'DD/MM/YYYY'),?,?)");
	                    ps.setString(1, s1);
	                    ps.setString(2, s3);
	                    ps.setString(3, s4);
	                    ps.setString(4, s5);
	                    ps.setString(5, s6);
	                    ps.setString(6, s11);
	                    ps.setString(7, s7);
	                    ps.setString(8, s8);
	                    ps.setString(9,bdate);
	                    ps.setString(10, s9);
	                    ps.setString(11, s10);
	                    ResultSet rs = ps.executeQuery();
	                    x++;
	                    if (x > 0) 
	                    { 
				
	                    	JOptionPane.showMessageDialog(frame,"Registered Successfully!");	                   }
	                  
	                    
	                    	
	                    }
	                   
	                    
	                    
	                    
	                
	          catch (Exception ex) 
	                {
	                    System.out.println(ex);
	                }
	          
				
				
				frame.dispose();
				dispose();
				Login s=new Login();
				s.frame.setVisible(true);
				s.frame.setExtendedState(s.frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);

			
			}
		});
		
		 reset = new JButton("Reset"); 
		 reset.setBackground(new Color(204, 204, 255));
		 reset.setFont(new Font("Tahoma", Font.BOLD, 12));
		 reset.setBounds(456, 643, 89, 23); 
	        reset.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					
					 String def = ""; 
					newusername.setText(def);
						newpassword.setText(def);
						
						name.setText(def);
						midname.setText(def);
						 lastname.setText(def);
						mobilenumber.setText(def);
						emailid.setText(def);
						collagename.setText(def);
						addres.setText(def); 
			            birthdate.setSelectedIndex(0); 
			            birthmonth.setSelectedIndex(0); 
			            birthyear.setSelectedIndex(0); 
			            if(gender==1) {
			            	mal.setSelected(false);
			            }else {
			            	femal.setSelected(false);
			            }
					
					
					
				}
				}
	        );
	        form2.add(reset); 
		
		submit.setFont(new Font("Tahoma", Font.BOLD, 12));
		submit.setBounds(296, 643, 89, 23);
		form2.add(submit);
		
		
		
		
		
	}
}
