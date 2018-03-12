package pl.profitonline.components;

public class StringComponent {
	private final static String TEXT = "This is a static text common for both methods";
	
	public Object makeSubstring() {
		return TEXT.substring(10);
	}
	
	public Object makeToUpperCase(){
		return TEXT.toUpperCase();
	}
}
