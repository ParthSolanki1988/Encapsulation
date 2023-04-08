package com.simformsolutions.bank;

public class Bank {

  private long accountNumber;

  private String name;

  private int balance;

  private int pin;


  public long getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(long accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public int getPin() {
    return pin;
  }

  public void setPin(int pin) {
    while (String.valueOf(pin).length() != 4) {
      System.out.println("");
    }
    this.pin = pin;
  }

  @Override
  public String toString() {
    return "Bank{" +
        "accountNumber=" + accountNumber +
        ", name='" + name + '\'' +
        ", balance=" + balance +
        ", pin=" + pin +
        '}';
  }
}
