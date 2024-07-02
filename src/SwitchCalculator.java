import java.util.Scanner;
public class SwitchCalculator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Operator(+,-,*,/,%) :");
        char op = sc.next().charAt(0);
        System.out.print("Enter any Two Operands: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch(op){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid Operation");
        }
    }
}