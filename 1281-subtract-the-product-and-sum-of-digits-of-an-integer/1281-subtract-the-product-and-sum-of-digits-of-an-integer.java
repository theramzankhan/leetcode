class Solution {
    public int subtractProductAndSum(int n) {
        int sumRes=0, productRes=1, digit=0, rem, res=0;
        while(n>0) {
            rem = n%10;
            n = n/10;
            sumRes = sumRes + rem;
            productRes = productRes * rem;
        }
        return res = productRes - sumRes;
    }
}