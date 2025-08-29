import java.util.Scanner;
public class ascii {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        for (char c='a';c<='z';c++){
            System.out.println(c+":"+(int)c);    //OR
                                                 //    for(int i=65;i<(65+26);i++){
                                                 //     System.out.println(i+ ""+(char)i);
      
        }
        sc.close();
    }
}
