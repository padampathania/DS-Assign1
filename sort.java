import java.util.Scanner;
public class array
{
    static void sort(int arr[] , int n)
    {
        for(int i = 0 ; i < n-1 ; i++ )
        {
            for(int j = 0 ; j < n-i-1 ; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
        sort(arr,n);
        for(int i = 0 ; i < n ; i++)
        {
            System.out.println(arr[i]);
        }
    }
   
}