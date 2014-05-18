import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Retail extends JFrame
{
private JPanel panel;
private JTextField wholeSale;
private JTextField markupPercentage;
private JLabel messageLabel;
private JButton myButton;
private final int WINDOW_WIDTH = 400;
private final int WINDOW_HEIGHT = 100;
public Retail()
{
super("Retail Price Calculator");
setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
buildPanel();
add(panel);
setVisible(true);
}
private void buildPanel()
{
wholeSale = new JTextField(10);
markupPercentage = new JTextField(10);
messageLabel = new JLabel("Enter wholesale and markup percentage");
myButton = new JButton("Calculate");
panel = new JPanel();
panel.add(messageLabel);
panel.add(wholeSale);
panel.add(markupPercentage);
panel.add(myButton);
myButton.addActionListener(new myButtonListener());
}
public static void main(String[] args)
{
new Retail();
}
private class myButtonListener implements ActionListener
{
double result;
public void actionPerformed(ActionEvent e)
{
result = Double.parseDouble(wholeSale.getText()) + Double.parseDouble(wholeSale.getText()) * (Double.parseDouble 
(markupPercentage.getText()) / 100);
messageLabel.setText(String.valueOf(result));
}
}
}
