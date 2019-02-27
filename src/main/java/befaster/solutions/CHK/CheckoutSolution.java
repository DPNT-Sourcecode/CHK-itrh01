package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckoutSolution {
	
	private Set<CheckoutStrategy> strategies = new HashSet<>();

	public static Map<String, Double> PRICE_MAP = new HashMap<>();

	static {
	    PRICE_MAP.put("Orange", 0.25);
	    PRICE_MAP.put("Apple", 0.6);
	}

    public Integer checkout(String skus) {
       
    	return 0;
    }
}


