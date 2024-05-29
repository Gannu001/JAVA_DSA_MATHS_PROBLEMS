import java.util.Scanner;

public class ALLprimefactors {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

int on= n;
     for(int div = 2 ; div*div <= n ;div++){
      while (n%div == 0) {
        n= n/div;
        System.out.println( " All the prime factors of n " + on + " is " + div + " ");
        
      }
          

     }
     if(n != 1)   {
        System.out.println(n);
      } 


    }
}
