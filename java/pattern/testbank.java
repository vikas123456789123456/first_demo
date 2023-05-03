package pattern;
class Account{
    int acc_no;
    String name;
    float amount;
    void insert(int a,String n,float amt){
        acc_no=a;
        name=n;
        amount=amt;
    }
    void deposit(float amt){
        amount=amount+amt;
        System.out.println(amt+" Deposited succesfully");

    }
    void withdrawl(float amt){
       if(amount>amt){
        amount=amount-amt;
        System.out.println(amt+" withdrawl succesfully");
       }
       else
       System.out.println("Insufficient amount");

    }
    void checkbalance(){
        System.out.println("Balance="+amount);
    }
    void display(){
        System.out.println(acc_no+" "+name+" "+amount);
    }
}

public class testbank {
    public static void main(String [] args){
        Account a=new Account();
        a.insert(101,"Vikas verma",1000);
        a.display();
        a.deposit(1000);
        a.withdrawl(500);
        a.checkbalance();
        a.insert(102,"Aryan",2000);
        a.display();
    }
    
}
