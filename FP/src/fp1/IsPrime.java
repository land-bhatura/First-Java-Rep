package fp1;

public class IsPrime {
	boolean isP(int a) {
		boolean p = true;
		for(int i=a-1;i>1;i--) {
			if(a%i == 0 ) {
				p= false;
				break;
				
			}
			
		}
		return p;
	}

}
