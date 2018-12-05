package sample;
import java.util.Date;

public class Event {

    //fields
    protected String nameOfEvent;
    protected String address;
    protected String description;
    protected Date dateAndTime;

    //default constructor
    public Event() {

    }

    //overloaded constructor
    public Event(String nameOfEvent, String address, String description, Date dateAndTime) {
        this.nameOfEvent = nameOfEvent;
        this.address = address;
        this.description = description;
        this.dateAndTime = dateAndTime;
    }

    //methods

    //setters
    public void setName(String name) {
        nameOfEvent = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateAndTime(Date dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //getters
    public String getNameOfEvent() {
        return nameOfEvent;
    }

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }

    public Date getDateAndTime() {
        return dateAndTime;
    }

    public String printEvent() {
        return "Event{" +
                "nameOfEvent='" + nameOfEvent + '\'' +
                ", address='" + address + '\'' +
                ", description='" + description + '\'' +
                ", dateAndTime=" + dateAndTime +
                '}';
    }
}
