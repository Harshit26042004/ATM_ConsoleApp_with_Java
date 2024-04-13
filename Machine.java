import java.util.ArrayList;

class Machine {
    private static ArrayList<Customers> admin;
    Machine(ArrayList<Customers> i){
        admin = i;
    }

    boolean checkLogIn(String name,String pass){
        int i = 0;

        while(i<admin.size()&&!admin.get(i).getName().equals(name)){
            i++;
        }
        if(i<admin.size()&&admin.get(i).getName().equals(name)&&admin.get(i).getPass().equals(pass)){
            return true;
        }
        return false;
    }
    void withDraw(String name,double amount,String pass){

        int i=0;
        while(i<admin.size()&&!admin.get(i).getName().equals(name)){
            i++;
        }
        if(admin.get(i).getName().equals(name)&&admin.get(i).getBalance()>amount){
            double temp = admin.get(i).getBalance()-amount;
            Administer.dta.get(i).setBalance(temp);
            System.out.println("Cash withdrawal successful");
        }
        else{
            System.out.println("No sufficient Money");
        }
    }

    Customers viewDetails(String name){
        int i=0;
        while(i<admin.size()&&!admin.get(i).getName().equals(name)){
            i++;
        }
        return admin.get(i);
    }
    void logOut(){
        System.out.println("Successfully logged out");
    }



}
