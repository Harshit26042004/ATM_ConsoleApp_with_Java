import java.util.ArrayList;

public class Administer {

    public static ArrayList<Customers> dta = new ArrayList<>();

    protected void createCustomer(String name,String bank,int id,String pass,double balance){
        Customers nc = new Customers(name,bank,id,pass,balance);
        dta.add(nc);
    }
    protected void deleteCustomer(int id){
        int i = 0;
        while(i<dta.size()&&dta.get(i).getId()!=id){
            i++;
        }
        if(dta.get(i).getId()==id){
            dta.remove(i);
        }
    }
    protected void fitBalance(int id,double bal){
        int i = 0;
        while(i<dta.size()&&dta.get(i).getId()!=id){
            i++;
        }
        if(dta.get(i).getId()==id){
            dta.get(i).setBalance(bal);
        }
    }
    public ArrayList<Customers> getDta() {
        return dta;
    }

}
