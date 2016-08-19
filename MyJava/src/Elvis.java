
public class Elvis {

	private static final Elvis sInstance = new Elvis();
	
	private Elvis(){}
	
	public static Elvis getInstance(){
		return sInstance;
	}
}
