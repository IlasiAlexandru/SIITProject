package com.sci.myTrips.entity;

import javax.persistence.*;
//import javax.validation.constraints.NotEmpty;
import java.text.DateFormat;

@Entity
@Table(name = "Trip")
public class Trip {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int tripId;

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id", nullable=false)
    private User tripUser;

    @Column(name="tripName")
    private String tripName;
    @Column(name="DateFrom")
    private DateFormat dateFrom;
    @Column(name="Dateto")
    private DateFormat dateTo;
    @Column(name="impressions")
    private String impressions;
    @Column(name="firstImage")
    private String firstImage;
    @Column(name="secondImage")
    private String secondImage;

    public Trip(User tripUser, String tripName, DateFormat dateFrom, DateFormat dateTo, String impressions, String firstImage, String secondImage, Location location) {
        this.tripUser = tripUser;
        this.tripName = tripName;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.impressions = impressions;
        this.firstImage = firstImage;
        this.secondImage = secondImage;
        this.location = location;
    }


    @OneToOne(fetch=FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "trip")
    private Location location;

    public User getTripUser() {
        return tripUser;
    }

    public void setTripUser(User tripUser) {
        this.tripUser = tripUser;
    }

    public String getTripName() {
        return tripName;
    }

    public void setTripName(String tripName) {
        this.tripName = tripName;
    }

    public DateFormat getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(DateFormat dateFrom) {
        this.dateFrom = dateFrom;
    }

    public DateFormat getDateTo() {
        return dateTo;
    }

    public void setDateTo(DateFormat dateTo) {
        this.dateTo = dateTo;
    }

    public String getImpressions() {
        return impressions;
    }

    public void setImpressions(String impressions) {
        this.impressions = impressions;
    }

    public String getFirstImage() {
        return firstImage;
    }

    public void setFirstImage(String firstImage) {
        this.firstImage = firstImage;
    }

    public String getSecondImage() {
        return secondImage;
    }

    public void setSecondImage(String secondImage) {
        this.secondImage = secondImage;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Trip() {
    }







}
