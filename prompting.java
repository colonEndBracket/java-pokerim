import javax.swing.*;
public class prompting
{
	public static void main(String[] args)
	{
		/**
		JOptionPane.showMessageDialog(null,"Hello there");
		String answer = JOptionPane.showInputDialog("A Draugr stands in yer way! Waht do ye do???");
		JOptionPane.showMessageDialog(null, answer);
		**/
		/**
		String[] buttons = { "Yes", "Yes to all", "No", "Cancel" };    
		int returnValue = JOptionPane.showOptionDialog(null, "Narrative", "Narrative", JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[i]);
		System.out.println(returnValue);
		**/
		Object[] actions = {"Attack", "Inspect", "Speak", "Flee"};

		ImageIcon icon = new ImageIcon("Draugr.jpg");

		int n = JOptionPane.showOptionDialog(null,
		    "A Draugr stands in thine way! What doth thee do?",
		    "ROLE PLAYING GAME",
		    JOptionPane.DEFAULT_OPTION,
		    JOptionPane.QUESTION_MESSAGE,
		    icon,
		    actions,
		    actions[0]);

		player("Defense");

		JOptionPane.showMessageDialog(null,"You choose: " + actions[n], "ROLE PLAYING GAME", JOptionPane.PLAIN_MESSAGE);
	}
	public static void player(String stat){
		Object[] actions;
		int n;
		System.out.println("You want to check the "+actions[n]+" option.");
	}
}