
public interface Lockablee {

	public void setKey(int key);
	public void lock(int key);
	public void unlock(int key);
	public boolean locked();

}
