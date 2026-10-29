class CinemaStructure
{
    public String title;
    public int time;
    public int bookedseat;

	public CinemaStructure(String title, int time, int bookedseat){
        title = t;
        time = h;
        bookedseat = bs;
    } // initializes all attributes.


	public boolean bookSeat(int seat){
        if(bookedSeat + seat > TotalSeat)
            return false;
        else
            return true;
    } // returns false if seats booked more 
 // than seats provided, else return true.


	public boolean cancel(int seat)	{
        if(bookSeat + seat > TotalSeat || seat > bookedseat)
            return false;
        else
            bookSeat -= seat;
            return true;
    } // returns false if sum of seats booked 
// and seats un-booked more than seats // provided, else return true.
	

    public int seatFree(){
        return totalSeat - bookedSeat;
    }// returns total of un-booked seats.
	
    
    public int seatBooked(){
        return bookedSeat;
    } // returns total of booked seats.
	
    
    public String getTitle(){
        return title;
    } // returns movie’s title.
	
    
    public int getTime(){
        return time;
    }// returns screening time.
	
    
    public String toDisplay(){
        return "Movie title: " + title + "Time: " + time;
    } // returns information of movie.
}
