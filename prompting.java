import javax.swing.JOptionPane;
public class prompting
{
	public static void main(String[] args)
	{
		//HELLO IS THIS COMMITED
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

		int n = JOptionPane.showOptionDialog(null,
		    "A Draugr stands in thine way! What doth thee do?",
		    "ROLE PLAYING GAME",
		    JOptionPane.DEFAULT_OPTION,
		    JOptionPane.QUESTION_MESSAGE,
		    null,
		    actions,
		    actions[0]);

		JOptionPane.showMessageDialog(null,"You choose: " + actions[n], "ROLE PLAYING GAME", JOptionPane.PLAIN_MESSAGE);
	}
}