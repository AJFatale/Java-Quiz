import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
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

public class OS1 extends JFrame {
	private JPanel page2;
	JLabel timeLabel = new JLabel("00:00:00");
    int timeCounter = 0;
    int i=0,j=0,k,l;
    boolean stop=true;
    
    Connection con=null;
    PreparedStatement pst=null ,pst1=null,pst2,ps=null;
    String value,value1,value2;
    
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
					OS1 frame = new OS1();
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
	public OS1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1032, 857);
		page2 = new JPanel();
		page2.setBackground(new Color(0, 153, 153));
		page2.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(page2);
		page2.setLayout(null);
		
		
		ButtonGroup g4=new ButtonGroup();
		ButtonGroup g5=new ButtonGroup();
		ButtonGroup g6=new ButtonGroup();
		
		page2.add(timeLabel);
		timeLabel.setBounds(825, 20, 111, 18);
		timeLabel.setFont(new Font("Helvetica",Font.BOLD,20));
		timeLabel.setBackground(Color.cyan);
		timeLabel.setForeground(Color.red);
	    new Timer(1000, this::updateGUI).start();
		
		
		JLabel lblNewLabel = new JLabel("Question 1");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel.setBounds(50, 40, 91, 14);
		page2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("The LRU algorithm");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 14));
	    lblNewLabel_1.setBounds(50, 75, 950, 18);
		page2.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("pages out pages that have been used recently ");
		rdbtnNewRadioButton.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton.setBounds(50, 165, 350, 23);
		page2.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "1";
			}
			});
		
		g4.add(rdbtnNewRadioButton);
		
			JRadioButton rdbtnNewRadioButton1 = new JRadioButton("pages out pages that have not been used recently ");
			rdbtnNewRadioButton1.setBackground(new Color(0, 153, 153));
			rdbtnNewRadioButton1.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton1.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton1.setBounds(410, 165, 350, 22);
		page2.add(rdbtnNewRadioButton1);
		
		rdbtnNewRadioButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "2";
			}
			});
		
		g4.add(rdbtnNewRadioButton1);
		
		JRadioButton rdbtnNewRadioButton2 = new JRadioButton("pages out pages that have been least used recently");
		rdbtnNewRadioButton2.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton2.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton2.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton2.setBounds(50, 195, 350, 23);
		
		rdbtnNewRadioButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "3";
			}
			});
		
		page2.add(rdbtnNewRadioButton2);
		g4.add(rdbtnNewRadioButton2);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("pages out the first page in a given area ");
		rdbtnNewRadioButton_1.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton_1.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton_1.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton_1.setBounds(410, 195, 350, 23);
		page2.add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "4";
			}
			});
		
		g4.add(rdbtnNewRadioButton_1);
		
		JLabel lblQuestion = new JLabel("Question 2");
		lblQuestion.setForeground(new Color(255, 255, 255));
		lblQuestion.setFont(new Font("Verdana", Font.BOLD, 14));
		lblQuestion.setBounds(50, 265, 91, 14);
		page2.add(lblQuestion);
		
		JLabel lblHowManyDifferent = new JLabel("Which of the following systems software does the job of merging the records from two files into one?");
		lblHowManyDifferent.setForeground(new Color(255, 255, 255));
		lblHowManyDifferent.setFont(new Font("Verdana", Font.BOLD, 14));
		lblHowManyDifferent.setBounds(50, 290, 950, 18);
		page2.add(lblHowManyDifferent);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Security software");
		rdbtnNewRadioButton_2.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton_2.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton_2.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton_2.setBounds(50, 350, 200, 23);
		
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "1";
			}
			});
		
		page2.add(rdbtnNewRadioButton_2);
		g5.add(rdbtnNewRadioButton_2);
		
		JRadioButton radioButton = new JRadioButton("Utility program");
		radioButton.setBackground(new Color(0, 153, 153));
		radioButton.setForeground(new Color(255, 255, 0));
		radioButton.setBounds(50, 380, 200, 23);
		radioButton.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "3";
			}
			});
		
		page2.add(radioButton);
		g5.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Networking software");
		radioButton_1.setBackground(new Color(0, 153, 153));
		radioButton_1.setForeground(new Color(255, 255, 0));
		radioButton_1.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		radioButton_1.setBounds(410, 350, 200, 23);
		
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "2";
			}
			});
		
		page2.add(radioButton_1);
		g5.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Documentation system");
		radioButton_2.setBackground(new Color(0, 153, 153));
		radioButton_2.setForeground(new Color(255, 255, 0));
		radioButton_2.setBounds(410, 380, 200, 23);
		radioButton_2.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		
		radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "4";
			}
			});
		
		page2.add(radioButton_2);
		g5.add(radioButton_2);
		
		JLabel lblQuestion_1 = new JLabel("Question 3");
		lblQuestion_1.setForeground(new Color(255, 255, 255));
		lblQuestion_1.setFont(new Font("Verdana", Font.BOLD, 14));
		lblQuestion_1.setBounds(50, 430, 91, 14);
		page2.add(lblQuestion_1);
		
		JLabel lblLetXY = new JLabel("Fork is");
		lblLetXY.setForeground(new Color(255, 255, 255));
		lblLetXY.setFont(new Font("Verdana", Font.BOLD, 14));
		lblLetXY.setBounds(50, 460, 950, 18);
		page2.add(lblLetXY);
		
		JRadioButton rdbtnZxy = new JRadioButton("the dispatching of a task ");
		rdbtnZxy.setBackground(new Color(0, 153, 153));
		rdbtnZxy.setForeground(new Color(255, 255, 0));
		rdbtnZxy.setBounds(50, 511, 200, 23);
		rdbtnZxy.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		
		rdbtnZxy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "1";
			}
			});
		
		page2.add(rdbtnZxy);
		g6.add(rdbtnZxy);
		
		JRadioButton rdbtnZxY = new JRadioButton("the creation of a new job");
		rdbtnZxY.setBackground(new Color(0, 153, 153));
		rdbtnZxY.setForeground(new Color(255, 255, 0));
		rdbtnZxY.setBounds(410, 541, 200, 23);
		rdbtnZxY.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		
		rdbtnZxY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "4";
			}
			});		
		
		page2.add(rdbtnZxY);
		g6.add(rdbtnZxY);
		
		JRadioButton rdbtnxyz = new JRadioButton("increasing the priority of a task");
		rdbtnxyz.setBackground(new Color(0, 153, 153));
		rdbtnxyz.setForeground(new Color(255, 255, 0));
		rdbtnxyz.setBounds(410, 511, 255, 23);
		rdbtnxyz.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		
		rdbtnxyz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "2";
			}
			});
		
		page2.add(rdbtnxyz);
		g6.add(rdbtnxyz);
		
		JRadioButton rdbtnZX = new JRadioButton("the creation of a new process ");
		rdbtnZX.setBackground(new Color(0, 153, 153));
		rdbtnZX.setForeground(new Color(255, 255, 0));
		rdbtnZX.setBounds(50, 541, 255, 23);
		rdbtnZX.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		
		rdbtnZX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "3";
			}
			});
		
		page2.add(rdbtnZX);
		g6.add(rdbtnZX);
		
		JButton button = new JButton("Next Page");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
				//    JOptionPane.showMessageDialog(page2,"submitted"+value+" "+value1+" "+value2);	   
				    
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(page2,ex.getMessage());
								
				}
				dispose();
				OS2 n=new OS2();
				n.OS();
			    n.timeCounter=timeCounter;	
				n.i=i;
				n.setVisible(true);
				n.setExtendedState(n.getExtendedState() | JFrame.MAXIMIZED_BOTH);				
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBounds(809,650, 121, 34);
		
		page2.add(button);
		
		
		
	}
}
