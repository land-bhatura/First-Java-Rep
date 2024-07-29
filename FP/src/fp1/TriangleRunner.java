package fp1;

import java.util.Scanner;

public class TriangleRunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a= scan.nextInt();
		SuperiorTriangle t1 = new SuperiorTriangle();
		t1.tria(a);
	}

}
