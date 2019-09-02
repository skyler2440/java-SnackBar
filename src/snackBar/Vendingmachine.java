package snackBar;

public class Vendingmachine
{
	private static int maxId = 0;
	private int id;
	private String name;

	public Vendingmachine(String name)
	{
		maxId++;
		id = maxId;
		this.name = name;
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	@Override
	public String toString()
	{
		String rtnStr = "id: " + id + "\n" +
						"name: " + name + "\n";
		return rtnStr;
	}
}