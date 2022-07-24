class Solution {
    public boolean isUgly(int n) {
        while(n>1){
            if(n%2==0){
                n=n/2;
            }else if(n%3==0){
                n=n/3;
            }else if(n%5==0){
                n=n/5;
            }else if(n%2!=0 && n%3!=0 && n%5!=0){
                return false;
            }
        }
        return n==1;
    }
}


//Recursive Solution other way
// class Solution {
//     public boolean isUgly(int n) {
//         if (n == 1) return true;
//         if (n <= 0) return false;
//         if (n % 2 == 0) return isUgly(n / 2);
//         if (n % 3 == 0) return isUgly(n / 3);
//         if (n % 5 == 0) return isUgly(n / 5);
//         return false;
//     }
// }

/* other way
Time Complexity : O(logn)
Space Complexity: O(1)
*/
// class Solution {
//     public boolean isUgly(int n) {
//         if(n==0){
//             return false;
//         }
        
//         while(n!=1){
//             if(n%2==0){
//                 n=n/2;
//                 continue;
//             }
            
//             if(n%3==0){
//                 n=n/3;
//                 continue;
//             }
            
//             if(n%5==0){
//                 n=n/5;
//                 continue;
//             }
            
//             return false;
//         }
//         return true;
//     }
// }



// I tried but wrong
// class Solution {
//     public boolean isUgly(int n) {
//         int temp = n;
//         if(n == 1 || n == 2 || n == 3 || n == 5)
//             return true;
//         if(n < 1)
//             return false;
//         if(n <= 10 && n%2 == 0 || n%3 == 0 || n%5 == 0)
//             return true;
//         if(n % 2 != 0 || n % 3 != 0 || n % 5 != 0)
//             return false;
//         while(n > 10) {
//             n = n/2;
//         }
//         if(n%2 == 0)
//             return true;
//         while(temp > 10) {
//             temp = temp/3;
//         }
//         if(temp%3 == 0)
//             return true;
//         int temp2 = temp;
//         while(temp2 > 10) {
//             temp2 = temp2/5;
//         }
//         if(temp2%5 == 0)
//             return true;
//         return false;
//     }
// }


// I tried but wrong at first but realized this is the wrong way
// class Solution {
//     public boolean isUgly(int n) {
//         if(n == 1 || n == 2 || n == 3 || n == 5)
//             return true;
//         for(int i=2; i<6; i++) {
//             for(int j=1; j<n; j++) {
//                 if(j%2 == 0 || j%3 == 0 || j%5 == 0) {
//                     if(i*j == n)
//                         return true;
//                 }
                
//             }
//             if(i == 3)
//                 i++;
//         }
//         return false;
//     }
// }




