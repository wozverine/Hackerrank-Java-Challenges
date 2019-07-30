import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d=scan.nextDouble();
        scan.nextLine(); 
        String s=scan.nextLine();
        System.out.printf("String: "+s+"\nDouble: "+d+"\nInt: "+i);
    }
}
