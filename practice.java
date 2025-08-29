//REVERSE THE NUMBER
/*import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int rev=0;
        int rem=0;
        int org=n;
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }System.out.println( rev);
    
        if(org==rev){
            System.out.println("palindrome");
        }else{
            System.out.print("not palindrome");
        }
    
        sc.close(); 
    }
} */
//SUM OF THE ELEMNT OF THE NUMBER
/*import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int rem=0;
        int sum=0;
        while(n!=0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }System.out.print(sum);
        sc.close(); 
    }}*/
    //GCD
   /* import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int m=sc.nextInt();
        while(n!=m){
            if (n>m)
            {
            n=n-m;
        }
            else
            {
                m=m-n;}
        }System.out.print(n);
        sc.close();
    }
        
    }*/
    //decimal to binaray
    /*import java.util.Scanner;
    public class practice {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);ava
            System.out.println("enter the number");
            int n=sc.nextInt();
            String o=Integer.toBinaryString(n);
            System.out.print(o);}}*/
import java.util.Scanner;
class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
        System.out.println("prime number");}
        else{
             System.out.println("not prime number");    
        }sc.close();
    }
}
