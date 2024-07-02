public class SumOhHarmonic {
    public static void main(String[]args){
        int n = Integer.parseInt(args[0]);
        double sum = 0;
        System.out.print("Enter upto which term you want: ");
        for(int i =1;i<=n ;i++){
            sum += 1.0/i;
        }
        System.out.println("Sum :"+sum);
    }
}
