class Customers {
    private String name;
    private String bank;
    private int id;
    private double balance;
    private String pass;

    Customers(String name,String bank,int id,String pass,double balance){
        this.name = name;
        this.bank = bank;
        this.id = id;
        this.pass = pass;
        this.balance = balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public String getBank() {
        return bank;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }
}
