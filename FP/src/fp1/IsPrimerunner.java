package fp1;

import java.util.Scanner;

public class IsPrimerunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number:");
		int n1 = scanner.nextInt();
		IsPrime p = new IsPrime();
		boolean n = p.isP(n1);
		if(n==true) {
			System.out.println("Joe numba iz prime numba");
		}else {
			System.out.println("jo namba aint praime numba");
		}
	}

}