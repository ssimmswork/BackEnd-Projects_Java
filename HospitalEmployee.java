
public abstract class HospitalEmployee {

	String title;

	public HospitalEmployee(String title) {

		this.title = title;

	}

	public void PrintStatement() {

		System.out.println("Employee Type: " + title);

	}
}
