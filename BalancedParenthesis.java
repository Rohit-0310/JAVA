import java.util.*;

class BalancedParenthesis{
    
    public static boolean balancePranthesis(String str)
    {
        Stack<Character> stack = new Stack<>();
        
        HashMap<Character, Character> map =new HashMap<>();
        
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i)=='{' || str.charAt(i)=='[' || str.charAt(i)=='(')
            {
                stack.push(str.charAt(i));
            }
            
            else {
                if(stack.isEmpty()){
                    return false;
                }
                
                if(map.get(str.charAt(i)) != stack.peek())
                {
                    return false;
                }
                
                stack.pop();
                
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
    
    
    public static void main(String[] args)
    {

        //-------- for Oj Input taking part------------- for custom input
        // Scanner sc = new Scanner(System.in);
        
        // int t = sc.nextInt();
        
        // while(t --!= 0)
        // {
        //     String str = sc.next();
        //     // System.out.println(str);
        //     boolean result = balancePranthesis(str);
        //     if(result){
        //         System.out.println("balanced");
        //     }else{
        //         System.out.println("not balanced");
        //     }
        // }


        
        //-------------------- for VS-Code Input taking------------------------
          String str = "{([])}";
            // System.out.println(str);
            boolean result = balancePranthesis(str);
            if(result){
                System.out.println("balanced");
            }else{
                System.out.println("not balanced");
            }
        
    }
}