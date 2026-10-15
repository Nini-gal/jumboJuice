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

            PhoneBill emp = new PhoneBill(name, staffNo, salary, minutes);
            empList.add(emp);

            System.out.println("Enter more data (yes/no):");
            moreData = sc.nextBoolean();
        }
        
        //b) Display the phone bill information with the highest amount
        PhoneBill highestBill = empList.get(0);
        for(PhoneBill emp : empList){//loop through the list to find the highest bill
            if(emp.getMinutes() > highestBill.getMinutes()){
                highestBill = emp;
            }
        }

        System.out.println("Highest Phone Bill:");
        System.out.println("Name: " + highestBill.getName());
        System.out.println("Staff No: " + highestBill.getStaffNo());
        System.out.println("Salary: " + highestBill.getSalary());
        System.out.println("Minutes: " + highestBill.getMinutes());

        //c)find and display the monthly salary for each sales representatives if the company decided to automatically deduct the phone bill from the monthly salary.
        for(PhoneBill emp : empList){
            int num;
            double cent;
            if(emp.getMinutes() > 100){
                num = emp.getMinutes() / 100;
                cent = 0.20;
            }else if( emp.getMinutes() > 150){
                num = emp.getMinutes() / 150;
                cent = 0.35;
            }else if(emp.getMinutes() < 100 && emp.getMinutes() < 50){
                num = emp.getMinutes() / 50;
                cent = 0.15;
            }
            double newSalary = emp.getSalary() - (num * cent);
            emp.setNewSalary(newSalary);
        }

        //display the new salary for each sales representatives
        System.out.println("New Salary for each sales representatives:");
        for(PhoneBill emp : empList){
            System.out.println("Name: " + emp.getName() + ", Staff No: "
            + emp.getStaffNo() + ", New Salary: " + emp.getNewSalary());
        }

        sc.close();

    }
}