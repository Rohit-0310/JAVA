import java.util.*;

class FindArrayAndMinimum{
   
    public static void main(String[] args)
    {
        // Scanner sc = new Scanner(System.in);
        
        // int r = sc.nextInt();
        // int c = sc.nextInt();
        // int arr[][] = new int[r][c];
        // for(int i = 0; i < r; i++){
        //     for(int j = 0; j < c; j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
        // System.out.println(ArrayAndMinimum(arr,r,c));


        // custom input
        int R=2;
        int C=2;
        int arr[][] ={{8, 5},
                {6, 8}};
 
        System.out.println(ArrayAndMinimum(arr, R, C));
        
    }
    
    
    public static int ArrayAndMinimum(int[][] arr, int r, int c)
    {
        for (int i = 0; i < r; i++)
        Arrays.sort(arr[i]);
 
    int ans = Integer.MAX_VALUE;
 
    for (int i = 0; i < r - 1; i++)
    {
        for (int j = 0; j < c; j++)
        {
 
        int p = bsearch(0, c-1, arr[i][j], arr[i + 1]);
        ans = Math.min(ans, Math.abs(arr[i + 1][p] - arr[i][j]));
 
        if (p-1 >= 0)
            ans = Math.min(ans,
                        Math.abs(arr[i + 1][p - 1] - arr[i][j]));
        }
    }
    return ans;
        
    }
    
    
    public static int bsearch(int low, int high, int n, int arr[])
    {
        int mid = (low + high)/2;
    
        if(low <= high)
        {
            if(arr[mid] < n)
                return bsearch(mid +1, high, n, arr);
            return bsearch(low, mid - 1, n, arr);
        }
    
        return low;
    }
}