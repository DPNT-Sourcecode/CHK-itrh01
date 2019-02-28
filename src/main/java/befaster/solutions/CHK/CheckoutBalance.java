package befaster.solutions.CHK;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class CheckoutBalance implements Checkout {

    private final Map<String, Integer> basePrice = new HashMap<>();
    
    private Map<String,DiscountValue> discounts = new HashMap<>();

    public void addDiscount(String item,  DiscountValue discount) {
    	discounts.put(item, discount);
    }

    @Override
    public void addPrice(String item, Integer price) {
        basePrice.put(item, price);
    }

    @Override
    public int getPrice(String item) {
       return basePrice.get(item);
    }
    
    @Override
    public int calculateTotal(List<String> shoppingCart) {
    	ArrayList<String> itemProcessed = new ArrayList<>();
    	int discountedTotalBalance = 0;
    	int normalPriceTotalBalance = 0;
    	
    	for(String item :shoppingCart) {
    		if(discounts.containsKey(item)) {
    			if(!itemProcessed.contains(item)) {
    				itemProcessed.add(item);
    				discountedTotalBalance += discounts.get(item).calculateTotal(shoppingCart);
    			}
    		}
    		else if(!itemProcessed.contains(item)){ 
    			int count = Collections.frequency(shoppingCart, item);
    			if(basePrice.get(item)!=null) {
    				normalPriceTotalBalance += count * basePrice.get(item);
    				itemProcessed.add(item);
    			}
    		}
    	}
    	
    	if((normalPriceTotalBalance+discountedTotalBalance)!=0)
    		return (normalPriceTotalBalance+discountedTotalBalance);
    	else 
    		return -1;
    }
}


