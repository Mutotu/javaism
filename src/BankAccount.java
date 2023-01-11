public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(){
        this(123,"LOL","LOL",215);
        System.out.println("Empty constructor called");
    }
    public BankAccount(int phoneNumber, String customerName, String email
    ,int accountNumber){
        System.out.println("Account with the paramteres calld");
        this.accountNumber = accountNumber;
        this.accountBalance = accountNumber;
        this.customerName = customerName;
    }

    public BankAccount(String customerName, String email, int phoneNumber) {
//        this("KOK", "@@@@ema", 123456);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public double depositFund(double amount){
        accountBalance += amount;
        return accountBalance;
    }
    public double withdrawFund(double amount){
        if(this.accountBalance - amount < 0) return 0.0;
        this.accountBalance -= amount;
        return this.accountBalance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
