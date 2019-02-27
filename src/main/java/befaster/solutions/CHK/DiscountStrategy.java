package befaster.solutions.CHK;


import java.util.List;
import befaster.solutions.CHK.CheckoutSolution;

public class DiscountStrategy implements CheckoutStrategy {

@Override
public void calculateTotal(List<String> items, double[] result) {
    ItemCounter counter = items.stream().collect(ItemCounter::new, ItemCounter::accept, ItemCounter::combine);

    double appleDiscount = (counter.counts[ItemCounter.APPLE_INDEX] / 2) * CheckoutSolution.PRICE_MAP.get("Apple");
    double orangeDiscount = (counter.counts[ItemCounter.ORANGE_INDEX] / 3) * CheckoutSolution.PRICE_MAP.get("Orange");

    result[0] -= orangeDiscount;
    result[0] -= appleDiscount;
}

class ItemCounter {
    static final int APPLE_INDEX = 0;
    static final int ORANGE_INDEX = 1;
    private int[] counts = new int[2];

    public void accept(String item) {
        switch (item) {
            case "Apple":
                counts[APPLE_INDEX]++;
                break;

            case "Orange":
                counts[ORANGE_INDEX]++;
                break;
        }
    }

    public void combine(ItemCounter other) {
        this.counts[APPLE_INDEX] += other.getCounts()[APPLE_INDEX];
        this.counts[APPLE_INDEX] += other.getCounts()[ORANGE_INDEX];
    }

    public int[] getCounts() {
        return counts;
    }
    }

 }
