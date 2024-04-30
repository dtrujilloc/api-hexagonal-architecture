package com.example.api.domain.port.output;

import com.example.api.domain.model.Price;

import java.time.LocalDateTime;

public interface IPricePersistOutputPort {

    Price getPriceByProductIdAndBrandIdAndDate(int productId, int brandId, LocalDateTime date);

}
