package com.example.api.infraestructure.adapter.output.jpa.repository;

import com.example.api.infraestructure.adapter.output.jpa.entity.PriceJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPriceJpaRepository extends JpaRepository<PriceJpaEntity, Integer> {
}
