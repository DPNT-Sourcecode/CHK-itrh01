package befaster.solutions.CHK;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckoutSolution {
	
    public Integer checkout(String skus) {
    	
    	Checkout pricing = new SimpleCheckout();
    	pricing.addPrice("A", new Integer(50));
    	pricing.addPrice("B", new Integer(30));
    	
    	
    	ArrayList<String> shoppingCart = new ArrayList<>();
    	for(int index=0; index < skus.length(); index++) {
    		shoppingCart.add(skus.substring(index, index+1));	
    	}
    	return 0;
    
    }
}



