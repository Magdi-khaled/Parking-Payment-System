
import java.util.Scanner;
public class Garage extends Operator {
    public static int N1=0;
    public Garage(){}
    public void GarageSlots(){
        Scanner sc =new Scanner(System.in);
        int N;

        System.out.println("Enter Number Of Slots (Less than or equal 2000 Slot only):");
        N = sc.nextInt();
        N1=N;
        System.out.println("Define Slot Dimensions...");
        for(int i=0;i<N;i++){
            System.out.println("Slot "+(i+1)+" Width:");
            double W = sc.nextDouble();
            System.out.println("Slot "+(i+1)+" Depth:");
            double D = sc.nextDouble();
            int Id = ++SlotsCount;
            Slot Sobj = new Slot(W,D,Id);
            obj[i]=Sobj;
        }
    }
}