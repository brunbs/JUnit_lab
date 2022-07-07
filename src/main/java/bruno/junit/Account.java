package bruno.junit;

public class Account {

    private String accountNumber;
    private Double balance;

    public Account(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void deposit(Double value) {
        this.balance += value;
    }

    public void withdraw(Double value) {
        if(this.isSufficientBalance(value)) {
            this.balance -= value;
        }
    }

    public boolean isSufficientBalance(Double value) {
        if(this.balance >= value) {
            return true;
        }
        return false;
    }
}
