import java.util.Scanner;
public class FiveDigitPalindrome {
    public static void main(String[]args){
        int done = 0;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter any five digit number");
        
            int num = sc.nextInt();
            int palindrome = 0 ,newnum = num;
            if(num>99999 || num < 10000){
                System.out.println("Enter five Digit number!!");
            }else{
                done = 1;
                while(newnum != 0){
                    int rem = newnum%10;
                    palindrome = palindrome*10+rem;
                    newnum = newnum/10;
                }
                if(palindrome == num){
                System.out.println("Palindrome");
                }else{
                System.out.println("Not palindrome");
            }
            }
        }while(done != 1);
        
        
    }
}
