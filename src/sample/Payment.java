package sample;
import java.util.Date;

public class Payment {

    //fields
    protected double amountDue;
    protected double currentDue;
    protected double amountPaid;
    protected Date dateDue;
    protected Date datePaid;
    protected boolean pastDue;

    //default constructor
    public Payment() {

    }
    //overloaded constructor

    public Payment(double amountDue, double currentDue, double amountPaid, Date dateDue,
                   Date datePaid, boolean pastDue) {
        this.amountDue = amountDue;
        this.currentDue = currentDue;
        this.amountPaid = amountPaid;
        this.dateDue = dateDue;
        this.datePaid = datePaid;
        this.pastDue = pastDue;
    }

    //methods
    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public double getCurrentDue() {
        return currentDue;
    }

    public void setCurrentDue(double currentDue) {
        this.currentDue = currentDue;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public Date getDateDue() {
        return dateDue;
    }

    public void setDateDue(Date dateDue) {
        this.dateDue = dateDue;
    }

    public Date getDatePaid() {
        return datePaid;
    }

    public void setDatePaid(Date datePaid) {
        this.datePaid = datePaid;
    }

    public boolean isPastDue() {
        return pastDue;
    }

    public void setPastDue(boolean pastDue) {
        this.pastDue = pastDue;
    }
    public void makePayment(double amountPaid){
        setCurrentDue(currentDue - amountPaid);
        setAmountDue(amountDue - amountPaid);
        setAmountPaid(this.getAmountPaid() + amountPaid);
    }
}
