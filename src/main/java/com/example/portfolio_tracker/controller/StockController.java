package com.example.portfolio_tracker.controller;

import com.example.portfolio_tracker.entity.Stock;
import com.example.portfolio_tracker.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stocks")
@CrossOrigin(origins = "*")
public class StockController {

    @Autowired
    private StockService stockService;

    @PostMapping
    public Stock addStock(@RequestBody Stock stock) {
        return stockService.saveStock(stock);
    }

    @PutMapping("/{id}")
    public Stock updateStock(@PathVariable Long id, @RequestBody Stock stock) {
        return stockService.updateStock(id, stock);
    }

    @DeleteMapping("/{id}")
    public void deleteStock(@PathVariable Long id) {
        stockService.deleteStock(id);
    }

    @GetMapping
    public List<Stock> getAllStocks() {
        return stockService.getAllStocks();
    }
}
