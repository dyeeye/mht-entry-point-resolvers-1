package pl.profitonline.components;

import java.util.HashMap;
import java.util.Map;


public class MultiMethodsComponent {

	public Object performSimpleCall() {
		// do some usefull stuff
		Map<String, String> payload = new HashMap<String, String>();
		payload.put("Resolver", "Property");
				
		return payload;
	}
	
	public Object performComplexCall() {
		// do some usefull stuff
		Map<String, Object> payload = new HashMap<String, Object>();
		payload.put("Resolver", "Property");
		payload.put("Complex", new Object[4]);
				
		return payload;
	}

}
