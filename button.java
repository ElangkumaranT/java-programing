import java.awt.*;
import javax.swing.*;
import java.util.*;
class button extends JFrame
{
JFrame f;
JLabel l1;
button()
{
f = new JFrame("elango kumaram");
l1 = new JLabel("lable 1");
f.add(l1);
f.setLayout(new GridLayout(2,2,3,3));
f.pack();
f.setVisible(true);
}
public static void main(String ar[])
{
new test();
}
}

