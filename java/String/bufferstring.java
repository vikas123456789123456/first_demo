package String;

public class bufferstring {
    public static void main(String args []){
        StringBuffer s1=new StringBuffer("vikas");//ALSO TAKE INPUT FROM USER
        StringBuffer s2=new StringBuffer("verma");
        s1=s1.append(s2); //s1 will be changed and get updated 1 function
        System.out.println(s1);
        s1.setCharAt(3,'v');//2 function
        System.out.println(s1);
        s2.insert(3,s1);//3 function
        System.out.println(s2);
        StringBuffer s3=new StringBuffer("ram");
        System.out.println(s3.length());
        s3.setLength(10);    //4 function
        System.out.println(s3.length());
        String s="vikas";
      s= s.replace('v','e');
      System.out.println(s);

    }
    
}
