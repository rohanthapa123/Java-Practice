public class PatternThree27 {
    public static void main(String[]args){
        int i,j,k;
        for(i=1;i<=5;i++){
            for(j=i;j<=5;j++){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }
    }
}
