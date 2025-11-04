class Solution {
    public int maxProfit(int[] prices) {
        //changes
     
     int pointer1 = 0;
     int pointer2 = 1;

    int max = 0;

    while(pointer2<prices.length){
        int curr = prices[pointer2]-prices[pointer1];
        if(curr>max) max = curr;
        if(prices[pointer1]>prices[pointer2]){
            pointer1=pointer2;
            pointer2++;
        }
        else{
            pointer2++;
        }
        
    }
    return max;
    }
}