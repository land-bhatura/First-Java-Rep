package aone;

public class Student {
	private String name;
	private int[] marks;
	private int a,s,max = 0,min;
	public Student(String name, int[] marks) {
		this.name=name;
		this.marks = marks;
		
	
	}
	public int NOM() {
		
		return marks.length;
		
	}
	public int sum() {

		for(int m:marks) {
			s += m;
			
		}
		return s;
		
	}
	public int MaxM() {

		for(int m:marks) {
			if( max < m) {
				max = m;
			}
			
		}
		return max;
	}
	public int MinM() {
		min=marks[0];
		for(int m:marks) {
			if( min > m) {
				min = m;
			}
			
		}
		return min;
	}
	
}
