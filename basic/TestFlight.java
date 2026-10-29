/**
 * @Student name  : NOR FATHINI BINTI NOR SULAIMAN
 * @Matric number : 2025801536
 * @Group         : T5CS1103A
 * @Date          : 29/10/2026
 */

import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class FlightRecord {

    // Attributes
    private int flightID;
    private String airline;
    private String origin;
    private String destination;
    private double duration; // in hours
    private String status;   // e.g. "On Time", "Delayed", "Cancelled"

    DecimalFormat df = new DecimalFormat("0.00");

    // Constructor
    public FlightRecord(int flightID, String airline, String origin,
                        String destination, double duration, String status) {
        this.flightID    = flightID;
        this.airline     = airline;
        this.origin      = origin;
        this.destination = destination;
        this.duration    = duration;
        this.status      = status;
    }

    // Mutators
    public void setFlightID(int flightID)         { this.flightID    = flightID;    }
    public void setAirline(String airline)         { this.airline     = airline;     }
    public void setOrigin(String origin)           { this.origin      = origin;      }
    public void setDestination(String destination) { this.destination = destination; }
    public void setDuration(double duration)       { this.duration    = duration;    }
    public void setStatus(String status)           { this.status      = status;      }

    // Accessors
    public int    getFlightID()    { return flightID;    }
    public String getAirline()     { return airline;     }
    public String getOrigin()      { return origin;      }
    public String getDestination() { return destination; }
    public double getDuration()    { return duration;    }
    public String getStatus()      { return status;      }

    // Printer
    public String toString() {
        return flightID + "\t" + airline + "\t" + origin + "\t" +
               destination + "\t" + df.format(duration) + "\t" + status;
    }
}

public class TestFlight {

    public static void main(String[] args) throws Exception {

        // ANSWER 1a: Create ArrayList object named flightList
        ArrayList<FlightRecord> flightList  = new ArrayList<>();

        File f = new File("flightData.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        String data = br.readLine();
        while (data != null) {

            StringTokenizer st = new StringTokenizer(data, ";");
            int    flightID    = Integer.parseInt(st.nextToken().trim());
            String airline     = st.nextToken().trim();
            String origin      = st.nextToken().trim();
            String destination = st.nextToken().trim();
            double duration    = Double.parseDouble(st.nextToken().trim());
            String status      = st.nextToken().trim();

            // ANSWER 1b: Create FlightRecord object
            FlightRecord frObj = new FlightRecord(flightID, airline, origin, destination, duration, status); 
            
            // ANSWER 1c: Insert FlightRecord object into ArrayList flightList
            flightList.add(frObj);
            
            data = br.readLine();
        }
        br.close();

        // ANSWER 2
        System.out.println("==========================================All Flight Record===============================================");
        System.out.printf("%-10s %-20s %-22s %-22s %-10s%-12s%n", 
                            "Flight ID", "Airline", "Origin", "Destination", "Duration", "Status");
        
        for(int i=0; i< flightList.size(); i++){
                FlightRecord frObj = flightList.get(i);
                System.out.printf("%-10s %-20s %-22s %-22s %-10s %-12s%n", 
                            frObj.getFlightID(), frObj.getAirline(), frObj.getOrigin(), frObj.getDestination(), frObj.getDuration(), frObj.getStatus());
            
        }
        

        // ANSWER 3
        double totalDuration = 0;
         for(int i=0; i< flightList.size(); i++){
             totalDuration += flightList.get(i).getDuration();
         } double averageDuration  = totalDuration / flightList.size();
         
         System.out.println("\nAverage Flight Duration is " + averageDuration + " hours.");


        // ANSWER 4 (bubble sort)
        System.out.println("==========================================Sort by Duration===============================================");
        
        for(int i=0; i< flightList.size()-1; i++){
            
            for(int j=0; j< flightList.size()-1-i; j++){
            
                if(flightList.get(j).getDuration()> flightList.get(j+1).getDuration()){//ascending Sort
            
                    FlightRecord temp = flightList.get(j);
                    flightList.set(j, flightList.get(j+1));
                    flightList.set(j+1, temp);
                }
            }
        }
        System.out.printf("%-10s %-20s %-22s %-22s %-10s%-12s%n", 
                            "Flight ID", "Airline", "Origin", "Destination", "Duration", "Status");
        
        for(int i=0; i< flightList.size(); i++){
                FlightRecord frObj = flightList.get(i);
                System.out.printf("%-10s %-20s %-22s %-22s %-10s %-12s%n", 
                            frObj.getFlightID(), frObj.getAirline(), frObj.getOrigin(), frObj.getDestination(), frObj.getDuration(), frObj.getStatus());
            
        }
        
        // ANSWER 5
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter flight ID to search and updates: ");
        int searchID = sc.nextInt();
        
        ArrayList<FlightRecord> searchList = new ArrayList<>(flightList);//search on old flightList
        
        for(int i=0; i< searchList.size()-1; i++){
            
            for(int j=0; j< searchList.size()-1-i; j++){
            
                if(searchList.get(j).getFlightID()> searchList.get(j+1).getFlightID()){//ascending Sort
            
                    FlightRecord temp = searchList.get(j);
                    searchList.set(j, searchList.get(j+1));
                    searchList.set(j+1, temp);
                }
            }
        }
        
        //binary search
        int low = 0, high = searchList.size()-1;
        int mid, foundIndex = -1;
        while(low <= high){
            mid = (low + high)/2;
            
            if(searchList.get(mid).getFlightID() == searchID){
                foundIndex = mid;
                break;
            }else if(searchList.get(mid).getFlightID() < searchID){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        
        if(foundIndex != -1){
            FlightRecord selectedFlight = searchList.get(foundIndex);
            
            System.out.println("\n Flight record found!");
            System.out.println(selectedFlight);
            sc.nextLine();
            
            System.out.println("Enter new flight status! : ");
            String newstatus = sc.nextLine();
            
            selectedFlight.setStatus(newstatus);
            System.out.println("Flight status updated successfully!");
            System.out.println(selectedFlight);
        }else{
            System.out.println("\n Flight " + searchID
            +"record not found!");
        }

        // ANSWER 6 (bonus)

    }
}