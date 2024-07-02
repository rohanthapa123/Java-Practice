import java.util.Scanner;
public class Fibonacci {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term in which you want the fibonacci is :");
        int n = sc.nextInt();
        int a=0,b=1,fibo=0;
        
        for(int i =2;i<=n;i++){
            fibo= a+b;
            a=b;
            b=fibo;
        }
        System.out.println("Fibonacci in "+n+" term is "+fibo);
    }
}