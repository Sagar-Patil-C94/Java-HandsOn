package OOPS;

// Encapsulation - Data Hidding
// Achived by making attributes as private and by providing getter and setter method
public class encapsulation {
    public static void main(String[] args) {
        BankDemo personalacct = new BankDemo("Sagar", 1813101021, 1000);
        personalacct.display();
        personalacct.name = "Java";
        personalacct.acctNum = 10101;
        // personalacct.balance - This will Cause compile time error
        // Using getter and setter
        personalacct.setBalance(2000);
        System.out.println(personalacct.getBalance());
    }

}

class BankDemo {
    public String name;
    public long acctNum;
    private long balance;

    public BankDemo(String name, long acctNum, long balance) {
        this.name = name;
        this.acctNum = acctNum;
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void display() {
        System.out.println(name);
        System.out.println(acctNum);
        System.out.println(balance);
    }

}