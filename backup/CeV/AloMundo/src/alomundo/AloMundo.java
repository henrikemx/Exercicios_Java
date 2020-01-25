import javax.swing.*;
public class HelloWorld extends JFrame
{
public static void main(String[] args)
{
new HelloWorld();
}
public HelloWorld()
{
JPanel panel1 = new JPanel();
JLabel label1 = new JLabel("Olá, Mundo, este é o meu primeiro programa Java no Ubuntu Linux");
panel1.add(label1);
this.add(panel1);
this.setTitle("Olá Mundo");
this.setSize(500,200);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setVisible(true);
}
}