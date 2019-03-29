import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class test extends JPanel {
	private final JButton btnNewButton_2 = new JButton("New button");

	/**
	 * Create the panel.
	 */
	public test() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JTextPane textPane = new JTextPane();
		add(textPane);
		
		JTextArea textArea = new JTextArea();
		add(textArea);
		
		JButton btnNewButton_1 = new JButton("New button");
		add(btnNewButton_1);
		add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("New button");
		add(btnNewButton);

	}

}
