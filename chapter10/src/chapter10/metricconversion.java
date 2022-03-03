/*

Program: metricconverison.java          Last Date of this Revision: February 22, 2022


Purpose: Create a MetricConversion application that allows the user to select a type of conversion from a combo box
and then the corresponding formula is displayed in a label.

Author: Chashampreet Teja, 
School: CHHS
Course: Computer Programming 30
 

*/
package chapter10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class metricconversion {

	private JFrame frame;
	private JTextField un1;
	
	int usernum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metricconversion window = new metricconversion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public metricconversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLUE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		un1 = new JTextField();
		un1.setBounds(231, 57, 136, 33);
		frame.getContentPane().add(un1);
		un1.setColumns(10);
		
		JLabel l0 = new JLabel("ENTER AN INTEGER");
		l0.setForeground(new Color(255, 255, 0));
		l0.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		l0.setBounds(53, 57, 183, 33);
		frame.getContentPane().add(l0);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JComboBox cb = new JComboBox();
		cb.setModel(new DefaultComboBoxModel(new String[] {"SELECT ONE", "INCHES TO CENTIMETER", "FEET TO METERS", "GALLON TO LITERS", "POUND TO KILOGRAM"}));
		cb.setToolTipText("SELECT CONVERSION METHOD");
		cb.setBounds(230, 118, 140, 30);
		panel.add(cb);
		
		JLabel l1 = new JLabel("SELECT CONVERSION TYPE");
		l1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		l1.setForeground(new Color(255, 255, 0));
		l1.setBounds(32, 126, 188, 22);
		panel.add(l1);
		
		JLabel l2 = new JLabel("CONVERTED NUMBER");
		l2.setForeground(new Color(255, 255, 0));
		l2.setFont(new Font("Trebuchet MS", Font.BOLD, 21));
		l2.setBackground(new Color(255, 255, 255));
		l2.setBounds(65, 199, 305, 30);
		panel.add(l2);
		
		JButton btn1 = new JButton("CONVERT");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					 double ITC =2.54; //set inches to centimeter value to 2.54 for conversion
				     double FTM =0.3048;//set feet to meters value to 0.3048 for conversion
				     double GTL=4.5461;//set gallons to liters value to 4.561 for conversion
				     double PTK=0.4536;//set pound to kilogram value to 0.4536 for conversion
				          
				          String user1 = un1.getText();//created a string to grab user input for further actions
				          
				          //if and else if statements to find if the expressions are true or false
				          
				          if((un1.getText().equals("")) || ((cb.getSelectedItem().equals("SELECT ONE"))))
				          {
				        	  String value=String.format("CHOOSE A CONVERSION TYPE"); //unable to get a conversion type to convert the integer 
				        	  l2.setText(value);
				              }
				              else if((un1.getText().equals("")))
					          {
					        	  String value=String.format("ENTER A NUMBER"); //no input integer given by the user for their conversion type
					        	  l2.setText(value);
					              }
					             else if(cb.getSelectedItem().equals("INCHES TO CENTIMETER")) //converting provided integer to inches to centimeter
						            {
							              double metric1 =Double.parseDouble(un1.getText());//storing value provided by the user by using double variable
							              double metric2 = ITC*metric1; //converting provided number into the selected conversion type
							              String value=String.format("%.2f",metric2);//only display up to  2 decimal points for the answer
							              l2.setText(value);//display final value in the label 
						                  }
						    	  	    	else if(cb.getSelectedItem().equals("FEET TO METERS"))
								            {
									              double metric1 =Double.parseDouble(un1.getText());
									              double metric2 = FTM*metric1;
									              String value=String.format("%.2f",metric2);
									              l2.setText(value);
									              }
							    	  	    	
						    	  	    	      else if(cb.getSelectedItem().equals("GALLON TO LITERS"))
									              {
										              double metric1 =Double.parseDouble(un1.getText());
										              double metric2 = GTL*metric1;
										              String value=String.format("%.2f",metric2);
										              l2.setText(value);
									                  }
						    	  	    	          else if(cb.getSelectedItem().equals("POUND TO KILOGRAM"))
									                  {
											              double metric1 =Double.parseDouble(un1.getText());
											              double metric2 = PTK*metric1;
											              String value=String.format("%.2f",metric2);
											              l2.setText(value);
										                  }
						      		               
						      		             
						      		       
						  
					             }
					                
				                
				              
				        
					            
					           
				
				
		        
				
			
		   });
		btn1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btn1.setBounds(145, 169, 131, 23);
		panel.add(btn1);							                                         
			
	
		
		
	}
}															
		 
		
			
			              
			          
			          
		
		
			
		
			
			
			
				  
			
				  
				 
			
	

