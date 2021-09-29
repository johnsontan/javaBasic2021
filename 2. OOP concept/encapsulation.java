public class encapsulation {
    public static void main(String args[]){
        bankAccount bob = new bankAccount(500);

        //Deposit
        System.out.println(bob.deposit(5));
        System.out.println(bob.deposit(15));

        //check balance
        System.out.print(bob.checkBalance());
    }
}

class bankAccount{
    private int balance;

    // constructor class
    public bankAccount(int balance){
        this.balance = balance;
    }

    // function to withdraw by substracting the amount of the balance
    public void withdraw(int amount){
        this.balance = this.balance - amount;
        //this.balance -= amount;
    }

    // function to deposit by adding the amount to the balance
    public String deposit(int amount){
        // if the amount is less than 10, it will not add the amount to the balance 
        if (amount < 10){
            return "Min deposit is $10.";
        }
        // any amount greater or equal to 10, the amount will be added to the balance
        else{
            this.balance = this.balance + amount;
            //this.balance += amount;
            return "Successfully deposit: " + amount;
        }
    }

    // function to check the balance 
    public int checkBalance(){
        return this.balance;
    }
}
