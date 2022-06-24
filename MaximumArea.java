import java.util.*;

class Main{
    
    public static void maximumRectangleArea(int[] arr, int n)
    {
        
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        int i = 0;
        while(i < n) {
            while(stack.peek() != -1 && arr[stack.peek()] > arr[i]) {
                maxArea = Math.max(maxArea, arr[stack.pop()] * (i - stack.peek() - 1));
            }
            stack.push(i++);
        }
        while(stack.peek() != -1) {
            maxArea = Math.max(maxArea, arr[stack.pop()] * (arr.length - stack.peek() - 1));
        }
        // return maxArea;
        
        
        System.out.println(maxArea);
    }
    
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t --!= 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
        
            for(int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
            maximumRectangleArea(arr, n);
        }
        
    }
}



// import java.util.*;

// class Main{
    
//     public static void detactPalindrome(int[] arr, int n)
//     {
        
//         int maxArea = 0;
//         int minHeight = 0;
//         for(int i = 0; i < n; i+=1)
//         {
//             maxArea = Math.max(arr[i], maxArea);
//             minHeight = arr[i];
//             for(int j = i-1; j >= 0 ; j-=1)
//             {
//                 minHeight = Math.min(arr[j], minHeight);
//                 int width = (j-i+1);
//                 maxArea = Math.max(maxArea, (minHeight*width));
//             }
//         }
        
//         System.out.println(maxArea);
//     }
    
    
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
        
//         int t = sc.nextInt();
        
//         while(t --!= 0)
//         {
//             int n = sc.nextInt();
//             int arr[] = new int[n];
        
//             for(int i = 0; i < n; i++)
//             {
//                 arr[i] = sc.nextInt();
//             }
//             detactPalindrome(arr, n);
//         }
        
//     }
// }










// ----------------------------------Nested Loop --------------------------------



// import java.util.*;

// class Main{
    
//     public static void detactPalindrome(int[] arr, int n)
//     {
//         int maxArea = 0;
//         for (int i = 0; i < n; i+=1) 
//         {
//             for (int j = i; j < n; j+=1) 
//             {
//                 int minHeight = Integer.MAX_VALUE;
//                 for (int k = i; k <= j; k+=1)
//                 {
//                     minHeight = Math.min(minHeight, arr[k]);
//                 }
//                     maxArea = Math.max(maxArea, minHeight * (j - i + 1));
//             }
//         }
        
//         System.out.println(maxArea);
//     }
    
    
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
        
//         int t = sc.nextInt();
        
//         while(t --!= 0)
//         {
//             int n = sc.nextInt();
//             int arr[] = new int[n];
        
//             for(int i = 0; i < n; i++)
//             {
//                 arr[i] = sc.nextInt();
//             }
//             detactPalindrome(arr, n);
//         }
        
//     }
// }
