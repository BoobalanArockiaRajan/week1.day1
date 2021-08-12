package week1.day1;

public class Amstrongnumber {

	public static void main(String[] args) {
	int n=267;
	int sum=0;
	int result=sum;
	
	while (n<0) {
		int rem=n%10;
		sum =(sum+(rem*rem*rem));
		n=n/10;
	}
	if(result==n) {
		System.out.println("It is an Amstrong Number");
	}
	else
		System.out.println("It is Not an Amstorng Number");
	
		
	}

}
