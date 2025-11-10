class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int left = 0;
        int right = 1;
        Set<Character> set = new HashSet<>();

        int max = 1;
        char[] chars = s.toCharArray();
        set.add(chars[0]);

        

        while(left<s.length()&&right<s.length()){
            if(!set.contains(chars[right])){
                set.add(chars[right]);
                max = Math.max(max,set.size());
                right++;
                
                continue;
            }
            if(set.contains(chars[right])){
                set.remove(chars[left]);
                left++;
            }

        }
        return max;
    }
}
