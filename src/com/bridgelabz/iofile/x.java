package com.bridgelabz.iofile;

import java.util.Arrays;

public class x {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int n = Integer.parseInt("5");
		int a[] = new int[10];

		for(int i=0;i<a.length;i++)
		{
			a[i] = (int)( Math.random()*50)+1;
			
		}
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		System.out.println("Second Largest : " +a[a.length-2]);
		
		System.out.println("Largest : " +a[a.length-1]);

		System.out.println("Second Minimum : " +a[1]);

		System.out.println("Minimum : " +a[0]);

		
	}

}
