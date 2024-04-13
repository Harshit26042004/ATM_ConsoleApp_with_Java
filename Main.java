import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Administrator working
    static Administer ad = new Administer();
    static {
        ad.createCustomer("Abi","Canara",1,"0007",(double)15000);
        ad.createCustomer("Aakash","KVB",2,"2004",(double)1000);
        ad.createCustomer("Charles","CSB",3,"0503",(double)23000);
        ad.createCustomer("Dinesh","SBI",4,"9023",(double)2500);
        ad.createCustomer("Hari","Canara",5,"2205",(double)7000);
        ad.fitBalance(2,2500);
    }
    public static void main(String[] args) {

        ArrayList<Customers> db ;
        db = ad.getDta();

        // ATM Machine working
        Machine mc = new Machine(db);

        Scanner sc = new Scanner(System.in);
        int a =0;
        do {
            System.out.println("Enter the option : ");
            System.out.println("1. Log in Account");
            System.out.println("3. Exit");
            a = sc.nextInt();

            if (a == 1) {
                System.out.println("Welcome! login to account");
                System.out.print("Enter name : ");
                String name = sc.next();
                System.out.println("Enter Pin");
                String pass = sc.next();
                if (mc.checkLogIn(name, pass)) {
                    int ac_opt = 0;
                    do {
                        System.out.println("Log in Successful");
                        System.out.println("1. Retrieve money");
                        System.out.println("2. Check balance");
                        System.out.println("3. Log out");
                        ac_opt = sc.nextInt();
                        if (ac_opt == 1) {
                            System.out.println("Enter amount");
                            double amount = sc.nextDouble();
                            mc.withDraw(name, amount, pass);
                        }
                        if (ac_opt == 2) {
                            Customers od = mc.viewDetails(name);
                            System.out.println("Name : " + od.getName());
                            System.out.println("id : " + od.getId());
                            System.out.println("Bank : " + od.getBank());
                            System.out.println("Balance : " + od.getBalance());
                        }
                    } while (ac_opt != 3);

                }
            }
        }
        while(a!=3);

    }
}