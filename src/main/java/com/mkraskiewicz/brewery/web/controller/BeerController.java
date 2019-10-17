package com.mkraskiewicz.brewery.web.controller;

import com.mkraskiewicz.brewery.web.model.BeerDTO;
import com.mkraskiewicz.brewery.web.service.BeerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by Maciej on 17/10/2019
 */
@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    public ResponseEntity<BeerDTO> getBeer(@PathVariable("beerId") UUID beerID){

        return new ResponseEntity<>(beerService.getBeerById(beerID), HttpStatus.OK);
    }
}
