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

public class Chapter5 extends JFrame {

	private JPanel chapter5;
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
if(i==30)
{
	JOptionPane.showMessageDialog(chapter5,"Time up!");
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
					Chapter5 frame = new Chapter5();
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
	public Chapter5() {
		setTitle("Chapter5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1112, 788);
		chapter5 = new JPanel();
		chapter5.setBackground(new Color(0, 153, 153));
		chapter5.setForeground(new Color(153, 204, 255));
		chapter5.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(chapter5);
		chapter5.setLayout(null);
		
		chapter5.add(timeLabel);
		timeLabel.setBounds(825, 20, 111, 18);
		timeLabel.setFont(new Font("Helvetica",Font.PLAIN,20));
		timeLabel.setBackground(Color.cyan);
		timeLabel.setForeground(Color.red);
		new Timer(1000, this::updateGUI).start();
		
		JLabel label = new JLabel("Question 1");
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("Verdana", Font.BOLD, 14));
		label.setBounds(32, 23, 91, 14);
		chapter5.add(label);
		
		JLabel label_1 = new JLabel("What was Hadoop named after?");
		label_1.setForeground(new Color(255, 255, 255));
		label_1.setFont(new Font("Verdana", Font.BOLD, 14));
		label_1.setBounds(32, 79, 899, 14);
		chapter5.add(label_1);
		
		JRadioButton radioButton = new JRadioButton("Creator Doug Cutting’s favorite circus act");
		radioButton.setForeground(new Color(255, 255, 0));
		radioButton.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		radioButton.setBackground(new Color(0, 153, 153));
		radioButton.setBounds(32, 145, 300, 23);
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "1";
			}
			});
		
		
		chapter5.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Cutting’s high school rock band");
		radioButton_1.setForeground(new Color(255, 255, 0));
		radioButton_1.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		radioButton_1.setBackground(new Color(0, 153, 153));
		radioButton_1.setBounds(32, 192, 250, 23);
		
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "3";
			}
			});
		chapter5.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("The toy elephant of Cutting’s son");
		radioButton_2.setForeground(new Color(255, 255, 0));
		radioButton_2.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		radioButton_2.setBackground(new Color(0, 153, 153));
		radioButton_2.setBounds(392, 145, 410, 23);
		radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "2";
			}
			});
		
		chapter5.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("A sound Cutting’s laptop made during Hadoop development");
		radioButton_3.setForeground(new Color(255, 255, 0));
		radioButton_3.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		radioButton_3.setBackground(new Color(0, 153, 153));
		radioButton_3.setBounds(392, 192, 410, 23);
		radioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "4";
			}
			});
		
		chapter5.add(radioButton_3);
		g1.add(radioButton_3);
		g1.add(radioButton_2);
		g1.add(radioButton_1);
		g1.add(radioButton);
		//ans1=g1.getSelection().toString();

		JLabel label_2 = new JLabel("Question 2");
		label_2.setForeground(new Color(255, 255, 255));
		label_2.setFont(new Font("Verdana", Font.BOLD, 14));
		label_2.setBounds(32, 259, 91, 14);
		chapter5.add(label_2);
		
		JLabel label_3 = new JLabel("All of the following accurately describe Hadoop, EXCEPT --- ?");
		label_3.setForeground(new Color(255, 255, 255));
		label_3.setFont(new Font("Verdana", Font.BOLD, 14));
		label_3.setBounds(32, 315, 899, 18);
		chapter5.add(label_3);
		
		JRadioButton radioButton_4 = new JRadioButton("Open source");
		radioButton_4.setForeground(new Color(255, 255, 0));
		radioButton_4.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		radioButton_4.setBackground(new Color(0, 153, 153));
		radioButton_4.setBounds(32, 381, 246, 23);
		radioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "1";
			}
			});
		chapter5.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("Real-time");
		radioButton_5.setForeground(new Color(255, 255, 0));
		radioButton_5.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		radioButton_5.setBackground(new Color(0, 153, 153));
		radioButton_5.setBounds(32, 428, 246, 23);
		radioButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "3";
			}
			});
		chapter5.add(radioButton_5);
		JRadioButton radioButton_6 = new JRadioButton("Java-based");
		radioButton_6.setForeground(new Color(255, 255, 0));
		radioButton_6.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		radioButton_6.setBackground(new Color(0, 153, 153));
		radioButton_6.setBounds(392, 381, 293, 23);
		radioButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "2";
			}
			});
		chapter5.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("Distributed computing approach");
		radioButton_7.setForeground(new Color(255, 255, 0));
		radioButton_7.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		radioButton_7.setBackground(new Color(0, 153, 153));
		radioButton_7.setBounds(392, 428, 333, 23);
		radioButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "4";
			}
			});
		chapter5.add(radioButton_7);
		g2.add(radioButton_5);
		g2.add(radioButton_4);
		g2.add(radioButton_7);
		g2.add(radioButton_6);
	//	ans2=g2.getSelection().toString();

		
		JLabel label_4 = new JLabel("Question 3");
		label_4.setForeground(new Color(255, 255, 255));
		label_4.setFont(new Font("Verdana", Font.BOLD, 14));
		label_4.setBounds(32, 490, 91, 14);
		chapter5.add(label_4);
		
		
		
		JLabel label_5 = new JLabel("Facebook Tackles Big Data With ------ based on Hadoop.");
		label_5.setForeground(new Color(255, 255, 255));
		label_5.setFont(new Font("Verdana", Font.BOLD, 14));
		label_5.setBounds(32, 546, 899, 18);
		chapter5.add(label_5);
		
		JRadioButton radioButton_8 = new JRadioButton("Project Prism");
		radioButton_8.setForeground(new Color(255, 255, 0));
		radioButton_8.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		radioButton_8.setBackground(new Color(0, 153, 153));
		radioButton_8.setBounds(32, 612, 293, 23);
		radioButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "1";
			}
			});
		chapter5.add(radioButton_8);
		
		JRadioButton radioButton_9 = new JRadioButton("Prism");
		radioButton_9.setForeground(new Color(255, 255, 0));
		radioButton_9.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		radioButton_9.setBackground(new Color(0, 153, 153));
		radioButton_9.setBounds(32, 659, 327, 23);
		radioButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "3";
			}
			});	
		chapter5.add(radioButton_9);
		
		JRadioButton radioButton_10 = new JRadioButton("Project Big");
		radioButton_10.setForeground(new Color(255, 255, 0));
		radioButton_10.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		radioButton_10.setBackground(new Color(0, 153, 153));
		radioButton_10.setBounds(392, 612, 376, 23);
		radioButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "2";
			}
			});

		chapter5.add(radioButton_10);
		
		JRadioButton radioButton_11 = new JRadioButton("Project Data");
		radioButton_11.setForeground(new Color(255, 255, 0));
		radioButton_11.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		radioButton_11.setBackground(new Color(0, 153, 153));
		radioButton_11.setBounds(392, 659, 293, 23);
		radioButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "4";
			}
			});
		chapter5.add(radioButton_11);
		g3.add(radioButton_11);
		g3.add(radioButton_10);
		g3.add(radioButton_9);
		g3.add(radioButton_8);
	//	ans3=g3.getSelection().toString();

		

		JButton button1 = new JButton(" Finish!");
		button1.addActionListener(new ActionListener() {
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
				  //  JOptionPane.showMessageDialog(chapter5,"submitted"+value+" "+value1+" "+value2);
				    String extract="select submittedanswers.sa ,chapter5.ans from chapter5,submittedanswers where submittedanswers.id=chapter5.id and submittedanswers.sa=chapter5.ans";
				    ps=con.prepareStatement(extract);
				    rs =  ps.executeQuery();
				    while(rs.next()) {
				    	result++;
				    }
				   
				    
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(chapter5,ex.getMessage());
								
				}
				JOptionPane.showMessageDialog(chapter5,"Your answers submitted successfully!");
				dispose();
				Result s=new Result();
				s.result=result;
				s.count=3;
				
				s.Result1();
				s.setVisible(true);
				s.setExtendedState(s.getExtendedState() | JFrame.MAXIMIZED_BOTH);
				
			}
		});
		button1.setFont(new Font("Tahoma", Font.BOLD, 12));
		button1.setBounds(650,650, 121, 34);
		chapter5.add(button1);
	}

}
