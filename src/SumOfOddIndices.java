public class SumOfOddIndices {
    public static void main(String[]args){
        int array[]={10,15,24,56,95,75,24,51,87,15};
        int sum=0;
        for(int i=1;i<array.length;i=i+2){
            sum+=array[i];
        }
        System.out.println("Sum: "+sum);
    }
}
