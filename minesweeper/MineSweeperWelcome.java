package minesweeper;

import java.awt.*; // Use AWT's Layout Manager
import java.awt.event.*;
import javax.swing.*; // Use Swing's Containers and Components

public class MineSweeperWelcome extends JDialog {
    private JTextFields playerNameField;
    private JButton startButton;

    public MinesweeperWelcomeScreen(JFrame parent) {
        super(parent, "Welcome to Minesweeper!", true);

        // Create a panel to hold the UI elements
        JPanel welcomePanel = new JPanel();
        welcomePanel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Add a welcome message to the panel
        JLabel welcomeLabel = new JLabel("Welcome to Minesweeper!");
        welcomeLabel.setFont(new Font("Helvetica Bold", Font.BOLD, 40)); // Change font size and style
        welcomeLabel.setForeground(Color.BLUE); // Change font color
        welcomeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        welcomePanel.add(welcomeLabel);

        // Add a field for the player to enter their name
        JLabel nameLabel = new JLabel("Enter your name:");
        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        JTextFields playerNameField = new JTextField();
        JTextFields playerNameField.setAlignmentX(Component.CENTER_ALIGNMENT);
        welcomePanel.add(nameLabel);
        welcomePanel.add(JTextFields playerNameField);

        // Add a button to start the game
        startButton = new JButton("Start!");
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Start the game with the player's name
                String playerName = playerNameField.getText();
                startGame(playerName);
            }
        });
        welcomePanel.add(startButton);

        // Add the panel to the dialog
        add(welcomePanel);
        pack();
        setLocationRelativeTo(null); // Center the dialog on the screen
    }

    private void startGame(String playerName) {
        // Start the game with the given player name
        // ...
        dispose(); // Close the welcome screen
    }
}