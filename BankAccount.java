public class BankAccount {
   
    private String name;
    private double balance;

   
    public BankAccount(String name, double initialBalance) {
        this.name = name;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Invalid initial balance. Set to 0.");
        }
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Error: Deposit amount must be positive!");
        }
    }

    
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive!");
        } else if (amount > balance) {
            System.out.println("Error: Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
        }
    }

    
    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Ahmed", 500.0);

        System.out.println("Account Holder: " + account.getName());
        System.out.println("Initial Balance: $" + account.getBalance());

        
        account.deposit(200.0);
        account.deposit(-50.0); 

        
        account.withdraw(100.0);
        account.withdraw(1000.0); 

        System.out.println("Final Balance: $" + account.getBalance());
    }
}