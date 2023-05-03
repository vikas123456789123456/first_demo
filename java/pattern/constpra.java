package pattern;
class student{
    int id;
    String name;
    student(int i,String n){
        id=i;
        name=n;
            // PARAMETERIZED CONSTRUCTOR
    }
    void display(){
        System.out.println(id+" "+name);
    }
}

public class constpra {
    public static void main(String [] args){
        student s1=new student(101,"Vikas");
        student s2=new student(102,"Mahesh");
        s1.display();
        s2.display();
    }
    
}
