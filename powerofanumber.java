/*pow() function is used to calculate the power of any base and it is defined in math.h header file. Write a program to read X as the base and N as the power and calculate the result (X^N - X to the power of N).

Input format:

The first line containing integer denotes the base(X)

The second line containing integer denotes the power(N)

Output format:

Print the power of a number

Sample Input:

2

3

Sample Output:

8*/





package Jayasrijavapractice;
import java.util.Scanner;
public class powerofanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int num1=sc.nextInt();
      int num2=sc.nextInt();
      System.out.printf("%.0f",Math.pow(num1,num2));
      sc.close();
	}

}
