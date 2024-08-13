// WAP to read element of 4x4 matrix and do - Find the Assending_Number


import java.util.Scanner;
class Assending_Number{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[4][4];
		int temp;
		System.out.println("Enter 4x4 matrix to find element assending: ");
		
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		int initial = arr[0][0];
		
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				for(int k = arr.length-1; >=0;
				
				
				
				
			}
		}
		
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
