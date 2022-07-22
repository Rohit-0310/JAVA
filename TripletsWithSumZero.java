import java.io.*;
import java.util.*;
import java.lang.*;

class TripletsWithSumZero{
    
    
    public static void triplate(int[] arr, int num)
    {
        // System.out.println(num);
        Arrays.sort(arr);
        int count = 0;
        
        for(int i = 0; i < num; i++)
        {
            int left = i+1;
            int right = num - 1;
            int x = arr[i];
            
            while(left < right)
            {
                if(x+arr[left] + arr[right] == 0)
                {
                    count++;
                    left++;
                    right--;
                }
                else if(x+arr[left] + arr[right] < 0)
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }
        }
        System.out.println(count);
        
    }
    
    
    
    
    public static void main(String args[])
    {
        // Scanner sc = new Scanner(System.in);
        
        // int num  = sc.nextInt();
        // int arr[] = new int[num];
        
        // for(int i = 0; i < num; i++)
        // {
        //     arr[i] = sc.nextInt();
        // }
        // triplate(arr, num);

        int arr[] = {2, -5, -8, 10, 0, 5, 4, 7, -2, -7};

        triplate(arr, arr.length);
    }
}