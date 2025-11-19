package DAY2;

public class CoutOfDigitsInNum {
	
	public static void main(String[] args) {
		long n =1234654655512535455L;
		int count = 0 ;
		while(n!=0){
			count++;
			n=n/10;
		}
		System.out.println(count);
	}
	
}
