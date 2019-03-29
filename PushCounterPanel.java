package Exceptions;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PushCounterPanel extends JPanel {

	private int count;
	private JButton push;
	private JLabel label;

	// -----------------------------------------------------------------
	// Constructor: Sets up the GUI.
	// -----------------------------------------------------------------

	public PushCounterPanel() {
		count = 0;

		push = new JButton("Add Two");
		push.addActionListener(new ButtonListener());

		label = new JLabel("Total = " + count);

		add(push);
		add(label);

		setBackground(Color.LIGHT_GRAY);
		setPreferredSize(new Dimension(100, 300));
	}

	// *****************************************************************
	// Represents a listener for button push (action) events.
	// *****************************************************************

	private class ButtonListener implements ActionListener {
		// --------------------------------------------------------------
		// Updates the counter and label when the button is pushed.
		// --------------------------------------------------------------

		public void actionPerformed(ActionEvent event) {
			count+=2;
			label.setText("Total = " + count);
		}
	}
}
