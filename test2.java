import javax.swing.*;
class example extends JFrame
{
example()
{

JFrame f = new JFrame("ELANGKUMARAN");
JButton b1 = new JButton("ELANGO");
//b1.setBounds(150,200,200,50);
b1.setLabel("naem");
f.add(b1);
f.setSize(500,600);
f.setLayout(null);
f.setVisible(true);
}
}
class test2
{
public static void main(String arg[])
{
new example();
}
}


