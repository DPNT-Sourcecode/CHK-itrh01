package befaster.solutions.CHK;

import java.util.List;
import static befaster.solutions.CHK.CheckoutSolution.PRICE_MAP;

public class SummingStrategy implements CheckoutStrategy {

@Override
public void calculateTotal(List<String> items, double[] result) {
    result[0] = items.stream().mapToDouble(PRICE_MAP::get).sum();
  }

}