package polymorphism;
class Bank{
    float getRateOfInterset(){
        return 0;
    }

}
class SBI extends Bank{
    float getRateOfInterset(){
        return 8.4f;
    }
}
class ICIC extends Bank{
    float getRateOfInterset(){
        return 7.3f;
    }
}
class Axis extends Bank{
    float getRateOfInterset(){
        return 9.7f;
    }
}
public class met_over2 {
    public static void main(String[] args) {
        Bank b;
        b=new SBI();
        System.out.println("SBI Rate of Interest="+b.getRateOfInterset());
        b=new ICIC();
        System.out.println("ICIC Rate of Interest="+b.getRateOfInterset());
        b=new Axis();
        System.out.println("Axis Rate of Interest="+b.getRateOfInterset());
      Axis  bb=new Axis();
        System.out.println("Axiss Rate of Interest="+bb.getRateOfInterset());
        
    }
}
