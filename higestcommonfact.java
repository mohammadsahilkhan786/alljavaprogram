import java.util.Scanner;
public class higestcommonfact {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=1;

        for(int i=1;i<n;i++)
        {
            if(n%i==0){
                h=i;
            }
        }
        System.out.print(h);
        sc.close();
    }
}
