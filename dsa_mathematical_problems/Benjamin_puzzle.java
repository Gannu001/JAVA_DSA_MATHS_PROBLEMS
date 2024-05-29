import java.util.Scanner;

/**
 * Benjamin_puzzle
 */
public class Benjamin_puzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n =  sc.nextInt();


         for (int i = 1 ; i*i<=n ;i++){
            System.out.println(i*i);
         }
    }

    
}