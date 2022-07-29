class Solution {
    public String reverseWords(String s) {
    s=s+ " ";
    String rev="";
    int p=0;
    for(int i=0;i<s.length();i++) {
        char c=s.charAt(i);
        if(c==' ') {
            StringBuilder sb = new StringBuilder(s.substring(p,i));
            rev=rev+sb.reverse().toString()+" ";
            p=i+1;
        }
    }
    return rev.trim();
  }
}



// class Solution {
//     public String reverseWords(String s) {
//         s=s+" ";
//         String d="",p="";
//         for(int i=0;i<s.length();i++)
//         {
//             char c=s.charAt(i);//check for blank
//             if(c!=' ')
//             {
//                 d=c+d; //for taking words and adding them backwards
//             }
//             else
//             {
//                 p=p+d+" ";//for adding all the words together
//                 d="";//for clearing the value to store next word
//             }
            
//         }
//         p=p.substring(0,p.length()-1);//to remove the last blank which was added extra in the first
//         return p;
//     }
// }

// class Solution {
//     public String reverseWords(String s) {
//         String[] words = s.split(" ");
//         StringBuilder str = new StringBuilder();
//         for (String i:words){
//             str.append(new StringBuffer(i).reverse()).append(" ");
//         }
//         return str.toString().trim();
//     }
// }

// class Solution {
// public String reverseWords(String s) {
// s=s+ " ";
// String rev="";
// int p=0;
// for(int i=0;i<s.length();i++)
// {
// char c=s.charAt(i);
// if(c==' ')
// {
// StringBuilder sb = new StringBuilder(s.substring(p,i));
// rev=rev+sb.reverse().toString()+" ";
// p=i+1;
// }
// }
// return rev.trim();
// }
// }

// class Solution {
//     public String reverseWords(String s) {
//        String st[]=s.split(" ");
//         String ans="";
//         for(String n:st){
//             char c[]=n.toCharArray();
//             for(int i=0;i<c.length/2;i++)
//             {
//                 char t=c[i];
//                 c[i]=c[c.length-i-1];
//                 c[c.length-i-1]=t;
//             }
//             ans+=String.valueOf(c)+" ";
//         }
//         return ans.strip();
//     }
// }










// The down 2 tried by me but failed
// class Solution {
// 	public String reverseWords(String s) {
// 		int j=0, k=0, m=0, l=0, count=0; 
// 		String word="", res="";
// 		char lastCharacter = s.charAt(s.length()-1);
// 		for(int i=0; i<s.length(); i++) {
// 			for(k=0; k<s.length(); k++) {
// 				count++;
// 				if(s.charAt(k) == ' ') {
// 					for(l=k-i; l>=i; l--) {
// 						word += s.charAt(l);
// 					}  
//                     word += " ";
//                     i = i + (count);
// 				}
//                 if(s.charAt(k) == lastCharacter) {
//                 for(m=k; m>=i; m--) {
//                     word += s.charAt(m);
//                 }
//             }
// 			}
// 		}
// 		return res += word;
// 	}
// }




// class Solution {
//     public String reverseWords(String s) {
//         int j=0, count=0; 
//         String word="", res="";
//         char lastCharacter = s.charAt(s.length()-1);
//         for(int i=0; i<s.length(); i++) {
//             count++;
//             if(s.charAt(i) == ' ') {
//                 j=(count-1)-i;
//                 for(int k=i-1; k>=j; k--) {
//                     word += s.charAt(k);
//                 }
//                 word += " ";
//             }
//             if(s.charAt(i) == lastCharacter) {
//                 j=(count-1)-i;
//                 for(int k=i; k>=j; k--) {
//                     word += s.charAt(k);
//                 }
//             }
//         }
//         return res += word;
//     }
// }