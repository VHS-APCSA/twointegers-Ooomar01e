
public class TwoIntegers 
{
	private int first;
	private int second;
	
	public TwoIntegers()
	{
		first = -1;
		second = -1;
	}
	public TwoIntegers( int first, int second)
	{
		this.first = first;
	    this.second = second;
	}
	public int getFirst()
	{
		return first;
	}
	public void setFirst( int first)
	{
		this.first = first;
	}
	public int getSecond()
	{
		return second;
	}
	public void setSecond( int second)
	{
		this.second = second;
	}
	public String arithmetic()
	{
		int sum = first + second;
		int dif = first - second;
		int prod = first * second;
		double quo = (double) first / second;
		
		return "The sum equals " + sum + "." + "The diffrence equals " + dif + "." + "The product is " + prod + "." + "The quotient is " + quo + "." ;
	}
	public String larger()
	{
		if(first > second)
		{
			return "The larger number is" + first  + ".";
		}	
		else if (first < second)
		{
			return "The larger number is " + second + ".";
		} 
		else
		{ 
			return first + "is equall to " + second;
		}
	}
	public boolean isEven()
	{
		if(first + second % 2 == 0)
		{
			return true;
		}
		else
		{ 
			return false;
		}
	}
	public boolean Multiple()
	{
			if(first + second % 2 == 0)
			{
				return true;
			}
			else
			{ 
				return false;
			}
	}
	
}
