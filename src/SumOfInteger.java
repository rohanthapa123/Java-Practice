public class SumOfInteger {
    public static void main(String[]args){
        int sum=0;
        for(int i=100;i<=200;i++){
            if(i%7 == 0){
                System.out.print(i+" ");
                sum+=i;
            }
        }
        System.out.println("\nSum: "+sum);
    }
}
