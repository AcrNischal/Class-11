// Fibonacc series upto nth

import java.util.Scanner;

class Fibonacc{
	public static void main(String[] args){
		
		int a = 100;
		int sum =0;
		for(int i=1; i<a; i++){
			if(i%3 ==0|| i%5 == 0){sum=sum+i;}
		}
		System.out.println(sum);
	}
}