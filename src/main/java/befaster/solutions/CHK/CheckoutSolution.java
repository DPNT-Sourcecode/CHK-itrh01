package befaster.solutions.CHK;

import java.util.ArrayList;

public class CheckoutSolution {
	
    public static Integer checkout(String skus) {
    	
    	CheckoutBalance pricing = new CheckoutBalance();
    	pricing.addPrice("A", 50);
    	pricing.addPrice("B", 30);
    	pricing.addPrice("C", 20);
    	pricing.addPrice("D", 15);
    	
    	
    	// Apply discounted offers
    	pricing.addDiscount("A", new DiscountValue( "A", 3, 130, 50)); 
    	pricing.addDiscount("B",new DiscountValue("B", 2, 45, 30)); 
    	
    	ArrayList<String> shoppingCart = new ArrayList<>();
    	for(int index=0; index < skus.length(); index++) {
    		shoppingCart.add(skus.substring(index, index+1));	
    	}
    	
    	return pricing.calculateTotal(shoppingCart);
    }
}
