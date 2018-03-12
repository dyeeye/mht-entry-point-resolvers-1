package pl.profitonline.components;

public class ReflectionComponent {
	public Object emptyPayload() {
		return "This is a string";
	}
	
	public Object objectPayload(Object payload) {
		return new String[] {"Yet this is an array for object", payload.toString()};
	}
	
	public Object stringPayload(String payload) {
		return new String[] {"Yet this is an array for string", payload};
	}
	
}
