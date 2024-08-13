// WAP to read element of 4x4 matrix and do - Find the sum of elements


import java.util.Scanner;
class Sum_Elements{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[4][4];
		int sum = 0;
		System.out.println("Enter 4x4 matrix contious: ");
		
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				
				sum += arr[i][j];
				
			}
		}
		
		System.out.println("The total sum of elements is " + sum);
		
	}
}