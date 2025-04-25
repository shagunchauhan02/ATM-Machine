import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double balance = 1000.00; 
        int pin = 1234;            
        int enteredPin;
        
        System.out.println("Welcome to the ATM Machine!");
        System.out.print("Enter your PIN: ");
        enteredPin = scanner.nextInt();
        
        if (enteredPin == pin) {
            int option;
            
            do {
                System.out.println("\nATM Menu:");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                
                option = scanner.nextInt();
                
                switch (option) {
                    case 1:
                        System.out.println("Your current balance is: $" + balance);
                        break;
                    
                    case 2:
                        System.out.print("Enter deposit amount: $");
                        double deposit = scanner.nextDouble();
                        balance += deposit;
                        System.out.println("Deposit successful! New balance: $" + balance);
                        break;
                    
                    case 3:
                        System.out.print("Enter withdrawal amount: $");
                        double withdraw = scanner.nextDouble();
                        
                        if (withdraw > balance) {
                            System.out.println("Insufficient balance!");
                        } else {
                            balance -= withdraw;
                            System.out.println("Withdrawal successful! New balance: $" + balance);
                        }
                        break;
                    
                    case 4:
                        System.out.println("Thank you for using the ATM! Goodbye.");
                        break;
                    
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
                
            } while (option != 4);
            
        } else {
            System.out.println("Incorrect PIN. Access denied.");
        }
        
        scanner.close();
    }
}
