package Arraylist;
import java.util.*;
  class student{
    int rollno;
    String name;
    int age;
     student( int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
 }

public class array_class_obj5 {
    public static void main(String[] args) {
        
     student s1=new student(1,"Vikas",18);
     student s2=new student(2,"Rohit",17);
     student s3=new student(3,"Adity",5);
     student s4=new student(4,"Sakshi",18);
      ArrayList<student> stu=new ArrayList<student>();
      stu.add(s1);
      stu.add(s2);
      stu.add(s3);
      stu.add(s4);

      Iterator itr=stu.iterator();
      while(itr.hasNext()){
        student st=(student)itr.next();
        System.err.println(st.rollno+" "+st.name+" "+st.age);
      }
      
    }
    
}
