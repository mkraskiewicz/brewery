package com.mkraskiewicz.brewery.web.mappers;

import com.mkraskiewicz.brewery.domain.Beer;
import com.mkraskiewicz.brewery.web.model.BeerDTO;
import org.mapstruct.Mapper;

/**
 * Created by Maciej on 22/10/2019
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDTO beerToBeerDTO(Beer beer);

    Beer beerDTOToBeer(BeerDTO dto);
}