import javax.swing.*;
import java.awt.*;
public class textPrompt{
	public static void main(String[] args){
		JFrame theGUI = new JFrame();
		theGUI.setTitle("Title of Window");
		theGUI.setSize(400,600);
		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel1 = new JPanel();
		panel1.textPrompt("Hello?");
		Container pane = theGUI.getContentPane();
		pane.add(panel1);
		theGUI.setVisible(true);
	}
}