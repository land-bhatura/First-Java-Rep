package aone;

public class StuRunner {

	public static void main(String[] args) {
		int[] marks = {193,209,98};
		Student student = new Student("Rend",marks);
		int s = student.NOM();
		System.out.println("Total Number of Subjects "+ s);
		s=student.sum();
		System.out.println("Sum is " + s);
		s=student.MaxM();
		System.out.println("Max number is " + s);
		s=student.MinM();
		System.out.println("Min number is " + s);
	}

}
