// Find the factorial of given number
import java.util.Scanner;
class Factorial{
	public static void main(String[] args){
		System.out.println("Enter a number to print factorial: ");
		int usr, temp=1;
		Scanner sc = new Scanner(System.in);
		usr = sc.nextInt();
		for(int i=1; i<=usr; i++){
			temp = temp * i;
		}
		System.out.println("The factorial of " + usr +" is "+ temp);
	}
}