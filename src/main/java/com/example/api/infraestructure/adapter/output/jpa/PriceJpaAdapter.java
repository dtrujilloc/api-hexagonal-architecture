package com.example.api.infraestructure.adapter.output.jpa;

import com.example.api.domain.model.PriceModel;
import com.example.api.domain.port.output.IPricePersistOutputPort;
import com.example.api.infraestructure.adapter.output.jpa.entity.PriceJpaEntity;
import com.example.api.infraestructure.adapter.output.jpa.mapper.IPriceJpaMapper;
import com.example.api.infraestructure.adapter.output.jpa.repository.IPriceJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;

@Component
@RequiredArgsConstructor
public class PriceJpaAdapter implements IPricePersistOutputPort {

    private final IPriceJpaRepository priceJpaRepository;
    private final IPriceJpaMapper priceJpaMapper;

    @Override
    public PriceModel getPriceByProductIdAndBrandIdAndDate(int productId, int brandId, LocalDateTime date) {

        List<PriceJpaEntity> priceJpaEntityList = priceJpaRepository.getPriceByProductIdAndBrandIdAndDateBetweenStartDateAndEndDate(productId, brandId, date);

        return priceJpaEntityList.stream()
                .max(Comparator.comparing(PriceJpaEntity::getPriority))
                .map(priceJpaMapper::priceJpaEntityToPriceModel).orElse(null);
    }
}
