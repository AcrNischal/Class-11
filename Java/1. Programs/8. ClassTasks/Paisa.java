import java.util.Scanner;

class Paisa{
	public static void main(String[] args){
		Currency object1 = new Currency();
		Currency object2 = new Currency();
		Currency add = new Currency();
		Currency sub = new Currency();
		Currency grater = new Currency();
		object1.getData();
		object2.getData();
		
		add = object1.add(object2);
		//diff = object1.diff(object2);
		//grater = object1.grater(object2);
		
		System.out.println("The Addition of Money\nRs. " + add.rs + "Paisa. "+ add.paisa);
	}
}

class Currency{
	int rs, paisa;
	
	void getData(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rupees: ");
		rs = sc.nextInt();
		System.out.println("Enter Paisa: ");
		paisa = sc.nextInt();
	}
	
	Currency add(Currency data){
		Currency addval =  new Currency();
		addval.rs = data.rs + this.rs;
		addval.paisa = data.rs + this.paisa;
		
		if(addval.paisa >= 100){
			addval.rs = addval.rs +  paisa/100;
			addval.paisa = paisa%100;			
		}
		return addval;
	}
	
	//Currency diff(){
	//	Currency diffval =  new Currency();
	//	diffval.rs = data.rs - this.rs;
	//	diffval.paisa = data.rs - this.paisa;
		
	//	if(addval.paisa < 0){
	//		diffval.rs -=1;
	//		diff.paisa = 10+diffval.paisa;
	//	}
		
	//}
	
	//Currency grater(){
	//	Currency graterval =  new Currency();
	//}
}