// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class fabonicci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
              count++;
        }
        if(count==2){
            System.out.println("prime");
            
        }
        else
         System.out.println("Not prime");
    
    }
}
