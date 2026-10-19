import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NameApp{
	//method to perform insertion sort
	public static void insertsort(ArrayList A){
		//sorting the data in the list into an ascending order
		for (int i = 0; i < A.size(); i++){
			Object key = A.get(i);
			int j = i - 1;
			while (j >= 0 && ((Comparable) A.get(j)).compareTo(key) > 0){
				A.set(j + 1, A.get(j));
				j--;
			}
			A.set(j + 1, key);
		}
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
				System.out.println("Removed name is " + obj.toString());
			}
		}

		NameApp.insertsort(nameList);

		System.exit(0);
	}
}