package Reverse_array;

import java.util.Scanner;

class Arrayprob{
	public static int[] verify(int A[]) 
	{
		Scanner	sc = new Scanner(System.in);
	int size = A.length;
	int B = 0;
	int C = size-1;
	while(B<C) {
		int temp = A[B];
		A[B]=A[C];
		A[C]=temp;
		B++;C--;
	}
	return A;
	}
}
public class Reversingarray{
	public static void main (String[] args) {
	Scanner	sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int [n];
	for (int i=0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
	}
	Arrayprob Array = new Arrayprob();
	int pair[]=Arrayprob.verify(arr);
	for(int i=0;i<pair.length;i++) {
		System.out.print(pair[i]+" ");
	}
	
	
	}
}