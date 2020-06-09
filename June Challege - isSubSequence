class Solution {
public:
    int checkLetterWise(string t, char s, int pos){
        
        for(int i=pos;i<t.length();i++){
            if(t[i]==s){
                return i+1;
            }
        }
        
        return -1;
        
    }
    bool isSubsequence(string s, string t) {
                      
        int pos=0,i=0;
        
        if(t.length()<1 && s.length()<1){
            return true;
        }
        
        if(s.length()>t.length()){
             return false;
        }
        
        
        while(pos!=-1 && i<s.length() && pos<t.length()){
          
          pos=checkLetterWise(t,s[i],pos);  
          i++;
        }
           
         if(pos!=-1 && i==s.length()){
             return true;
         }
       
         return false;
        
    }
};
