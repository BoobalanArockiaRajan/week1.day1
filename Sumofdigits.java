package week1.day1;

public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=567;
int sum =0;
while(n!=0)
{
	int rem =n%10;
	sum =sum+rem;
	n=n/10;
	}
System.out.println("Sum Of The Digit is"+sum);
	}

}
