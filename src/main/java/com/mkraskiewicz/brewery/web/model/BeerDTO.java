package com.mkraskiewicz.brewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.util.UUID;

/**
 * Created by Maciej on 17/10/2019
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDTO {

    @Null
    private UUID id;
    @NotBlank
    private String beerName;
    @NotBlank
    private String beerStyle;
    @Positive
    private Long upc;
}
