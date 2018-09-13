import java.util.Scanner;
public class array
{
    static void rev(int arr[] , int n)
    {
        for(int i = n-1 ; i >= 0 ; i-- )
        {
         
          System.out.println(arr[i]);
        }
    }
    public static void main(String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = s.nextInt();
        }
        rev(arr,n);
    }
   
}