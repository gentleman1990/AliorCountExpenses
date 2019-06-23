package model;

public class ExpenseModel {
    String sender;
    String receiver;
    String description;
    double value;
    String tag;

    public ExpenseModel(String sender, String receiver, String description, double value) {
        this.sender = sender;
        this.receiver = receiver;
        this.description = description;
        this.value = value;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return value;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
