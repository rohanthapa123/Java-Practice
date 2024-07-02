import java.util.Scanner;
public class EligibleStudent {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Marks of Mathematics,Physics and Chemistry: ");
        float math = sc.nextFloat();
        float physics = sc.nextFloat();
        float chemistry = sc.nextFloat();
        if(math >= 60 && physics >=50 && chemistry >= 40 && (math+physics+chemistry >= 200 || math+physics >= 150))
            System.out.println("Eligible.");        
        else
            System.out.println("Not Eligible.");
    }
}
