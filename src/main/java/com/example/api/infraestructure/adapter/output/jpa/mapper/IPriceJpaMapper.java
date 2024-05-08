package com.example.api.infraestructure.adapter.output.jpa.mapper;

import com.example.api.domain.model.PriceModel;
import com.example.api.infraestructure.adapter.output.jpa.entity.PriceJpaEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IPriceJpaMapper {

    PriceModel priceJpaEntityToPriceModel(PriceJpaEntity entity);

}
