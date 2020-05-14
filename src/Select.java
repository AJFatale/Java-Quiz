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

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.Color;

public class Select extends JFrame {

	private JPanel contentPane;
	protected String uname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Select frame = new Select();
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
	public Select() {
		setBackground(new Color( 151, 194, 85));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 441);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(244, 155, 47));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Department");
		label.setBackground(new Color(255, 228, 225));
		label.setForeground(Color.white);
		label.setFont(new Font("Verdana", Font.BOLD, 16));
		label.setBounds(400, 198, 112, 35);
		contentPane.add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.white);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-----------------Select Department--------------------", "Electronics and Communication Engineering", "Computer Science Engineering", "Electrical engineering", "Mechanical Engineering", "Information Technology Engineering", "Civil Engineering", "Chemical Engineering", "Aeronautical Engineering"}));
		comboBox.setFont(new Font("Verdana", Font.PLAIN, 12));
		comboBox.setBounds(550, 194, 314, 35);
		contentPane.add(comboBox);
		
		JLabel label_1 = new JLabel("Year");
		label_1.setBackground(new Color(255, 228, 225));
		label_1.setForeground(Color.white);
		label_1.setFont(new Font("Verdana", Font.BOLD, 16));
		label_1.setBounds(400, 304, 112, 35);
		contentPane.add(label_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.white);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"---------------------Select Year----------------------", "First Year", "Second Year", "Third Year"}));
		comboBox_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		comboBox_1.setBounds(550, 300, 314, 35);
		contentPane.add(comboBox_1);
		
		JLabel label_2 = new JLabel("Subject");
		label_2.setBackground(new Color(255, 228, 225));
		label_2.setForeground(Color.white);
		label_2.setFont(new Font("Verdana", Font.BOLD, 16));
		label_2.setBounds(400, 404, 112, 35);
		contentPane.add(label_2);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBackground(Color.white);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"-------------------Select Subject-------------------- ", "Computer Network", "Computer Organizations", "Algorithms","Big Data", "Set","Data Structure","Digital Logic Design","Graph Theory","Operating System","Database Management System"}));
		comboBox_2.setFont(new Font("Verdana", Font.PLAIN, 12));
		comboBox_2.setBounds(550, 400, 314, 35);
		contentPane.add(comboBox_2);
		
		JButton button = new JButton("Start Quiz");
		//button.setBackground(new Color(255, 228, 225));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(comboBox.getSelectedItem().toString()=="Computer Science Engineering")
				{
					if(comboBox_1.getSelectedItem().toString()=="First Year" ||comboBox_1.getSelectedItem().toString()=="Second Year" ||comboBox_1.getSelectedItem().toString()=="Third Year")
					{
						if(comboBox_2.getSelectedItem().toString()=="Algorithms")
						{
							dispose();
							Chapter c=new Chapter();
							
							c.setVisible(true);
							c.setExtendedState(c.getExtendedState() | JFrame.MAXIMIZED_BOTH);
						}
						if(comboBox_2.getSelectedItem().toString()=="Set")
						{
							dispose();
							javaprojectset s=new javaprojectset();
							
							s.javaproject();
							s.setVisible(true);
							s.setExtendedState(s.getExtendedState() | JFrame.MAXIMIZED_BOTH);
						}
						if(comboBox_2.getSelectedItem().toString()=="Big Data")
						{
							dispose();
							Chapter5 c5=new Chapter5();
							
							c5.setVisible(true);
							c5.setExtendedState(c5.getExtendedState() | JFrame.MAXIMIZED_BOTH);
						}
						if(comboBox_2.getSelectedItem().toString()=="Computer Organizations")
						{
							dispose();
							Chapter4 c4=new Chapter4();
							c4.setVisible(true);
							c4.setExtendedState(c4.getExtendedState() | JFrame.MAXIMIZED_BOTH);
						}
						if(comboBox_2.getSelectedItem().toString()=="Computer Network")
						{
							dispose();
							Chapter3 c3=new Chapter3();
							c3.setVisible(true);
							c3.setExtendedState(c3.getExtendedState() | JFrame.MAXIMIZED_BOTH);
						}
						if(comboBox_2.getSelectedItem().toString()=="Database Management System")
						{
							dispose();
							Chapter2 c2=new Chapter2();
							c2.setVisible(true);
							c2.setExtendedState(c2.getExtendedState() | JFrame.MAXIMIZED_BOTH);
						}
						if(comboBox_2.getSelectedItem().toString()=="Data Structure")
						{
							dispose();
							DS1 d=new DS1();
							d.setVisible(true);
							d.setExtendedState(d.getExtendedState() | JFrame.MAXIMIZED_BOTH);
						}
						if(comboBox_2.getSelectedItem().toString()=="Digital Logic Design")
						{
							dispose();
							DL1 d2=new DL1();
							d2.setVisible(true);
							d2.setExtendedState(d2.getExtendedState() | JFrame.MAXIMIZED_BOTH);
						}
						if(comboBox_2.getSelectedItem().toString()=="Graph Theory")
						{
							dispose();
							GT1 g=new GT1();
							g.setVisible(true);
							g.setExtendedState(g.getExtendedState() | JFrame.MAXIMIZED_BOTH);
						}
						if(comboBox_2.getSelectedItem().toString()=="Operating System")
						{
							dispose();
							OS1 o=new OS1();
							o.setVisible(true);
							o.setExtendedState(o.getExtendedState() | JFrame.MAXIMIZED_BOTH);
						}
						
					
						
					}
					
						
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane,"Questions will be added soon");
					
				}
					
			}
		});
		button.setFont(new Font("Verdana", Font.BOLD, 15));
		button.setBounds(500, 470, 117, 33);
		contentPane.add(button);
		
		JButton button1 = new JButton("Exit");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
				
			}
		});
		button1.setFont(new Font("Verdana", Font.BOLD, 15));
		button1.setBounds(670, 470, 117, 33);
		contentPane.add(button1);
		
		JLabel l4 = new JLabel("");
		l4.setBackground(new Color(0, 0, 0));
		l4.setIcon(new ImageIcon("C:\\Users\\lenovo\\Desktop\\Java Practical\\Project\\images\\cne.jpg"));
		l4.setBounds(900,20, 500,100);
		contentPane.add(l4);
		
		JLabel l5 = new JLabel("");
		l5.setBackground(new Color(0, 0, 0));
		l5.setIcon(new ImageIcon("C:\\Users\\lenovo\\Desktop\\Java Practical\\Project\\images\\dbms.jpg"));
		l5.setBounds(1000,200, 500,150);
		contentPane.add(l5);
		
		JLabel l1 = new JLabel("");
		l1.setBackground(new Color(0, 0, 0));
		l1.setIcon(new ImageIcon("C:\\Users\\lenovo\\Desktop\\Java Practical\\Project\\images\\coa.jpg"));
		l1.setBounds(60,20, 500,150);
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("");
		l2.setBackground(new Color(0, 0, 0));
		l2.setIcon(new ImageIcon("C:\\Users\\lenovo\\Desktop\\Java Practical\\Project\\images\\big data.jpg"));
		l2.setBounds(480,20, 500,150);
		contentPane.add(l2);
		
		JLabel l3 = new JLabel("");
		l3.setBackground(new Color(0, 0, 0));
		l3.setIcon(new ImageIcon("C:\\Users\\lenovo\\Desktop\\Java Practical\\Project\\images\\os.jpg"));
		l3.setBounds(80,250, 500,150);
		contentPane.add(l3);
		
		JLabel l6 = new JLabel("");
		l6.setBackground(new Color(0, 0, 0));
		l6.setIcon(new ImageIcon("C:\\Users\\lenovo\\Desktop\\Java Practical\\Project\\images\\GT.png"));
		l6.setBounds(140,430, 500,250);
		contentPane.add(l6);
		
		JLabel l7 = new JLabel("");
		l7.setBackground(new Color(0, 0, 0));
		l7.setIcon(new ImageIcon("C:\\Users\\lenovo\\Desktop\\Java Practical\\Project\\images\\ds.jpg"));
		l7.setBounds(950,400, 500,150);
		contentPane.add(l7);
		
		JLabel l8 = new JLabel("");
		l8.setBackground(new Color(0, 0, 0));
		l8.setIcon(new ImageIcon("C:\\Users\\lenovo\\Desktop\\Java Practical\\Project\\images\\setsnew.jpg"));
		l8.setBounds(700,520, 500,150);
		contentPane.add(l8);
	}

}
