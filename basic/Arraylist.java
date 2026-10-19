import java.util.ArrayList;
import java.util.Collection;

class ArrayList{
	public  ArrayList() { … }
	public boolean add (Object elem)	// append element at end of list
	public Object get (int location)	// return the element at specified location
	Object remove (int location)		// remove element from specified location
	public int size()					// return the actual size of the list
}


public class NameApp{
	//method to perform insertion sort
	public static void insertsort(ArrayList A){
		//sorting the data in the list into an ascending order
	}

	public static void main(String[] args){
		ArrayList<String> nameList = new ArrayList<>();
		for (int x = 0; x < 8; x++){
			String name = JOptionPane.showInputDialog("Enter name ");
			if (nameList.add(name)){
				System.out.println("Name is appended to end of list");
			}
		}

		for(int x = 0; x < nameList.size(); x++){
			if(nameList.get(x).toString().charAt(0) == 'A'){
				Object obj = nameList.remove(x);
				System.out.print("Removed name is " + obj.toString());
			}
		}

		NameApp.insertsort(nameList);

		System.exit(0);
	}
}