/*Tutorial1 : Declare arraylist with initializer list of integer: 10, 5 , 3 , 3, 12, 2, 11*/
/*Tutorial2 : Allow user to enter number in the middle of the index list*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //to initializes the arraylist with values in one line
        ArrayList<Integer> data = new ArrayList<>(List.of(10,5,3,3,12,2,11));

        //print out the arraylist
        System.out.println("Original ArrayList: " + data);

        //allow user tu enter in the numbers
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter an integer to add in the middle: ");
        int userInput = sc.nextInt();
        
        //to calculate the middle index
        int middleIndex = data.size() / 2;

        //inserting the user's number at the middle index
        data.add(middleIndex, userInput);

        System.out.println("Updated ArrayList: " + data);

        sc.close();
    }
}