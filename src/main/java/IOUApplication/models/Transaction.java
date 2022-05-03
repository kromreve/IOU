package IOUApplication.models;

public class Transaction {
    private int userID;
    private double amount;
    private Boolean sent;
    private String message;

    public Transaction(int id, double amount, Boolean sent, String message){
        this.userID = id;
        this.amount = amount;
        this.sent = sent;
        this.message = message;
    }

    public int getUserID(){
        return this.userID;
    }

    public double getAmount(){
        return this.amount;
    }

    public Boolean getSent() {
        return sent;
    }

    public String getMessage() {
        return message;
    }
}
