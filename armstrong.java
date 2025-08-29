import java.util.*;
public class armstrong{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
         int count=0;
         int rem=0;
         int sum=0;
         int dup=n;
         int duplicate=n;
        if(n==0){        // special case 
            count=1;
        }else{
            while(n!=0){
                n=n/10;
                count++;
            }
            
        }
        while(dup!=0){
            rem=dup%10;
            sum=sum+(int)Math.pow(rem,count);
            dup=dup/10;
            // System.out.println(sum);

        }
            System.out.println(count+","+sum);
            if (sum==duplicate){
                System.out.println("armstrong");
            }
            else{
                System.out.println("not");
            }
      

        
    sc.close();    
    }
}

