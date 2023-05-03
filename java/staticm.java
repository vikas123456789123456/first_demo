class student{
    int roll;
    String name;
    static String cname="XYZ college";
    student(int x,String y)
    {roll=x;
    name=y;
}
   void display(){
    System.out.println("Roll no="+roll+"  Name="+name+"  College name="+cname);
   }
}
public class staticm {
    public static void main (String [] args){
        student aa=new student(101,"Ram");
        student bb=new student(102,"Ramu");
        aa.display();
        bb.display();

    }

}
