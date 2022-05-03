package IOUApplication.models;

public class UserInfo {

    private int userID;
    private String password;
    private String email;
    private String phoneNumber;
    private String bankAcctNumber;
    private String bankAcctName;
    private double acctBalance;

    public UserInfo(int userID, String password, String email, String phoneNumber, String bankAcctNumber,
                    String bankAcctName, double acctBalance){
        this.userID = userID;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.bankAcctNumber = bankAcctNumber;
        this.bankAcctName = bankAcctName;
        this.acctBalance = acctBalance;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBankAcctNumber() {
        return bankAcctNumber;
    }

    public void setBankAcctNumber(String bankAcctNumber) {
        this.bankAcctNumber = bankAcctNumber;
    }

    public String getBankAcctName() {
        return bankAcctName;
    }

    public void setBankAcctName(String bankAcctName) {
        this.bankAcctName = bankAcctName;
    }

    public double getAcctBalance() {
        return acctBalance;
    }

    public void setAcctBalance(double acctBalance) {
        this.acctBalance = acctBalance;
    }
}
