import java.util.Scanner;
import java.util.ArrayList;

public class monthlyPhoneBill{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //a) input some data into an object, empList. The process stops when user decides to.
        ArrayList<PhoneBill> empList = new ArrayList<>();

        System.out.println("Enter data (yes/no):");
        Boolean moreData = sc.nextBoolean();//to check if user wants to enter more data
        while(moreData){
            System.out.println("Enter name, staffNo, salary, minutes:");
            String name = sc.next();
            String staffNo = sc.next();
            double salary = sc.nextDouble();
            int minutes = sc.nextInt();

            empList.add(new PhoneBill(name, staffNo, salary, minutes));

            System.out.println("Enter more data (yes/no):");
            moreData = sc.nextBoolean();
        }
        
        //b) Display the phone bill information with the highest amount
        double  highestBill; 
        double bill = 0;
        PhoneBill objectHighestPB = null;
        for(PhoneBill emp : empList){//loop through the list to find the highest bill
            bill = emp.calcPhoneBill();
            if(bill > highestBill){
                highestBill = bill;
                objectHighestPB = emp;
            }
        }
        objectHighestPB.printInfo();


        //c)find and display the monthly salary for each sales representatives if the company decided to automatically deduct the phone bill from the monthly salary.
        //display the new salary for each sales representatives
        for(PhoneBill emp : empList){
            System.out.println(empList.printInfo());
        }

        sc.close();

    }
}