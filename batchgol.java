
import java.util.Scanner;

public class batchgol{    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if ((a&1)==0){
                System.out.println(a/2);
                for (int i = 0 ; i < a/2 ; i++){
                    System.out.print("2 ");
                }       
            }
        else{
            System.out.println((a-3)/2 +1);
            for (int i =0 ; i < (a-3)/2; i++){
                System.out.print("2 ");

            }
            System.out.print("3");
        }
    }
}