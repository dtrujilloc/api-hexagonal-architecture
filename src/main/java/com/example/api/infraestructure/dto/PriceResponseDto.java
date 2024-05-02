package com.example.api.infraestructure.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PriceResponseDto {
    private int priceList;
    private int brandId;
    private int productId;
    private LocalDateTime applicationDate;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private double price;
}
