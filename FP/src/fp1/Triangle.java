package fp1;

import java.util.Iterator;

public class Triangle {
	
	private int a;//b,c;
	void tri(int a) {
		this.a = a;
		//this.b=b;
		//this.c=c;
		for(int i=0;i<a;i++) {
			System.out.print("\n");
			for(int j=0;j<=i;j++)
				System.out.print(j+1);
		}
		
	}
}
