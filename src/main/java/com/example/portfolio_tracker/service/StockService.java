package com.example.portfolio_tracker.service;

import com.example.portfolio_tracker.entity.Stock;
import com.example.portfolio_tracker.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    public Stock saveStock(Stock stock) {
        return stockRepository.save(stock);
    }

    public Stock updateStock(Long id, Stock stock) {
        stock.setId(id);
        return stockRepository.save(stock);
    }

    public void deleteStock(Long id) {
        stockRepository.deleteById(id);
    }

    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }
}
