package befaster.solutions.CHK;


import java.util.Collections;
import java.util.List;
import befaster.solutions.CHK.CheckoutSolution;

public class DiscountValue {

    private final String discountedItem;
    private final int minimumAmount;
    private final int discountPrice;
    private final int basePrice;
       
    public DiscountValue(String item, int min, int discount, int basePrice) {
         this.discountedItem = item;
         this.minimumAmount = min;
         this.discountPrice = discount;
         this.basePrice = basePrice;
    }

    public int calculateTotal(List<String> shoppingCart) {
        int count = Collections.frequency(shoppingCart, discountedItem);
        // Integer division gives the number of times the discount is applied
        int discountedTotal = (count / minimumAmount) * discountPrice;
        discountedTotal+= (count % minimumAmount)*basePrice;
       
        return discountedTotal;
    }
}