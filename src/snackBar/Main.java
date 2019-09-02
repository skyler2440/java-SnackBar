package snackBar;

public class Main
{
	private static void workWithData()
	{
		Vendingmachine v1 = new Vendingmachine("Food");
		Vendingmachine v2 = new Vendingmachine("Drink");
		Vendingmachine v3 = new Vendingmachine("Office");

		Customer c1 = new Customer("Jane", 45.25);
		Customer c2 = new Customer("Bob", 33.14);

		//name qty cost vendid
		Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
		Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
		Snack s3 = new Snack("Pretzel", 30, 2.00, v1.getId());
		Snack s4 = new Snack("Soda", 24, 2.50, v2.getId());
		Snack s5 = new Snack("Water", 20, 2.75, v2.getId());

		System.out.println("*** Vending Machines ***");
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println("*** Customers ***");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("*** Snacks ***");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}

	public static void main(String[] args)
	{
		workWithData();
	}
}