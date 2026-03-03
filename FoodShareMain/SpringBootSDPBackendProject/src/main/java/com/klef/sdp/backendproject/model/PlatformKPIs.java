package com.klef.sdp.backendproject.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "platform_kpis")
public class PlatformKPIs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kpi_id")
    private Integer kpiId;

    @Column(name = "total_donations")
    private Long totalDonations;

    @Column(name = "total_food_saved_kg")
    private Double totalFoodSavedKg;

    @Column(name = "total_meals_served")
    private Long totalMealsServed;

    @Column(name = "total_carbon_offset_kg")
    private Double totalCarbonOffsetKg;

    @Column(name = "active_donors")
    private Long activeDonors;

    @Column(name = "active_beneficiaries")
    private Long activeBeneficiaries;

    @Column(name = "calculated_at")
    private LocalDateTime calculatedAt;

    // Getters and Setters
    public Integer getKpiId() {
        return kpiId;
    }

    public void setKpiId(Integer kpiId) {
        this.kpiId = kpiId;
    }

    public Long getTotalDonations() {
        return totalDonations;
    }

    public void setTotalDonations(Long totalDonations) {
        this.totalDonations = totalDonations;
    }

    public Double getTotalFoodSavedKg() {
        return totalFoodSavedKg;
    }

    public void setTotalFoodSavedKg(Double totalFoodSavedKg) {
        this.totalFoodSavedKg = totalFoodSavedKg;
    }

    public Long getTotalMealsServed() {
        return totalMealsServed;
    }

    public void setTotalMealsServed(Long totalMealsServed) {
        this.totalMealsServed = totalMealsServed;
    }

    public Double getTotalCarbonOffsetKg() {
        return totalCarbonOffsetKg;
    }

    public void setTotalCarbonOffsetKg(Double totalCarbonOffsetKg) {
        this.totalCarbonOffsetKg = totalCarbonOffsetKg;
    }

    public Long getActiveDonors() {
        return activeDonors;
    }

    public void setActiveDonors(Long activeDonors) {
        this.activeDonors = activeDonors;
    }

    public Long getActiveBeneficiaries() {
        return activeBeneficiaries;
    }

    public void setActiveBeneficiaries(Long activeBeneficiaries) {
        this.activeBeneficiaries = activeBeneficiaries;
    }

    public LocalDateTime getCalculatedAt() {
        return calculatedAt;
    }

    public void setCalculatedAt(LocalDateTime calculatedAt) {
        this.calculatedAt = calculatedAt;
    }
}
