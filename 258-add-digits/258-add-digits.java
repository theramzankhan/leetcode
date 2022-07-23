// class Solution {
// public:
//     int addDigits(int num) {
//         int sum = 0;
//         int res = 0;
//         int ans = 0;
//         while(num > 0) {
//             sum += num % 10;
//             num /= 10;
//           }
//         while(sum > 0) {
//             res += sum % 10;
//             sum /= 10;
//           }
//         while(res > 0) {
//             ans += res % 10;
//             res /= 10;
//           }
        
//         return ans;
//     }
// };


class Solution {
    public int addDigits(int num) {
        int rem=0,sum=0;
        while(num > 0) {
            rem = num % 10;
            num = num/10;
            sum += rem;
        }  
        num = sum;
        int res=0;
        while(num > 0) {
            rem = num % 10;
            num = num/10;
            res += rem;
        }  
        num = res;
        int ans=0;
        while(num > 0) {
            rem = num % 10;
            num = num/10;
            ans += rem;
        }  
    return ans; 
    }
}

// First Approach which was quite right but not fully right.
// class Solution {
//     public int addDigits(int num) {
//         int rem=0,sum=0;
//         while(num > 0) {
//             rem = num % 10;
//             num = num/10;
//             sum += rem;
            
//             if(sum > 9) {
//                 num = sum;
//                 sum=0;rem=0;
//                 while(num > 0) {
//                     rem = num % 10;
//                     num = num/10;
//                     sum += rem;
//                 }
//             }
//         }
        
//     return sum;   
//     }
// }
// Output: 38 -> 2
//         0  -> 0
        

// class Solution {
//     public int addDigits(int num) {
//         int rem=0,sum=0;
//         if(num < 10)
//             return num;
//         while(num != 0) {
//             rem = num % 10;
//             sum += rem; 
//             num = num/10; 
//         }
//         return addDigits(sum);
//     }
// }


// class Solution {
//     public int addDigits(int num) {
//         if(num == 0) return 0;
//         else if(num % 9 == 0) return 9;
//         else return num % 9;
//     }
// }