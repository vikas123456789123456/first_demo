public class prac_loop{
    public static void main(String [] args){
        //selection statement
        int x=11;
        if(x<=10){
         System.out.println("hello");
         
        }
        else;
        System.out.println("yes");
        //Unreachable code
      /*  //1 while(true){
         System.out.println("hello");
        }
        System.out.println("hii");
      //2  while(false){
            System.out.println("hello");
           }
           System.out.println("hii");*/
        int a=10,b=20;
        while(a>b){  //if in this program a<b then its become infinte loop
            System.out.println("hello");
        }
        System.out.println("hii");
        System.out.println();
        //accesing the data of array by for-each loop
       int [] ar={10,20,30,40,50,60};
       for(int c:ar)
       System.out.print(c+" ");
       
       /*by normal loop
       for(int y=0;y<ar.length;y++)
        System.out.println(ar[y]);*/
        System.out.println();
        int [][] t={{12,14,15,16},{13,15,16,17}};
        for(int [] s:t){
            for(int y:s){
                System.out.println(y);
            }

        } System.out.println();
    //for break statement
    /*for(int i=1;i<=3;i++){
        for(int j=1;j<=3;j++){
            if(i==3 && j==3){
                break;
            }System.out.println(i+" "+j);
        }
    }*/
     l1:;
     for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            if(i==j) //for better understanding change the break type
                break; //break l1; //continue//continue l1
            System.out.println(i+"   "+j);
        }
     } System.out.println();
     System.out.println();
//continue statement in do-while
int x1=0;
do{
  x1++;
  System.out.println(x1);
  if(++x1<5)
    continue;
 x1++;
  System.out.println(x1);
} while(++x1<10);


    }
}