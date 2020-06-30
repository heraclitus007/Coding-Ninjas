/*
Given an integer n, using phone keypad find out and print all the possible strings that can be made using digits of input n.
Note : The order of strings are not important. Just print different strings in new lines.
Input Format :
Integer n
Output Format :
All possible strings in different lines
Constraints :
1 <= n <= 10^6
Sample Input:
23
Sample Output:
ad
ae
af
bd
be
bf
cd
ce
cf
*/


import java.util.*;
import java.util.Arrays;

public class solution {

	public static void printKeypad(int input){
		// Write your code here
        String[] s=keypad(input);
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
	}
    public static String[] keypad(int n){
		// Write your code here
		
        String[] str={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
        ArrayList<String> op=new ArrayList<>();
        String[] ans=solve(str,n,op).toArray(new String[op.size()]);
        return ans;
	}
    
    public static ArrayList<String> solve(String[] str,int n,ArrayList<String> op){
        
        if(n==0){
                                   
            return op;           
            
        }
        else{
            int d=n%10;
            String key=str[d];
            if(op.isEmpty()){
                
                for(int i=0;i<key.length();i++){
                    
                    op.add(Character.toString(key.charAt(i)));
                }
                
                return solve(str,n/10,op);
            }
            
            else{
                
                ArrayList<String> temp=new ArrayList<String>();
                for(int i=0;i<key.length();i++){
                    
                    for(int j=0;j<op.size();j++){
                        
                        String x=op.get(j);
                        temp.add(key.charAt(i)+x);
                    }
                    
                }
                
                return solve(str,n/10,temp);
            }
        
            
            
        }
        
        
    }
}
