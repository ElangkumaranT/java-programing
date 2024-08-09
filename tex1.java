import javax.swing.*;
import java.awt.*;
class tex extends JFrame
{
JLabel l1;
tex()
{
JFrame f = new JFrame("projext 1");
JTextArea t1 = new JTextArea();
//t1.setBound(150,200,200,50);
l1 = new JLabel("name");
JButton b1 = new JButton("sub");
//b1.setBound(180,230,230,80);
f.setSize(300,400);
f.add(t1);
f.add(b1);
f.setLayout(null);
f.setVisible(true);
}
}
class tex1
{
public static void main(String arg[])
{
new tex();
}
}