package com.sci.myTrips.entity;


import javax.persistence.*;

@Entity
@Table(name = "Location")

public class Location {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tripId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trip_id", nullable = false)
    private Trip trip;

    @Column(name="name")
    private String name;

    @Column(name="longitude")
    private double longitude;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Column(name="latidude")
    private double latitude;

    public Location(String name, double longitude, double latitude) {
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
    }





}
