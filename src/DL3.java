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

public class DL3 extends JFrame {
	private JPanel page2;

	JLabel timeLabel = new JLabel();
    int timeCounter;
    int i=0,j=0,k,l;
    boolean stop=true;
    
    Connection con=null;
    PreparedStatement pst=null ,pst1=null,pst2,ps=null;
    ResultSet rs=null;
    String value,value1,value2;
    int result;

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
	JOptionPane.showMessageDialog(page2,"Time up!");
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
					DL3 frame = new DL3();
					frame.DL();
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
	public void DL() {
		setBackground(new Color(0, 153, 153));
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
		
		JLabel lblNewLabel = new JLabel("Question 7");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 153, 153));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel.setBounds(50, 40, 91, 14);
		page2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("EPROM contents can be erased by exposing it to:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(0, 153, 153));
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 14));
	    lblNewLabel_1.setBounds(50, 75, 950, 18);
		page2.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Ultraviolet rays");
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton.setBounds(50, 122, 200, 23);
		page2.add(rdbtnNewRadioButton);
		g4.add(rdbtnNewRadioButton);
		
			JRadioButton rdbtnNewRadioButton1 = new JRadioButton("Infrared rays.");
			rdbtnNewRadioButton1.setForeground(new Color(255, 255, 0));
			rdbtnNewRadioButton1.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton1.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton1.setBounds(410, 122, 200, 22);
		page2.add(rdbtnNewRadioButton1);
		g4.add(rdbtnNewRadioButton1);
		
		JRadioButton rdbtnNewRadioButton2 = new JRadioButton("Burst of microwaves ");
		rdbtnNewRadioButton2.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton2.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton2.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton2.setBounds(50, 152, 200, 23);
		page2.add(rdbtnNewRadioButton2);
		g4.add(rdbtnNewRadioButton2);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Intense heat radiations.");
		rdbtnNewRadioButton_1.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton_1.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton_1.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton_1.setBounds(410, 152, 250, 23);
		page2.add(rdbtnNewRadioButton_1);
		g4.add(rdbtnNewRadioButton_1);
		
		JLabel lblQuestion = new JLabel("Question 8");
		lblQuestion.setForeground(new Color(255, 255, 255));
		lblQuestion.setBackground(new Color(0, 153, 153));
		lblQuestion.setFont(new Font("Verdana", Font.BOLD, 14));
		lblQuestion.setBounds(50, 265, 91, 14);
		page2.add(lblQuestion);
		
		JLabel lblHowManyDifferent = new JLabel("The hexadecimal number �A0� has the decimal value equivalent to ");
		lblHowManyDifferent.setForeground(new Color(255, 255, 255));
		lblHowManyDifferent.setBackground(new Color(0, 153, 153));
		lblHowManyDifferent.setFont(new Font("Verdana", Font.BOLD, 14));
		lblHowManyDifferent.setBounds(50, 290, 950, 18);
		page2.add(lblHowManyDifferent);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("256 ");
		rdbtnNewRadioButton_2.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton_2.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton_2.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton_2.setBounds(50, 355, 200, 23);
		page2.add(rdbtnNewRadioButton_2);
		g5.add(rdbtnNewRadioButton_2);
		
		JRadioButton radioButton = new JRadioButton("80 ");
		radioButton.setForeground(new Color(255, 255, 0));
		radioButton.setBackground(new Color(0, 153, 153));
		radioButton.setBounds(50, 380, 200, 23);
		radioButton.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		page2.add(radioButton);
		g5.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("160");
		radioButton_1.setForeground(new Color(255, 255, 0));
		radioButton_1.setBackground(new Color(0, 153, 153));
		radioButton_1.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		radioButton_1.setBounds(410, 350, 200, 23);
		page2.add(radioButton_1);
		g5.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("100");
		radioButton_2.setForeground(new Color(255, 255, 0));
		radioButton_2.setBackground(new Color(0, 153, 153));
		radioButton_2.setBounds(410, 380, 200, 23);
		radioButton_2.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		page2.add(radioButton_2);
		g5.add(radioButton_2);
		
		JLabel lblQuestion_1 = new JLabel("Question 9");
		lblQuestion_1.setForeground(new Color(255, 255, 255));
		lblQuestion_1.setBackground(new Color(0, 153, 153));
		lblQuestion_1.setFont(new Font("Verdana", Font.BOLD, 14));
		lblQuestion_1.setBounds(50, 430, 91, 14);
		page2.add(lblQuestion_1);
		
		JLabel lblLetXY = new JLabel("The output of a logic gate is 1 when all its inputs are at logic 0. the gate is either");
		lblLetXY.setForeground(new Color(255, 255, 255));
		lblLetXY.setBackground(new Color(0, 153, 153));
		lblLetXY.setFont(new Font("Verdana", Font.BOLD, 14));
		lblLetXY.setBounds(50, 460, 950, 18);
		page2.add(lblLetXY);
		
		JRadioButton rdbtnZxy = new JRadioButton("a NAND or an EX-OR ");
		rdbtnZxy.setForeground(new Color(255, 255, 0));
		rdbtnZxy.setBackground(new Color(0, 153, 153));
		rdbtnZxy.setBounds(50, 505, 200, 23);
		rdbtnZxy.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		page2.add(rdbtnZxy);
		g6.add(rdbtnZxy);
		
		JRadioButton rdbtnZxY = new JRadioButton("an OR or an EX-NOR ");
		rdbtnZxY.setForeground(new Color(255, 255, 0));
		rdbtnZxY.setBackground(new Color(0, 153, 153));
		rdbtnZxY.setBounds(410, 535, 200, 23);
		rdbtnZxY.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		page2.add(rdbtnZxY);
		g6.add(rdbtnZxY);
		
		JRadioButton rdbtnxyz = new JRadioButton("an AND or an EX-OR");
		rdbtnxyz.setForeground(new Color(255, 255, 0));
		rdbtnxyz.setBackground(new Color(0, 153, 153));
		rdbtnxyz.setBounds(410, 505, 200, 23);
		rdbtnxyz.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		page2.add(rdbtnxyz);
		g6.add(rdbtnxyz);
		
		JRadioButton rdbtnZX = new JRadioButton("a NOR or an EX-NOR");
		rdbtnZX.setForeground(new Color(255, 255, 0));
		rdbtnZX.setBackground(new Color(0, 153, 153));
		rdbtnZX.setBounds(50, 535, 200, 23);
		rdbtnZX.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		page2.add(rdbtnZX);
		g6.add(rdbtnZX);
		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "1";
			}
			});
		
		rdbtnNewRadioButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "2";
			}
			});
		
		rdbtnNewRadioButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "3";
			}
			});
		
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "4";
			}
			});
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "1";
			}
			});
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "3";
			}
			});
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "2";
			}
			});
		radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "4";
			}
			});
		rdbtnZxy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "1";
			}
			});
		rdbtnZxY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "4";
			}
			});		
		rdbtnxyz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "2";
			}
			});
		rdbtnZX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "3";
			}
			});
		
		
		
		JButton button1 = new JButton(" Finish!");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
				//    JOptionPane.showMessageDialog(page2,"submitted"+value+" "+value1+" "+value2);				    
				    String extract="select submittedanswers.sa ,DL.ans from DL,submittedanswers where submittedanswers.id=DL.id and submittedanswers.sa=DL.ans";
				    ps=con.prepareStatement(extract);
				    rs =  ps.executeQuery();
				    while(rs.next()) {
				    	result++;
				    }
				   
				    
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(page2,ex.getMessage());
								
				}
				JOptionPane.showMessageDialog(page2,"Your answers submitted successfully!");
				dispose();
				Result s=new Result();
				s.result=result;
				s.count=9;
				s.Result1();
				s.setVisible(true);
				s.setExtendedState(s.getExtendedState() | JFrame.MAXIMIZED_BOTH);
				
			}
		});
		button1.setFont(new Font("Tahoma", Font.BOLD, 12));
		button1.setBounds(650,650, 121, 34);
		page2.add(button1);
		
	}
}
