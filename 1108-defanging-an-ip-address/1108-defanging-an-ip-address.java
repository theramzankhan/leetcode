//my code 
class Solution {
    public String defangIPaddr(String address) {
        String res = "";
        for(int i=0; i<address.length(); i++) {
            if(address.charAt(i) == '.')
                res += "[.]";
            else
                res += address.charAt(i);
        }
        return res;
    }
}



//other ways
// class Solution {
//     public String defangIPaddr(String address) {
//         return address.replace(".","[.]");
//     }
// }





// public String defangIPaddr(String address) {
//         StringBuilder sb = new StringBuilder("");
        
//         for(int i = 0; i<address.length(); i++){
//             Character c = address.charAt(i);
//             if(c !='.'){
//                 sb.append(c);
//             }else{
//                 sb.append("[.]");
//             }
//         }
        
//         return sb.toString();
//     }
// }


// class Solution {
//     public String defangIPaddr(String address) {
//         return address.replace(".","[.]");
//     }
// }