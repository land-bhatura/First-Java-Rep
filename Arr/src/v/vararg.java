package v;

import java.util.Scanner;

public class vararg {
	private int[] av;
	private int s;
	String[] name;
	Scanner scan = new Scanner(System.in);
	public int[] mrks(int s) {
		this.s = s;
		
		System.out.println("Enter marks : ");
		for(int i=0;i<s;i++) {
			av[i]=scan.nextInt();
			System.out.println();
		}
		return av;
	}
}
