import java.util.ArrayList;

public class Soalan3{
	public static void main(String[]args){

		ArrayList arr1 = new ArrayList(50);
		ArrayList arr2 = new ArrayList(50);

		arr1.add(100);
		arr1.add(250);
		arr1.add(300);
		arr1.add(53);
		arr1.add(23);
		arr1.add(230);
		arr1.add(67);
		arr1.add(12);
		arr1.add(500);
		arr1.add(77);

		System.out.println("Ori List 1: " + arr1);

		for (int i = 0; i<arr1.size(); i++){
			int num = (Integer) arr1.get(i);

			if (num > 100){
				Object removedItem = arr1.remove(i);
				arr2.add(removedItem);

				i--;
			}
		}

		System.out.println("Current List 1: " +arr1);
		System.out.println("Current List 2: " +arr2);
	}
}
