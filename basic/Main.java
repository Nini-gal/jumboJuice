/*Tutorial1 : Declare arraylist with initializer list of integer: 10, 5 , 3 , 3, 12, 2, 11*/

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        //to initializes the arraylist with values in one line
        ArrayList<Integer> data = new ArrayList<>(List.of(10,5,3,3,12,2,11));
    }
}