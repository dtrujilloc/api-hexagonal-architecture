package com.example.api.application.dto;

import java.time.LocalDateTime;

public class PriceResponseDto {
    private int priceList;
    private int brandId;
    private int productId;
    private LocalDateTime applicationDate;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private double price;

    public PriceResponseDto() {
    }

    public PriceResponseDto(int priceList, int brandId, int productId, LocalDateTime applicationDate, LocalDateTime startDate, LocalDateTime endDate, double price) {
        this.priceList = priceList;
        this.brandId = brandId;
        this.productId = productId;
        this.applicationDate = applicationDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
    }

    public int getPriceList() {
        return priceList;
    }

    public void setPriceList(int priceList) {
        this.priceList = priceList;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public LocalDateTime getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(LocalDateTime applicationDate) {
        this.applicationDate = applicationDate;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
