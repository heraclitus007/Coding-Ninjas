/*
In a class there are ‘n’ number of students. They have three different subjects: Data Structures, Algorithm Design & Analysis and Operating Systems. Marks for each subject of all the students are provided to you. You have to tell the position of each student in the class. Print the names of each student according to their position in class. Tie is broken on the basis of their roll numbers. Between two students having same marks, the one with less roll number will have higher rank. The input is provided in order of roll number.

First line will have a single integer ‘n’, denoting the number of students in the class.
Next ‘n’ lines each will have one string denoting the name of student and three space separated integers m1, m2, m3 denoting the marks in three subjects.

Print ‘n’ lines having two values: First, the position of student in the class and second his name.

1 <= n <= 10^5
0 <= m1, m2, m3 <= 100

SAMPLE I/P 1:
3
Mohit 94 85 97
Shubham 93 91 94
Rishabh 95 81 99

SAMPLE O/P 1:
1 Shubham
2 Mohit
3 Rishabh

4 because at 1100 hours, we will have maximum number of customers at the shop, throughout the day. And that maximum number is 4. 
*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
        List<Student> stud=new ArrayList<Student>();
        String name[]=new String[n];
        for(int i=0;i<n;i++){
            
            name[i]=sc.next();
            int m1=sc.nextInt();
            int m2=sc.nextInt();
            int m3=sc.nextInt();
            int marks=m1+m2+m3;
            stud.add(new Student(i+1,marks));
        }
        
        Collections.sort(stud, (s1,s2) -> {
            if(s1.marks!=s2.marks)
                return (s1.marks>s2.marks)?-1:1;
            else
                return (s1.i<s2.i)?-1:1;
            
        });
        //Collections.reverse(stud);
          int pos=1;               
          for(Student s:stud){
              
              System.out.println(pos+" "+name[s.i-1]);
              pos++;
          }              
		
	}
}
class Student{
    int i;
    
    int marks;
    
    public Student(int i,int marks){
        this.i=i;
        this.marks=marks;
    }
}