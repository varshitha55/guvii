

import java.util.*;
import java.lang.*;
import java.io.*;

class num
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
			int[] a=new int[10];
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int tmp=a[j];
					a[j]=a[j+1];
					a[j+1]=tmp;
			}	}
		}
		System.out.println(a[0]);
	}
}
