import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
public class taxCalc extends JFrame
{
private JLabel messageLabel;
private JPanel panel;
private JTextField wholeSale;
private final int WINDOW_WIDTH = 400;
private final int WINDOW_HEIGHT = 100;
JSlider slider1 = new JSlider(JSlider.HORIZONTAL, 0, 10, 5);
public taxCalc()
{
super("Tax Calculator");
setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
calSlider.addChangeListener(new SliderListener());


sliderPanel = new JPanel();
sliderPanel.add(slider1);
buildPanel();
add(panel);
setVisible(true);
}
private void buildPanel()
{
wholeSale = new JTextField(10);
messageLabel = new JLabel("Enter the price and select the tax percentage.");
panel = new JPanel();
panel.add(messageLabel);
panel.add(wholeSale);
slider1.setMinorTickSpacing(1);
slider1.setMajorTickSpacing(5);
slider1.setPaintTicks(true);
slider1.setPaintLabels(true);
}
public static void main(String[] args)
{
new TaxCalc();
}
private class SliderListener implements ChangeListener
    
{
        
public void stateChanged(ChangeEvent e)
        
{
            
double price, tax, total;
           
DecimalFormat fmt = new DecimalFormat("0.0");

           
price = Double.parseDouble(priceAmount.getText());
           
tax = calSlider.getValue();
            
total = price * (tax/100);

            
priceAmount.setText(Double.toString(price));
            
salesTax.setText(fmt.format(tax));
            
salesTotal.setText(fmt.format(total));


}
    
}
}