import static org.junit.Assert.*;

import org.junit.Test;

public class FJUT {
	
	class SC{
		int sum(int[] nos) {
			int sum=0;
			for(int i=0;i<nos.length;i++) {
				sum +=nos[i];
			}
			return sum;
		}
	}

	@Test
	public void test() {
		SC s = new SC();
		int test=s.sum(new int[] {1,2,3,4,5,6,7,8,9});
		System.out.println(test);
		int t2 = 5;
		assertEquals(t2,test);
	}
	
	@Test
	public void test2() {
		
	}
}
