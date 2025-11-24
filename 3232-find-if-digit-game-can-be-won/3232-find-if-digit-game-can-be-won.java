class Solution {
    public boolean canAliceWin(int[] nums) {
        int total1 = 0;
        int total2 = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]/10==0) total1+=nums[i];
            else total2+=nums[i];
        }
        if(total1==total2)return false;
        return true;
    }
}