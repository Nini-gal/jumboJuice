import java.util.Scanner;
import java.utl.ArrayList;
import java.util.List;

class Student{
	String name;
	String matric;
	String course;
	double cgpa
	String status;

	Student(String name, String matric, String course, double cgoa, String status){




public class tutorial{
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
		ArrayList<Student> arrList = new ArrayList<>();

		for(int i = 0; i<100; i++){
			System.out.println("Enter data for student " +i+ "(Name, Matric, Course, Status): ");

			String name = sc.next();
			String matric = sc.next();
			String course = sc.next();
			double cgpa = sc.nect();
			String status = sc.next();

			Student anak = new Student(name,matric,course,cgpa,status);
			arrList.add(anak);
		}

		double totalCgpa = 0;
		for(int i = 0; i<100 ; i++){
			totalCgpa += arrList.get(i).getCgpa();
			double averageCgpa = totalCgpa / arrList.size();
		}

		System.out.println("Average CGPA is " + averageCgpa);

		int countKB2_9 = 0;
		for(Student stu : arrList){
			if(stu.etStatus().equaks("KB")){
				if(stu.getCgpa() > 2.9){
					countKB2_9++;
				}
			}
		}

		Sytsm.out.println()
