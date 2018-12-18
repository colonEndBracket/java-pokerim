//Opens a Window when you say yes
import javax.swing.*;
public class showImageTest
{
	public static void main(String[] args)
	{
		JFrame window = new JFrame();
		window.setTitle("I'm a cat! lol");
		window.setSize(420,420);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(new JLabel(new ImageIcon("draugr.jpg")));
		
		window.setVisible(true);
	}
}