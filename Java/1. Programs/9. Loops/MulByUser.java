// Wap to display mul of n number

import java.util.Scanner;

class MulByUser{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number to display multiplication: ");
		int user = sc.nextInt();
		
		for(int i =1; i<=10; i++){
			System.out.println(user + " x "+ i +" = " + (user*i));
		}
		
	}
}