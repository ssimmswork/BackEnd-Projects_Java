package Exceptions;

import javax.swing.JFrame;

public class PushCounter {
	// -----------------------------------------------------------------
	// Creates and displays the main program frame.
	// -----------------------------------------------------------------
	public static void main(String[] args) {
		JFrame frame = new JFrame("Pushes x Two");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		PushCounterPanel panel = new PushCounterPanel();
		frame.getContentPane().add(panel);

		frame.pack();
		frame.setVisible(true);
	}
}
