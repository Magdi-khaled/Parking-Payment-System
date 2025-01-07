public class ParkOut extends Operator{
    public void ParkOut(int TicketID){
        try{
            if(T1[TicketID-1].IsFull() && this.T1[TicketID-1]!=null) {
                int Start,End;
                T1[TicketID - 1].PrintTicketINfo(false);
                T1[TicketID - 1].flag = false;
                V[TicketID - 1].VehicleField = false;
                obj[TicketID - 1].Empty = false;
            }
            else if(!T1[TicketID-1].IsFull() && this.T1[TicketID-1]!=null){
                System.out.println("Ticket Not Exist...");
            }
        }
        catch (Exception e){
                System.out.println("Ticket Not Exist...");
        }
    }
}
