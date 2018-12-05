package sample;
import java.io.File;
public class Resident extends User {

    //fields
    protected File leaseDocument;
    protected int zipCode;
    protected int accountNumber;
    protected int routingNumber;


    //default constructor
    public Resident() {

    }
    //overloaded constructor

    public Resident(String name, String username, String password,
                    int residenceID, int zipCode, int accountNumber, int routingNumber) {
        super(name, username, password, residenceID);
        this.zipCode = zipCode;
        this.accountNumber = accountNumber;
        this.routingNumber = routingNumber;
    }
    //methods

    //setters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setRoutingNumber(int routingNumber) {
        this.routingNumber = routingNumber;
    }

    //getters

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getRoutingNumber() {
        return routingNumber;
    }
}
