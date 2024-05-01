package com.example.api.application.usecase;

import com.example.api.domain.model.Price;
import com.example.api.domain.port.input.IPriceServiceInputPort;
import com.example.api.domain.port.output.IPricePersistOutputPort;

import java.time.LocalDateTime;

public class PriceUseCase implements IPriceServiceInputPort {

    private final IPricePersistOutputPort pricePersistOutputPort;

    public PriceUseCase (IPricePersistOutputPort pricePersistOutputPort) {
        this.pricePersistOutputPort = pricePersistOutputPort;
    }

    @Override
    public Price getPriceByProductIdAndBrandIdAndDate(int productId, int brandId, LocalDateTime date) {
        return null;
    }
}
