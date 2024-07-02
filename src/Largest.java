import java.util.Scanner;
public class Largest {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a, b , c, d;
        System.out.print("Enter any Four numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();        
        if(a > b && a > c && a > d)
            System.out.println(a +" is largest among all");
        else if(b > a && b > c && b > d)
            System.out.println(b +" is largest among all");
        else if(c > a && c > b && c > d)
            System.out.println(c +" is largest among all");
        else
            System.out.println(d + " is largest among all");
    }
}
