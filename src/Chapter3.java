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

public class Chapter3 extends JFrame {

	private JPanel Chapter3;
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
	JOptionPane.showMessageDialog(Chapter3,"Time up!");
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
					Chapter3 frame = new Chapter3();
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
	public Chapter3() {
		
		
		
		setTitle("Chapter3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1307, 955);
		Chapter3 = new JPanel();
		Chapter3.setForeground(new Color(255, 255, 0));
		Chapter3.setBackground(new Color(0, 153, 153));
		Chapter3.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Chapter3);
		Chapter3.setLayout(null);
		
		Chapter3.add(timeLabel);
		timeLabel.setBounds(825, 20, 111, 18);
		timeLabel.setFont(new Font("Helvetica",Font.PLAIN,20));
		timeLabel.setBackground(Color.cyan);
		timeLabel.setForeground(Color.red);
		new Timer(1000, this::updateGUI).start();
		
		JLabel label = new JLabel("Question 1");
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("Verdana", Font.BOLD, 14));
		label.setBounds(29, 28, 91, 14);
		Chapter3.add(label);
		
		JLabel label_1 = new JLabel("Which one of the following is not a client server application?");
		label_1.setForeground(new Color(255, 255, 255));
		label_1.setFont(new Font("Verdana", Font.BOLD, 14));
		label_1.setBounds(29, 84, 899, 18);
		Chapter3.add(label_1);
		
