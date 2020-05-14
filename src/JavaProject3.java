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

public class JavaProject3 extends JFrame {

	private JPanel page3;
	private JTextField txtxX;
	private JTextField textField;
	private ButtonGroup g1=new ButtonGroup();
	private ButtonGroup g2=new ButtonGroup();
	private ButtonGroup g3=new ButtonGroup();
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
					JavaProject3 frame = new JavaProject3();
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
	public void JavaProject() 
	{
		setBackground(new Color(0, 153, 153));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1162, 788);
		page3 = new JPanel();
		page3.setBackground(new Color(0, 153, 153));
		page3.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(page3);
		page3.setLayout(null);
		
		page3.add(timeLabel);
		timeLabel.setBounds(825, 20, 111, 18);
		timeLabel.setFont(new Font("Helvetica",Font.BOLD,20));
		timeLabel.setBackground(Color.cyan);
		timeLabel.setForeground(Color.red);
		new Timer(1000, this::updateGUI).start();
		
		JLabel lblQuestion = new JLabel("Question 7");
		lblQuestion.setForeground(new Color(255, 255, 255));
		lblQuestion.setBackground(new Color(0, 153, 153));
		lblQuestion.setFont(new Font("Verdana", Font.BOLD, 14));
		lblQuestion.setBounds(28, 28, 91, 14);
		page3.add(lblQuestion);
		
		JLabel lblLetGBe = new JLabel("Let G be a group with 15 elements. Let L be a subgroup of G. It is known that L != G and that the size of L is at least 4. The size of L is _______.");
		lblLetGBe.setForeground(new Color(255, 255, 255));
		lblLetGBe.setBackground(new Color(0, 153, 153));
		lblLetGBe.setFont(new Font("Verdana", Font.BOLD, 14));
		lblLetGBe.setBounds(28, 84, 2000, 20);
		page3.add(lblLetGBe);
		
		JRadioButton radioButton = new JRadioButton("3");
		radioButton.setForeground(new Color(255, 255, 0));
		radioButton.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		radioButton.setBackground(new Color(0, 153, 153));
		radioButton.setBounds(28, 150, 109, 23);
		page3.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("5");
		radioButton_1.setForeground(new Color(255, 255, 0));
		radioButton_1.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		radioButton_1.setBackground(new Color(0, 153, 153));
		radioButton_1.setBounds(28, 197, 109, 23);
		page3.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("7");
		radioButton_2.setForeground(new Color(255, 255, 0));
		radioButton_2.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		radioButton_2.setBackground(new Color(0, 153, 153));
		radioButton_2.setBounds(388, 150, 109, 23);
		page3.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("9");
		radioButton_3.setForeground(new Color(255, 255, 0));
		radioButton_3.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		radioButton_3.setBackground(new Color(0, 153, 153));
		radioButton_3.setBounds(388, 197, 109, 23);
		page3.add(radioButton_3);
		g1.add(radioButton_3);
		g1.add(radioButton_2);
		g1.add(radioButton_1);
		g1.add(radioButton);
		//ans1=g1.getSelection().toString();

		
		JLabel lblQuestion_1 = new JLabel("Question 8");
		lblQuestion_1.setForeground(new Color(255, 255, 255));
		lblQuestion_1.setBackground(new Color(0, 153, 153));
		lblQuestion_1.setFont(new Font("Verdana", Font.BOLD, 14));
		lblQuestion_1.setBounds(28, 268, 91, 20);
		page3.add(lblQuestion_1);
		
		JLabel lblThereAreTwo = new JLabel("There are two elements x, y in a group (G,    ) such that every element in the group can be written as a product of some number of x\u2019s and y\u2019s in some order. It is known that");
		lblThereAreTwo.setForeground(new Color(255, 255, 255));
		lblThereAreTwo.setBackground(new Color(0, 153, 153));
		lblThereAreTwo.setFont(new Font("Verdana", Font.BOLD, 14));
		lblThereAreTwo.setBounds(30, 307, 2096, 23);
		page3.add(lblThereAreTwo);
		
		JRadioButton radioButton_4 = new JRadioButton("2");
		radioButton_4.setForeground(new Color(255, 255, 0));
		radioButton_4.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		radioButton_4.setBackground(new Color(0, 153, 153));
		radioButton_4.setBounds(28, 390, 109, 23);
		page3.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("3");
		radioButton_5.setForeground(new Color(255, 255, 0));
		radioButton_5.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		radioButton_5.setBackground(new Color(0, 153, 153));
		radioButton_5.setBounds(28, 437, 109, 23);
		page3.add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("4");
		radioButton_6.setForeground(new Color(255, 255, 0));
		radioButton_6.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		radioButton_6.setBackground(new Color(0, 153, 153));
		radioButton_6.setBounds(388, 390, 109, 23);
		page3.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("5");
		radioButton_7.setForeground(new Color(255, 255, 0));
		radioButton_7.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		radioButton_7.setBackground(new Color(0, 153, 153));
		radioButton_7.setBounds(388, 437, 109, 23);
		page3.add(radioButton_7);
		g2.add(radioButton_7);
		g2.add(radioButton_6);
		g2.add(radioButton_5);
		g2.add(radioButton_4);
	
		
		txtxX = new JTextField();
		txtxX.setFont(new Font("Verdana", Font.BOLD, 14));
		txtxX.setForeground(new Color(255, 255, 255));
		txtxX.setBackground(new Color(0, 153, 153));
		txtxX.setEditable(false);
		txtxX.setText("\"x \u2217 x = y \u2217 y = x \u2217 y \u2217 x \u2217 y = y \u2217 x \u2217 y \u2217 x = e\"");
		txtxX.setBounds(28, 340, 250, 20);
		page3.add(txtxX);
		txtxX.setColumns(10);
		
