import java.util.Scanner;
public class Reverse {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any digits you want to reverse: ");
        int num = sc.nextInt();
        int newNum = num,rev=0;
        while(newNum != 0){
            int rem = newNum %10;
            rev = rev *10 + rem;
            newNum/=10;
        }
        System.out.println("The reverse of the digit is "+rev);
    }
}
