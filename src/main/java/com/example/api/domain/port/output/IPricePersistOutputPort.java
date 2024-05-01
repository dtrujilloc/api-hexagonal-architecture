package com.example.api.domain.port.output;

import com.example.api.domain.model.PriceModel;

import java.time.LocalDateTime;

public interface IPricePersistOutputPort {

    PriceModel getPriceByProductIdAndBrandIdAndDate(int productId, int brandId, LocalDateTime date);

}
