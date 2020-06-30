/*
In Little Flowers Public School, there are many students with same first names. You are given a task to find the students with same names. You will be given a string comprising of all the names of students and you have to tell the name and count of those students having same. If all the names are unique, print -1 instead.
Note: We don't have to mention names whose frequency is 1.

The only line of input will have a string ‘str’ with space separated first names of students.

Print the names of students along with their count if they are repeating. If no name is repeating, print -1

1 <= |str| <= 10^5
Time Limit: 1 second

SAMPLE I/P 1:
Abhishek harshit Ayush harshit Ayush Iti Deepak Ayush Iti

SAMPLE O/P 1:
harshit 2
Ayush 3
Iti 2

*/

import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		/* Your class should be named Main.
 			* Read input as specified in the question.
 			* Print output as specified in the question.
		*/

		// Write your code here
        Scanner sc=new Scanner(System.in);
        ArrayList<String> arrli=new ArrayList<>();
        while(sc.hasNext())
            arrli.add(sc.next());
        
        Map<String, Integer> mp = new HashMap<>();
        for (int i = 0; i < arrli.size(); i++) 
        { 
            if (mp.containsKey(arrli.get(i)))  
            { 
                mp.put(arrli.get(i), mp.get(arrli.get(i)) + 1); 
            }  
            else
            { 
                mp.put(arrli.get(i), 1); 
            } 
        } 
        boolean flag=false;
        for (Map.Entry<String, Integer> entry : mp.entrySet()) 
        { 
            int  val=entry.getValue();
           // boolean next=entry.iterator.hasNext();
            // if(val==1 && next==false)
            //     System.out.println("-1");
            if(val==1)
                continue;
            else{
                flag=true;
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
                
        } 
        
        
        if(!flag)
            System.out.println("-1");
        

	}

}