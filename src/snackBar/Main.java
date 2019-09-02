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

		System.out.println("*** 1. CX 1 buys 3 of snack 4 ***");
		c1.setCashOnHand(c1.getCashOnHand() - (s4.getCost() * 3.0));
		s4.setQuantity(s4.getQuantity() - 3);
		System.out.println("Cash on hand: " + c1.getCashOnHand() + " Quantity: " + s4.getQuantity());

		System.out.println("*** 2. CX 1 buys 1 of snack 3 ***");
		c1.setCashOnHand(c1.getCashOnHand() - (s3.getCost() * 1));
		s3.setQuantity(s3.getQuantity() - 1);
		System.out.println("Cash on hand: " + c1.getCashOnHand() + " Quantity: " + s3.getQuantity());

		System.out.println("*** 3. CX 2 buys 2 of snack 4 ***");
		c2.setCashOnHand(c2.getCashOnHand() - (s4.getCost() * 2));
		s4.setQuantity(s4.getQuantity() - 2);
		System.out.println("Cash on hand: " + c2.getCashOnHand() + " Quantity: " + s4.getQuantity());

		System.out.println("*** 4. CX 1 finds 10 ***");
		c1.setCashOnHand(c1.getCashOnHand() + 10);
		System.out.println("Cash on hand: " + c1.getCashOnHand());

		System.out.println("*** 5. CX 1 buys 1 of snack 2 ***");
		c1.setCashOnHand(c1.getCashOnHand() - (s2.getCost() * 1));
		s2.setQuantity(s2.getQuantity() - 1);
		System.out.println("Cash on hand: " + c1.getCashOnHand() + " Quantity: " + s2.getQuantity());

		System.out.println("*** 6. Add 12 items to Snack 3 ***");
		s3.setQuantity(s3.getQuantity() + 12);
		System.out.println("Quantity: " + s3.getQuantity());

		System.out.println("*** 7. CX 2 buys 3 of snack 3 ***");
		c2.setCashOnHand(c2.getCashOnHand() - (s3.getCost() * 3));
		s3.setQuantity(s3.getQuantity() - 3);
		System.out.println("Cash on hand: " + c2.getCashOnHand() + " Quantity: " + s3.getQuantity());
	}

	public static void main(String[] args)
	{
		workWithData();
	}
}