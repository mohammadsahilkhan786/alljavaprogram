import java.util.Scanner;
public class twinprime {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n1=sc.nextInt();
        // int n2=sc.nextInt();
  
        for(int i=1;i<=50;i++){
            int c1=0;
        for(int j=1;j<=i;j++){
            if(i%j==0)
            c1++;
        }
        for(int k=1;k<=50;k++){
            int c2=0;
        for(int l=1;l<=k;l++){
            if(k%l==0)
            c2++;
        }
        if(c1==2&c2==2&(i-k==2)){
            System.out.println(i + "," + k);
        }
        
        }}



    sc.close();
    } 
}
