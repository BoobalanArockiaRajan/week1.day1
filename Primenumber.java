package week1.day1;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=17;
		
		int num2=0;
		
		for (int i = 1; i <= num; i++) 
			if(num%i==0) 
				num2=num2+1;
			
		if(num2==2) 
			System.out.println("Given Number is Prime");
		else 
			System.out.println("Given Number is not Prime");

	}

}
