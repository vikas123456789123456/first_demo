package String;

public class Bufferstring2 {
    public static void main(String args[]){

        StringBuffer sb=new StringBuffer("vikas");
        System.out.println(sb.capacity());
        StringBuffer sb2=new StringBuffer();
        System.out.println(sb2.capacity());
        StringBuffer sb3=new StringBuffer(100);
        System.out.println(sb3.capacity());
        StringBuffer sb4=new StringBuffer(100);
        sb4.append("Java is high level programming language");
        System.out.println(sb4.length());
        // sb4.setLength(10);
          sb4.trimToSize();
          System.out.println(sb4.capacity());
          StringBuffer sb5=new StringBuffer();
          sb5.append("vikas");
          sb5.append(3456);
          sb5.append("verma");
          System.out.println(sb5);
          sb5.insert(5,12);
          System.out.println(sb5.reverse());


    } 
    
}
