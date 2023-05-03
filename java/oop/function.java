package oop;
class operation{
    int data=50;
    void change(int data){
        this.data=data+100;
       //data=data+100;
    }
}

public class function {
    public static void main(String[] args) {
        
        operation oo=new operation();
        System.out.println("before change= "+oo.data);
        oo.change(500);
        System.out.println("After changing= "+oo.data);

    }
    
}
