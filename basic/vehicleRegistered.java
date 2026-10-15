import java.util.ArrayList;
import java.util.Scanner;

public class vehicleRegistered{
    public static void main(String[]args){
        //create an arraylist to store vehicle objects
        ArrayList<Vehicle> VehicleList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        //input data into the arraylist
        System.out.println("Enter data (yes/no): ");
        Boolean moreData = sc.nextBoolean();

        int count = 0;
        while(moreData){
            System.out.println("Enter name:");
            String name = sc.next();
            System.out.println("Enter plate number:");
            String plateNo = sc.next();
            System.out.println("Enter category (S/P/V):");
            char category = sc.next().charAt(0);

            count++;

            //create a new vehicle object and add it to the arraylist
            Vehicle v = new Vehicle(name, plateNo, category);
            VehicleList.add(v);

            System.out.println("Enter data (yes/no): ");
            moreData = sc.nextBoolean();
        }

        int staffCount = 0;
        int studentCount = 0;

        for(Vehicle v : VehicleList){
            if(v.getCategory() == 'S'){
                staffCount++;
            }else if (v.getCategory() == 'P'){
                studentCount++;
            }
        }

        System.out.println("Total number of vehicles registered: " + count);
        System.out.println("Total number of staff vehicles: " + staffCount);
        System.out.println("Total number of student vehicles: " + studentCount);

        System.out.println("List of registered vehicle: ");
        for(int i = 0; i < VehicleList.size(); i++){
            System.out.println("Name : " + v.getVehicle());
            System.out.println("PlateNo : " + v.getPlateNo());
            System.out.println("Category : " + v.getCategory());
        }
    }
    
}
