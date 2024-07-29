package fp1;

public class SuperiorTriangle {
	
	private int a,b,c;
	void tria(int a) {
		this.a = a;
		this.b=b;
		this.c=c;
		for(int i=1;i<a;i++) {
			System.out.print("\n");
			for(int k=a-i;k>=0;k--) {
				System.out.print("-");
			}
			for(int j=1;j<=(i*2-1);j++) {
				System.out.print("*");
			}
		}

}
}
