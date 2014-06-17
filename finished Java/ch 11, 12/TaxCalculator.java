import javax.swing.*;

import javax.swing.event.*;

import java.awt.*;

import java.text.DecimalFormat;


public class TaxCalculator extends JFrame

{

private JLabel l1, l2, l3;

private JTextField priceAmount;

private JTextField salesTax;
private JTextField salesTotal;

private JPanel ppanel;
private JPanel spanel;

private JPanel tpanel;

private JPanel sPanel;
private JSlider calSlider;


public TaxCalculator()
{
setTitle("Total Purchase Tax Calculator");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


l1 = new JLabel("Price Amount: ");
l2 = new JLabel("Sales Tax: ");

l3 = new JLabel("Total Sales:");
priceAmount = new JTextField("0.0", 10);

priceAmount.setEditable(true);


salesTax = new JTextField("0.0", 10);

salesTax.setEditable(false);
salesTotal = new JTextField("0.0", 10);
salesTotal.setEditable(false);


calSlider = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
calSlider.setMajorTickSpacing(1);
calSlider.setMinorTickSpacing(1);
calSlider.setPaintTicks(true);
calSlider.setPaintLabels(true);
calSlider.addChangeListener(new SliderListener());


 ppanel = new JPanel();

ppanel.add(l1);
ppanel.add(priceAmount);
spanel = new JPanel();
spanel.add(l2);

spanel.add(salesTax);
tpanel = new JPanel();
tpanel.add(l3);
tpanel.add(salesTotal);
sPanel = new JPanel();
sPanel.add(calSlider);


setLayout(new GridLayout(4, 1));
add(ppanel);

add(spanel);

add(tpanel);

add(sPanel);


pack();
setVisible(true);
}
private class SliderListener implements ChangeListener
{
public void stateChanged(ChangeEvent e)

{

double price, tax, total;
DecimalFormat fmt = new DecimalFormat("0.0");
price = Double.parseDouble(priceAmount.getText());
tax = calSlider.getValue();
total = price +price * (tax/100);
priceAmount.setText(Double.toString(price));
salesTax.setText(fmt.format(tax));
salesTotal.setText(fmt.format(total));
}
}
public static void main(String[] args)
{

new TaxCalculator();
}

}