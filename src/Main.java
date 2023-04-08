import com.simformsolutions.bank.Bank;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Bank bank = new Bank();
    Scanner input = new Scanner(System.in);


    //Enter bank  accountNo
    System.out.print("Enter AccountNumber : ");
    bank.setAccountNumber(input.nextLong());

    //Enter bank  username
    System.out.print("Enter Name : ");
    bank.setName(input.next());

    //Enter bank  balance
    System.out.print("Enter Bank Balance : ");
    bank.setBalance(input.nextInt());

    //Enter bank pin
    System.out.print("Enter Pin : ");
    bank.setPin(input.nextInt());


    System.out.println(bank.getAccountNumber());
    System.out.println(bank.getName());
    System.out.println(bank.getBalance());
    System.out.println(bank.getPin());

//    You can print bank account details using toString() method
//    System.out.println(bank.toString());
  }
}