package pl.profitonline.components;

import java.util.HashMap;
import java.util.Map;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class SimpleComponent implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// do some usefull stuff
		Map<String, String> payload = new HashMap<String, String>();
		payload.put("Resolver", "Callable");
		
		return payload;
	}
	
	public Object onEmpty() {
		return "Non-callable method";
	}

}
