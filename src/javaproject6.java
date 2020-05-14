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
import javax.swing.Timer;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;

public class javaproject6 extends JFrame 
{

	private JPanel contentPane;
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
					javaproject6 frame = new javaproject6();
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
		setBounds(100, 100, 968, 1006);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 0));
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
		
		JLabel lblQuestion = new JLabel("Question 16");
		lblQuestion.setForeground(new Color(255, 255, 255));
		lblQuestion.setBackground(new Color(0, 153, 153));
		lblQuestion.setFont(new Font("Verdana", Font.BOLD, 14));
		lblQuestion.setBounds(26, 24, 100, 14);
		contentPane.add(lblQuestion);
		
		JLabel lblARelationR = new JLabel("A relation R is defined on the set of integers as xRy if f(x + y) is even. Which of the following state\u00ACments is true?");
		lblARelationR.setForeground(new Color(255, 255, 255));
		lblARelationR.setBackground(new Color(0, 153, 153));
		lblARelationR.setFont(new Font("Verdana", Font.BOLD, 14));
		lblARelationR.setBounds(26, 80, 899, 18);
		contentPane.add(lblARelationR);
		
		JRadioButton rdbtnRIsNot = new JRadioButton("R is not an equivalence relation");
		rdbtnRIsNot.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		rdbtnRIsNot.setForeground(new Color(255, 255, 0));
		rdbtnRIsNot.setBackground(new Color(0, 153, 153));
		rdbtnRIsNot.setBounds(26, 146, 246, 23);
		contentPane.add(rdbtnRIsNot);
		
		JRadioButton rdbtnRIsAn = new JRadioButton("R is an equivalence relation having 1 equivalence class");
		rdbtnRIsAn.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		rdbtnRIsAn.setForeground(new Color(255, 255, 0));
		rdbtnRIsAn.setBackground(new Color(0, 153, 153));
		rdbtnRIsAn.setBounds(26, 193, 378, 23);
		contentPane.add(rdbtnRIsAn);
		
		JRadioButton rdbtnRIsAn_1 = new JRadioButton("R is an equivalence relation having 2 equivalence classes");
		rdbtnRIsAn_1.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		rdbtnRIsAn_1.setForeground(new Color(255, 255, 0));
		rdbtnRIsAn_1.setBackground(new Color(0, 153, 153));
		rdbtnRIsAn_1.setBounds(426, 146, 421, 23);
		contentPane.add(rdbtnRIsAn_1);
		
		JRadioButton rdbtnRIsAn_2 = new JRadioButton("R is an equivalence relation having 3 equivalence classes");
		rdbtnRIsAn_2.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		rdbtnRIsAn_2.setForeground(new Color(255, 255, 0));
		rdbtnRIsAn_2.setBackground(new Color(0, 153, 153));
		rdbtnRIsAn_2.setBounds(426, 193, 421, 23);
		contentPane.add(rdbtnRIsAn_2);
		g1.add(rdbtnRIsNot);
		g1.add(rdbtnRIsAn);
		g1.add(rdbtnRIsAn_1);
		g1.add(rdbtnRIsAn_2);
	
		
		JLabel lblQuestion_1 = new JLabel("Question 17");
		lblQuestion_1.setForeground(new Color(255, 255, 255));
		lblQuestion_1.setBackground(new Color(0, 153, 153));
		lblQuestion_1.setFont(new Font("Verdana", Font.BOLD, 14));
		lblQuestion_1.setBounds(26, 268, 100, 14);
		contentPane.add(lblQuestion_1);
		
		JLabel lblLetRBe = new JLabel("Let R be the relation on the set of positive integers such that aRb if and only if a and b are distinct and have a common divisor other than ");
		lblLetRBe.setForeground(new Color(255, 255, 255));
		lblLetRBe.setBackground(new Color(0, 153, 153));
		lblLetRBe.setFont(new Font("Verdana", Font.BOLD, 14));
		lblLetRBe.setBounds(26, 324,1100, 14);
		contentPane.add(lblLetRBe);
		
		JRadioButton rdbtnRIsSymmetric = new JRadioButton("R is symmetric and reflexive but not transitive");
		rdbtnRIsSymmetric.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		rdbtnRIsSymmetric.setForeground(new Color(255, 255, 0));
		rdbtnRIsSymmetric.setBackground(new Color(0, 153, 153));
		rdbtnRIsSymmetric.setBounds(26, 390, 358, 23);
		contentPane.add(rdbtnRIsSymmetric);
		
		JRadioButton rdbtnRIsReflexive = new JRadioButton("R is reflexive but not symmetric and not transitive");
		rdbtnRIsReflexive.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		rdbtnRIsReflexive.setForeground(new Color(255, 255, 0));
		rdbtnRIsReflexive.setBackground(new Color(0, 153, 153));
		rdbtnRIsReflexive.setBounds(26, 437, 358, 23);
		contentPane.add(rdbtnRIsReflexive);
		
		JRadioButton rdbtnRIsTransitive = new JRadioButton("R is transitive but not reflexive and not symmetric");
		rdbtnRIsTransitive.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		rdbtnRIsTransitive.setForeground(new Color(255, 255, 0));
		rdbtnRIsTransitive.setBackground(new Color(0, 153, 153));
		rdbtnRIsTransitive.setBounds(386, 390, 461, 23);
		contentPane.add(rdbtnRIsTransitive);
		
		JRadioButton rdbtnRIsSymmetric_1 = new JRadioButton("R is symmetric but not reflexive and not transitive");
		rdbtnRIsSymmetric_1.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		rdbtnRIsSymmetric_1.setForeground(new Color(255, 255, 0));
		rdbtnRIsSymmetric_1.setBackground(new Color(0, 153, 153));
		rdbtnRIsSymmetric_1.setBounds(386, 437, 461, 23);
		contentPane.add(rdbtnRIsSymmetric_1);
		g2.add(rdbtnRIsSymmetric_1);
		g2.add(rdbtnRIsTransitive);
		g2.add(rdbtnRIsReflexive);
		g2.add(rdbtnRIsSymmetric);
	
		JLabel lblWhichOneOf = new JLabel("Which one of the following statements about R is True?");
		lblWhichOneOf.setForeground(new Color(255, 255, 255));
		lblWhichOneOf.setBackground(new Color(0, 153, 153));
		lblWhichOneOf.setFont(new Font("Verdana", Font.BOLD, 14));
		lblWhichOneOf.setBounds(26, 349, 899, 14);
		contentPane.add(lblWhichOneOf);
		
		JLabel lblQuestion_2 = new JLabel("Question 18");
		lblQuestion_2.setForeground(new Color(255, 255, 255));
		lblQuestion_2.setBackground(new Color(0, 153, 153));
		lblQuestion_2.setFont(new Font("Verdana", Font.BOLD, 14));
		lblQuestion_2.setBounds(26, 516, 100, 14);
		contentPane.add(lblQuestion_2);
		
		JLabel lblTheCardinalityOf = new JLabel("The cardinality of the power set of {0, 1, 2 . . . 10} is _________.");
		lblTheCardinalityOf.setForeground(new Color(255, 255, 255));
		lblTheCardinalityOf.setBackground(new Color(0, 153, 153));
		lblTheCardinalityOf.setFont(new Font("Verdana", Font.BOLD, 14));
		lblTheCardinalityOf.setBounds(26, 572, 899, 18);
		contentPane.add(lblTheCardinalityOf);
		
		JRadioButton radioButton = new JRadioButton("1024");
		radioButton.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		radioButton.setForeground(new Color(255, 255, 0));
		radioButton.setBackground(new Color(0, 153, 153));
		radioButton.setBounds(26, 638, 246, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("1023");
		radioButton_1.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		radioButton_1.setForeground(new Color(255, 255, 0));
		radioButton_1.setBackground(new Color(0, 153, 153));
		radioButton_1.setBounds(26, 685, 287, 23);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("2048");
		radioButton_2.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		radioButton_2.setForeground(new Color(255, 255, 0));
		radioButton_2.setBackground(new Color(0, 153, 153));
		radioButton_2.setBounds(386, 638, 313, 23);
		contentPane.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("2043");
		radioButton_3.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		radioButton_3.setForeground(new Color(255, 255, 0));
		radioButton_3.setBackground(new Color(0, 153, 153));
		radioButton_3.setBounds(386, 685, 74, 23);
		contentPane.add(radioButton_3);
		g3.add(radioButton);
		g3.add(radioButton_1);
		g3.add(radioButton_2);
		g3.add(radioButton_3);
		rdbtnRIsNot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "1";
			}
			});
		
		rdbtnRIsAn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "3";
			}
			});
		
		rdbtnRIsAn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "2";
			}
			});
		
		rdbtnRIsAn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "4";
			}
			});
		rdbtnRIsSymmetric.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "1";
			}
			});
		rdbtnRIsReflexive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "3";
			}
			});
		rdbtnRIsTransitive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "2";
			}
			});
		rdbtnRIsSymmetric_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "4";
			}
			});
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "1";
			}
			});
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "3";
			}
			});		
		radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "2";
			}
			});
		radioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "4";
			}
			});
	

		JButton button = new JButton("Next Page");
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBounds(809,650, 121, 34);
		contentPane.add(button);
		

		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				stop=false;
try {
					
					String submitQuery = "update submittedanswers SET sa=?  where id=16";
					String submitQuery1 = "update submittedanswers SET sa=?  where id=17";
					String submitQuery2 = "update submittedanswers SET sa=?  where id=18";
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
				//    JOptionPane.showMessageDialog(contentPane,"submitted"+value+" "+value1+" "+value2);
				   
				    
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(contentPane,ex.getMessage());
								
				}
				dispose();
				javaproject7 jp7=new javaproject7();
				jp7.javaproject();
				 jp7.timeCounter=timeCounter;	
				 jp7.i=i;
				jp7.setVisible(true);
				jp7.setExtendedState(jp7.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			}
	});
	}

}
