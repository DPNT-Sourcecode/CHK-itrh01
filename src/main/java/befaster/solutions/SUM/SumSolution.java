package befaster.solutions.SUM;

import befaster.runner.NumberOutOfRangeException;;

public class SumSolution {

    public int compute(int x, int y) throws NumberOutOfRangeException{
        int sum = 0;
        if((x<=100 && x>=0) && (y <=100 && y>=0)) {
        	sum = x+y;
        }
        else {
        	throw new NumberOutOfRangeException();
        }
        return sum;
    }

}


