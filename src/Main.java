import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Garage obj = new Garage();
        Parking P1 = new ParkIn1();
        Parking P2 = new ParkIn2();
        ParkOut Po=new ParkOut();
        TotalIncome t=TotalIncome.Getinstance();
        int choice;
        System.out.println(" ------------------ ");
        System.out.println("|GARAGE APPLICATION|");
        System.out.println(" ------------------ ");
        while (true){
            System.out.println(" ---------------- ");
            System.out.println("|Configurations. |");
            System.out.println("|----------------|");
            System.out.println("|[1]FIRST-COME   |");
            System.out.println("|[2]BEST-FIT     |");
            System.out.println("|[3]Exit.        |");
            System.out.println(" ---------------- ");
            System.out.println("Enter Configuration choice :");
            choice = sc.nextInt();
            if (choice==1){
                System.out.println("\nSYSTEM HANDLED BY FIRST COME ALGORITHM \n\n");
                while (true){
                    int choice1;
                    System.out.println(" ---------------------- ");
                    System.out.println("|  GARAGE OWNER SCREEN |");
                    System.out.println("|----------------------|");
                    System.out.println("|[1]DEFINE GARAGE SLOTS|");
                    System.out.println("|[2]GO BACK            |");
                    System.out.println(" ---------------------- ");
                    System.out.println("Enter choice :");
                    choice1 = sc.nextInt();
                    if(choice1==1){
                        int choice2;
                        obj.GarageSlots();
                        System.out.println("GARAGE SLOTS DEFINED SUCCESSFULLY");
                        while (true){
                            System.out.println(" ---------------------------");
                            System.out.println("|   GARAGE MANAGER SCREEN   |");
                            System.out.println("|---------------------------|");
                            System.out.println("|[1]PARK IN                 |");
                            System.out.println("|[2]PARK OUT                |");
                            System.out.println("|[3]DISPLAY AVAILABLE SLOTS |");
                            System.out.println("|[4]Total Income            |");
                            System.out.println("|[5]GO BACK                 |");
                            System.out.println(" --------------------------- ");
                            System.out.println("Enter choice :");
                            choice2=sc.nextInt();
                            if(choice2==1){
                                P1.ParkIn();
                            }
                            else if(choice2==2){
                                int TID;
                                System.out.println("Enter Ticket ID :");
                                TID = sc.nextInt();
                                Po.ParkOut(TID);
                            }
                            else if (choice2==3) {
                                System.out.println("------------------");
                                obj.DisplayAvailableSlots();
                                System.out.println("------------------");
                            }
                            else if(choice2==4){
                                double TTI;
                                System.out.println("Enter Time For TotalIncome : ");
                                TTI =sc.nextDouble();
                                System.out.println("Total Income At "+TTI+" = "+t.GetTotalIncomeAtAnyTIME(TTI));
                            }
                            else if(choice2==5){
                                break;
                            }
                        }
                    }
                    else if(choice1==2) {
                        break;
                    }
                }
            }
            else if (choice==2){System.out.println("\nSYSTEM HANDLED BY BEST FIT ALGORITHM \n\n");
                while (true){
                    int choice1;
                    System.out.println(" ---------------------- ");
                    System.out.println("|  GARAGE OWNER SCREEN |");
                    System.out.println("|----------------------|");
                    System.out.println("|[1]DEFINE GARAGE SLOTS|");
                    System.out.println("|[2]GO BACK            |");
                    System.out.println(" ---------------------- ");
                    System.out.println("Enter choice :");
                    choice1 = sc.nextInt();
                    if(choice1==1){
                        int choice2;
                        obj.GarageSlots();
                        System.out.println("GARAGE SLOTS DEFINED SUCCESSFULLY");
                        while (true){
                            System.out.println(" ---------------------------");
                            System.out.println("|   GARAGE MANAGER SCREEN   |");
                            System.out.println("|---------------------------|");
                            System.out.println("|[1]PARK IN                 |");
                            System.out.println("|[2]PARK OUT                |");
                            System.out.println("|[3]DISPLAY AVAILABLE SLOTS |");
                            System.out.println("|[4]Total Income            |");
                            System.out.println("|[5]GO BACK                 |");
                            System.out.println(" --------------------------- ");
                            System.out.println("Enter choice :");
                            choice2=sc.nextInt();
                            if(choice2==1){
                                P2.ParkIn();
                            }
                            else if(choice2==2){
                                int TID;
                                System.out.println("Enter Ticket ID :");
                                TID = sc.nextInt();
                                Po.ParkOut(TID);
                            }
                            else if (choice2==3) {
                                System.out.println("------------------");
                                obj.DisplayAvailableSlots();
                                System.out.println("------------------");
                            }
                            else if(choice2==4){
                                double TTI;
                                System.out.println("Enter Time For TotalIncome : ");
                                TTI =sc.nextDouble();
                                System.out.println("Total Income At "+TTI+" = "+t.GetTotalIncomeAtAnyTIME(TTI));
                            }
                            else if(choice2==5)
                            {
                                break;
                            }
                        }
                    }
                    else if(choice1==2) {
                        break;
                    }
                }
            }
            else if(choice==3){
                System.out.println("\nTHANK YOU FOR USING OUR APPLICATION ^-^\n");
                break;
            }
            else {
                System.out.println("Enter Configuration choice :");
                choice = sc.nextInt();
            }
        }
        }
    }
