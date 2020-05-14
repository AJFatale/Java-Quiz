import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.Timer;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class javaprojectset extends JFrame {

	private JPanel page1;
	private ButtonGroup g1=new ButtonGroup();
	private ButtonGroup g2=new ButtonGroup();
	private ButtonGroup g3=new ButtonGroup();
	JLabel timeLabel = new JLabel("00:00:00");
    int timeCounter = 0;
    int i=0,j=0,k,l;
    boolean stop=true;
    
    Connection con=null;
    PreparedStatement pst=null ,pst1=null,pst2,ps=null;
    ResultSet rs=null;
    String value,value1,value2;
    int result=0;
    
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
					javaprojectset frame = new javaprojectset();
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
		setBounds(100, 100, 1032, 964);
		page1 = new JPanel();
		page1.setBackground(new Color(0, 153, 153));
		page1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(page1);
		page1.setLayout(null);
		
		page1.add(timeLabel);
		timeLabel.setBounds(825, 20, 111, 18);
		timeLabel.setFont(new Font("Helvetica",Font.BOLD,20));
		timeLabel.setBackground(Color.cyan);
		timeLabel.setForeground(Color.red);
	    new Timer(1000, this::updateGUI).start();
		
		
		JLabel lblNewLabel = new JLabel("Question 1");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 153, 153));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel.setBounds(50, 39, 91, 14);
		page1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Consider the set S = {1, \u03C9, \u03C92}, where \u03C9 and w2 are cube roots of unity. If * denotes the multiplication operation, the structure (S, *) forms?");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(0, 153, 153));
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_1.setBounds(50, 90, 1200, 18);
		page1.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("A group");
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton.setBounds(50, 145, 109, 23);
		page1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("A ring");
		rdbtnNewRadioButton_1.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton_1.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton_1.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton_1.setBounds(50, 209, 109, 23);
		page1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("An integral domain");
		rdbtnNewRadioButton_2.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton_2.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton_2.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton_2.setBounds(410, 145, 217, 23);
		page1.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("A field");
		rdbtnNewRadioButton_3.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton_3.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton_3.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton_3.setBounds(410, 209, 109, 23);
		page1.add(rdbtnNewRadioButton_3);
		g1.add(rdbtnNewRadioButton_3);
		g1.add(rdbtnNewRadioButton_2);
		g1.add(rdbtnNewRadioButton_1);
		g1.add(rdbtnNewRadioButton);
		//ans1=g1.getSelection().toString();

		JLabel lblQuestion = new JLabel("Question 2");
		lblQuestion.setForeground(new Color(255, 255, 255));
		lblQuestion.setBackground(new Color(0, 153, 153));
		lblQuestion.setFont(new Font("Verdana", Font.BOLD, 14));
		lblQuestion.setBounds(50, 286, 91, 14);
		page1.add(lblQuestion);
		
		JLabel lblWhichOne = new JLabel("Which one of the following in NOT necessarily a property of a Group?");
		lblWhichOne.setForeground(new Color(255, 255, 255));
		lblWhichOne.setBackground(new Color(0, 153, 153));
		lblWhichOne.setFont(new Font("Verdana", Font.BOLD, 14));
		lblWhichOne.setBounds(50, 334, 1000, 18);
		page1.add(lblWhichOne);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Commutativity");
		rdbtnNewRadioButton_4.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton_4.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton_4.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton_4.setBounds(50, 381, 134, 23);
		page1.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Associativity");
		rdbtnNewRadioButton_5.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton_5.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton_5.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton_5.setBounds(50, 439, 109, 23);
		page1.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Existence of inverse for every element");
		rdbtnNewRadioButton_6.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton_6.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton_6.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton_6.setBounds(410, 381, 302, 23);
		page1.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Existence of identity");
		rdbtnNewRadioButton_7.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton_7.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton_7.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton_7.setBounds(410, 439, 186, 23);
		page1.add(rdbtnNewRadioButton_7);
		g2.add(rdbtnNewRadioButton_7);
		g2.add(rdbtnNewRadioButton_6);
		g2.add(rdbtnNewRadioButton_5);
		g2.add(rdbtnNewRadioButton_4);
	
		JLabel lblQuestion_1 = new JLabel("Question 3");
		lblQuestion_1.setForeground(new Color(255, 255, 255));
		lblQuestion_1.setBackground(new Color(0, 153, 153));
		lblQuestion_1.setFont(new Font("Verdana", Font.BOLD, 14));
		lblQuestion_1.setBounds(50, 518, 91, 14);
		page1.add(lblQuestion_1);
		
		JLabel lblConsiderTheBinary = new JLabel("Consider the binary relation R = {(x, y), (x, z), (z, x), (z, y)} on the set {x, y, z}. Which one of the following is TRUE?");
		lblConsiderTheBinary.setForeground(new Color(255, 255, 255));
		lblConsiderTheBinary.setBackground(new Color(0, 153, 153));
		lblConsiderTheBinary.setFont(new Font("Verdana", Font.BOLD, 14));
		lblConsiderTheBinary.setBounds(50, 566,1000, 18);
		page1.add(lblConsiderTheBinary);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("R is symmetric but NOT antisymmetric");
		rdbtnNewRadioButton_8.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton_8.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton_8.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton_8.setBounds(50, 610, 327, 23);
		page1.add(rdbtnNewRadioButton_8);
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("R is NOT symmetric but antisymmetric");
		rdbtnNewRadioButton_9.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton_9.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton_9.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton_9.setBounds(50, 668, 327, 23);
		page1.add(rdbtnNewRadioButton_9);
		
		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("R is both symmetric and antisymmetric");
		rdbtnNewRadioButton_10.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton_10.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton_10.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton_10.setBounds(410, 610, 338, 23);
		page1.add(rdbtnNewRadioButton_10);
		
		JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("R is neither symmetric nor antisymmetric");
		rdbtnNewRadioButton_11.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton_11.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton_11.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton_11.setBounds(410, 668, 338, 23);
		page1.add(rdbtnNewRadioButton_11);
		g3.add(rdbtnNewRadioButton_11);
		g3.add(rdbtnNewRadioButton_10);
		g3.add(rdbtnNewRadioButton_9);
		g3.add(rdbtnNewRadioButton_8);
		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "1";
			}
			});
		
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "3";
			}
			});
		
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "2";
			}
			});
		
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "4";
			}
			});
		rdbtnNewRadioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "1";
			}
			});
		rdbtnNewRadioButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "3";
			}
			});
		rdbtnNewRadioButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "2";
			}
			});
		rdbtnNewRadioButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "4";
			}
			});
		rdbtnNewRadioButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "1";
			}
			});		
		rdbtnNewRadioButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "3";
			}
			});
		rdbtnNewRadioButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "2";
			}
			});
		rdbtnNewRadioButton_11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					value2 = "4";
				}
				});
		
		

		JButton btnNewButton = new JButton("Next Page");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				stop=false;
try {
					
					String submitQuery = "update submittedanswers SET sa=?  where id=1";
					String submitQuery1 = "update submittedanswers SET sa=?  where id=2";
					String submitQuery2 = "update submittedanswers SET sa=?  where id=3";
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
				
				    //    JOptionPane.showMessageDialog(page1,"submitted"+value+" "+value1+" "+value2);
				    
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(page1,ex.getMessage());
								
				}
				dispose();
				JavaProject2 jp4=new JavaProject2();
				jp4.JavaProject();
				jp4.timeCounter=timeCounter;	
				jp4.i=i;
				jp4.setVisible(true);
				jp4.setExtendedState(jp4.getExtendedState() | JFrame.MAXIMIZED_BOTH);

			}
	});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(800, 620, 121, 34);
		page1.add(btnNewButton);
		
		
	}
}
