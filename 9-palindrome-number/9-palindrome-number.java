class Solution {
    public boolean isPalindrome(int x) {
        int rem=0, check=0, temp=x;
        while(x>0) {
            rem = x%10;
            check = check*10+rem;
            x = x/10;
        }
        if(check == temp)
            return true;
        else 
            return false;
    }
}


