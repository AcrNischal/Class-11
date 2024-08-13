// WAP to define array of String with atleast names of 10 friends
// and Ask user to enter any name and display true if user entered
// name is match with any array name.

import java.util.Scanner;

class Friends{
	public static void main(String[] args){
		
		boolean guess = false;
		String[] friends = {"Laxman", "Laxmi", "Nitin", "Nishchal", "Manish", "Bhaskar", "Dipesh", "Pranjal", "Lakshya", "Bipesh"};
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Guess my friend name: ");
		String name = sc.nextLine();
		
		for(int i=0; i<friends.length; i++){
			if(name.equals(friends[i])){
				System.out.println("Wooh! you guess my friend " + name);
				guess = true;
				break;
			}
			
		}
		if(guess==false){
			System.out.println("Haha you can't bruh!!!!!!!!!");
		}
	}


}