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
    	ArrayList<String> shoppingCart = new ArrayList<>();
    	for(int index=0; index < skus.length(); index++) {
    		shoppingCart.add(skus.substring(index, index+1));
    		
    		return 1;
    	}
    	
    
    }
}

