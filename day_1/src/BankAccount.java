
class  Bank{
    int acountId;
    String OwnerName ;
    double Balance;

    void DisplayInfo(){
        System.out.println("account "+acountId);
        System.out.println("owner : "+OwnerName);
        System.out.println("Balance is  : $"+Balance);
    }
    void  Deposite(double Amount){
        Balance += Amount;
        System.out.println(OwnerName+" make deposit $"+Amount);
        System.out.println("now your balnace is : $"+Balance);

    }

    void  WithDraw(double Amount){
        Balance -= Amount;
        System.out.println(OwnerName+" Withdrawls $"+Amount);
        System.out.println("now your balnace is : $"+Balance);

    }

}

public class BankAccount {

    public static void main(String[] args) {
        Bank owner1 = new Bank();
        Bank owner2 = new Bank();

        owner1.acountId=1;
        owner1.OwnerName ="Feysal";
        owner1.Balance =1000;
        owner1.acountId=2;
        owner2.OwnerName ="Maxamed";
        owner2.Balance =500;

        owner1.DisplayInfo();
        owner2.DisplayInfo();

        owner1.Deposite(200);
        owner2.WithDraw(100);


    }
}
