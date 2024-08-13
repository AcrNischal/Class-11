

import java.util.Scanner;

class Dimm{
	public static void main(String[] args){
		Operations do1 = new Operations();
		Operations do2 = new Operations();
		Operations do3 = new Operations();
		do1.getInp();
		do2.getInp();
		do3 = do2.addition(do1);
		
		
		System.out.println("The feet is : " + do3.feet + " and Inch is : "+ do3.inch);
	}
	
}

class Operations{
	int feet, inch, i=0;
	public void getInp(){
		Scanner sc = new Scanner(System.in);
		
		while( i<1){
			System.out.println("Enter a feet value: ");
		feet = sc.nextInt();
		
		System.out.println("Enter a inch value: ");
		inch = sc.nextInt();
			if(inch<0 || inch > 23){

			System.out.println("You have done something wrong please re-run the program");
			
			i=0;
			
		}
			 i++;
		}
		
		
	}
	
	public Operations addition(Operations getval){
		Operations results = new Operations();
		results.feet = this.feet + getval.feet;
		results.inch = this.inch + getval.inch;
		
		if(results.inch%12!=0){
			results.feet = results.feet + results.inch%12;
			results.inch = results.inch - 12;
		}
		
		return results;
	}
	
	public Operations subtraction(Operations a){
		Operations ressub = new Operations();
		ressub.feet = this.feet - a.feet;
		ressub.inch = this.inch - a.inch;
		
		return ressub;
	}
	
	
}