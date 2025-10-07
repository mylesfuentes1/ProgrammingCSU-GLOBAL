import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class InterfaceExamples extends JFrame implements ActionListener {

    private JTextArea textArea;
    private JMenuItem showDateTimeItem, writeToFileItem, changeColorItem, exitItem;
    private JPanel mainPanel; // Background changes here
    private Color randomGreenHue;

    public InterfaceExamples() {
        // Frame setup
        setTitle("Interface Examples");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Main panel - this is where the background color will change
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        add(mainPanel, BorderLayout.CENTER);

        // Create a sub-panel for the text area so it doesn't cover entire window
        JPanel textPanel = new JPanel(new BorderLayout());
        textPanel.setPreferredSize(new Dimension(500, 120)); // smaller section
        textPanel.setBackground(Color.WHITE);

        // Text area setup
        textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(textArea);
        textPanel.add(scrollPane, BorderLayout.CENTER);

        // Add sub-panel to main panel
        mainPanel.add(textPanel, BorderLayout.SOUTH);

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Options");

        // Menu items
        showDateTimeItem = new JMenuItem("Show Date and Time");
        writeToFileItem = new JMenuItem("Write to log.txt");
        changeColorItem = new JMenuItem("Change Background to Random Green Hue");
        exitItem = new JMenuItem("Exit");

        // Add items to menu
        menu.add(showDateTimeItem);
        menu.add(writeToFileItem);
        menu.add(changeColorItem);
        menu.add(exitItem);
        menuBar.add(menu);
        setJMenuBar(menuBar);

        // Add listeners
        showDateTimeItem.addActionListener(this);
        writeToFileItem.addActionListener(this);
        changeColorItem.addActionListener(this);
        exitItem.addActionListener(this);

        // Generate one random green hue
        randomGreenHue = generateRandomGreenHue();
    }

    private Color generateRandomGreenHue() {
        Random rand = new Random();
        int r = rand.nextInt(50);
        int g = 150 + rand.nextInt(106);
        int b = rand.nextInt(50);
        return new Color(r, g, b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == showDateTimeItem) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String dateTime = LocalDateTime.now().format(formatter);
            textArea.append("Current Date and Time: " + dateTime + "\n");

        } else if (source == writeToFileItem) {
            try (FileWriter writer = new FileWriter("log.txt", true)) {
                writer.write(textArea.getText() + "\n");
                JOptionPane.showMessageDialog(this, "Text written to log.txt");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error writing to file: " + ex.getMessage());
            }

        } else if (source == changeColorItem) {
            mainPanel.setBackground(randomGreenHue);
            mainPanel.repaint();
            textArea.append("Background changed to hue: " + colorToHex(randomGreenHue) + "\n");

        } else if (source == exitItem) {
            System.exit(0);
        }
    }

    private String colorToHex(Color color) {
        return String.format("#%02X%02X%02X", color.getRed(), color.getGreen(), color.getBlue());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InterfaceExamples frame = new InterfaceExamples();
            frame.setVisible(true);
        });
    }
}

