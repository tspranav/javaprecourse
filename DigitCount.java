public class DigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 19785, count=0;
		for (int i = n; i>0; i=i/10 ) {
			count++;
			
			
		}
		System.out.println("The number has " +count+" digits");

	}

}