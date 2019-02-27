package befaster.solutions.SUM;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumSolutionTest {
    private SumSolution sum;

    @Before
    public void setUp() {

        sum = new SumSolution();
    }

    @Test
    public void compute_sum() {
    	try {
        assertThat(sum.compute(1, 1), equalTo(2));
    	}catch(Exception e) {
    		e.getMessage();
    	}
    }
    
    @Test
    public void compute_sum200() {
        assertThat(sum.compute(100, 100), equalTo(200));
    }
    
    @Test
    public void compute_sum201() {
        assertThat(sum.compute(1001, 100), equalTo(0));
    }
    
    
    
    
}


