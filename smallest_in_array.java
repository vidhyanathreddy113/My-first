package logics;

public class smallest_in_array {

	public static void main(String[] args) {
		
		int a [] = {11,40,30,6};
		
		int min = a[0];
		for(int i =1;i<a.length;i++) {
			if(min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("max number in given array is :"+min);
		
	}
	
}
