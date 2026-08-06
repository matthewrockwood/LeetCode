public class Solution {
    public int AddDigits(int num) {
        int temp = 0;
        if(num<10) return num;
        else{
            temp = num%10;
           return (AddDigits(num/10+temp));
        }
        return -1;
        
       
    }
}