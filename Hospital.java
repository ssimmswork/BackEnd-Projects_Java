
public class Hospital {

	public static void main(String[] args) {

		System.out.println("Hospital Employee Types \n");

		HospitalEmployee[] arry = new HospitalEmployee[4];

		arry[0] = new Doctor();
		arry[1] = new Nurse();
		arry[2] = new Surgeon();
		arry[3] = new Admin();

		for (HospitalEmployee i : arry) {
			if (i != null) {
				i.PrintStatement();
			}

		}

	}

}
