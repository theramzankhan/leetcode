class Solution {
    public String interpret(String command) {
        String res = "";
        for(int i=0; i<command.length(); i++) {
            if(command.charAt(i) == '(' && command.charAt(i+1) == ')') {
                res += "o";
                i++;   
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) == 'a' && command.charAt(i+2) == 'l' 
                   && command.charAt(i+3) == ')') {
                res += "al";
                i=i+3;
            }
            else {
                res += command.charAt(i);
            }
                
        }
        return res;
    }
}


//other ways
// class Solution {
//     public String interpret(String command) {
//         return command.replace("()","o").replace("(al)","al");
//     }
// }


// class Solution {
//     public String interpret(String command) {
//      command = command.replace("()","o");
//      command = command.replace("(","");
//      command = command.replace(")","");
 
//        return command;
//     }
// }