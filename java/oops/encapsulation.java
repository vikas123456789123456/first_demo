package oops;
class Student{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Student ss=new Student();
        System.out.println(ss.getName());
        ss.setName("Ram");
        System.out.println(ss.getName());
        
        
    }
}
