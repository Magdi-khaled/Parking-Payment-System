import java.util.HashMap;
import java.util.Map;

public class Ticket extends Operator{
    public int TicketID;
    private int IN,MY;;
    private String MN;
    private double VW, VD;
    public boolean flag=false;
    public Vehicle Vobj = new Vehicle(IN,MY,TicketID,VW,VD,MN);
    public TotalIncome t=TotalIncome.Getinstance();
    public ParkingFees PF =new ParkingFees();
    public double ArrivalTime;
    public double DepartureTime;

    public Ticket(Vehicle obj){
        Vobj=obj;
    }
    public void PrintTicketINfo(boolean check) {
        double ParkingTime;
        int S = Vobj.GetSlotID();
        int INum =Vobj.GetVehicleIdentifier();
        double D = Vobj.GetVehicleDepth();
        double W = Vobj.GetVehicleWidth();
        String N = Vobj.GetVehicleName();
        String CurrentTime = GetTime(); /// --> 9/5/2022 02:09:32
        int MY1 = Vobj.GetVehicleModelYear();
        ParkingTime = GetFeesTime();
        flag = true;
        if (check) {

            System.out.println(" ------------------------------------ ");
            System.out.println("|         TICKET INFORMATION         |");
            System.out.println(" ------------------------------------ ");
            System.out.println("| Slot ID : " + S);
            System.out.println("| Vehicle Name : " + N);
            System.out.println("| Vehicle Model: " + MY1);
            System.out.println("| Identifier Number: " + INum);
            System.out.println("| Vehicle Width: " + W);
            System.out.println("| Vehicle Depth: " + D);
            System.out.println("| Arrival Time : " + CurrentTime);
            ArrivalTime = ParkingTime;
        }
        else {
            System.out.println(" ------------------------------------ ");
            System.out.println("|         TICKET INFORMATION         |");
            System.out.println(" ------------------------------------ ");
            System.out.println("| Slot ID : " + S);
            System.out.println("| Vehicle Name : " + N);
            System.out.println("| Vehicle Model: " + MY1);
            System.out.println("| Identifier Number: " + INum);
            System.out.println("| Vehicle Width: " + W);
            System.out.println("| Vehicle Depth: " + D);
            System.out.println("| Departure Time : " + CurrentTime);
            DepartureTime = ParkingTime;
            int Fees1 = PF.CalculateFees(DepartureTime, ArrivalTime);
            t.addFeesWithTime(DepartureTime,Fees1);
            System.out.println("| Parking Fees = " + Fees1);
            System.out.println(" ------------------------------------ ");
        }
    }
    public boolean IsFull(){
        if(flag) return true;
        else return false;
    }

}
