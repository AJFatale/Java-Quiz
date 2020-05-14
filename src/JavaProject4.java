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

public class JavaProject4 extends JFrame {

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
					JavaProject4 frame = new JavaProject4();
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
		
		JLabel lblQuestion = new JLabel("Question 10");
		lblQuestion.setForeground(new Color(255, 255, 255));
		lblQuestion.setBackground(new Color(0, 153, 153));
		lblQuestion.setFont(new Font("Verdana", Font.BOLD, 14));
		lblQuestion.setBounds(24, 30, 100, 14);
		contentPane.add(lblQuestion);
		
		JLabel lblLetAB = new JLabel("Let A, B and C be non-empty sets and let X = (A \u2013 B) \u2013 C and Y = (A \u2013 C) \u2013 (B \u2013 C). Which one of the following is TRUE?");
		lblLetAB.setForeground(new Color(255, 255, 255));
		lblLetAB.setBackground(new Color(0, 153, 153));
		lblLetAB.setFont(new Font("Verdana", Font.BOLD, 14));
		lblLetAB.setBounds(24, 86,950, 18);
		contentPane.add(lblLetAB);
		
		JRadioButton rdbtnXY = new JRadioButton("X = Y");
		rdbtnXY.setForeground(new Color(255, 255, 0));
		rdbtnXY.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnXY.setBackground(new Color(0, 153, 153));
		rdbtnXY.setBounds(24, 152, 109, 23);
		contentPane.add(rdbtnXY);
		
		JRadioButton rdbtnXY_1 = new JRadioButton("X \u2282 Y");
		rdbtnXY_1.setForeground(new Color(255, 255, 0));
		rdbtnXY_1.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnXY_1.setBackground(new Color(0, 153, 153));
		rdbtnXY_1.setBounds(24, 199, 109, 23);
		contentPane.add(rdbtnXY_1);
		
		JRadioButton rdbtnYX = new JRadioButton("Y \u2282 X");
		rdbtnYX.setForeground(new Color(255, 255, 0));
		rdbtnYX.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnYX.setBackground(new Color(0, 153, 153));
		rdbtnYX.setBounds(384, 152, 109, 23);
		contentPane.add(rdbtnYX);
		
		JRadioButton rdbtnNoneOfThese = new JRadioButton("none of these");
		rdbtnNoneOfThese.setForeground(new Color(255, 255, 0));
		rdbtnNoneOfThese.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNoneOfThese.setBackground(new Color(0, 153, 153));
		rdbtnNoneOfThese.setBounds(384, 199, 154, 23);
		contentPane.add(rdbtnNoneOfThese);
		g1.add(rdbtnNoneOfThese);
		g1.add(rdbtnYX);
		g1.add(rdbtnXY_1);
		g1.add(rdbtnXY);
	
		
		JLabel lblQuestion_1 = new JLabel("Question 11");
		lblQuestion_1.setForeground(new Color(255, 255, 255));
		lblQuestion_1.setBackground(new Color(0, 153, 153));
		lblQuestion_1.setFont(new Font("Verdana", Font.BOLD, 14));
		lblQuestion_1.setBounds(24, 266, 100, 14);
		contentPane.add(lblQuestion_1);
		
		JLabel lblLetRAnd = new JLabel("Let R and S be any two equivalence relations on a non-empty set A. Which one of the following statements is TRUE?");
		lblLetRAnd.setForeground(new Color(255, 255, 255));
		lblLetRAnd.setBackground(new Color(0, 153, 153));
		lblLetRAnd.setFont(new Font("Verdana", Font.BOLD, 14));
		lblLetRAnd.setBounds(24, 322, 950, 18);
		contentPane.add(lblLetRAnd);
		
		JRadioButton rdbtnRS = new JRadioButton("R \u222A S, R \u2229 S are both equivalence relations");
		rdbtnRS.setForeground(new Color(255, 255, 0));
		rdbtnRS.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnRS.setBackground(new Color(0, 153, 153));
		rdbtnRS.setBounds(24, 388, 308, 23);
		contentPane.add(rdbtnRS);
		
		JRadioButton rdbtnRS_1 = new JRadioButton("R \u222A S is an equivalence relation");
		rdbtnRS_1.setForeground(new Color(255, 255, 0));
		rdbtnRS_1.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnRS_1.setBackground(new Color(0, 153, 153));
		rdbtnRS_1.setBounds(24, 435, 308, 23);
		contentPane.add(rdbtnRS_1);
		
		JRadioButton rdbtnRS_2 = new JRadioButton("R \u2229 S is an equivalence relation");
		rdbtnRS_2.setForeground(new Color(255, 255, 0));
		rdbtnRS_2.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnRS_2.setBackground(new Color(0, 153, 153));
		rdbtnRS_2.setBounds(384, 388, 342, 23);
		contentPane.add(rdbtnRS_2);
		
