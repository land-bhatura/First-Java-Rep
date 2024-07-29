package v;

import java.util.Scanner;

public class VarArgRun {

	public static void main(String[] args) {
		int[] a;
		int s;
		vararg rahul = new vararg();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of subjects : ");
		s=scan.nextInt();
		a=rahul.mrks(s);
		for(int j:a) {
			System.out.println("   "+j);
		}
	}

}
