// WAP to read marks of 20 studnts and display after inverting array

import java.util.Scanner;

class InvertingArray{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] marks = new int[20];
		System.out.println("Enter continous 20 marks: ");
		int temp = 19, temp2;
		
		
		for(int i=0; i<=19; i++){
			marks[i] = input.nextInt();
		}
		System.out.println("\n\nInverting");
		
		for(int i=0; i<=9; i++){
			temp2 = marks[i];
			marks[i] = marks[temp];
			marks[temp] = temp2; 
			
			temp--;
		}
		
		for(int i=0; i<=19; i++){
			System.out.println(marks[i]);
		}
	}
}