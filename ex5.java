public class ex5 {

    static class InvalidAmountException extends RuntimeException {
        public InvalidAmountException() {
            super("Amount is greater than balance");
        }
    }

    static class Account {
        int accountNumber;
        String accountHolderName;
        double balance;

        public Account(int accountNumber, String accountHolderName, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = balance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            if (amount > balance) {
                throw new InvalidAmountException();
            }
            balance -= amount;
        }
    }

    public static void main(String[] args) {

        Account acc = new Account(1, "Nazim", 500);

        acc.deposit(200);

        try {
            acc.withdraw(800);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Balance: " + acc.balance);
    }
}