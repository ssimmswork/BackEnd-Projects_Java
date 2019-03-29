
public class Lockable implements Lockablee {

	private int key, pass;
	private boolean locked;

	public void setKey(int key) {

		key = key;
		locked = true;
	}

	public void lock(int key) {

		if (key == pass) {

			locked = true;
		}
	}

	public void unlock(int key) {

		if (key == 10) {

			locked = false;
		}
	}

	public boolean locked() {

		return locked;
	}
}
