public class BankAccount {
    private double balance;
    private String ownerName;

    // Constructor
    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount should be positive");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Withdrawal failed: invalid amount or insufficient funds");
            return false;
        }
    }
    public void setOwnerName(String name) {
        this.ownerName = name;
    }


    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Venkatesh", 39);
        System.out.println("Owner: " + acc.getOwnerName() + ", Balance: " + acc.getBalance());

        acc.deposit(50);
        System.out.println("After deposit: " + acc.getBalance());

        acc.withdraw(30);
        System.out.println("After withdraw: " + acc.getBalance());

        acc.withdraw(200); // will fail
        System.out.println("After failed withdraw: " + acc.getBalance());

        acc.setOwnerName("Venkatesh I");
        System.out.println("After setter Function :" +acc.getOwnerName());


    }
}
