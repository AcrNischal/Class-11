// Wap to define array of string with atleast names of 10 friends and ask user to enter any name and
// display true if user entered name is matched with any array member

import java.util.Scanner;

public class GuessName{
	public static void main(String[] args){
		boolean guess = false;
		Scanner sc = new Scanner(System.in);
		
		String[] names = {"Laxman", "Bhaskar", "Nitin", "Manish", "Laxmi", "Bipesh", "Kriti", "Sugam", "Lakshya", "Simran"};
		
		System.out.print("Guess my friend name: ");
		
		String guessname = sc.nextLine();
		
		for(int i=0; i<10; i++){
			if(names[i].equals(guessname)){
				guess = true;
				break;
			}
		}
		
		if(guess){
			System.out.println("Wooh " + guessname + " is my friend");
		}else{
			System.out.println("Opps " + guessname + " is not my friend");
		}
	}
}