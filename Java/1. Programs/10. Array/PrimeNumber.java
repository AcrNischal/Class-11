//Wap number to find n number is prime or not

import java.util.Scanner;

class PrimeNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean prime = true;
		System.out.println("Enter a number to find number is prime or not: ");
		int usr = sc.nextInt();
		for(int i=2; i<=usr/2; i++){
			if(usr%i==0){
				prime = false;
				break;
			}
		}
		if(prime){
			System.out.println("The given number " + usr + " is prime");
		}else{
			System.out.println("The given number " + usr + " is not prime");
		}
	}
}