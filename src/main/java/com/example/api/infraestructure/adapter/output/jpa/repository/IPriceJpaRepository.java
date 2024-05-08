package com.example.api.infraestructure.adapter.output.jpa.repository;

import com.example.api.infraestructure.adapter.output.jpa.entity.PriceJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface IPriceJpaRepository extends JpaRepository<PriceJpaEntity, Integer> {

    @Query("SELECT p FROM PriceJpaEntity p WHERE p.productId = :productId AND p.brandId = :brandId AND (:date BETWEEN p.startDate AND p.endDate)")
    List<PriceJpaEntity> getPriceByProductIdAndBrandIdAndDateBetweenStartDateAndEndDate(@Param("productId") Integer productId, @Param("brandId") Integer brandId, @Param("date") LocalDateTime date);
}
