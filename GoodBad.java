import java.util.*;
class GoodBad{
    
    public static void goodAndBad(String str, String good)
    {
        str+=" ";
        for(int i=0; i < str.length()-1; i++){
            if(str.charAt(i)!=str.charAt(i+1)){
                good+=str.charAt(i);
            }
        }
        System.out.println(good);
    }
    
    
    public static void main(String[] args){
            // Scanner sc = new Scanner(System.in);
            // int t = sc.nextInt();
            // while(t--!=0){
            //     String str = sc.next();
            //     goodAndBad(str, "");
            // }
        
        String str = "aaab";
        goodAndBad(str, "");
        
    }
}