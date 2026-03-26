

import java.util.Scanner;

public class watermelon_1{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int Weight = sc.nextInt();
        String ans = ((Weight & 1)==0) && Weight>2 ? "Yes":"NO";
        System.out.println(ans);
        

    }
}