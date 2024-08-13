// WAP to read element of 4x4 matrix and do - Find the Smallest_Number


import java.util.Scanner;
class Smallest_Number{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[4][4];
		int smallest = 0, total_element = 0;
		
		System.out.println("Enter 4x4 matrix to find element smallest: ");
		
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		smallest = arr[0][0];
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				if(smallest>arr[i][j]){
					smallest = arr[i][j];
				}
			}
		}
		
		System.out.println("The smallest of total elements is " + smallest);
	}
}
