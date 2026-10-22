import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NumberApp {
    public static void main(String[] args){
        final int MAX = 10;
        String strnum;
        ArrayList<String> numList = new ArrayList<>(100);

        for(int i=0; i< MAX; i++){
            strnum = JOptionPane.showInputDialog("Input number: ");
            numList.add(i, strnum);
        }

        Object obj;
        for(int j = 0; j<numList.size(); j++){
            double num = Double.parseDouble(numList.get(j).toString());

            if((num%3) == 0){
                numList.set(j, "1000");
            }else{
                obj = numList.remove(j);
                System.out.println("Removed number is " + obj.toString());
            }
        }

        System.exit(0);
    }
}
