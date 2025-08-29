import java.util.Scanner;
public class sumofreversenumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem=0;
        int rev=0;
        int sum=0;
        while (n != 0){
            rem=n%10;
            rev=(rev*10)+rem;
            sum=sum+rem;
            n=n/10;
        }
        System.out.print("the reverse of the number is:"+rev);
        System.out.print("the sum of the  reverse number is:"+sum);
        

        sc.close();
    }
    
}
