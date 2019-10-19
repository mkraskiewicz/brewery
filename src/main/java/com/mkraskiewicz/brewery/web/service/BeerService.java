package com.mkraskiewicz.brewery.web.service;

import com.mkraskiewicz.brewery.web.model.BeerDTO;

import java.util.UUID;

/**
 * Created by Maciej on 17/10/2019
 */
public interface BeerService {

    BeerDTO getBeerById(UUID beerId);
    BeerDTO saveNewBeer(BeerDTO beerDto);
    void updateBeer(UUID beerId, BeerDTO beerDto);
    void deleteById(UUID beerId);
}
