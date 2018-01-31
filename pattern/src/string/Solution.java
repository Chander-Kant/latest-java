package string;

import java.util.Scanner;

class Solution {
	public int solution(int A, int B, int K)
	{
		int count=0;
		for(int i=A;i<=B;i++)
		{
			if(i%K==0)
			{
				count++;
				
			}
			}
		return count;
			
		}
		
	
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Solution sl= new Solution();
	System.out.println("Enter A(start), B(end), K(divisor)");
	int A= sc.nextInt();
	int  B= sc.nextInt();
	int  K= sc.nextInt();
	int var= sl.solution(A, B, K);
	System.out.println(var);
	

}}
