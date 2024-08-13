// WAP to read element of 4x4 matrix and do - Find the Largest_Number


import java.util.Scanner;
class Largest_Number{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[4][4];
		int largest = 0, total_element = 0;
		
		System.out.println("Enter 4x4 matrix to find element largest: ");
		
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		largest = arr[0][0];
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				if(largest<arr[i][j]){
					largest = arr[i][j];
				}
			}
		}
		
		System.out.println("The largest of total elements is " + largest);
	}
}
