package befaster.solutions.CHK;

import java.util.List;

public interface Checkout {
	int calculateTotal(List<String> items);
	public void addPrice(String item, Integer price);
	public int  getPrice(String item);
}
