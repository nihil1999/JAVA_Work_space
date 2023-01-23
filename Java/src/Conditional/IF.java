package Conditional;

public class IF {

	// To check add or even.
	public void check_add_or_even(int n) 
	
	{	
		if (n > 0) // if given number is greater than 0, it gets inside the block.
		{
			if (n % 2 == 0) // true block.To check if the number is even that is if remainder equals to 0.
				System.out.println(n + " is an even number.");

			else // false block the number is odd that is if remainder not equals to 0.
				System.out.println(n + " is an odd number.");
		}

		else {
			if (n == 0)
				System.out.println("Change the number since it is 0.");
			else
				System.out.println("Change the number since it is less than 0.");
		}
	}

	// To check a number is divisible by 3 or not.
	public void check_number_divisibleBy_3(int n) 
	
	{
		if (n % 3 == 0) // true block.To check if the number is divisible by 3 that is if remainder
						// equals to 0.
			System.out.println(n + " is divisible by 3.");

		else // false block.To check if the number is divisible by 3 that is if remainder not
				// equals to 0.
			System.out.println(n + " is not divisible by 3.");
	}

	// To check numbers are equal or not.
	public void check_number_is_equal(int num1, int num2) 
	
	{
		if (num1 == num2) // true block.To check if the number is equal or not.
			System.out.println("Numbers are equal.");

		else // false block.
			System.out.println("Numbers are not equal.");
	}

	// To check which number is greatest among 2 numbers.
	public int check_greater_number(int num1, int num2) 
	
	{
		if (num1 != num2) {
			if (num1 > num2) // true block.To check first number is greater.
			{
				System.out.println(num1 + " is greater.");
				return num1;
			} else // false block.Second number is greater.
			{
				System.out.println(num2 + " is greater.");
				return num2;
			}
		} else {
			System.out.println("Numbers are equal, so change the number.");
			return 0;
		}
	}

	// To check which number is greatest among 3 numbers.
	public void check_greater_number(int num1, int num2, int num3) 
	
	{
		if (num1 != num2 && num2 != num3 && num1 != num3) {
			if (num1 > num2 && num1 > num3) // To check first number is greater.
				System.out.println(num1 + " is greater.");

			else if (num2 > num1 && num2 > num3) // Second number is greater.
				System.out.println(num2 + " is greater.");

			else // third number is greater
				System.out.println(num3 + " is greater.");
		} else {
			System.out.println("Numbers are equal, so change the number.");
		}
	}

	// To check which number is lowest among 2 numbers.
	public void check_lowest_number(int num1, int num2) 
	
	{
		if (num1 != num2) {
			if (num1 < num2) // true block.To check first number is lowest.
				System.out.println(num1 + " is lowest.");

			else // false block.Second number is lowest.
				System.out.println(num2 + " is lowest.");
		} else {
			System.out.println("Numbers are equal, so change the number.");
		}
	}

	// To check which number is lowest among 3 numbers.
	public void check_lowest_number(int num1, int num2, int num3) 
	
	{
		if (num1 != num2 && num2 != num3 && num1 != num3) {
			if (num1 < num2 && num1 < num3) // To check first number is greater.
				System.out.println(num1 + " is smallest.");

			else if (num2 < num1 && num2 < num3) // Second number is greater.
				System.out.println(num2 + " is smallest.");

			else // third number is greater
				System.out.println(num3 + " is smallest.");
		} else {
			System.out.println("Numbers are equal, so change the number.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IF obj = new IF();
		obj.check_add_or_even(6);
		obj.check_number_divisibleBy_3(7);
		obj.check_number_is_equal(5, 4);
		System.out.println("Largest numbers is :" + obj.check_greater_number(10, 100));
		obj.check_greater_number(30, 50, 70);
		obj.check_lowest_number(50, 30);
		obj.check_lowest_number(108, 20, 100);
	}

}
