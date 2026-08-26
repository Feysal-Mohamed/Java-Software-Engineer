package Encapsulation;

class  BankAccount{
   private int acountId;
   private String OwnerName ;
   private double Balance;

    public int getAcountId() {
        return acountId;
    }

    public void setAcountId(int acountId) {
        this.acountId = acountId;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    void DisplayInfo(){
        System.out.println("account "+acountId);
        System.out.println("owner : "+OwnerName);
        System.out.println("Balance is  : $"+Balance);
    }
    void  Deposite(double Amount){
        if (Amount >0){
            Balance += Amount;
            System.out.println(OwnerName+" make deposit $"+Amount);
            System.out.println("now your balnace is : $"+Balance);

        }

    }

    void  WithDraw(double Amount){
      if(Amount <= Balance){
          Balance -= Amount;
          System.out.println(OwnerName+" Withdrawls $"+Amount);
          System.out.println("now your balnace is : $"+Balance);
      }else {
          System.out.println("Your balance is not enough");
      }

    }

}

public class Bank {

    public static void main(String[] args) {
        BankAccount owner1 = new BankAccount();
        BankAccount owner2 = new BankAccount();

        owner1.setAcountId(1);
        owner1.setOwnerName("maxamed");
        owner1.Deposite(1000);
        owner1.setAcountId(2);
        owner2.setOwnerName("feysal");
        owner2.Deposite(500);

        owner1.DisplayInfo();
        owner2.DisplayInfo();

        owner1.Deposite(200);
        owner2.WithDraw(100);


    }
}



