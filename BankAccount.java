import java.util.Scanner;
class Bank{
    int id;
    String name;
    int balance;
    int deposit;
    int withdraw;
    Bank(int i, String n, int b, int d, int w){
        id = i;
        name = n;
        balance = b;
        deposit = d;
        withdraw = w;
    }
    void getDeposit(){
        System.out.println("You have deposited " + deposit);
        balance = balance + deposit;
    }
    void getWithdraw(){
        if(withdraw>balance){
            System.out.println("You don't have sufficent balance");
        }else{
            System.out.println("You have withdrawn " + withdraw);
            balance = balance - withdraw;
        }
    }
    void getDisplay(){
        System.out.println(balance);
    }
}

public class BankAccount{
    public static void main(String[] args){
        System.out.println("For bank account A: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter account number");
        int id = input.nextInt();
        System.out.println("Enter name");
        String name = input.next();
        System.out.println("Enter balance");
        int bal = input.nextInt();
        System.out.println("If you'd like to deposit, enter amount, else enter 0");
        int dep = input.nextInt();
        System.out.println("If you'd like to withdraw, enter amount, else enter 0");
        int with = input.nextInt();
        Bank a = new Bank(id,name,bal,dep,with);
        System.out.println("For bank account B: ");
        System.out.println("Enter account number");
        int idb = input.nextInt();
        System.out.println("Enter name");
        String nameb = input.next();
        System.out.println("Enter balance");
        int balb = input.nextInt();
        System.out.println("If you'd like to deposit, enter amount, else enter 0");
        int depb = input.nextInt();
        System.out.println("If you'd like to withdraw, enter amount, else enter 0");
        int withb = input.nextInt();
        Bank b = new Bank(idb,nameb,balb,depb,withb);
        System.out.println("-----------------------------");
        System.out.println("For bank A");
        a.getDeposit();
        a.getWithdraw();
        a.getDisplay();
        System.out.println("-----------------------------");
        System.out.println("For bank B");
        b.getDeposit();
        b.getWithdraw();
        b.getDisplay();
    }
}
