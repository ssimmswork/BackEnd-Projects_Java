package Exceptions;

import javax.swing.JFrame;

public class Pay {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Payroll");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new PayPanel());

		frame.pack();
		frame.setVisible(true);
	}

}
