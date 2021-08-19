class Solution {
    public boolean isPalindrome(int x) {
        if(x == 0) {
    		return true;
    	}
        try{
            if(x != 0){
                if(x > 0){
                	
                	int reverse = 0;
                	int value = x;
                	while(x != 0) {
                		int dummy = x % 10;
                		x = x / 10;
                		reverse = (reverse * 10) + dummy;
                	}
                   
                 
                	if(reverse == value) {
                		return true;
                	}
                	else {
                		return false;
                	}
                	
                }
                else if(x < 0){
                    return false;
                }
            }
        }
        catch(Exception e){
                return false;
        }
      
        return false;
    }
}