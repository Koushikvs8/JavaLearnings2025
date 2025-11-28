package arrays.ArraysCoading;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a= { 2,45,56,78,65,12,32,56,90};
		System.out.println("Enter any number  of :"+Arrays.toString(a));
		Scanner input=new Scanner(System.in);
		int value=input.nextInt();
		boolean flag=false;
		for(int x:a)
		{
           if(x==value) 
           {
        	   flag=true;
        	   break;
           }
         	
	}
		if(flag)
		{
			System.out.println("the element is found");
		}
		else
		{
			System.out.println("the element not found");
		}

}}
