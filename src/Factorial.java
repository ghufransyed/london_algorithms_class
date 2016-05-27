/**
 * Created by ghufran on 5/27/16.
 */
public class Factorial {
    
    public static int FactorialRecursive(int n){
        if (n == 0){
            return 1;
        }
        else{
            System.out.println("Recursive call here!");
            System.out.println("Value of n is: " + n);
            return n * FactorialRecursive(n - 1);
        }
    }
    
    
    public static int FactorialIterative(int n){
        int result = 1;
        
        for (int i = 0 ; i <= n ; i++){
            System.out.println("Iteration here!");
            result *= i;
        }
        
        return result;
        
    }
    public static void backwardsString(String s){
        if (s.equals("")){
            return;
        }
        else{
            System.out.print(s.charAt(s.length() - 1));
            backwardsString(s.substring(0,s.length() - 1));
            return;
        }
    }
}
