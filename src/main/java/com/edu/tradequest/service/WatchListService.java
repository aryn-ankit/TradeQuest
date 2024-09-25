package com.edu.tradequest.service;

import java.util.Set;

import com.edu.tradequest.model.Stock;
import com.edu.tradequest.dao.WatchListDAO;
import com.edu.tradequest.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WatchListService {
    @Autowired
    private WatchListDAO watchListDAO;

    public User getProfileAttributes(String email) {
        return this.watchListDAO.getProfileAttributes(email);
    }

    public boolean addStockToWatchList(User user, String stockSymbol) {
        return this.watchListDAO.addStockToWatchList(user, stockSymbol);
    }

    public Set<Stock> retrieveWatchList(User user)
    {
        return this.watchListDAO.retrieveWatchList(user);
    }
  


}