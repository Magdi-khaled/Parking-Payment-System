public class ParkingFees {
    public int CalculateFees(double t2,double t1){
        double Total = t2-t1;/// 23 - 20.5 =2.5
        int Fees=0;
            if(Total>1.0){
                int t=(int) Total;/// 2
                Fees=t*5;
                if(Total>(t/1.0)){ Fees+=5;}
                return Fees;
            }
            else {
                return Fees+=5;
            }
    }
}
