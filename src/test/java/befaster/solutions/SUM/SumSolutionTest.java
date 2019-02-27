package befaster.solutions.SUM;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import befaster.runner.NumberOutOfRangeException;;


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
    	try {
    		assertThat(sum.compute(100, 100), equalTo(200));
    	}catch(Exception e) {
    		e.getMessage();
    	}
    }
    
    @Test(expected = NumberOutOfRangeException.class)
    public void compute_sum201() throws NumberOutOfRangeException {
    	try {
    		sum.compute(1001, 100);
    	} catch(Exception e) {
    		
    	}
    }
    
    @Test(expected = NumberOutOfRangeException.class)
    public void compute_negative_yinput() throws NumberOutOfRangeException {
    	try {
    		sum.compute(1000, -1);
    	} catch(Exception e) {
    		
    	}
    }
    
    @Test(expected = NumberOutOfRangeException.class)
    public void compute_negative_xinput() throws NumberOutOfRangeException {
    	try {
    		sum.compute(-1, 100);
    	} catch(Exception e) {
    		
    	}
    }
    
    @Test
    public void compute_sum100with0()  {
    	try {
    		 assertThat(sum.compute(100, 0), equalTo(2));
    	} catch(Exception e) {
    		
    	}
    }
    
    @Test
    public void compute_sum0with100()  {
    	try {
    		 assertThat(sum.compute(0,100), equalTo(2));
    	} catch(Exception e) {
    		
    	}
    }  
    
    
}
