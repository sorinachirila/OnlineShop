package ro.sda.shop.storage;

import ro.sda.shop.model.Stock;

import java.util.ArrayList;
import java.util.List;

public class StockDAO implements GenericDAO<Stock> {
    static List<Stock> stockList = new ArrayList<Stock>();

    public List<Stock> findAll() {
        return stockList;
    }

    public Stock findById(Long id) {
        for (Stock stock : stockList){
            if (stock.getId().equals(id)) {
                return stock;
            }
        }
        return null;
    }

    public void update(Stock stock) {
        delete(stock);
        add(stock);
    }

    public Stock add(Stock stock) {
        if (stock.getId() == null) {
            stock.setId(generateNewId());
        }
        stockList.add(stock);
        return stock;
    }

    public void delete(Stock stock) {
        deleteById(stock.getId());
    }

    public void deleteById(Long id) {
        Stock deletedStock = null;
        for (Stock stock : stockList) {
            if (stock.getId().equals(id)) {
                deletedStock = stock;
            }
        }
        stockList.remove(deletedStock);
    }

    private long generateNewId() {
        return findMaxId() + 1;
    }

    private Long findMaxId() {
        Long max = -1L;
        for (Stock stock : stockList) {
            if (max < stock.getId()) {
                max = stock.getId();
            }
        }
        return max;
    }
}

