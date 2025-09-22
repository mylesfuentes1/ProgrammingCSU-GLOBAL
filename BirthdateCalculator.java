import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.Period;


public class BirthdateCalculator extends JFrame implements ActionListener {

private JTextField birthYearField, birthMonthField, birthDayField;
private JButton calcButton;
private JLabel resultLabel;
private JPanel panel;

public BirthdateCalculator() {
	//Frame
	setTitle("BirthDate Calculator");
	setSize(350, 200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//Panel
	panel = new JPanel();
	panel.setLayout(new GridLayout(5,2,5,5));
	
	//input fields
	panel.add(new JLabel("Birth Year (YYYY): "));
	birthYearField = new JTextField();
	panel.add(birthYearField);
	
	panel.add(new JLabel("Birth Day (DD):"));
	birthDayField = new JTextField();
	panel.add(birthDayField);
	
	panel.add(new JLabel("Birth Month (MM):"));
	birthMonthField = new JTextField();
	panel.add(birthMonthField);
	
	//Button
	calcButton = new JButton("Calculate Age");
	calcButton.addActionListener(this);
	panel.add(calcButton);
	
	//Result Label
	resultLabel = new JLabel("Your age will appear here");
	panel.add(resultLabel);
	
	//Add panel to frame
	add(panel);
	
	setVisible(true);
	
	

}



public void actionPerformed(ActionEvent e) {
	try {
		int year = Integer.parseInt(birthYearField.getText());
		int month = Integer.parseInt(birthMonthField.getText());
		int day = Integer.parseInt(birthDayField.getText());
		
		LocalDate birthDate = LocalDate.of(year,  month, day);
		LocalDate currentDate = LocalDate.now();
		
		if (birthDate.isAfter(currentDate)) {
			resultLabel.setText("Invalid date (in furture)!");
		} else {
			int age = Period.between(birthDate, currentDate).getYears();
			resultLabel.setText("You are" + age + "years old.");
		}
	} catch (Exception ex) {
		resultLabel.setText("Invalid input! Use numbers only.");
	}
	
	}
	


public static void main(String[] args) {
	new BirthdateCalculator();
}

}
