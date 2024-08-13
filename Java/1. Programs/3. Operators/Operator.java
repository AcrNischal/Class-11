// Operaters in JAVA

class Operater{
	public static void main(String[] args){
		
		int v1, v2, varans;
		float varans2;
		v1 = 12;
		v2 = 20;
		boolean yesno;
		
		// Addition
		varans = v1 + v2;		
		System.out.println("The sum of "+ v1 +" and "+ v2 +" is " + varans);
		
		// Before Increment
		++v1;		
		System.out.println("The one increment of "+ v1++);
		
		// After Increment
		//v1++;
		System.out.println("The increment after execution of " + v1);
		
		// Mod 
		varans = v2 % v1;
		System.out.println("The reminder after dividing " + v2 + " by " + v1 + " is " + varans);
		
		// Getting v1 is equals to v2 or not
		yesno = v1 == v2;
		System.out.println(v1 +" is equals to " + v2 + "? => "+ yesno);
		
		// Dividing variable one and variable two
		varans2 = (float) v2 / v1;
		System.out.println("The div of " + v2 + " and " + v1 + " is " + varans2);
		
		
		
		
		// decrement 
		int a = 989;
		--a;
		System.out.println("The answer after 1 decrement of " + (a+1) + " is " + a);
		
		
		
	}
	
}