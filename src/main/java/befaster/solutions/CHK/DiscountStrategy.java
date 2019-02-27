package befaster.solutions.CHK;


import java.util.List;
import befaster.solutions.CHK.CheckoutSolution;

public class DiscountStrategy implements CheckoutStrategy {

@Override
public void calculateTotal(List<String> items, double[] result) {
    ItemCounter counter = items.stream().collect(ItemCounter::new, ItemCounter::accept, ItemCounter::combine);

    double appleDiscount = (counter.counts[ItemCounter.A_INDEX] / 2) * CheckoutSolution.PRICE_MAP.get("A");
    double orangeDiscount = (counter.counts[ItemCounter.B_INDEX] / 3) * CheckoutSolution.PRICE_MAP.get("B");

    result[0] -= orangeDiscount;
    result[0] -= appleDiscount;
}

class ItemCounter {
    static final int A_INDEX = 0;
    static final int B_INDEX = 1;
    private int[] counts = new int[2];

    public void accept(String item) {
        switch (item) {
            case "Apple":
                counts[A_INDEX]++;
                break;

            case "Orange":
                counts[B_INDEX]++;
                break;
        }
    }

    public void combine(ItemCounter other) {
        this.counts[A_INDEX] += other.getCounts()[A_INDEX];
        this.counts[B_INDEX] += other.getCounts()[B_INDEX];
    }

    public int[] getCounts() {
        return counts;
    }
    }

 }


