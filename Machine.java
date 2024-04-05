import java.util.ArrayList;

class Machine {
    private static ArrayList<Customers> admin;
    Machine(ArrayList<Customers> i){
        admin = i;
    }

    boolean checkLogIn(int id,String pass){
        int i = 0;

        while(i<admin.size()&&admin.get(i).getId()!=id){
            i++;
        }
        if(i<admin.size()&&admin.get(i).getId()==id&&admin.get(i).getPass().equals(pass)){
            return true;
        }
        return false;
    }
    void withDraw(int id,double amount,String pass){
        id--;
        if(id>=0&&admin.get(id).getBalance()>amount){
            double temp = admin.get(id).getBalance()-amount;
            Administer.dta.get(id).setBalance(temp);
            System.out.println("Cash withdrawal successful");
        }
        else{
            System.out.println("No sufficient Money");
        }
    }

    Customers viewDetails(int id){
        id--;
        return admin.get(id);
    }
    void logOut(){
        System.out.println("Successfully logged out");
    }



}
