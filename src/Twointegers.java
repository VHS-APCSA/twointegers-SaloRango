public class Twointegers 
{
	private int num1;
	private int num2;
	
	public Twointegers()
	{
		num1 = 0;
		num2 = 0;
	}
	
	public Twointegers(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}	


	public int getNum1()
	{
		return num1;
	}
	
	public int getNum2()
	{
		return num2;
	}
	
	public void setNum1(int num1)
	{
		this.num1 = num1;
	}
	
	public void setNum2(int num2)
	{ 
		this.num2 = num2;
	}
	
	public String arithmetic()
	{	
		return (num1 + " + " + num2 + " = " + (num1 + num2) + "\n" +
				num1 + " - " + num2 + " = " + (num1 - num2) + "\n" +
				num1 + " * " + num2 + " = " + (num1 * num2) + "\n" +
				num1 + " / " + num2 + " = " + ((double) num1 / num2) + "\n");
	}
	
	public int larger()
	{
		if(num1 > num2)
		{
			return num1;
		}
		
		else if(num1 < num2)
		{
			return num2;
		}
		
		else
		{
			return num1;
		}
	}
	
	public boolean isEven()
	{
		if((num1 + num2) % 2 == 0)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	public boolean isMultiple()
	{
		if(num2 % num1 == 0)
		{
			return true;
		}
		
		else
		{
			return false;
		}

	}
}
