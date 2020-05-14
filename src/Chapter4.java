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

public class Chapter4 extends JFrame {

	private JPanel contentPane;
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
					Chapter4 frame = new Chapter4();
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
	public Chapter4() {
		setTitle("Chapter4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1112, 788);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 0));
		contentPane.setBackground(new Color(0, 153, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		contentPane.add(timeLabel);
		timeLabel.setBounds(825, 20, 111, 18);
		timeLabel.setFont(new Font("Helvetica",Font.PLAIN,20));
		timeLabel.setBackground(Color.cyan);
		timeLabel.setForeground(Color.red);
		new Timer(1000, this::updateGUI).start();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 153));
		panel.setForeground(new Color(153, 204, 255));
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(10, 10, 1291, 749);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Question 1");
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("Verdana", Font.BOLD, 14));
		label.setBounds(29, 34, 91, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("The amount of ROM needed to implement a 4 bit multiplier is");
		label_1.setForeground(new Color(255, 255, 255));
		label_1.setFont(new Font("Verdana", Font.BOLD, 14));
		label_1.setBounds(29, 90, 899, 18);
		panel.add(label_1);
		
		JRadioButton radioButton = new JRadioButton("64 bits");
		radioButton.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		radioButton.setBackground(new Color(0, 153, 153));
		radioButton.setForeground(new Color(255, 255, 0));
		radioButton.setBounds(29, 150, 109, 23);
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "1";
			}
			});
		panel.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("128 bits");
		radioButton_1.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		radioButton_1.setBackground(new Color(0, 153, 153));
		radioButton_1.setForeground(new Color(255, 255, 0));
		radioButton_1.setBounds(29, 197, 109, 23);
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "3";
			}
			});
		panel.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("1 Kbits");
		radioButton_2.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		radioButton_2.setBackground(new Color(0, 153, 153));
		radioButton_2.setForeground(new Color(255, 255, 0));
		radioButton_2.setBounds(389, 150, 109, 23);
		radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "2";
			}
			});
		panel.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("2 Kbits");
		radioButton_3.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		radioButton_3.setBackground(new Color(0, 153, 153));
		radioButton_3.setForeground(new Color(255, 255, 0));
		radioButton_3.setBounds(389, 197, 154, 23);
		radioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "4";
			}
			});
		panel.add(radioButton_3);
		g1.add(radioButton_3);
		g1.add(radioButton_2);
		g1.add(radioButton_1);
		g1.add(radioButton);

		JLabel label_2 = new JLabel("Question 2");
		label_2.setForeground(new Color(255, 255, 255));
		label_2.setFont(new Font("Verdana", Font.BOLD, 14));
		label_2.setBounds(29, 270, 91, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Register renaming is done in pipelined processors");
		label_3.setForeground(new Color(255, 255, 255));
		label_3.setFont(new Font("Verdana", Font.BOLD, 14));
		label_3.setBounds(29, 326, 899, 18);
		panel.add(label_3);
		
		JRadioButton radioButton_4 = new JRadioButton("as an alternative to register allocation at compile time");
		radioButton_4.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		radioButton_4.setBackground(new Color(0, 153, 153));
		radioButton_4.setForeground(new Color(255, 255, 0));
		radioButton_4.setBounds(29, 386, 350, 23);
		radioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "1";
			}
			});
		panel.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("for efficient access to function parameters and local variables");
		radioButton_5.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		radioButton_5.setBackground(new Color(0, 153, 153));
		radioButton_5.setForeground(new Color(255, 255, 0));
		radioButton_5.setBounds(29, 433, 400, 23);
		radioButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "3";
			}
			});
		panel.add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("to handle certain kinds of hazards");
		radioButton_6.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		radioButton_6.setBackground(new Color(0, 153, 153));
		radioButton_6.setForeground(new Color(255, 255, 0));
		radioButton_6.setBounds(430, 386, 293, 23);
		radioButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "2";
			}
			});
		panel.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("as part of address translation");
		radioButton_7.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		radioButton_7.setBackground(new Color(0, 153, 153));
		radioButton_7.setForeground(new Color(255, 255, 0));
		radioButton_7.setBounds(430, 433, 333, 23);
		radioButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "4";
			}
			});
		panel.add(radioButton_7);
		g2.add(radioButton_7);
		g2.add(radioButton_6);
		g2.add(radioButton_5);
		g2.add(radioButton_4);

		
		JLabel label_4 = new JLabel("Question 3");
		label_4.setForeground(new Color(255, 255, 255));
		label_4.setFont(new Font("Verdana", Font.BOLD, 14));
		label_4.setBounds(29, 501, 91, 14);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Consider the data given in previous question. The size of the cache tag directory is");
		label_5.setForeground(new Color(255, 255, 255));
		label_5.setFont(new Font("Verdana", Font.BOLD, 14));
		label_5.setBounds(29, 551, 899, 18);
		panel.add(label_5);
		
		JRadioButton radioButton_8 = new JRadioButton("160 Kbits");
		radioButton_8.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		radioButton_8.setBackground(new Color(0, 153, 153));
		radioButton_8.setForeground(new Color(255, 255, 0));
		radioButton_8.setBounds(29, 617, 293, 23);
		radioButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "1";
			}
			});
		panel.add(radioButton_8);
		
		JRadioButton radioButton_9 = new JRadioButton("136 bits");
		radioButton_9.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		radioButton_9.setBackground(new Color(0, 153, 153));
		radioButton_9.setForeground(new Color(255, 255, 0));
		radioButton_9.setBounds(29, 664, 327, 23);
		radioButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "3";
			}
			});	
		panel.add(radioButton_9);
		
		JRadioButton radioButton_10 = new JRadioButton("40 Kbits");
		radioButton_10.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		radioButton_10.setBackground(new Color(0, 153, 153));
		radioButton_10.setForeground(new Color(255, 255, 0));
		radioButton_10.setBounds(389, 617, 376, 23);
		radioButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "2";
			}
			});
		panel.add(radioButton_10);
		
		JRadioButton radioButton_11 = new JRadioButton("32 bits");
		radioButton_11.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		radioButton_11.setBackground(new Color(0, 153, 153));
		radioButton_11.setForeground(new Color(255, 255, 0));
		radioButton_11.setBounds(389, 664, 293, 23);
		radioButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "4";
			}
			});
		panel.add(radioButton_11);
		g3.add(radioButton_11);
		g3.add(radioButton_10);
		g3.add(radioButton_9);
		g3.add(radioButton_8);

		
	
		
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
				  //  JOptionPane.showMessageDialog(panel,"submitted"+value+" "+value1+" "+value2);
				    String extract="select submittedanswers.sa ,chapter4.ans from chapter4,submittedanswers where submittedanswers.id=chapter4.id and submittedanswers.sa=chapter4.ans";
				    ps=con.prepareStatement(extract);
				    rs =  ps.executeQuery();
				    while(rs.next()) {
				    	result++;
				    }
				   
				    
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(panel,ex.getMessage());
								
				}
				
				
				JOptionPane.showMessageDialog(panel,"Your answers submitted successfully!");
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
		panel.add(button1);
	}
}
