import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TotalIncome {
    private static TotalIncome T =new TotalIncome();
    public Map<Double,Integer> Mp = new HashMap<>();
    private TotalIncome(){};
    public static TotalIncome Getinstance(){
        return T;
    }
    public void addFeesWithTime(double F,int t){
        T.Mp.put(F,t);
    }
    public int GetTotalIncomeAtAnyTIME(double F){
        int value=0;
        List<Double> li =new ArrayList<Double>(Mp.keySet());
        for(int i=0;i<Mp.size();i++){
            if(li.get(i)<=F){
                value+=Mp.get(li.get(i));
            }
        }
        return value;
    }


}
