package minesweeper;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameEndMessagePanel extends JPanel {
	private static final long serialVersionUID = 1L;  // to prevent serial warning
   
    // Buttons to allow the player to restart the game or exit the game
	JButton reset = new JButton("Restart");
	JButton exit = new JButton("Exit");
   
    // Constructor 
    public GameEndMessagePanel(boolean win, JPanel panel) {
	    JPanel message = new JPanel();
		
		// To determine which message to show based on whether the player has won
		
		// Message for winning the game
		if (win) {
			JFrame winFrame = new JFrame("Congratulations!");
			winFrame.setSize(260, 150);
			JLabel winLabel = new JLabel("You win!", SwingConstants.CENTER);
			
			winLabel.setFont(new Font("Helvetica Bold", Font.BOLD, 40)); // Change font size and style
			winLabel.setForeground(Color.BLUE); // Change font color
			
			message.add(winLabel);
			winFrame.getContentPane().add(message);

			// The message will appear at the centre of GameBoardPanel 
			winFrame.setLocationRelativeTo(panel);
			winFrame.setVisible(true);
			
		// Message for losing the game 	
		} else {
			JFrame loseFrame = new JFrame("Game Over!");
			loseFrame.setSize(260, 150);			
			JLabel loseLabel = new JLabel("You Lose!", SwingConstants.CENTER);
			
			loseLabel.setFont(new Font("Helvetica Bold", Font.BOLD, 40)); // Change font size and style
			loseLabel.setForeground(Color.RED); // Change font color
			
			message.add(loseLabel);
			loseFrame.getContentPane().add(message);
			
			// The message will appear at the centre of GameBoardPanel
			loseFrame.setLocationRelativeTo(panel);
			loseFrame.setVisible(true);
		}
		
		// To add the buttons to the panel 
		message.add(reset, BorderLayout.SOUTH);
		message.add(exit, BorderLayout.SOUTH);
		
		// Reset button creates a new 
		reset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MineSweeperMain newGame = new MineSweeperMain();
			}
		});
		
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
} 
   
   