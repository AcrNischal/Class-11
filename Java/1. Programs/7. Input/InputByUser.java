import java.util.Scanner;

public class InputByUser{
	public static void main(String[] args){
		
		
		
		Scanner obj = new Scanner(System.in);
	//	num1 = obj.nextInt();
	//	num3 = obj.nextFloat();
	//	System.out.println("The sum of " + num1 +" and " + num3 + " will be " + (num1+num3));
	
		System.out.print("Enter your name: ");
		String name = obj.nextLine();
		System.out.print("Enter your address: ");
		String address = obj.nextLine();
		System.out.print("Enter your age: ");
		int age = obj.nextInt();		
		System.out.println("Hi " + name + ", Your address is " + address + " and you are " + age + ".");
	}
	
}