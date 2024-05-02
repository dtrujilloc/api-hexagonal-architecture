package com.example.api.infraestructure.mapper;

import com.example.api.infraestructure.dto.PriceResponseDto;
import com.example.api.domain.model.PriceModel;
import org.mapstruct.Mapper;

import java.time.LocalDateTime;

@Mapper(componentModel = "spring")
public interface IPriceMapper {
    PriceResponseDto priceModelToPriceResponseDto(PriceModel priceModel, LocalDateTime applicationDate);
}
