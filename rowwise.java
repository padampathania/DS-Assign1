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
		int arr[][] = new int [n][n];
		for(int i = 0 ; i < n ; i++)
		{
		    for(int j = 0 ; j < n ; j++ )
		    {
		       arr[i][j] = s.nextInt();
		    }
		}
		int i , j;
	    for(i = 0 ; i < n ; i++)
	    {
	        for(j = 0 ; j < n ; j++)
	        {
	            System.out.print(arr[i][j] + " , ");
	            if(j == n-1)
	            {
	                for(j = n-1 ; j >= 0 ; j--)
	                {
	                    System.out.print(arr[i+1][j] + " , ");
	                }
	                i++; j=n;
	            }
	        }
	    }
	}
}