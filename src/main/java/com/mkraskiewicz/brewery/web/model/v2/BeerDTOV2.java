package com.mkraskiewicz.brewery.web.model.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by Maciej on 17/10/2019
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDTOV2 {

    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private Long upc;
}
