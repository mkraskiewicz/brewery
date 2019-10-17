package com.mkraskiewicz.brewery.web.service.impl;

import com.mkraskiewicz.brewery.web.model.BeerDTO;
import com.mkraskiewicz.brewery.web.service.BeerService;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Maciej on 17/10/2019
 */
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }
}
