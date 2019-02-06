public class BankAccount {
    private String name;
    private int balans;
    public BankAccount(String name, int balans){
        this.name = name;
        this.balans = balans;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalans() {
        return balans;
    }

    public void setBalans(int balans) {
        this.balans = balans;
    }

    @Override
    public String toString() {
        return this.getName()+" "+this.getBalans();
    }
}