		textField = new JTextField();
		textField.setForeground(new Color(255, 255, 255));
		textField.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		textField.setBackground(new Color(0, 153, 153));
		textField.setEditable(false);
		textField.setText("*");
		textField.setBounds(362, 313, 19, 20);
		page3.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("where e is the identity element. The maximum number of elements in such a group is -----------.");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 153, 153));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel.setBounds(288, 343, 822, 20);
		page3.add(lblNewLabel);
		
		JLabel lblQuestion_2 = new JLabel("Question 9");
		lblQuestion_2.setForeground(new Color(255, 255, 255));
		lblQuestion_2.setBackground(new Color(0, 153, 153));
		lblQuestion_2.setFont(new Font("Verdana", Font.BOLD, 14));
		lblQuestion_2.setBounds(28, 506, 91, 20);
		page3.add(lblQuestion_2);
		
		JLabel lblLetEF = new JLabel("Let E, F and G be finite sets. Let X = (E \u2229 F) \u2013 (F \u2229 G) and Y = (E \u2013 (E \u2229 G)) \u2013 (E \u2013 F). Which one of the following is true?");
		lblLetEF.setForeground(new Color(255, 255, 255));
		lblLetEF.setBackground(new Color(0, 153, 153));
		lblLetEF.setFont(new Font("Verdana", Font.BOLD, 14));
		lblLetEF.setBounds(28, 562, 2000, 20);
		page3.add(lblLetEF);
		
		JRadioButton rdbtnXY = new JRadioButton("X \u2282 Y");
		rdbtnXY.setForeground(new Color(255, 255, 0));
		rdbtnXY.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		rdbtnXY.setBackground(new Color(0, 153, 153));
		rdbtnXY.setBounds(28, 628, 109, 23);
		page3.add(rdbtnXY);
		
		JRadioButton rdbtnXY_1 = new JRadioButton(" X \u2283 Y");
		rdbtnXY_1.setForeground(new Color(255, 255, 0));
		rdbtnXY_1.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		rdbtnXY_1.setBackground(new Color(0, 153, 153));
		rdbtnXY_1.setBounds(28, 675, 109, 23);
		page3.add(rdbtnXY_1);
		
		JRadioButton rdbtnXY_2 = new JRadioButton("X = Y");
		rdbtnXY_2.setForeground(new Color(255, 255, 0));
		rdbtnXY_2.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		rdbtnXY_2.setBackground(new Color(0, 153, 153));
		rdbtnXY_2.setBounds(388, 628, 109, 23);
		page3.add(rdbtnXY_2);
		
		JRadioButton rdbtnXY_3 = new JRadioButton("X \u2013 Y \u2260 \u03C6 and Y \u2013 X \u2260 \u03C6");
		rdbtnXY_3.setForeground(new Color(255, 255, 0));
		rdbtnXY_3.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		rdbtnXY_3.setBackground(new Color(0, 153, 153));
		rdbtnXY_3.setBounds(388, 675, 154, 23);
		page3.add(rdbtnXY_3);
		g3.add(rdbtnXY_3);
		g3.add(rdbtnXY_2);
		g3.add(rdbtnXY_1);
		g3.add(rdbtnXY);

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
		radioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "1";
			}
			});
		radioButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "3";
			}
			});
		radioButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "2";
			}
			});
		radioButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "4";
			}
			});
		rdbtnXY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "1";
			}
			});	
		rdbtnXY_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "3";
			}
			});		
		rdbtnXY_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "2";
			}
			});
		rdbtnXY_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "4";
			}
			});
	
		
		JButton button = new JButton("Next Page");
		button.setBackground(new Color(0, 153, 153));
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBounds(966, 675, 121, 34);
		page3.add(button);
		

		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				stop=false;
try {
					
					String submitQuery = "update submittedanswers SET sa=?  where id=7";
					String submitQuery1 = "update submittedanswers SET sa=?  where id=8";
					String submitQuery2 = "update submittedanswers SET sa=?  where id=9";
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
				  //  JOptionPane.showMessageDialog(page3,"submitted"+value+" "+value1+" "+value2);
				   
				    
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(page3,ex.getMessage());
								
				}
				dispose();
				JavaProject4 jp4=new JavaProject4();
				jp4.JavaProject();
				 jp4.timeCounter=timeCounter;	
				 jp4.i=i;
				jp4.setVisible(true);
				jp4.setExtendedState(jp4.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			}
	});
}
}