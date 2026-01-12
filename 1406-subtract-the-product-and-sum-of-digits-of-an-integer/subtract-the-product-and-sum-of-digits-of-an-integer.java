class Solution {
    public int subtractProductAndSum(int n) {

        int psum = 1;
        int dsum = 0;

        while (n > 0) {
            int digit = n % 10;  
            psum *= digit;      
            dsum += digit;       
            n /= 10;             
        }

        return psum - dsum;
    }
}

