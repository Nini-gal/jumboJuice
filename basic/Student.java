import java.util.ArrayList;
import java.util.Scanner;

class Student{
	String name;
	String matric;
	String course;
	double cgpa;
	String status;

	Student(String n, String m, String c, double cg, String s){
        name = n;
        matric = m;
        course = c;
        cgpa = cg;
        status = s;
    }

    double getCGPA(){
        return cgpa;
    }

    String getStatus(){
        return status;
    } 
}

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arrList = new ArrayList<>(100);

        for(int i=0 ; i<100 ; i++){
            System.out.println("Enter data for student " +i+ "(Name, Matric, Course, Status): ");

			String name = sc.nextLine();
			String matric = sc.nextLine();
			String course = sc.nextLine();
			double cgpa = sc.nextDouble();
			String status = sc.nextLine();

			Student anak = new Student(name,matric,course,cgpa,status);
			arrList.add(anak);
        }

            //to make it simple arrList.add(new Student(name,matric,course,cgpa,status);)
        double totalCgpa = 0;
        for( Student anak : arrList){
            totalCgpa += anak.getCGPA();
            // 100 total
        }
        double averageCgpa = totalCgpa /100;
        System.out.println("Average of student's cgpa : " + averageCgpa);

        int countKB2_9 = 0;
		for(Student anak : arrList){
			if(anak.getStatus().equals("KB")){
				if(anak.getCGPA() > 2.9){
					countKB2_9++;
				}
			}
		}

        System.out.println("Number of student swith status KB and cgpa over 2.9: " + countKB2_9);
    }
}
