import java.security.PublicKey;
import java.util.Scanner;
public class Vehicle extends Operator{
    private int uniqueNumber,ModelYear,SlotId;
    private double Width,Depth;
    private String ModelName;
    public boolean VehicleField=false;
    ///Functions----
    public Vehicle(int UN,int M,int SID,double W,double D ,String MN){
        uniqueNumber=UN;
        ModelYear=M;
        SlotId=SID;
        Width=W;
        Depth=D;
        ModelName=MN;
    }
    public int GetSlotID(){
        return SlotId;
    }
    public String GetVehicleName(){
        return ModelName;
    }
    public double GetVehicleWidth(){
        return Width;
    }
    public double GetVehicleDepth(){
        return Depth;
    }
    public int GetVehicleModelYear(){
        return ModelYear;
    }
    public int GetVehicleIdentifier(){
        return uniqueNumber;
    }
    public boolean ISFull(){
        if(VehicleField) return true;
        else return false;
    }

}