		JRadioButton rdbtnNeitherR = new JRadioButton("Neither R \u222A S nor R \u2229 S is an equivalence relation");
		rdbtnNeitherR.setForeground(new Color(255, 255, 0));
		rdbtnNeitherR.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNeitherR.setBackground(new Color(0, 153, 153));
		rdbtnNeitherR.setBounds(384, 435, 342, 23);
		contentPane.add(rdbtnNeitherR);
		g2.add(rdbtnNeitherR);
		g2.add(rdbtnRS_2);
		g2.add(rdbtnRS_1);
		g2.add(rdbtnRS);
	
		JLabel lblQuestion_2 = new JLabel("Question 12");
		lblQuestion_2.setForeground(new Color(255, 255, 255));
		lblQuestion_2.setBackground(new Color(0, 153, 153));
		lblQuestion_2.setFont(new Font("Verdana", Font.BOLD, 14));
		lblQuestion_2.setBounds(24, 501, 100, 14);
		contentPane.add(lblQuestion_2);
		
		JLabel lblLetFB = new JLabel("Let f: B \u2192 C and g: A \u2192 B be two functions and let h = f o g. Given that h is an onto function. Which one of the following is TRUE?");
		lblLetFB.setForeground(new Color(255, 255, 255));
		lblLetFB.setBackground(new Color(0, 153, 153));
		lblLetFB.setFont(new Font("Verdana", Font.BOLD, 14));
		lblLetFB.setBounds(24, 553, 1100, 18);
		contentPane.add(lblLetFB);
		
		JRadioButton rdbtnFAndG = new JRadioButton("f and g should both be onto functions.");
		rdbtnFAndG.setForeground(new Color(255, 255, 0));
		rdbtnFAndG.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnFAndG.setBackground(new Color(0, 153, 153));
		rdbtnFAndG.setBounds(24, 619, 308, 23);
		contentPane.add(rdbtnFAndG);
		
		JRadioButton rdbtnFShouldBe = new JRadioButton("f should be onto but g need not be onto");
		rdbtnFShouldBe.setForeground(new Color(255, 255, 0));
		rdbtnFShouldBe.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnFShouldBe.setBackground(new Color(0, 153, 153));
		rdbtnFShouldBe.setBounds(24, 666, 308, 23);
		contentPane.add(rdbtnFShouldBe);
		
		JRadioButton rdbtnGShouldBe = new JRadioButton("g should be onto but f need not be onto");
		rdbtnGShouldBe.setForeground(new Color(255, 255, 0));
		rdbtnGShouldBe.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnGShouldBe.setBackground(new Color(0, 153, 153));
		rdbtnGShouldBe.setBounds(384, 619, 273, 23);
		contentPane.add(rdbtnGShouldBe);
		
		JRadioButton rdbtnBothFAnd = new JRadioButton("both f and g need not be onto");
		rdbtnBothFAnd.setForeground(new Color(255, 255, 0));
		rdbtnBothFAnd.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnBothFAnd.setBackground(new Color(0, 153, 153));
		rdbtnBothFAnd.setBounds(384, 666, 342, 23);
		contentPane.add(rdbtnBothFAnd);
		g3.add(rdbtnBothFAnd);
		g3.add(rdbtnGShouldBe);
		g3.add(rdbtnFShouldBe);
		g3.add(rdbtnFAndG);
		rdbtnXY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "1";
			}
			});
		
		rdbtnXY_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "3";
			}
			});
		
		rdbtnYX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "2";
			}
			});
		
		rdbtnNoneOfThese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "4";
			}
			});
		rdbtnRS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "1";
			}
			});
		rdbtnRS_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "3";
			}
			});
		rdbtnRS_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "2";
			}
			});
		rdbtnNeitherR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "4";
			}
			});
		rdbtnFAndG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "1";
			}
			});
		rdbtnFShouldBe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "3";
			}
			});		
		rdbtnGShouldBe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "2";
			}
			});
		rdbtnBothFAnd.addActionListener(new ActionListener() {
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
					
					String submitQuery = "update submittedanswers SET sa=?  where id=10";
					String submitQuery1 = "update submittedanswers SET sa=?  where id=11";
					String submitQuery2 = "update submittedanswers SET sa=?  where id=12";
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
			//	    JOptionPane.showMessageDialog(contentPane,"submitted"+value+" "+value1+" "+value2);
				   
				    
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(contentPane,ex.getMessage());
								
				}
				dispose();
				JavaProject5 jp5=new JavaProject5();
				jp5.JavaProject();
				 jp5.timeCounter=timeCounter;		
				 jp5.i=i;
				jp5.setVisible(true);
				jp5.setExtendedState(jp5.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			}
	});
	}

}
