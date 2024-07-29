package fp1;

import java.util.Scanner;

public class Option {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter First Number");
		int n1=scanner.nextInt();
		System.out.println("Enter Second Number");
		int n2=scanner.nextInt();
		System.out.println("Now enter option: \n 1. \t Addition. \n 2. \t Subtraction \n 3. \t Multiply(OFC) \n 4. \t Division");
		int n3=scanner.nextInt();
		if(n3==1) {
			System.out.println(n1+n2);
		}
		else if(n3==2) {
			System.out.println(n1-n2);
		}
		else if(n3==3) {
			System.out.println(n1*n2);
		}
		else if(n3==4) {
			System.out.println(n1/n2);
		}
		
		
		
	}

}
