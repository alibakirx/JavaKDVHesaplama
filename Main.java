import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //Değişken tanımlama.
        double amount,newAmount,kdvAmount;
        double kdvRate = 0.18,kdvRate2 = 0.08;


        //Kullanıcıdan aldığımız değeri 'amount' değişkenine atadık.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        amount = input.nextDouble();


        //Girilen tutar 0 - 1000 aralığında ise KDV oranını %18 olarak aldık.
        if (amount >= 0 && amount <= 1000){
            kdvAmount = amount * kdvRate;
            newAmount = amount + kdvAmount;
            System.out.print(newAmount);
        }
        //Girilen tutar 1000 ve üzeri ise KDV oranını %8 olarak aldık.
        else if (amount > 1000) {
            kdvAmount = amount * kdvRate2;
            newAmount = amount + kdvAmount;
            System.out.print(newAmount);

        }
        //Girilen tutar 0'dan küçük bir değerse hata mesajı verdik.
        else {
            System.out.println("Please enter a valid value !!!");
        }




    }
}