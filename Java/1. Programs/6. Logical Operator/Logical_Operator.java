
class Logical_Operator {

	public static void main(String[] args) {

		boolean var_1 = true, var_2 = false;

		System.out.println("Logical OR Operation of " + var_1 + " and " + var_2 + " will be " + (var_1 || var_2));
		System.out.println("Logical OR Operation of " + var_1 + " and " + var_1 + " will be " + (var_1 || var_1));
		System.out.println("Logical OR Operation of " + var_2 + " and " + var_1 + " Will be " + (var_2 || var_1));
		System.out.println("Logical OR Operation of " + var_2 + " and " + var_2 + " will be " + (var_2 || var_2));
		System.out.println("");

		System.out.println("Logical AND Operation of " + var_1 + " and " + var_2 + " will be " + (var_1 && var_2));
		System.out.println("Logical AND Operation of " + var_1 + " and " + var_1 + " will be " + (var_1 && var_1));
		System.out.println("Logical AND Operation of " + var_2 + " and " + var_1 + " will be " + (var_2 && var_1));
		System.out.println("Logical AND Operation of " + var_2 + " and " + var_2 + " will be " + (var_2 && var_2));
		System.out.println("");

		System.out.println("Logical NOT Operation of " + var_2 + " will be " + (!var_2));

	}

}