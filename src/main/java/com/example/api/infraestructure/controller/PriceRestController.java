package com.example.api.infraestructure.controller;

import com.example.api.infraestructure.dto.PriceResponseDto;
import com.example.api.infraestructure.handler.PriceHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/price")
public class PriceRestController {
    private final PriceHandler priceHandler;

    @GetMapping("/product/{productId}/brand/{brandId}")
    public PriceResponseDto getPriceByProductIdAndBrandIdAndDateAndFilterByMajorPriority(
            @PathVariable(name = "productId") Integer productId,
            @PathVariable(name = "brandId") Integer brandId,
            @RequestParam(name = "application-date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime applicationDate) {
        return priceHandler.getPriceByProductIdAndBrandIdAndDateAndFilterByMajorPriority(productId, brandId, applicationDate);
    }
}
