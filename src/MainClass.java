import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Purchase Amount :");
        float pa = sc.nextFloat();
        float disc;
        if(pa  >= 5000)
            disc = pa * 0.10f;
        else if(pa >= 4000)
            disc = pa * 0.07f;
        else if(pa >= 3000)
            disc = pa * 0.05f;
        else if(pa >= 2000)
            disc = pa * 0.03f;
        else
            disc = pa * 0.02f;
        System.out.print("Disc = "+disc);
    }
    
}
