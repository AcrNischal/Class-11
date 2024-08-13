// WAP to read element of 4x4 matrix and do - Find the average


import java.util.Scanner;
class Elements_avarage{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[4][4];
		int avarage = 0, total_element = 0;
		
		System.out.println("Enter 4x4 matrix to find element avarage: ");
		
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				avarage += arr[i][j];
				total_element++;
			}
		}
		
		System.out.println("The average of total elements is " + (avarage/total_element));
	}
}
