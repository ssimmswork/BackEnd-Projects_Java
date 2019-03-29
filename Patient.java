
import javax.swing.JOptionPane;

public class Patient {

	public static void main(String[] args) {

		double clam, bill = 0;
		String lastName = "", firstName = "";

		while (true) {

			lastName = JOptionPane.showInputDialog(" Patient last name or Enter -1 to exit: ");

			if (lastName.compareTo("-1") != 0) {

				firstName = JOptionPane.showInputDialog("Patient first name: ");

				String claimAmount = JOptionPane.showInputDialog("Enter claim amount: ");
				double billing = Double.parseDouble(claimAmount);

				String billingOption = JOptionPane.showInputDialog("Enter billing option (1 or 2): ");
				int option = Integer.parseInt(billingOption);

				if (billingOption.equals(1)) {

					bill = Patient.calcBillDeduct(billing);
				}

				if (billingOption.equals(2)) {
					bill = Patient.calcBillMed(billing);
				}
			} else {
				break;
			}
		}

		Patient.displayTitle();
		JOptionPane.showMessageDialog(null,
				"\n" + "Name: " + adjustName(firstName) + "\t" + adjustName(lastName) + "\n Bill: " + bill);

	}

	public static void displayTitle() {

		JOptionPane.showMessageDialog(null, "Patient Billing");

	}

	public static String adjustName(String name) {

		return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
	}

	public static double calcBillDeduct(double bill) {

		return (bill - 50) * 0.8;
	}

	public static double calcBillMed(double billing) {

		return billing * .35;

	}

}
