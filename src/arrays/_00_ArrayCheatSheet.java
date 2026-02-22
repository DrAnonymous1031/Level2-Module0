package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		Random ran = new Random();
		//1. make an array of 5 Strings
		String[]kitties = {"Tostada","Chip","Milo","Cloudy","Walter"};
		//2. print the third element in the array
		System.out.println(kitties[2]);
		//3. set the third element to a different value
		kitties[3]=("Gnarpy");
		//4. print the third element again
		System.out.println(kitties[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		
		//6. make an array of 50 integers
		int[] eps = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for(int i=0; i<eps.length; i++) {
			eps[i]=ran.nextInt(1000)+1;
		}
		//8. without printing the entire array, print only the smallest number in the array
		int z = 100;
		for(int i=0;i<eps.length; i++) {
//			System.out.println(eps[i]);
			if(eps[i]<z) {
				z=eps[i];
			}
		}
		System.out.println(z);
		System.out.println(" ");
		boolean bool = true;
		while (bool) {
			int l = 0;
			for(int i=0; i<eps.length-1; i++) {
				if(eps[i]>eps[i+1]) {
					int v = eps[i];
					eps[i] = eps[i+1];
					eps[i+1]=v;
					l++;
				}
			}
			if(l==0) {
				bool=false;
			}
		}
		System.out.println(" ");
		for(int i=0;i<eps.length; i++) {
			System.out.println(eps[i]);
		}
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
