import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Currency;

public class Operator{
    public static int SlotsCount=0;
    public static int NumberOfVehicles=0;
    public boolean checkSuit=false;
    public boolean check=false;
    public int c=0;
    public static Slot[] obj = new Slot[2000];
    public static Ticket[] T1 = new Ticket[2000];
    public static Vehicle[] V = new Vehicle[2000];

    ///Functions----
    public String GetTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String CurrentTime=dtf.format(now);
        return CurrentTime;
    }
    public double GetFeesTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        double FeesTime=now.getHour()+(now.getMinute()/60.0);
        return FeesTime;
    }
    public void SearchALGORITHM1(double w,double d){    
        checkSuit=false;
        for(int i=0;i<Garage.N1;i++){
            if(w<=obj[i].getWidth()&&d<=obj[i].getDepth()&&!obj[i].ISEmpty()){
                c=i;
                checkSuit=true;
                break;
            }
        }
        if(checkSuit) {
            System.out.println(" --------------------");
            System.out.println("|    SUITABLE SLOT   |");
            System.out.println("|--------------------|");
            System.out.println("     SLOT: " + (c + 1));
            System.out.println(" --------------------");
        }
        else{
            System.out.println(" -------------------------------------- ");
            System.out.println("| NO SUITABLE SLOTS FOR THIS VEHICLE!! |");
            System.out.println(" -------------------------------------- ");
        }
    }
    public void SearchALGORITHM2(double w,double d){
//        checkSuit=false;
        double SlotArea=0.0;
        double Area =0.0;
        c=-1;
        for(int i=0;i<Garage.N1;i++){
            SlotArea=obj[i].getWidth()*obj[i].getDepth();
            if(SlotArea>=w*d && w<=obj[i].getWidth() && d<=obj[i].getDepth()&&!obj[i].ISEmpty()){
                if(Area==0.0){
                    Area=SlotArea;
                    c=i;
                }
                else if(SlotArea<Area){
                    Area=SlotArea;
                    c=i;
                }
                checkSuit=true;
            }
        }
        if(c!=-1) {
            System.out.println(" --------------------");
            System.out.println("|    SUITABLE SLOT   |");
            System.out.println("|--------------------|");
            System.out.println("     SLOT: " + (c + 1));
            System.out.println(" --------------------");
        }
        else {
            System.out.println(" -------------------------------------- ");
            System.out.println("| NO SUITABLE SLOTS FOR THIS VEHICLE!! |");
            System.out.println(" -------------------------------------- ");
        }
    }
    public void DisplayAvailableSlots(){
        boolean flag=false;
        System.out.println(" --------------------- ");
        System.out.println("|   AVAILABLE SLOTS   |");
        System.out.println(" --------------------- ");
        for(int i=0;i<Garage.N1;i++){
            if(!obj[i].ISEmpty()) {
                System.out.println("| SLOT " +(i+1));
                flag=true;
                check=true;
            }
        }
        if(!flag) {
            System.out.println(" --------------------- ");
            System.out.println("| ALL SLOTS ARE FULL! |");
            System.out.println(" --------------------- ");
        }
    }


}
