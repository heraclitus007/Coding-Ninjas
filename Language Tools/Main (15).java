/*
Given a string, you need to remove all the duplicates. That means, the output string should contain each character only once. The respective order of characters should remain same.

String S
Output String
0 <= Length of S <= 10^8

SAMPLE I/P 1:
ababacd

SAMPLE O/P 1:
abcd
*/

import java.util.*;
public class solution {

	public static String uniqueChar(String str){
		// Write your code here
        //char ch[]=str.toCharArray();
        Set<Character> lhs=new LinkedHashSet<>();
        for(int i=0;i<str.length();i++)
            lhs.add(str.charAt(i));
        
        String ans="";
        Iterator it=lhs.iterator();
        while(it.hasNext()){
            ans=ans+it.next();
        }
        return ans;

	}
}
