import java.util.Scanner;
import java.util.LinkedList;

public class Cinema{
    public static void main(String[] args) 
	{
        LinkedList<CinemaStructure> movieList = new LinkedList<>();
        movieList.add(new Cinema("Spiderman",1000));
        movieList.add(new Cinema("Doomsday",2200));
        movieList.add(new Cinema("Marvel Hulk",1800));
        movieList.add(new Cinema("Walking Dead", 2300));
        Scanner sc = new Scanner(System.in);
        //a)
        System.out.print("Enter seat: ");
        for(int i = 0; i < movieList.size(); i++){
            boolean noError;
            do { 
                System.out.println("Enter seat number to book: ");
                int seatCount = sc.nextInt();
                CinemaStructure mov = movieList.get(i);
                noError = mov.bookSeat(seatCount);
                if(!noError){
                    System.out.println("Error: seat count is not valid, re-enter---");
                }
            } while (!noError);
        }

        //b)
        System.out.println("Enter seat to un-book: ");
        for(int i = 0; i < movieList.size(); i++){
            boolean noError;
            System.out.println("Enter the movie title: " mov.getTitle().toUpperCase() +  "/Time: " + mov.getTime());
            do {
                System.out.println("Enter seat number to cancel: ");
                int seatCancel = sc.nextInt();
                noError = mov.cancel(seatCancel);
                if(!noError){
                    System.out.println("Error: seat count is not valid, re-enter---");
                }else{
                    System.out.println("Done .. Remaining seat count is " + mov.seatFre());
                }
            } while (!noError);
        }

        int highestBooked;
        int booked = 0;
        CinemaStructure objHighestBked = null;
        for(int i = 0; i < movieList.size(); i++){
            CinemaStructure mov = movieList.get(i);
            booked = mov.seatBooked();
            if(booked > highestBooked){
                highestBooked = booked;
                objHighestBked = mov;
            }
            
        }
        System.out.println("Display highest booked movie information: ");
        objHighestBked.toDisplay();
    }
}
