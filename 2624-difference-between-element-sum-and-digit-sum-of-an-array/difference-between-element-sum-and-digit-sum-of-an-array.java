class Solution {
    public int differenceOfSum(int[] nums) {
        int n_Sum=0;
        int dig_Sum=0;
        for(int dig:nums){
            n_Sum+=dig;

            int temp=dig;
            while(temp>0){
                dig_Sum+=temp%10;
                temp/=10;
            }
          
        }
        return Math.abs(n_Sum-dig_Sum);    
    }
}