		JRadioButton radioButton = new JRadioButton("Internet chat");
		radioButton.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		radioButton.setForeground(new Color(255, 255, 0));
		radioButton.setBackground(new Color(0, 153, 153));
		radioButton.setBounds(29, 150, 109, 23);
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "1";
			}
			});		
		Chapter3.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Web browsing");
		radioButton_1.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		radioButton_1.setForeground(new Color(255, 255, 0));
		radioButton_1.setBackground(new Color(0, 153, 153));
		radioButton_1.setBounds(29, 197, 109, 23);
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "3";
			}
			});
		Chapter3.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("E-mail");
		radioButton_2.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		radioButton_2.setForeground(new Color(255, 255, 0));
		radioButton_2.setBackground(new Color(0, 153, 153));
		radioButton_2.setBounds(389, 150, 109, 23);
		radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "2";
			}
			});
		Chapter3.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("ping");
		radioButton_3.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		radioButton_3.setForeground(new Color(255, 255, 0));
		radioButton_3.setBackground(new Color(0, 153, 153));
		radioButton_3.setBounds(389, 197, 154, 23);
		radioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "4";
			}
			});
		Chapter3.add(radioButton_3);
		g1.add(radioButton_3);
		g1.add(radioButton_2);
		g1.add(radioButton_1);
		g1.add(radioButton);
		
		
		JLabel label_2 = new JLabel("Question 2");
		label_2.setForeground(new Color(255, 255, 255));
		label_2.setFont(new Font("Verdana", Font.BOLD, 14));
		label_2.setBounds(29, 264, 91, 14);
		Chapter3.add(label_2);
		
		JLabel label_3 = new JLabel("In the following pairs of OSI protocol layer/sub-layer and its functionality, the INCORRECT pair is");
		label_3.setForeground(new Color(255, 255, 255));
		label_3.setFont(new Font("Verdana", Font.BOLD, 14));
		label_3.setBounds(29, 320, 899, 18);
		Chapter3.add(label_3);
		
		JRadioButton radioButton_4 = new JRadioButton("Network layer and Routing ");
		radioButton_4.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		radioButton_4.setForeground(new Color(255, 255, 0));
		radioButton_4.setBackground(new Color(0, 153, 153));
		radioButton_4.setBounds(29, 386, 379, 23);
		radioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "1";
			}
			});
		Chapter3.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("Data Link Layer and Bit synchronization");
		radioButton_5.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		radioButton_5.setForeground(new Color(255, 255, 0));
		radioButton_5.setBackground(new Color(0, 153, 153));
		radioButton_5.setBounds(29, 433, 379, 23);
		radioButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "3";
			}
			});
		Chapter3.add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("Transport layer and End-to-end process communication");
		radioButton_6.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		radioButton_6.setForeground(new Color(255, 255, 0));
		radioButton_6.setBackground(new Color(0, 153, 153));
		radioButton_6.setBounds(410, 386, 469, 23);
		radioButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "2";
			}
			});
		Chapter3.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("Medium Access Control sub-layer and Channel sharing");
		radioButton_7.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		radioButton_7.setForeground(new Color(255, 255, 0));
		radioButton_7.setBackground(new Color(0, 153, 153));
		radioButton_7.setBounds(410, 433, 469, 23);
		radioButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "4";
			}
			});
		Chapter3.add(radioButton_7);
		g2.add(radioButton_7);
		g2.add(radioButton_6);
		g2.add(radioButton_5);
		g2.add(radioButton_4);

		
		JLabel label_4 = new JLabel("Question 3");
		label_4.setForeground(new Color(255, 255, 255));
		label_4.setFont(new Font("Verdana", Font.BOLD, 14));
		label_4.setBounds(29, 495, 91, 14);
		Chapter3.add(label_4);
		
		JLabel label_5 = new JLabel("Which of the following is NOT true with respect to a transparent bridge and a router?");
		label_5.setForeground(new Color(255, 255, 255));
		label_5.setFont(new Font("Verdana", Font.BOLD, 14));
		label_5.setBounds(29, 551, 899, 18);
		Chapter3.add(label_5);
		
		JRadioButton radioButton_8 = new JRadioButton("Both bridge and router selectively forward data packets");
		radioButton_8.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		radioButton_8.setForeground(new Color(255, 255, 0));
		radioButton_8.setBackground(new Color(0, 153, 153));
		radioButton_8.setBounds(29, 617, 379, 23);
		radioButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "1";
			}
			});
		Chapter3.add(radioButton_8);
		
		JRadioButton radioButton_9 = new JRadioButton("A bridge uses IP addresses while a router uses MAC addresses");
		radioButton_9.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		radioButton_9.setForeground(new Color(255, 255, 0));
		radioButton_9.setBackground(new Color(0, 153, 153));
		radioButton_9.setBounds(29, 664, 379, 23);
		radioButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "3";
			}
			});	
		Chapter3.add(radioButton_9);
		
		JRadioButton radioButton_10 = new JRadioButton("A bridge builds up its routing table by inspect­ing incoming packets");
		radioButton_10.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		radioButton_10.setForeground(new Color(255, 255, 0));
		radioButton_10.setBackground(new Color(0, 153, 153));
		radioButton_10.setBounds(410, 617, 469, 23);
		radioButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "2";
			}
			});
		Chapter3.add(radioButton_10);
		
		JRadioButton radioButton_11 = new JRadioButton("A router can connect between a LAN and a WAN");
		radioButton_11.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		radioButton_11.setForeground(new Color(255, 255, 0));
		radioButton_11.setBackground(new Color(0, 153, 153));
		radioButton_11.setBounds(410, 664, 469, 23);
		radioButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = "4";
			}
			});
		Chapter3.add(radioButton_11);
		g3.add(radioButton_11);
		g3.add(radioButton_10);
		g3.add(radioButton_9);
		g3.add(radioButton_8);

		
		JButton button = new JButton("Finish");
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
				//    JOptionPane.showMessageDialog(Chapter3,"submitted"+value+" "+value1+" "+value2);
				    String extract="select submittedanswers.sa ,chapter3.ans from chapter3,submittedanswers where submittedanswers.id=chapter3.id and submittedanswers.sa=chapter3.ans";
				    ps=con.prepareStatement(extract);
				    rs =  ps.executeQuery();
				    while(rs.next()) {
				    	result++;
				    }
				   
				    
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(Chapter3,ex.getMessage());
								
				}
				
				JOptionPane.showMessageDialog(Chapter3,"Your answers submitted successfully!");
				Result s=new Result();
				s.result=result;
				s.count=3;
				s.Result1();
				dispose();
				s.setVisible(true);
				s.setExtendedState(s.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBounds(900,650, 121, 34);
		Chapter3.add(button);
		
	
	}

}
