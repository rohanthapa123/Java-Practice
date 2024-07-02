public class OperationInArray {
    public static void main(String[]args){
        float[] array ={12.1f,9.45f,5.5f,2.45f,5.3f,1.25f,3.75f,7.87f,13.23f,15.7f};
        int i;
        float sum=0,product=1,average;
        for(i=0;i<array.length;i++){
            sum+=array[i];
            product*=array[i];
        }
        average = sum/10;
        System.out.println("Sum: "+sum + "\nProduct: "+product+"\nAverage: "+average);
    }
}
