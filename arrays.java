import java.util.Scanner;
public class arrays {
   /*  public static void main(String[] args) {
        int marks[]=new int[3];
        marks[0]=97;
        marks[1]=95;
        marks[2]=99;
      //  System.out.println(marks[0]);
      //  System.out.println(marks[1]);
      //  System.out.println(marks[2]);
    for(int i=0;i<3;i++){
        System.out.println(marks[i]);
}}
    */
    //how to take input from the user array of size bhi or number bhi
    /*public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        String arr[]=new String[size];
        //input ka liya
        for(int i=0;i<size;i++){
         arr[i]=sc.next();   
        }
        //output ka liya
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
     
        }*/
  
      /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int size=sc.nextInt();
        System.out.println("enter the number x:");
        int x=sc.nextInt();
        int [] arr=new int[size];
        for(int i = 0; i<size ;i++){
            arr[i]=sc.nextInt();
        }
        //int max=arr[0];
        int c=0;
        for(int i = 0; i<size ;i++){
            if(arr[i]>x)
            //max=arr[i];
            c++;
        }
                System.out.print(c);
        sc.close();
    }
}