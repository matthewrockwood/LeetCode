class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //HashMap<Integer,Integer> map = new HashMap<>();
        List<List<Integer>> list = new LinkedList<>();
        
        Arrays.sort(nums);
        

        for(int i=0;i<nums.length-2;i++){
            if(i>0&&nums[i-1]==nums[i]){
                   continue; 
                }
            int pointer1 = i+1;
            int pointer2 = nums.length-1;
            while(pointer1<pointer2){
                int currNum = nums[i]+nums[pointer1]+nums[pointer2];
                
                if(currNum<0){
                    pointer1++;
                    continue;
                }
                if(currNum>0){
                    pointer2--;
                    continue;
                }
                List<Integer> currList = new ArrayList<>();
                currList.add(nums[i]);
                currList.add(nums[pointer1]);
                currList.add(nums[pointer2]);
                list.add(currList);
                pointer1++;
                
                    while(pointer1<pointer2 && nums[pointer1]==nums[pointer1-1]) pointer1++;
            }
        }
        return list;
    }
}
