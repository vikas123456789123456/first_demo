package constractor;
class student{
    int id;
    String name;
    void display(){
        System.out.println(id+" "+name);
    }
}         //THERE IS NO CONSTRACTOR SO COOMPILER PROVIDE YOU DEFAULT CONSTRACTOR AND DEFAULT VALUE PROVIDE BY-
          // DEFAULT CONSTRACTOR
public class consdef2 {
    public static void main(String []args){
        student s1=new student();
        student s2=new student();
        s1.display();
        s2.display();
    }
    
}
