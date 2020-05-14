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

public class JavaProject5 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private ButtonGroup g1=new ButtonGroup();
	private ButtonGroup g2=new ButtonGroup();
	private ButtonGroup g3=new ButtonGroup();
	String ans1,ans2,ans3;
	JLabel timeLabel = new JLabel();
    int timeCounter;
    int i=0,j=0,k,l;
    boolean stop=true;
    
    Connection con=null;
    PreparedStatement pst=null ,pst1=null,pst2,ps=null;
    ResultSet rs=null;
    String value,value1,value2;
   
	/**
	 * Launch the application.
	 */
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
}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaProject5 frame = new JavaProject5();
					frame.JavaProject();
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
	public void JavaProject() {
		setBackground(new Color(0, 153, 153));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 972, 788);
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
		
		JLabel lblQuestion_1 = new JLabel("Question 13");
		lblQuestion_1.setForeground(new Color(255, 255, 255));
		lblQuestion_1.setBackground(new Color(0, 153, 153));
		lblQuestion_1.setFont(new Font("Verdana", Font.BOLD, 13));
		lblQuestion_1.setBounds(21, 27, 91, 14);
		contentPane.add(lblQuestion_1);
		
		JLabel lblConsiderTheBinary = new JLabel("Consider the binary relation: S = {(x, y) | y = x+1 and x, y      {0, 1, 2, ...}} The reflexive transitive closure of S is");
		lblConsiderTheBinary.setForeground(new Color(255, 255, 255));
		lblConsiderTheBinary.setBackground(new Color(0, 153, 153));
		lblConsiderTheBinary.setFont(new Font("Verdana", Font.BOLD, 13));
		lblConsiderTheBinary.setBounds(21, 129, 899, 14);
		contentPane.add(lblConsiderTheBinary);
		
		JRadioButton rdbtnxY = new JRadioButton("{(x, y) | y > x and x, y \u2208 {0, 1, 2, \u2026 }}");
		rdbtnxY.setBackground(new Color(0, 153, 153));
		rdbtnxY.setForeground(new Color(255, 255, 0));
		rdbtnxY.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		rdbtnxY.setBounds(21, 149, 246, 23);
		contentPane.add(rdbtnxY);
		
		JRadioButton rdbtnxY_1 = new JRadioButton("{(x, y) | y \u2265 x and x, y \u2208 {0, 1, 2, \u2026 }}");
		rdbtnxY_1.setBackground(new Color(0, 153, 153));
		rdbtnxY_1.setForeground(new Color(255, 255, 0));
		rdbtnxY_1.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		rdbtnxY_1.setBounds(21, 196, 234, 23);
		contentPane.add(rdbtnxY_1);
		
		JRadioButton rdbtnxY_2 = new JRadioButton("{(x, y) | y < x and x, y \u2208 {0, 1, 2, \u2026 }}");
		rdbtnxY_2.setBackground(new Color(0, 153, 153));
		rdbtnxY_2.setForeground(new Color(255, 255, 0));
		rdbtnxY_2.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		rdbtnxY_2.setBounds(381, 149, 273, 23);
		contentPane.add(rdbtnxY_2);
		
		JRadioButton rdbtnxY_3 = new JRadioButton("{(x, y) | y \u2264 x and x, y \u2208 {0, 1, 2, \u2026 }}");
		rdbtnxY_3.setBackground(new Color(0, 153, 153));
		rdbtnxY_3.setForeground(new Color(255, 255, 0));
		rdbtnxY_3.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		rdbtnxY_3.setBounds(381, 196, 234, 23);
		contentPane.add(rdbtnxY_3);
		g1.add(rdbtnxY_3);
		g1.add(rdbtnxY_2);
		g1.add(rdbtnxY_1);
		g1.add(rdbtnxY);
	
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(0, 153, 153));
		textField.setEditable(false);
		textField.setText("\u2208 ");
		textField.setBounds(447, 126, 17, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblQuestion_2 = new JLabel("Question 14");
		lblQuestion_2.setForeground(new Color(255, 255, 255));
		lblQuestion_2.setBackground(new Color(0, 153, 153));
		lblQuestion_2.setFont(new Font("Verdana", Font.BOLD, 13));
		lblQuestion_2.setBounds(21, 261, 91, 14);
		contentPane.add(lblQuestion_2);
		
		JLabel lblWhichOfThe = new JLabel("Which of the following is true?");
		lblWhichOfThe.setForeground(new Color(255, 255, 255));
		lblWhichOfThe.setBackground(new Color(0, 153, 153));
		lblWhichOfThe.setFont(new Font("Verdana", Font.BOLD, 13));
		lblWhichOfThe.setBounds(21, 317, 899, 14);
		contentPane.add(lblWhichOfThe);
		
		JRadioButton rdbtnTheSetOf = new JRadioButton("The set of all rational negative numbers forms a group under multiplication.");
		rdbtnTheSetOf.setBackground(new Color(0, 153, 153));
		rdbtnTheSetOf.setForeground(new Color(255, 255, 0));
		rdbtnTheSetOf.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		rdbtnTheSetOf.setBounds(21, 383, 390, 23);
		contentPane.add(rdbtnTheSetOf);
		
		JRadioButton rdbtnTheSetOf_1 = new JRadioButton("The set of all non-singular matrices forms a group under multiplication.");
		rdbtnTheSetOf_1.setBackground(new Color(0, 153, 153));
		rdbtnTheSetOf_1.setForeground(new Color(255, 255, 0));
		rdbtnTheSetOf_1.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		rdbtnTheSetOf_1.setBounds(21, 430, 381, 23);
		contentPane.add(rdbtnTheSetOf_1);
		
		JRadioButton rdbtnTheSetOf_2 = new JRadioButton("The set of all matrices forms a group under multiplication.");
		rdbtnTheSetOf_2.setBackground(new Color(0, 153, 153));
		rdbtnTheSetOf_2.setForeground(new Color(255, 255, 0));
		rdbtnTheSetOf_2.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		rdbtnTheSetOf_2.setBounds(429, 383, 400, 23);
		contentPane.add(rdbtnTheSetOf_2);
		
		JRadioButton rdbtnBothAnd = new JRadioButton("Both (2) and (3) are true.");
		rdbtnBothAnd.setBackground(new Color(0, 153, 153));
		rdbtnBothAnd.setForeground(new Color(255, 255, 0));
		rdbtnBothAnd.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		rdbtnBothAnd.setBounds(429, 430, 400, 23);
		contentPane.add(rdbtnBothAnd);
		g2.add(rdbtnBothAnd);
		g2.add(rdbtnTheSetOf_2);
		g2.add(rdbtnTheSetOf_1);
		g2.add(rdbtnTheSetOf);

		JLabel lblQuestion = new JLabel("Question 15");
		lblQuestion.setForeground(new Color(255, 255, 255));
		lblQuestion.setBackground(new Color(0, 153, 153));
		lblQuestion.setFont(new Font("Verdana", Font.BOLD, 13));
		lblQuestion.setBounds(21, 512, 91, 14);
		contentPane.add(lblQuestion);
		
		JLabel lblConsiderTheFollowing = new JLabel("Consider the following statements: S1: There exists infinite sets A, B, C such that  A     (B    C) is finite. S2: There exists two irrational numbers");
		lblConsiderTheFollowing.setForeground(new Color(255, 255, 255));
		lblConsiderTheFollowing.setBackground(new Color(0, 153, 153));
		lblConsiderTheFollowing.setFont(new Font("Verdana", Font.BOLD, 13));
		lblConsiderTheFollowing.setBounds(21, 542,1100, 14);
		contentPane.add(lblConsiderTheFollowing);
		
		JRadioButton rdbtnOnlySIs = new JRadioButton("Only S1 is correct");
		rdbtnOnlySIs.setBackground(new Color(0, 153, 153));
		rdbtnOnlySIs.setForeground(new Color(255, 255, 0));
		rdbtnOnlySIs.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		rdbtnOnlySIs.setBounds(21, 612, 246, 23);
		contentPane.add(rdbtnOnlySIs);
		
		JRadioButton rdbtnOnlySIs_1 = new JRadioButton("Only S2 is correct");
		rdbtnOnlySIs_1.setBackground(new Color(0, 153, 153));
		rdbtnOnlySIs_1.setForeground(new Color(255, 255, 0));
		rdbtnOnlySIs_1.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		rdbtnOnlySIs_1.setBounds(21, 659, 234, 23);
		contentPane.add(rdbtnOnlySIs_1);
		
		JRadioButton rdbtnBothSAnd = new JRadioButton("Both S1 and S2 are correct");
		rdbtnBothSAnd.setBackground(new Color(0, 153, 153));
		rdbtnBothSAnd.setForeground(new Color(255, 255, 0));
		rdbtnBothSAnd.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		rdbtnBothSAnd.setBounds(381, 612, 273, 23);
		contentPane.add(rdbtnBothSAnd);
		
		JRadioButton rdbtnNoneOfS = new JRadioButton("None of S1 and S2 is correct");
		rdbtnNoneOfS.setBackground(new Color(0, 153, 153));
		rdbtnNoneOfS.setForeground(new Color(255, 255, 0));
		rdbtnNoneOfS.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		rdbtnNoneOfS.setBounds(381, 659, 211, 23);
		contentPane.add(rdbtnNoneOfS);
		g3.add(rdbtnNoneOfS);
		g3.add(rdbtnBothSAnd);
		g3.add(rdbtnOnlySIs_1);
		g3.add(rdbtnOnlySIs);
	
		JLabel lblXAndY = new JLabel(" x and y such that (x+y) is rational. Which of the following is true about S1 and S2?");
		lblXAndY.setForeground(new Color(255, 255, 255));
		lblXAndY.setBackground(new Color(0, 153, 153));
		lblXAndY.setFont(new Font("Verdana", Font.BOLD, 13));
		lblXAndY.setBounds(21, 566, 911, 18);
		contentPane.add(lblXAndY);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(255, 255, 255));
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_1.setBackground(new Color(0, 153, 153));
		textField_1.setEditable(false);
		textField_1.setText(" \u2229");
		textField_1.setBounds(631, 539, 17, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(255, 255, 255));
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_2.setBackground(new Color(0, 153, 153));
		textField_2.setText(" \u2229");
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(664, 539, 17, 20);
		contentPane.add(textField_2);
		
		rdbtnxY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "1";
			}
			});
		
		rdbtnxY_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "3";
			}
			});
		
		rdbtnxY_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "2";
			}
			});
		
		rdbtnxY_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "4";
			}
			});
		rdbtnTheSetOf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "1";
			}
			});
		rdbtnTheSetOf_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "3";
			}
			});
		rdbtnTheSetOf_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "2";
			}
			});
		rdbtnBothAnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "4";
			}
			});
		rdbtnOnlySIs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "1";
			}
			});
		rdbtnOnlySIs_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "3";
			}
			});		
		rdbtnBothSAnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "2";
			}
			});
		rdbtnNoneOfS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "4";
			}
			});
	
		
		JButton button = new JButton("Next Page");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBounds(809,650, 121, 34);
		contentPane.add(button);
		

		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				stop=false;
				
try {
					
					String submitQuery = "update submittedanswers SET sa=?  where id=13";
					String submitQuery1 = "update submittedanswers SET sa=?  where id=14";
					String submitQuery2 = "update submittedanswers SET sa=?  where id=15";
					 Class.forName("oracle.jdbc.driver.OracleDriver"); 
			            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abhi"); 
			        pst=con.prepareStatement(submitQuery);
				    pst.setString(1,value);
				    pst.executeQuery();
				    
				    pst1=con.prepareStatement(submitQuery1);
				    pst1.setString(1,value1);
				    pst1.executeQuery();
				    
				    pst2=con.prepareStatement(submitQuery2);
				    pst2.setString(1,value2);
				    pst2.executeQuery();
				  // JOptionPane.showMessageDialog(contentPane,"submitted"+value+" "+value1+" "+value2);
				   
				    
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(contentPane,ex.getMessage());
								
				}
				
				dispose();
				javaproject6 jp6=new javaproject6();
				jp6.javaproject();
				 jp6.timeCounter=timeCounter;	
				 jp6.i=i;
				jp6.setVisible(true);
				jp6.setExtendedState(jp6.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			}
	});
	}

}
