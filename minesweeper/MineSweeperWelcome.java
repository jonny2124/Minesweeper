package minesweeper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MineSweeperWelcome extends JFrame {
    private static final long serialVersionUID = 1L; // to prevent serial warning

    private JButton startButton = new JButton("Start Game");
    private Music bgMusic;

    public MineSweeperWelcome() {
        bgMusic = new Music("C:/Java/Minesweeper/minesweeper/Minesweeper Music.wav");
        bgMusic.play();

        Container cp = this.getContentPane(); // JFrame's content-pane
        cp.setLayout(new BorderLayout()); // in 10x10 GridLayout

        JLabel title = new JLabel("Welcome to Minesweeper");
        title.setFont(new Font("Helvetica Bold", Font.BOLD, 24));
        title.setHorizontalAlignment(JLabel.CENTER);
        cp.add(title, BorderLayout.NORTH);

        JLabel taunt = new JLabel("Are you prepared to die??");
        taunt.setForeground(Color.RED);
        taunt.setFont(new Font("Chiller", Font.BOLD, 18));
        taunt.setHorizontalAlignment(JLabel.CENTER);
        cp.add(taunt, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(startButton);
        cp.add(buttonPanel, BorderLayout.SOUTH);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false); // Hide the welcome screen
                new MineSweeperMain(); // Show the game window
            }
        });

        pack(); // Pack the UI components, instead of setSize()
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // handle window-close button
        setTitle("Minesweeper");
        setLocationRelativeTo(null); // Center the window on the screen
        setVisible(true); // show it
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MineSweeperWelcome();
            }
        });
    }
}