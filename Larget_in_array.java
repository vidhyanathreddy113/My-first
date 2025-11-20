package logics;

public class Larget_in_array {

public static void main(String[] args) {
		
		int a [] = {11,40,30,6};
		
		int max = a[0];
		for(int i =1;i<a.length;i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("max number in given array is :"+max);
		
	}
	
}
