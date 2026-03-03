package com.klef.sdp.backendproject.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "donations")
public class Donations {
    @Id
    @Column(name = "donation_id", length = 36)
    private String donation_id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    @Column(name = "food_description", nullable = false, length = 500)
    private String food_description;

    @Enumerated(EnumType.STRING)
    @Column(name = "food_category", nullable = false)
    private FoodCategory food_category;

    @Column(name = "quantity_kg", nullable = false)
    private Double quantity_kg;

    @Column(name = "expiry_date")
    private LocalDateTime expiry_date;

    @Column(name = "pickup_window_start")
    private LocalDateTime pickup_window_start;

    @Column(name = "pickup_window_end")
    private LocalDateTime pickup_window_end;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "created_at")
    private LocalDateTime created_at;

    @Column(name = "updated_at")
    private LocalDateTime updated_at;

    public enum FoodCategory {
        vegetables, fruits, dairy, bakery, meat, prepared, canned, beverages, other
    }

    public enum Status {
        available, reserved, requested, picked_up, delivered, expired, rejected
    }

    // Getters and Setters
    public String getDonation_id() {
        return donation_id;
    }

    public void setDonation_id(String donation_id) {
        this.donation_id = donation_id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getFood_description() {
        return food_description;
    }

    public void setFood_description(String food_description) {
        this.food_description = food_description;
    }

    public FoodCategory getFood_category() {
        return food_category;
    }

    public void setFood_category(FoodCategory food_category) {
        this.food_category = food_category;
    }

    public Double getQuantity_kg() {
        return quantity_kg;
    }

    public void setQuantity_kg(Double quantity_kg) {
        this.quantity_kg = quantity_kg;
    }

    public LocalDateTime getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(LocalDateTime expiry_date) {
        this.expiry_date = expiry_date;
    }

    public LocalDateTime getPickup_window_start() {
        return pickup_window_start;
    }

    public void setPickup_window_start(LocalDateTime pickup_window_start) {
        this.pickup_window_start = pickup_window_start;
    }

    public LocalDateTime getPickup_window_end() {
        return pickup_window_end;
    }

    public void setPickup_window_end(LocalDateTime pickup_window_end) {
        this.pickup_window_end = pickup_window_end;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }
}
