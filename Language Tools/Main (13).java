/*
Ayush loves the characters ‘a’, ‘s’, and ‘p’. He got a string of lowercase letters and he wants to find out how many times characters ‘a’, ‘s’, and ‘p’ occurs in the string respectively. Help him find it out.

First line contains an integer denoting length of the string.
Next line contains the string.

1<=n<=10^5
‘a’<= each character of string <= ‘z’

Three space separated integers denoting the occurrence of letters ‘a’, ‘s’ and ‘p’ respectively.

SAMPLE I/P 1:
6
aabsas

SAMPLE O/P 1:
3 2 0

*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
        String str=sc.next();
        int a=0;
        int s=0;
		int p=0;        
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='a')
                a++;
            else if(str.charAt(i)=='s')
                s++;
            else if(str.charAt(i)=='p')
                p++;
        }
        System.out.println(a+" "+s+" "+p);
	}
}