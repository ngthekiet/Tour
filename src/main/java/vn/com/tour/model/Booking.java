package vn.com.tour.model;

import java.sql.Date;

public class Booking {
    private long id;
    private Customer customer;
    private Date departuteDate;
    private int noAdults;
    private int noChildren;
    private Tour tour;

    public Booking(long id, Customer customer, Date departuteDate, int noAdults, int noChildren, Tour tour) {
        this.id = id;
        this.customer = customer;
        this.departuteDate = departuteDate;
        this.noAdults = noAdults;
        this.noChildren = noChildren;
        this.tour = tour;
    }

    public Booking() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDepartuteDate() {
        return departuteDate;
    }

    public void setDepartuteDate(Date departuteDate) {
        this.departuteDate = departuteDate;
    }

    public int getNoAdults() {
        return noAdults;
    }

    public void setNoAdults(int noAdults) {
        this.noAdults = noAdults;
    }

    public int getNoChildren() {
        return noChildren;
    }

    public void setNoChildren(int noChildren) {
        this.noChildren = noChildren;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }
}
