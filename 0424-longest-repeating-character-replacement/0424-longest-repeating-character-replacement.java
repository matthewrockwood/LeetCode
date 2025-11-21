class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;

        int max = 0;

        Map<Character,Integer> map = new HashMap<>();
        int maxCount = 0;
        while(right<s.length()){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);

            if(map.get(s.charAt(right))>maxCount) maxCount = map.get(s.charAt(right));
            while((right-left+1)-maxCount>k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
                
            }
            max=Math.max(max,right-left+1);
                right++;
        }
        return max;

    }
}
