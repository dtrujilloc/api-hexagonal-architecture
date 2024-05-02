package com.example.api.infraestructure.configuration.bean;

import com.example.api.application.usecase.PriceUseCase;
import com.example.api.domain.port.input.IPriceServiceInputPort;
import com.example.api.domain.port.output.IPricePersistOutputPort;
import com.example.api.infraestructure.adapter.output.jpa.PriceJpaAdapter;
import com.example.api.infraestructure.adapter.output.jpa.mapper.IPriceJpaMapper;
import com.example.api.infraestructure.adapter.output.jpa.repository.IPriceJpaRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public IPriceServiceInputPort priceServiceInputPort(IPricePersistOutputPort pricePersistOutputPort) {
        return new PriceUseCase(pricePersistOutputPort);
    }

    @Bean
    public IPricePersistOutputPort pricePersistOutputPort(IPriceJpaRepository priceJpaRepository, IPriceJpaMapper priceJpaMapper) {
        return new PriceJpaAdapter(priceJpaRepository, priceJpaMapper);
    }

}
