package IOUApplication.models;

import org.apache.catalina.User;

public class MoneyTransaction {
    double amount;

    String senderName;
    UserInfo sender;
    UserInfo receiver;
    String receiverName;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public UserInfo getSender() {
        return sender;
    }

    public void setSender(UserInfo sender) {
        this.sender = sender;
    }

    public UserInfo getReceiver() {
        return receiver;
    }

    public void setReceiver(UserInfo receiver) {
        this.receiver = receiver;
    }

    public MoneyTransaction(double amount, String senderName, String receiverName) {
        this.amount = amount;
        this.senderName = senderName;
        this.receiverName = receiverName;
    }
}
