import javax.swing.*;
public class Sum extends JFrame
{
public Sum()
{
super("A Simple Window");
JFrame window = new JFrame("A Simple Window");
final int WINDOW_WIDTH = 350, WINDOW_HEIGHT = 250;
setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
int val = 5;
int x = 0;
int tot = 0;
while(x <= val)
{
tot += x;
x += 1;
}
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}