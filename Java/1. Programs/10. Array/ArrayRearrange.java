// Read 10 Numbers from user and store them into arrayand remove even numbers from array and place all odd numbers to
// top of array

import java.util.Scanner;

class ArrayRearrange{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		int lastElement = array.length-1;
		System.out.println("Enter array 10 ele:");
		for(int i=0; i<array.length; i++){
			array[i] = sc.nextInt();
			
			if(array[i]%2==0){
				array[i] = 0;
			}
			System.out.println(array[i]);
		}
	
		for(int i=0; i<array.length; i++){
			for(int j=i; j<array.length; j++){
				if(array[i] == 0 && j<array.length-1){
					array[j] = array[j+1];
				}
			}
			array[lastElement] = 0;
			lastElement--;
		}
		
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
		
		
	}

}