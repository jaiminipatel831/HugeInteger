import src.HugeInteger;
import src.LinkedList;

public class hugeinteger {
	private LinkedList number;
	public HugeInteger(String num)
	{
		number = new LinkedList();
		for(int i=0; i< num.length(); i++)
		{
			number.addLast(Integer.parseInt("" + num.charAt(i)));
		}
	}
	public HugeInteger addition(HugeInteger h) 
	{
		try
		{
			int carry = 0;
			int currposition1 = this.number.length()-1;
			int currposition2 = h.number.length()-1;  
			int currvalue;
			int currNode1;
			int currNode2;
			
			String ans = "";
			do
			{
			if(currposition1 < 0)
			{
				currNode1 = 0;
			}
			else
			{
				currNode1 = this.number.get(currposition1).getPayload();
			} 
			if(currposition2 < 0)
			{
				currNode2 = 0;
			}
			else
			{
				currNode2 = h.number.get(currposition2).getPayload();
			}
			currvalue = currNode1+currNode2+carry;
			if(currvalue > 9)
			{
				carry = 1;
				currvalue = currvalue - 10;
			}
			else
			{
				carry = 0;
			}
			ans = currvalue + ans;
			currposition1--;
			currposition2--;
			}
			while(currposition1 >= 0 || currposition2 >= 0);
			if(carry == 1)
			{
				ans = carry + ans;
				
			}
			System.out.println(ans);
			return new HugeInteger(ans);
			}
		catch(Exception e)
		{
			return null;
		}
		
	}
	public void display() throws Exception
	{
		//this.number.display();
		for(int i=0; i < this.number.length(); i++)
		{
			this.number.get(i).display();
		}
		this.number.display();
	}
}
