package Exceptions;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PayPanel extends JPanel {

	
		private JComboBox payTypes;
		private JButton calcButton;
		private JTextField hrs, bns, rte;
		private JLabel hours, rate, bonus, pay;
		private double totalPay;
		private int i;


		public PayPanel() {
			
			String[] types = { "Make A Selection...", "Salaried", "Hourly", "Volunteer" };

			payTypes = new JComboBox(types);
			hours = new JLabel("Hours:");
			hrs = new JTextField(3);
			bonus = new JLabel("Weekly Bouns:");
			bns = new JTextField(7);
			rate = new JLabel("Pay Rate:");
			rte = new JTextField(5);
			
			calcButton = new JButton("Calc");

			setPreferredSize(new Dimension(400, 100));
			setBackground(Color.cyan);

			add(payTypes);
			payTypes.addActionListener(new PayListener());
			
			add(hours).setVisible(false);
			add(hrs).setVisible(false);
			add(rate).setVisible(false);
			add(rte).setVisible(false);
			add(bonus).setVisible(false);
			add(bns).setVisible(false);
						
			add(calcButton).setVisible(false);
			calcButton.addActionListener(new CalcListener());
			

		}

		private class PayListener implements ActionListener {

			public void actionPerformed(ActionEvent event) {
				
				i = payTypes.getSelectedIndex();
			
				switch (i) {
				case 0:
					break;
				case 1:
					hours.setVisible(false);
					hrs.setVisible(false);
					rate.setVisible(false);
					rte.setVisible(false);
					bonus.setVisible(true);
					bns.setVisible(true);
					calcButton.setVisible(true);
					break;
				case 2:
					bonus.setVisible(false);
					bns.setVisible(false);
					hours.setVisible(true);
					hrs.setVisible(true);
					rate.setVisible(true);
					rte.setVisible(true);
					calcButton.setVisible(true);
					break;
				case 3:
					bonus.setVisible(false);
					bns.setVisible(false);
					hours.setVisible(false);
					hrs.setVisible(false);
					rate.setVisible(false);
					rte.setVisible(false);
					calcButton.setVisible(true);
					break;
				}
			}

		}
		
		private class CalcListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {

				i = payTypes.getSelectedIndex();
				switch (i) {
				case 0:
					JOptionPane.showMessageDialog(null, "Please select a employment type");
					break;
				case 1:
					String b = bns.getText();
					double bn = Double.parseDouble(b);
					totalPay = 2000 + bn;
					break;
				case 2:
					String h = bns.getText();
					double hr = Double.parseDouble(h);
					String r = rte.getText();
					double rt = Double.parseDouble(r);
					totalPay = hr * rt;
					break;
				case 3:
					totalPay = 0;
					break;

				}

				pay = new JLabel("Total: " + totalPay);
				add(pay);
			}

		}

		
	}

