package com.example.api.application.usecase;

import com.example.api.domain.model.PriceModel;
import com.example.api.domain.port.input.IPriceServiceInputPort;
import com.example.api.domain.port.output.IPricePersistOutputPort;

import java.time.LocalDateTime;

public class PriceUseCase implements IPriceServiceInputPort {

    private final IPricePersistOutputPort pricePersistOutputPort;

    public PriceUseCase (IPricePersistOutputPort pricePersistOutputPort) {
        this.pricePersistOutputPort = pricePersistOutputPort;
    }

    @Override
    public PriceModel getPriceByProductIdAndBrandIdAndDate(int productId, int brandId, LocalDateTime date) {
        return pricePersistOutputPort.getPriceByProductIdAndBrandIdAndDate(productId, brandId, date);
    }
}
