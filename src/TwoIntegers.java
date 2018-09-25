
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
		
		return  first + "+" + second + "=" + sum + "," + first + "-" + second + "=" + dif + "," + first + "*" + second + "=" + prod + "," + first + "/" + second + "=" + quo + "," ;
	}
	public int larger()
	{
		if(first > second)
		{
			return first;
		}	
		else if (first < second)
		{
			return second;
		} 
		else
		{ 
			return first;
		}
	}
	public boolean isEven()
	{
		if((first + second) % 2 == 0)
		{
			return true;
		}
		else
		{ 
			return false;
		}
	}
	public boolean multiple()
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
