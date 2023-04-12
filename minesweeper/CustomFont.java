import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CustomFont extends JFrame {
    public CustomFont() {
        // Load the custom font
        Font customFont = null;
        try {
            customFont = Font.createFont(Font.TRUETYPE_FONT,
                    new File("C:/Java/Minesweeper/minesweeper/who asks satan.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
        }

        // Create a JLabel and set its font to the custom font
        JLabel label = new JLabel("Hello World");
        label.setFont(customFont);
        add(label);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CustomFontExample();
    }
}