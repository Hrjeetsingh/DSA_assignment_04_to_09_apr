//Print odd numbers till 31 using recurtion

class GFG
{
	static final int N = 31;
	static int n = 1;

	
	static void fun1()
	{
		if (n <= N)
		{
			System.out.printf("%d ", n);
			n++;
			fun2();
		}
		else
		{
			return;
		}
	}

	
	static void fun2()
	{
		if (n <= N)
		{
			System.out.printf("%d ", n);
			n++;
			fun1();
		}
		else
		{
			return;
		}
	}

	public static void main(String[] args)
	{
		fun1();
	}
}




// program to reverse a string using recursion

class StringReverse
{

	void reverse(String str)
	{
		if ((str==null)||(str.length() <= 1))
		System.out.println(str);
		else
		{
			System.out.print(str.charAt(str.length()-1));
			reverse(str.substring(0,str.length()-1));
		}
	}
	
	
	public static void main(String[] args)
	{
		String str = "Geeks for Geeks";
		StringReverse obj = new StringReverse();
		obj.reverse(str);
	}
}

// . Find the factorial of a number using recurtion
class Factorial {

    public static void main(String[] args) {
        int num = 6;
        long factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static long multiplyNumbers(int num)
    {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }
}


// Find the nth power of any given number using recurtion

class Power {
    public static void main(String[] args) {
        
      int base = 3, powerRaised = 4;
      int result = power(base, powerRaised);
  
      System.out.println(base + "^" + powerRaised + "=" + result);
    }
  
    public static int power(int base, int powerRaised) {
      if (powerRaised != 0) {
  
        // recursive call to power()
        return (base * power(base, powerRaised - 1));
      }
      else {
        return 1;
      }
    }
  }