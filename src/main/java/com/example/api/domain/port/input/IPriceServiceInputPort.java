package com.example.api.domain.port.input;

import com.example.api.domain.model.Price;

import java.time.LocalDateTime;

public interface IPriceServiceInputPort {

    Price getPriceByProductIdAndBrandIdAndDate(int productId, int brandId, LocalDateTime date);
}
