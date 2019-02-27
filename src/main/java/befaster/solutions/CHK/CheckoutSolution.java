package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckoutSolution {
	
	private Set<CheckoutStrategy> strategies = new HashSet<>();

	public static Map<String, Integer> PRICE_MAP = new HashMap<>();

	static {
	    PRICE_MAP.put("A", 50);
	    PRICE_MAP.put("B", 30);
	    PRICE_MAP.put("C", 20);
	    PRICE_MAP.put("D", 15);
	}

    public Integer checkout(String skus) {
       
    	return 0;
    }
}
