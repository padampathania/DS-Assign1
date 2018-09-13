import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class array
{
	public static void main (String[] args) 
	{
	    int n;
	    Scanner s = new Scanner(System.in);
	    n = s.nextInt();
		int arr1[] = new int [n];
		int arr2[] = new int [n];
		for(int i = 0 ; i < n ; i++)
		{
		    arr1[i] = s.nextInt();
		}
		for(int i = 0 ; i < n ; i++)
		{
		    arr2[i] = s.nextInt();
		}
		int i=0 , j=0 , k=0 ,count=0;
		int temp[] = new int[n];
		while(i < n)
		{
		    int data = arr1[i];
		    for(j = 0 ; j < n ; j++)
		    {
		        if(data == arr2[j])
		        {
		            temp[k] = data;
		            k++;
		            count++;
		            arr2[j] = -1;
		            break;
		        }
		    }
		    i++;
		}
		for(int z = 0 ; z < count ; z++  )
		{
		   for(int zz = 0 ; zz < count-z-1 ; zz++ )
		   {
		       if(temp[zz]>temp[zz+1])
		       {
		           int var = temp[zz];
		           temp[zz] = temp[zz+1];
		           temp[zz+1] = var;
		       }
		   }
		}
		for(int z = 0 ; z < count ; z++)
		{
		    System.out.println(temp[z]);
		}
	}
}
