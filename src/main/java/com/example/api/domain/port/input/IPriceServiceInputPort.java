package com.example.api.domain.port.input;

import com.example.api.domain.model.PriceModel;

import java.time.LocalDateTime;

public interface IPriceServiceInputPort {

    PriceModel getPriceByProductIdAndBrandIdAndDate(int productId, int brandId, LocalDateTime date);
}
