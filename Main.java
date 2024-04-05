import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Administrator working
        Administer ad = new Administer();
        ArrayList<Customers> db ;
        ad.createCustomer("Abi","Canara",1,"0007",(double)15000);
        ad.createCustomer("Aakash","KVB",2,"2004",(double)1000);
        ad.createCustomer("Charles","CSB",3,"0503",(double)23000);
        ad.fitBalance(2,2500);
        db = ad.getDta();

        // ATM Machine working
        Machine mc = new Machine(db);
        if(mc.checkLogIn(2,"2004")){
            System.out.println("logged in");
        }
        mc.withDraw(2,500,"2004");
        Customers ob = mc.viewDetails(2);
        System.out.println("Name : "+ob.getName());
        System.out.println("id : "+ob.getId());
        System.out.println("Bank : "+ob.getBank());
        System.out.println("Balance : "+ob.getBalance());
        mc.logOut();
    }
}