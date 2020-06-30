/*
Given a string S, remove consecutive duplicates from it recursively.
Input Format :
String S
Output Format :
Output string
Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string
Sample Input 1 :
aabccba
Sample Output 1 :
abcba
Sample Input 2 :
xxxyyyzwwzzz
Sample Output 2 :
xyzwz
*/

public class Solution {

	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
		String ans=""+s.charAt(0);
        //System.out.println(ans);
        return remove(s.substring(1),ans);
        
        
	}
    
    public static String remove(String s,String ans){
        
        if(s.length()==0)
            return ans;
        
        else{
            char c1=s.charAt(0);
            char c2=ans.charAt(ans.length()-1);
            if(c2!=c1)
                ans=ans+c1;
            //System.out.println(ans);
            
        }
        return remove(s.substring(1),ans);
        
        
    }

}