import java.io.*;
import java.util.*;

public class NewClass
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the amount of numbers :");
        int n = scanner.nextInt();
        
        int arr[] = new int[n];
        
        for(int i = 0;i<n;i++)
        {
            System.out.print("Enter number here :");
            arr[i] = scanner.nextInt();
        }
                
        for(int i = 0;i<n-1;i++)
        {
            for(int j = 0;j<n-i-1;j++)
            {
                if(arr[j] < arr[j + 1])
                {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for(int num : arr)
            System.out.println(num);
        
        scanner.close();
    }
}
