package schoolmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Teacher pooja = new Teacher(1,"pooja",500);
		Teacher lizzy = new Teacher(2, "lizzy", 700);
		Teacher roshan = new Teacher(3, "roshan", 600);
		
		List<Teacher> teacherList= new ArrayList<Teacher>();
		teacherList.add(pooja);
		teacherList.add(lizzy);
		teacherList.add(roshan);
		
		
		
		Student nirmal = new Student(1, "nirmal", 12);
		Student venkat = new Student(2, "venkat", 11);
		Student rabbi = new Student(3, "rabbi", 8);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(nirmal);
		studentList.add(venkat);
		studentList.add(rabbi);
		
		
		
		School edu =new School(teacherList,studentList);
		
		nirmal.payFees(5000);
		rabbi.payFees(6000);
		System.out.println(" edu has earned $" + edu.getTotalMoneyEarned());
		
		
		System.out.println("----------Making SCHOOL PAY SALARY----------");
		roshan.receiveSalary(roshan.getSalary());
		System.out.println("edu has spent for salary to " + roshan.getName()
		+ " and now has $" + edu.getTotalMoneyEarned());
		
		
		pooja.receiveSalary(pooja.getSalary());
		System.out.println("edu has spent for salary to " + pooja.getName()
		+ " and now has $" + edu.getTotalMoneyEarned());
		
		
		System.out.println(nirmal);
		System.out.println(pooja);
		
		
		
		
	}

}
