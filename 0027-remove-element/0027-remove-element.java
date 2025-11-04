class Solution {
    public int removeElement(int[] nums, int val) {
        int p1 = 0;
        int p2 = nums.length-1;
        
        //repo

        while(p1<=p2){
            if(nums[p2]==val){
                p2--;
                continue;
            }
            if(nums[p1]==val){
                nums[p1] = nums[p2];
                p1++;
                p2--;
                System.out.println(nums[p1]);
            }
            else{
                p1++;
            }
        }
        return p1;
    }
}