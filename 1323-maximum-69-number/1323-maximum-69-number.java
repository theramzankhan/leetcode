class Solution {
    public int maximum69Number (int num) {
        String str = Integer.toString(num); // convert int to String
        char ch[]=str.toCharArray();       // convert String to Char array
        for(int i=0;i<ch.length;i++){    
            if(ch[i]=='6'){        //loop to replace 6 with 9 only first occurence
                ch[i]='9';
                break;
            }
        }
        String s = String.valueOf(ch); //convert char array to string
        int x = Integer.parseInt(s); // convert String to int
        return x;
    }
}


// class Solution {
//     public int maximum69Number (int num) {
        
//         StringBuilder sb = new StringBuilder(String.valueOf(num));
        
//         for(int i=0;i<sb.length();i++){
//             if(sb.charAt(i)=='6'){
//                 sb.setCharAt(i,'9');
//                 break;
//             }
//         }
        
//         return Integer.parseInt(sb.toString());
//     }
// }



        
        
        

// class Solution {
//     public int maximum69Number (int num) {
        
//         char str[] = Integer.toString(num).toCharArray();
        
//         for(int i=0; i<str.length; i++) {
//             if(str[i] == '6') {
//                 str[i] = '9';
//                 break;
//             }
//         }
//         return Integer.parseInt(new String(str));
//     }
// }




// I tried using this 2 logics but failed
// class Solution {
//     public int maximum69Number (int num) {
//         int res = 0;
        
//         int[] digits = Integer.toString(num).chars().map(c -> c-'0').toArray();
        
//         for(int i=0; i<digits.length; i++) {
//             if(digits[i] == 6) {
//                 digits[i] = 9;
//                 break;   
//             }
//         }
        
//         int finalInt = Integer.parseInt(digits.toInteger);
//         return finalInt;
//     }
// }

//         while(num != 0) {
//             digit = num%10;
//             num = num/10;
//             if(digit == 6)
//                 digit = 9;
//             res += digit;
//         }
//         return res;
//     }
// }

