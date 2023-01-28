import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class NumberOfSteps {

    int count = 0;

    public int numberOfSteps(int num) {     
        //Base case
        if (num < 1) {
            return count;
        } else if (num % 2 != 0) {
            count++;
            return numberOfSteps(num - 1);
        
        } else if (num % 2 == 0) {
            count++;
            return numberOfSteps(num / 2);
        } else if  (num == 1){
            num--;
            count++;
        }
        return count;     
    }

     
            
    public static void main(String[] args) {

        NumberOfSteps s = new NumberOfSteps();

       int print = s.numberOfSteps(14);

       System.out.println(print);

    }

}