package com.mkraskiewicz.brewery.web.service.v2;

import com.mkraskiewicz.brewery.web.model.v2.BeerDTOV2;

import java.util.UUID;

/**
 * Created by Maciej on 19/10/2019
 */
public interface BeerServiceV2 {
    
    BeerDTOV2 saveNewBeer(BeerDTOV2 beerDto);

    void updateBeer(UUID beerId, BeerDTOV2 beerDto);

    void deleteById(UUID beerId);

    BeerDTOV2 getBeerById(UUID beerID);
}
