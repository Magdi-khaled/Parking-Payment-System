import java.util.Scanner;

public class ParkIn2 extends Parking{
    public void ParkIn(){
        int SlotChoice;
        DisplayAvailableSlots();
        if(check) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" ------------------------- ");
            System.out.println("|ENTER VEHICLE INFORMATION|");
            System.out.println(" ------------------------- ");
            System.out.println(" ------------------------- ");
            System.out.println("|      VEHICLE INFO       |");
            System.out.println(" ------------------------- ");
            System.out.println(" Identifier Number:");
            int IDnumber = sc.nextInt();
            System.out.println(" Model Name       :");
            String ModelN = sc.next();
            System.out.println(" Vehicle Width    :");
            double Width = sc.nextDouble();
            System.out.println(" Vehicle Depth    :");
            double Depth = sc.nextDouble();
            System.out.println(" Model Year       :");
            int ModelY = sc.nextInt();
            SearchALGORITHM2(Width,Depth);
            if(checkSuit==true){
                SlotChoice = c;
                if (!obj[SlotChoice].ISEmpty()){
                    Vehicle v1=new Vehicle(IDnumber,ModelY,SlotChoice+1,Width,Depth,ModelN);
                    V[SlotChoice]=v1;
                    Ticket T=new Ticket(v1);
                    T1[SlotChoice]=T;
                    obj[SlotChoice].Empty = true;
                    T1[SlotChoice].PrintTicketINfo(true);
                    System.out.println(" ------------------------------------ ");
                    System.out.println("|     VEHICLE PARKED SUCCESSFULLY    |");
                    System.out.println(" ------------------------------------ ");
                }
                NumberOfVehicles++;
            }
        }
        else System.out.println("No Available Slots...");
    }
}
