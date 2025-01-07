import java.security.PublicKey;
import java.util.Scanner;
public class Slot{
    private double Width,Depth;
    private int SlotId;
    public Boolean Empty = false;
    Slot(double w,double d,int SD){
        Width=w;
        Depth=d;
        SlotId=SD;
    }
    public double getWidth() {
        return Width;
    }
    public double getDepth(){
        return Depth;
    }
    boolean ISEmpty(){
        if(Empty) return true;
        else return false;
    }
    public void EditSlotInfo(double Width,double Depth){
        this.Width=Width;
        this.Depth=Depth;
    }
}
