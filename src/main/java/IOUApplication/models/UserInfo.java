package IOUApplication.models;

public class UserInfo {

    private int userID;
    private String password;
    private String name;
    private String email;
    private String phoneNumber;
    private String bankacct_number;
    private String bankAcctName;
    private double acctBalance;

    public UserInfo(int userID, String password, String name, String email, String phoneNumber, String bankacct_number,
                    String bankAcctName, double acctBalance){
        this.userID = userID;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.bankacct_number = bankacct_number;
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

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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

    public String getBankacct_number() {
        return bankacct_number;
    }

    public void setBankacct_number(String bankacct_number) {
        this.bankacct_number = bankacct_number;
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

    @Override
    public String toString() {
        return "UserInfo{" +
                "userID=" + userID +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", bankacct_number='" + bankacct_number + '\'' +
                ", bankAcctName='" + bankAcctName + '\'' +
                ", acctBalance=" + acctBalance +
                '}';
    }
}
