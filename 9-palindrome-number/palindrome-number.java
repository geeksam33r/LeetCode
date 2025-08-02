import java.util.*;
class Solution {
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        int palindrome = x;
        int rev=0;
        while(palindrome!=0){
            int rem =palindrome%10;
            rev=rev*10+ rem;
            palindrome=palindrome/10;
        }
        if (x==rev){
            return true;
        }
        return false;

        
        
    }

public static void main(String args[]){
    System.out.println("x= ");
    Scanner sc =new Scanner(System.in);
    int x=sc.nextInt();
    System.out.println(isPalindrome(x));
        
    }
    
        
    
}

