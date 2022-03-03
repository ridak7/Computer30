/*
Program: divisbleby3.java          Last Date of this Revision: February 20, 2022

Purpose: Create a DivisibleBy3 application that prompts the user for an integer and then displays a message when
Check is clicked indicating whether the number is divisible by 3

Author: Chashampreet Teja, 
School: CHHS
Course: Computer Programming 30
 
*/

package chapter10;

import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;

	public class divisbleby3 {

		private JFrame frame;
		private JTextField UserIn;
		 
		int userNum ;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						divisbleby3 window = new divisbleby3();
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
		public  divisbleby3() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.setBounds(100, 100, 460, 286);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBackground(Color.BLACK);
			
			panel.setBounds(10, 11, 424, 225);
			frame.getContentPane().add(panel);
			panel.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Enter an Interger:");
			lblNewLabel.setForeground(Color.RED);
			lblNewLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 23));
			
			lblNewLabel.setBounds(33, 24, 192, 33);
			panel.add(lblNewLabel);
			
			UserIn = new JTextField();
			UserIn.setBounds(217, 22, 123, 35);
			panel.add(UserIn);
			UserIn.setColumns(10);
			
			
			JLabel Final = new JLabel("Enter a number to check");
			Final.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 22));
			Final.setForeground(Color.RED);
			
			Final.setBounds(31, 146, 383, 35);
			panel.add(Final);
			
			JButton CheckButton = new JButton("Check divisiblity");
			CheckButton.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 21));
			CheckButton.addActionListener(new ActionListener() {
				
				
				public void actionPerformed(ActionEvent e) { //button
					String userIn = UserIn.getText();
					
					if (userIn != null && !userIn.trim().isEmpty()) 
					{ 
						  userNum = Integer.parseInt(userIn); //convert the users string to an integer 
						  
						  if (userNum % 3 == 0) 
						  	{
							 Final.setText("The number is divisible by 3");  // output this to user when the integer is divisible by 3
						  	}
						  		
						  		else
						  		{
						  		Final.setText("The number is not divisible by 3"); //output this to user when it is not divisible by three 
						  		}
						  
						  
					
						  
						 
					}
					
				
					
					
				}
			});
			
			CheckButton.setBounds(121, 85, 180, 35);
			panel.add(CheckButton);
			
			JLabel l1 = new JLabel("");
			Image img=new ImageIcon(this.getClass().getResource("/tt.jpeg")).getImage() ;
			l1.setIcon(new ImageIcon(img));
			l1.setBounds(21, 68, 90, 76);
			panel.add(l1);
			
			JLabel l2 = new JLabel("New label");
			Image img1=new ImageIcon(this.getClass().getResource("/tt.jpeg")).getImage() ;
			l2 .setIcon(new ImageIcon(img1));
		
			l2.setBounds(324, 68, 90, 76);
			panel.add(l2);
			
			
		}
	}



