import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;

public class javaproject7 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private ButtonGroup g1=new ButtonGroup();
	private ButtonGroup g2=new ButtonGroup();
	String ans1,ans2;
	
	JLabel timeLabel = new JLabel();
    int timeCounter;
    int i=0,j=0,k,l;
    boolean stop=true;
    
    Connection con=null;
    PreparedStatement pst=null ,pst1=null,ps=null;
    ResultSet rs=null;
    String value,value1;
    int result,count=20;

	void updateGUI(java.awt.event.ActionEvent e) {
	NumberFormat nf = new DecimalFormat("00");
if(stop) {
	if(timeCounter<61) 
	{
		 
    timeLabel.setText(nf.format(j)+":"+nf.format(i)+":" + nf.format(++timeCounter));
	}
    if(i<61 && timeCounter==61) 
    {
    timeCounter=0;
    timeLabel.setText(nf.format(j)+":"+nf.format(++i)+":" + nf.format(timeCounter));
    }
	
	if(j<61 && i==61 && timeCounter==61) 
	{
	i=0;
	timeCounter=0;
    timeLabel.setText(nf.format(++j)+":"+nf.format(i)+":" + nf.format(timeCounter));
	    }
	
}
if(i==30)
{
	JOptionPane.showMessageDialog(contentPane,"Time up!");
	dispose();
	
	
	Result s=new Result();
	
	s.setVisible(true);
	s.setExtendedState(s.getExtendedState() | JFrame.MAXIMIZED_BOTH);
	
	
}

}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					javaproject7 frame = new javaproject7();
					frame.javaproject();
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
	public void javaproject() {
		setBackground(new Color(0, 153, 153));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 967, 788);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		contentPane.add(timeLabel);
		timeLabel.setBounds(825, 20, 111, 18);
		timeLabel.setFont(new Font("Helvetica",Font.BOLD,20));
		timeLabel.setBackground(Color.cyan);
		timeLabel.setForeground(Color.red);
		new Timer(1000, this::updateGUI).start();
		
		JLabel lblQuestion = new JLabel("Question 19");
		lblQuestion.setForeground(new Color(255, 255, 255));
		lblQuestion.setBackground(new Color(0, 153, 153));
		lblQuestion.setFont(new Font("Verdana", Font.BOLD, 14));
		lblQuestion.setBounds(27, 63, 100, 18);
		contentPane.add(lblQuestion);
		
		JLabel lblTheNumberOf = new JLabel("The number of onto functions (surjective functions) from set X = {1, 2, 3, 4} to set Y = {a, b, c} is ________________");
		lblTheNumberOf.setForeground(new Color(255, 255, 255));
		lblTheNumberOf.setBackground(new Color(0, 153, 153));
		lblTheNumberOf.setFont(new Font("Verdana", Font.BOLD, 14));
		lblTheNumberOf.setBounds(27, 87,1100, 18);
		contentPane.add(lblTheNumberOf);
		
		JRadioButton radioButton = new JRadioButton("36");
		radioButton.setBackground(new Color(0, 153, 153));
		radioButton.setForeground(new Color(255, 255, 0));
		radioButton.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		radioButton.setBounds(27, 153, 246, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("64");
		radioButton_1.setBackground(new Color(0, 153, 153));
		radioButton_1.setForeground(new Color(255, 255, 0));
		radioButton_1.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		radioButton_1.setBounds(27, 200, 287, 23);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("81");
		radioButton_2.setBackground(new Color(0, 153, 153));
		radioButton_2.setForeground(new Color(255, 255, 0));
		radioButton_2.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		radioButton_2.setBounds(387, 153, 313, 23);
		contentPane.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("72");
		radioButton_3.setBackground(new Color(0, 153, 153));
		radioButton_3.setForeground(new Color(255, 255, 0));
		radioButton_3.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		radioButton_3.setBounds(387, 200, 313, 23);
		contentPane.add(radioButton_3);
		g1.add(radioButton_3);
		g1.add(radioButton_2);
		g1.add(radioButton_1);
		g1.add(radioButton);
	
		JLabel lblQuestion_1 = new JLabel("Question 20");
		lblQuestion_1.setForeground(new Color(255, 255, 255));
		lblQuestion_1.setBackground(new Color(0, 153, 153));
		lblQuestion_1.setFont(new Font("Verdana", Font.BOLD, 14));
		lblQuestion_1.setBounds(27, 282, 100, 18);
		contentPane.add(lblQuestion_1);
		
		JLabel lblLetRBe = new JLabel("Let R be a relation on the set of ordered pairs of positive integers such that ((p, q), (r, s))     R if and only if p\u2013s = q\u2013r. Which one of");
		lblLetRBe.setForeground(new Color(255, 255, 255));
		lblLetRBe.setBackground(new Color(0, 153, 153));
		lblLetRBe.setFont(new Font("Verdana", Font.BOLD, 14));
		lblLetRBe.setBounds(27, 320,1100, 18);
		contentPane.add(lblLetRBe);
		
		JRadioButton rdbtnBothReflexiveAnd = new JRadioButton("Both reflexive and symmetric");
		rdbtnBothReflexiveAnd.setBackground(new Color(0, 153, 153));
		rdbtnBothReflexiveAnd.setForeground(new Color(255, 255, 0));
		rdbtnBothReflexiveAnd.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnBothReflexiveAnd.setBounds(27, 404, 246, 23);
		contentPane.add(rdbtnBothReflexiveAnd);
		
		JRadioButton rdbtnReflexiveButNot = new JRadioButton("Reflexive but not symmetric");
		rdbtnReflexiveButNot.setBackground(new Color(0, 153, 153));
		rdbtnReflexiveButNot.setForeground(new Color(255, 255, 0));
		rdbtnReflexiveButNot.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnReflexiveButNot.setBounds(27, 451, 287, 23);
		contentPane.add(rdbtnReflexiveButNot);
		
		JRadioButton rdbtnNotReflexiveBut = new JRadioButton("Not reflexive but symmetric");
		rdbtnNotReflexiveBut.setBackground(new Color(0, 153, 153));
		rdbtnNotReflexiveBut.setForeground(new Color(255, 255, 0));
		rdbtnNotReflexiveBut.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNotReflexiveBut.setBounds(387, 404, 313, 23);
		contentPane.add(rdbtnNotReflexiveBut);
		
		JRadioButton rdbtnNeitherReflexiveNor = new JRadioButton("Neither reflexive nor symmetric");
		rdbtnNeitherReflexiveNor.setBackground(new Color(0, 153, 153));
		rdbtnNeitherReflexiveNor.setForeground(new Color(255, 255, 0));
		rdbtnNeitherReflexiveNor.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNeitherReflexiveNor.setBounds(387, 451, 313, 23);
		contentPane.add(rdbtnNeitherReflexiveNor);
		
		JLabel lblTheFollowingIs = new JLabel(" the following is true about R?");
		lblTheFollowingIs.setForeground(new Color(255, 255, 255));
		lblTheFollowingIs.setBackground(new Color(0, 153, 153));
		lblTheFollowingIs.setFont(new Font("Verdana", Font.BOLD, 14));
		lblTheFollowingIs.setBounds(27, 363, 899, 18);
		contentPane.add(lblTheFollowingIs);
		g2.add(rdbtnNeitherReflexiveNor);
		g2.add(rdbtnNotReflexiveBut);
		g2.add(rdbtnReflexiveButNot);
		g2.add(rdbtnBothReflexiveAnd);

		textField = new JTextField();
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(0, 153, 153));
		textField.setEditable(false);
		textField.setText("\u2208");
		textField.setBounds(735, 320, 18, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "1";
			}
			});
		
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "3";
			}
			});
		
		radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "2";
			}
			});
		
		radioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "4";
			}
			});
		rdbtnBothReflexiveAnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "1";
			}
			});
		rdbtnReflexiveButNot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "3";
			}
			});
		
		rdbtnNotReflexiveBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "2";
			}
			});
		rdbtnNeitherReflexiveNor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "4";
			}
			});
		
	
		JButton button1 = new JButton(" Finish!");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stop=false;
