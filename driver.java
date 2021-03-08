import src.HugeInteger;

public class driver {
	public static void main(String[] args) throws Exception 
	{
		HugeInteger h1 = new HugeInteger("89");
		HugeInteger h2 = new HugeInteger("47");
		HugeInteger ans = h1.addition(h2);
		ans.display();
	}

}
