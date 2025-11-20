package logics;

public class Reverse_array {

	
	public static void main(String[] args) {
		
		int [] arr = {40,10,30,20,50,11};
		
		int j = arr.length;
		
		int[] b = new int[j];
		
		for(int i =0;i<arr.length;i++) {
			b[j-1] = arr[i];
			j = j-1;
		}
		
		for(int i :b) {
			System.out.print(i+" ");
		}
	}
	
}
