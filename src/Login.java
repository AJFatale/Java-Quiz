import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login {

	 JFrame frame;
	private JTextField username;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_3;
    boolean login=false;
  
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
		            
		            Class.forName("oracle.jdbc.driver.OracleDriver"); 
		            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abhi"); 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(new Color( 136, 97, 197));
		frame.setBounds(100, 100, 871, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 25));
		lblNewLabel.setBounds(470, 270, 200, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 25));
		lblNewLabel_1.setBounds(470, 334, 200, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		username = new JTextField();
		username.setBackground(new Color(255, 250, 250));
		username.setBounds(686, 271, 180, 35);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(255, 250, 250));
		passwordField.setBounds(686, 334, 180, 35);
		frame.getContentPane().add(passwordField);
		

		JLabel l4 = new JLabel("");
		l4.setBackground(new Color(0, 0, 0));
		l4.setIcon(new ImageIcon("C:\\Users\\lenovo\\Desktop\\Java Practical\\Project\\images\\quiz.jpg"));
		l4.setBounds(1000,20, 500, 250);
		frame.add(l4);
		
		JButton btnNewButton = new JButton("Login");
			btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Connection con;
				try
				{
					 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abhi");
				Statement statement = con.createStatement();
	            
	            ResultSet results = statement.executeQuery("select username,passsword from registration");
	            while(results.next())
	            {
	            	String uname =username.getText();
					String psd=passwordField.getText();
					String u=results.getString(1);
					String p=results.getString(2);
					
					
					if (uname.equals(u) && psd.equals(p))
					{
						
						login=true;
						
					
					}
					
					
					
	            }
	            if(login) {
	            	String uname =username.getText();
	            	JOptionPane.showMessageDialog(frame,"You are Sucessfully logged in!");
					frame.dispose();
					Select s=new Select();
					
					s.setVisible(true);
					s.setExtendedState(s.getExtendedState() | JFrame.MAXIMIZED_BOTH);
				
	            }else {
	            	JOptionPane.showMessageDialog(frame,"Invalid Username or Password");
	            	username.setText(" ");
	            	passwordField.setText("");
	            }
				
				
			}
				catch(Exception e2) 
				{
					
				}
				
			}
		});
	
		btnNewButton.setBounds(544, 412, 92, 32);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel_2 = new JLabel("Login to Quiz");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBackground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_2.setBounds(555, 100, 450, 60);
		frame.getContentPane().add(lblNewLabel_2);
		
		btnNewButton_1 = new JButton("New Registration");
		//btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				RegistrationForm Reg=new RegistrationForm();
				Reg.setVisible(true);
				Reg.setExtendedState(Reg.getExtendedState() | JFrame.MAXIMIZED_BOTH);
				
				
			}
		});
		//btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(686, 412, 161, 30);
		frame.getContentPane().add(btnNewButton_1);
		
	
	}


		
	}

