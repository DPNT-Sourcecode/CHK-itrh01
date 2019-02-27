package befaster.solutions.SUM;

import befaster.runner.SolutionNotImplementedException;

public class SumSolution {

    public int compute(int x, int y) {
        int sum = 0;
        if((x<=100 && x>=0) && (y <=100 && y>=0)) {
        	sum = x+y;
        }
        return sum;
    }

}

