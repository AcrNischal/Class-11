// Read name of 10 students display only if name is not started with vowels

import java.util.Scanner;

class NotStartWithVowels{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		String[] names = new String[10];
		
		for(int i=0; i<10; i++){
			names[i] = sc.nextLine();
		}
		
		for(int i=0; i<10; i++){
			if(!(names[i].charAt(0) == 'a' && names[i].charAt(0) == 'e' && names[i].charAt(0) == 'i' && names[i].charAt(0) == 'o' && names[i].charAt(0) == 'u')){
				System.out.println(names[i]);
			}
		}
		
	}
}