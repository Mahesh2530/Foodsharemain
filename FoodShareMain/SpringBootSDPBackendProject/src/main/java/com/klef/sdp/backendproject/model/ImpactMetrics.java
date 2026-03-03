package com.klef.sdp.backendproject.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "impact_metrics")
public class ImpactMetrics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "metric_id")
    private Integer metricId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @Column(name = "food_saved_kg")
    private Double foodSavedKg;

    @Column(name = "meals_served")
    private Long mealsServed;

    @Column(name = "carbon_offset_kg")
    private Double carbonOffsetKg;

    @Column(name = "calculated_at")
    private LocalDateTime calculatedAt;

    // Getters and Setters
    public Integer getMetricId() {
        return metricId;
    }

    public void setMetricId(Integer metricId) {
        this.metricId = metricId;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Double getFoodSavedKg() {
        return foodSavedKg;
    }

    public void setFoodSavedKg(Double foodSavedKg) {
        this.foodSavedKg = foodSavedKg;
    }

    public Long getMealsServed() {
        return mealsServed;
    }

    public void setMealsServed(Long mealsServed) {
        this.mealsServed = mealsServed;
    }

    public Double getCarbonOffsetKg() {
        return carbonOffsetKg;
    }

    public void setCarbonOffsetKg(Double carbonOffsetKg) {
        this.carbonOffsetKg = carbonOffsetKg;
    }

    public LocalDateTime getCalculatedAt() {
        return calculatedAt;
    }

    public void setCalculatedAt(LocalDateTime calculatedAt) {
        this.calculatedAt = calculatedAt;
    }
}
