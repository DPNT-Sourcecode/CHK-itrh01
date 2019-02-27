package befaster.solutions.CHK;


import java.util.Collections;
import java.util.List;
import befaster.solutions.CHK.CheckoutSolution;

public class DiscountValue implements Checkout {

    private final Checkout baseCheckout;
    private final String discountedItem;
    private final int minimumAmount;
    private final int discountValue;

    public DiscountValue(Checkout base, String item, int min, int discount) {
         this.baseCheckout = base;
         this.discountedItem = item;
         this.minimumAmount = min;
         this.discountValue = discount;
    }

    @Override
    public int calculateTotal(List<String> shoppingCart) {
        int count = Collections.frequency(shoppingCart, discountedItem);
        // Integer division gives the number of times the discount is applied
        int discountedTotal = (count / minimumAmount) * discountValue;
       
        return discountedTotal;
    }
}