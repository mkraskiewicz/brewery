package com.mkraskiewicz.brewery.web.service.v2.impl;

import com.mkraskiewicz.brewery.web.model.v2.BeerDTOV2;
import com.mkraskiewicz.brewery.web.model.v2.BeerStyleEnum;
import com.mkraskiewicz.brewery.web.service.v2.BeerServiceV2;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Maciej on 19/10/2019
 */
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDTOV2 saveNewBeer(BeerDTOV2 beerDto) {
        return BeerDTOV2.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDTOV2 beerDto) {

    }

    @Override
    public void deleteById(UUID beerId) {

    }

    @Override
    public Object getBeerById(UUID beerID) {
        return BeerDTOV2.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyleEnum.ALE)
                .build();
    }
}
