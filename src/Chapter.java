import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.Timer;
public class Chapter extends JFrame 
{
	
	private JPanel Algorithms;
	private ButtonGroup g1=new ButtonGroup();
	private ButtonGroup g2=new ButtonGroup();
	JLabel timeLabel = new JLabel("00:00:00");
    int timeCounter = 0;
    int i=0,j=0,k,l;
    boolean stop=true;
    static Chapter frame;
    
    Connection con=null;
    PreparedStatement pst=null ,pst1=null,ps=null;
    ResultSet rs=null;
    String value,value1;
    int result=0;
	
	/*
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					 frame = new Chapter();
					frame.setVisible(true);
					frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
					
					
						
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Chapter() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 975, 858);
		Algorithms = new JPanel();
		Algorithms.setBackground(new Color(0, 153, 153));
		Algorithms.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Algorithms);
		Algorithms.setLayout(null);
		
		Algorithms.add(timeLabel);
		timeLabel.setBounds(825, 20, 111, 18);
		timeLabel.setFont(new Font("Helvetica",Font.BOLD,20));
		timeLabel.setBackground(Color.cyan);
		timeLabel.setForeground(Color.red);
		  
        new Timer(1000, this::updateGUI).start();
		
		JLabel lblNewLabel = new JLabel("Question 1");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel.setBounds(45, 34, 95, 20);
		Algorithms.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("What is recurrence for worst case of QuickSort and what is the time complexity in Worst case?");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_1.setBounds(45, 101, 830, 16);
		Algorithms.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Recurrence is T(n) = T(n-2) + O(n) and time complexity is O(n^2)");
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton.setBackground(new Color(51, 153, 153));
		rdbtnNewRadioButton.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		rdbtnNewRadioButton.setBounds(45, 153, 365, 23);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "1";
			}
			});
		Algorithms.add(rdbtnNewRadioButton);
		
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Recurrence is T(n) = T(n-1) + O(n) and time complexity is O(n^2)");
		rdbtnNewRadioButton_1.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton_1.setBackground(new Color(51, 153, 153));
		rdbtnNewRadioButton_1.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		rdbtnNewRadioButton_1.setBounds(45, 207, 365, 23);
		
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "3";
			}
			});
		
		Algorithms.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Recurrence is T(n) = 2T(n/2) + O(n) and time complexity is O(nLogn)");
		rdbtnNewRadioButton_2.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton_2.setBackground(new Color(51, 153, 153));
		rdbtnNewRadioButton_2.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		rdbtnNewRadioButton_2.setBounds(438, 153, 437, 23);
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "2";
			}
			});
		Algorithms.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Recurrence is T(n) = T(n/10) + T(9n/10) + O(n) and time complexity is O(nLogn)");
		rdbtnNewRadioButton_3.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton_3.setBackground(new Color(51, 153, 153));
		rdbtnNewRadioButton_3.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		rdbtnNewRadioButton_3.setBounds(438, 207, 437, 23);
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = "4";
			}
			});
		Algorithms.add(rdbtnNewRadioButton_3);
		g1.add(rdbtnNewRadioButton_3);
		g1.add(rdbtnNewRadioButton_2);
		g1.add(rdbtnNewRadioButton_1);
		g1.add(rdbtnNewRadioButton);
		
		JLabel lblQuestion = new JLabel("Question 2");
		lblQuestion.setForeground(new Color(255, 255, 255));
		lblQuestion.setFont(new Font("Verdana", Font.BOLD, 14));
		lblQuestion.setBounds(45, 306, 95, 20);
		Algorithms.add(lblQuestion);
		
		JLabel lblNewLabel_2 = new JLabel("Suppose we have a O(n) time algorithm that finds median of an unsorted array. Now consider ");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_2.setBounds(45, 368, 830, 14);
		Algorithms.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("a QuickSort implementation where we first find median using the above algorithm, then use median ");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_3.setBounds(45, 392, 830, 14);
		Algorithms.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("as pivot. What will be the worst case time complexity of this modified QuickSort.");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_4.setBounds(45, 416, 830, 17);
		Algorithms.add(lblNewLabel_4);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("O(n^2 Logn)\r\n");
		rdbtnNewRadioButton_4.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton_4.setBackground(new Color(51, 153, 153));
		rdbtnNewRadioButton_4.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		rdbtnNewRadioButton_4.setBounds(45, 488, 225, 23);
		rdbtnNewRadioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "1";
			}
			});
		Algorithms.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("O(n^2)");
		rdbtnNewRadioButton_5.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton_5.setBackground(new Color(51, 153, 153));
		rdbtnNewRadioButton_5.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		rdbtnNewRadioButton_5.setBounds(45, 551, 225, 23);
		rdbtnNewRadioButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "3";
			}
			});
		Algorithms.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("O(n Logn Logn)");
		rdbtnNewRadioButton_6.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton_6.setBackground(new Color(51, 153, 153));
		rdbtnNewRadioButton_6.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		rdbtnNewRadioButton_6.setBounds(438, 488, 306, 23);
		rdbtnNewRadioButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "2";
			}
			});
		Algorithms.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("O(nLogn)");
		rdbtnNewRadioButton_7.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton_7.setBackground(new Color(51, 153, 153));
		rdbtnNewRadioButton_7.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		rdbtnNewRadioButton_7.setBounds(438, 551, 306, 23);
		rdbtnNewRadioButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = "4";
			}
			});
		Algorithms.add(rdbtnNewRadioButton_7);
		g2.add(rdbtnNewRadioButton_7);
		g2.add(rdbtnNewRadioButton_6);
		g2.add(rdbtnNewRadioButton_5);
		g2.add(rdbtnNewRadioButton_4);
	   
	
		
		
		JButton button1 = new JButton(" Finish!");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stop=false;
				
			try {
				
				String submitQuery = "update submittedanswers SET sa=?  where id=1";
				String submitQuery1 = "update submittedanswers SET sa=?  where id=2";
				 Class.forName("oracle.jdbc.driver.OracleDriver"); 
		            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abhi"); 
		        pst=con.prepareStatement(submitQuery);
			    pst.setString(1,value);
			    pst.executeQuery();
			    
			    pst1=con.prepareStatement(submitQuery1);
			    pst1.setString(1,value1);
			    pst1.executeQuery();
			//    JOptionPane.showMessageDialog(Algorithms,"submitted"+value+" "+value1);
			    
			    String extract="select submittedanswers.sa ,chapter.ans from chapter,submittedanswers where submittedanswers.id=chapter.id and submittedanswers.sa=chapter.ans";
			    ps=con.prepareStatement(extract);
			    rs =  ps.executeQuery();
			    while(rs.next()) {
			    	result++;
			    }
			   
			    
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(Algorithms,ex.getMessage());
							
			}
		
			      
				
				
				JOptionPane.showMessageDialog(Algorithms,"Your answers submitted successfully!");
				dispose();
				
				
				Result s=new Result();
				
				s.count=2;
				s.Result1();
				
				s.setVisible(true);
				s.setExtendedState(s.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			}
		});
		button1.setFont(new Font("Tahoma", Font.BOLD, 12));
		button1.setBounds(650,650, 121, 34);
		Algorithms.add(button1);
		
		
		}
	
	
		
	
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
    	JOptionPane.showMessageDialog(Algorithms,"Time up!");
    	
		dispose();
		
		
		Result s=new Result();
		
		s.setVisible(true);
		s.setExtendedState(s.getExtendedState() | JFrame.MAXIMIZED_BOTH);
    	
    	
    }
   

	}
 }
	