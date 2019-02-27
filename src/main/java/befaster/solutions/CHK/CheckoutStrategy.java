package befaster.solutions.CHK;

import java.util.List;

public interface CheckoutStrategy {
	void calculateTotal(List<String> items, double[] subtotals);
}
