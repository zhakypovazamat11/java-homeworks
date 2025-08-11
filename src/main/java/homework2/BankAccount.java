package homework2;

public class BankAccount {

  String owner;
  int balance;

  BankAccount(String owner, int balance) {
    this.owner = owner;
    this.balance = balance;
  }

  public String getOwner() {
    return this.owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public void deposit(int amount) {
    if (amount < 0) {
      System.out.println("Deposit amount can not be negative");
    }
    this.balance += amount;
  }

  public void withdraw(int amount) {
    if (balance <= 0) {
      System.out.println("Balance is equal or less than zero");
    }
    this.balance -= amount;
  }

  public void printBalance() {
    System.out.println("Your current balance is " + this.balance + " $ USD");
  }
}
