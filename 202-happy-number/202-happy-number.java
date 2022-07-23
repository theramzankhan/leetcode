// class Solution {
//     public boolean isHappy(int n) {
        
//         if(n == 1)
//             return true;
                
//         int ans=0, count=0;
//         while(n > 1) {
//             count++;
        
//             while(n > 0) {
//                 int rem = n%10;
//                 ans += rem*rem; 
//                 n = n/10;
//             }
            
//             if(ans == 1)
//                 return true;
            
//                 n = ans;
//                 ans = 0;
            
//             if(count > 100) 
//                 break;
//         }
        
        
//         return false;
//     }
// }
// run the loop 100 times at max and see if you get 1 otherwise call it a day and move on. Number is not happy. O(1) time and 
// space. This code will work for 99.9% of inputs and i can live with those numbers

class Solution {
	public boolean isHappy(int n) {
		while(n>6){
			int sum=0;
			int cpy=0;
			while(n>0){
				sum+=(n%10)*(n%10);
				n/=10;
			}n=sum;

		}if(n==1)return true;
		return false;
	}
}



//My logic at the start, few base test cases ran
// class Solution {
//     public boolean isHappy(int n) {
        
//         int ans=0;
//         while(n > 1) {
//             int rem = n%10;
//             ans = ans*ans + rem*rem; 
//             n = n/10; 
//         }
        
//         if(n == 1)
//             return true;
//         else
//             return false;
//     }
// }


//There are many examples of collection to easily solve this problem. Hence will solve this one later also.