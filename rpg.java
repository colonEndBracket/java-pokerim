import java.util.Scanner;
import javax.swing.*;

public class rpg
{
	public static void main(String[] args)
	{
		//Display enemy
		JFrame window = new JFrame();
		window.setTitle("I'm a cat! lol");
		window.setSize(420,420);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(new JLabel(new ImageIcon("draugr.jpg")));
		
		window.setVisible(true);

		//Input Sequence
		System.out.println("A Draugr stands in your way!");

		Scanner cmd = new Scanner (System.in);

		String action;

		System.out.print("Do you slay the draugr? (y/n): ");
		action = cmd.nextLine();

		if ( action.equals("y") )
		{
			System.out.println("YESSSSSSSSS");
		}
		else if ( action.equals("n") )
		{
			System.out.println("you chose NO");
		}
		else{
			System.out.println("Sorry mate I couldn't understand you");
		}
		//Display User Input
		System.out.println(action);
	}
}