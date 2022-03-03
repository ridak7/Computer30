/*

Program: BreakAPlate.java          Last Date of this Revision: February 23, 2022

Purpose: Modify the BreakAPlate application to display a picture of the prize won rather than text naming the prize.
The tiger_plush.gif, sticker.gif, and placeholder.gif are supplied as data files for this text

Author: Chashampreet Teja, 
School: CHHS
Course: Computer Programming 30



*/
package chapter10;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.ImageIcon;



public class BreakAPlate 
{

	private JFrame frame;
	private boolean clicked;
	ImageIcon apl = new ImageIcon("..\\chapter10\\images\\plates_all_broken.gif");
	ImageIcon p2 = new ImageIcon("..\\\\chapter10\\\\images\\\\plates_two_broken.gif");
	ImageIcon i0 = new ImageIcon("..\\\\chapter10\\\\images\\\\placeholder.gif");
	ImageIcon sticker = new ImageIcon("..\\\\chapter10\\\\images\\\\sticker.gif");
	ImageIcon allPlates = new ImageIcon("..\\\\chapter10\\\\images\\\\plates.gif");
	ImageIcon tigerPlush =  new ImageIcon("..\\\\chapter10\\\\images\\\\tiger_plush.gif");
	
	/**
	 * Create the application.
	 */
	public BreakAPlate() 
	{
		initialize();
		clicked = true;
	}
	
	public boolean getClicked()
	{
		return clicked;
	}
	
	public void setClicked(boolean input)
	{
		clicked = input;
	}
	
	/**
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
					BreakAPlate window = new BreakAPlate();
					window.frame.setVisible(true);
				    }
			        catch (Exception e) 
				    {
			        	e.printStackTrace();
				        }
			}
		});
	}
    
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 153, 0));
		frame.setBounds(100, 100, 950, 632);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn = new JButton("PLAY");
		btn.setForeground(new Color(102, 153, 0));
		btn.setBackground(new Color(255, 255, 255));
		btn.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btn.setBounds(201, 294, 402, 42);
		frame.getContentPane().add(btn);
		
		JLabel titleLabel = new JLabel("BREAK THE PLATES");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setForeground(new Color(0, 153, 0));
		titleLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 43));
		titleLabel.setOpaque(true);
		titleLabel.setBackground(new Color(153, 255, 0));
		titleLabel.setBounds(93, 46, 586, 72);
		frame.getContentPane().add(titleLabel);
		
		JLabel plates = new JLabel(new ImageIcon("plates.gif"));
		plates.setBackground(new Color(153, 255, 0));
		plates.setForeground(SystemColor.activeCaption);
		plates.setOpaque(true);
		plates.setBounds(93,118,586,165);
		frame.getContentPane().add(plates);
		
		JLabel prize = new JLabel(new ImageIcon("placeholder.gif"));
		prize.setForeground(new Color(0, 128, 0));
		prize.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 48));
		prize.setText("");
		prize.setBackground(new Color(153, 255, 0));
		prize.setBounds(142,360,507,168);
		prize.setOpaque(true);
		frame.getContentPane().add(prize);
		
		JLabel p1 = new JLabel("New label");
		Image img1=new ImageIcon(this.getClass().getResource("/a2.png")).getImage() ;
		p1.setIcon(new ImageIcon(img1));
		p1.setBounds(93, 275, 98, 89);
		frame.getContentPane().add(p1);
		
		JLabel p3 = new JLabel("");
		Image img =new ImageIcon(this.getClass().getResource("/template.png")).getImage() ;
		p3.setIcon(new ImageIcon(img));
		p3.setBounds(713, 135, 161, 342);
		frame.getContentPane().add(p3);
		
		btn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{   
				//if statement to make the 
				if (getClicked() == true)
				{
					btn.setText("Play again");
					//randomize the plates
			        int plate1 = (int)(2 * Math.random() + 0); 
			        int plate2 = (int)(2 * Math.random() + 0);
			        int plate3 = (int)(2 * Math.random() + 0);
			        //if statement to display tigerPlush if three plates are broken
			        if (plate1 == plate2 && plate1 == plate3)
			        {
			        	plates.setIcon(apl);
			        	prize.setIcon(tigerPlush);
			        	btn.setText("Play again");
			            }
			            //else statement to display sticker if 2 plates are broken
			        	else
			        	{
			        		plates.setIcon(p2);
			        		prize.setIcon(sticker);
			        		btn.setText("Play again");
			        		}
			        
			        		setClicked(false);
							}	
				            //else statement to display nothing if no plates are broken
							else
						    {
								btn.setText("Play again");
								plates.setIcon(allPlates);
								prize.setIcon(i0);
								setClicked(true);
						    }
			}
		});				
	}
}












