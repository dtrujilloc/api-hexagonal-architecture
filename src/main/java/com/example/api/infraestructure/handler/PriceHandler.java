package com.example.api.infraestructure.handler;

import com.example.api.application.dto.PriceResponseDto;
import com.example.api.domain.model.PriceModel;
import com.example.api.domain.port.input.IPriceServiceInputPort;
import com.example.api.infraestructure.mapper.IPriceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class PriceHandler {
    private final IPriceServiceInputPort priceServiceInputPort;
    private final IPriceMapper priceMapper;

    public PriceResponseDto getPriceByProductIdAndBrandIdAndDateAndFilterByMajorPriority(int productId, int brandId, LocalDateTime date) {
        PriceModel priceModel = priceServiceInputPort.getPriceByProductIdAndBrandIdAndDate(productId, brandId, date);

        return priceMapper.priceModelToPriceResponseDto(priceModel, date);
    }
}
