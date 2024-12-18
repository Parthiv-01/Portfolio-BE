package com.example.portfolio_tracker.repository;

import com.example.portfolio_tracker.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
}
