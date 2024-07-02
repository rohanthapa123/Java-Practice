public class MinAndMax {
    public static void main(String[]args){
        int[] num = {57,84,35,62,12,15,79,95,34,87};
        int max=num[0],min = num[0];
        for(int i=1;i<10;i++){
            if(num[i] > max){
                max = num[i];
            }
            if(num[i] < min){
                min = num[i];
            }
        }
        System.out.println("The Minimum number is "+min+" and Maximum number is "+max);
            
    }
}
