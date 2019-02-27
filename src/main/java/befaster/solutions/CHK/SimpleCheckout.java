package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SimpleCheckout implements Checkout {

    private final Map<String, Integer> basePrice = new HashMap<>();

    public void addPrice(String item, Integer price) {
        basePrice.put(item, price);
    }

    @Override
    public int calculateTotal(List<String> shoppingCart) {
        // Your own code, very good use of Streams, here
        return shoppingCart.stream().mapToInt(basePrice::get).sum();
    }
}



