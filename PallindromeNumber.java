class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0){
            return false;
        }
        
        int temp =x,val=0;
        
        while(temp>0){
            val=val*10+temp%10;
            temp=temp/10;
        }
        if(val==x){
            return true;
        }
        else{
            return false;
        }
        
    }
}