try {
					
					String submitQuery = "update submittedanswers SET sa=?  where id=19";
					String submitQuery1 = "update submittedanswers SET sa=?  where id=20";
					 Class.forName("oracle.jdbc.driver.OracleDriver"); 
			            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abhi"); 
			        pst=con.prepareStatement(submitQuery);
				    pst.setString(1,value);
				    pst.executeQuery();
				    
				    pst1=con.prepareStatement(submitQuery1);
				    pst1.setString(1,value1);
				    pst1.executeQuery();
				    
				  
				    
				    String extract="select submittedanswers.sa ,javaprojectset.ans from javaprojectset,submittedanswers where submittedanswers.id=javaprojectset.id and submittedanswers.sa=javaprojectset.ans";
				    ps=con.prepareStatement(extract);
				    rs =  ps.executeQuery();
				    while(rs.next()) {
				    	result++;
				    }
			//	    JOptionPane.showMessageDialog(contentPane,"submitted"+value+" "+value1+" "+result);
				   
				    
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(contentPane,ex.getMessage());
								
				}
				JOptionPane.showMessageDialog(contentPane,"Your answers submitted successfully!");
				dispose();
				Result s=new Result();
				s.result=result;
				s.count=count;
				s.Result1();
				s.setVisible(true);
				s.setExtendedState(s.getExtendedState() | JFrame.MAXIMIZED_BOTH);
				
			}
		});
		button1.setFont(new Font("Tahoma", Font.BOLD, 12));
		button1.setBounds(650,650, 121, 34);
		contentPane.add(button1);
		
		
	}
}
