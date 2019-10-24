package com.mkraskiewicz.brewery.web.mappers;

import com.mkraskiewicz.brewery.domain.Beer;
import com.mkraskiewicz.brewery.domain.Beer.BeerBuilder;
import com.mkraskiewicz.brewery.web.model.BeerDTO;
import com.mkraskiewicz.brewery.web.model.BeerDTO.BeerDTOBuilder;
import com.mkraskiewicz.brewery.web.model.v2.BeerStyleEnum;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-10-22T22:20:16+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.5 (Oracle Corporation)"
)
@Component
public class BeerMapperImpl implements BeerMapper {

    @Override
    public BeerDTO beerToBeerDTO(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDTOBuilder beerDTO = BeerDTO.builder();

        beerDTO.id( beer.getId() );
        beerDTO.beerName( beer.getBeerName() );
        if ( beer.getBeerStyle() != null ) {
            beerDTO.beerStyle( beer.getBeerStyle().name() );
        }
        beerDTO.upc( beer.getUpc() );

        return beerDTO.build();
    }

    @Override
    public Beer beerDTOToBeer(BeerDTO dto) {
        if ( dto == null ) {
            return null;
        }

        BeerBuilder beer = Beer.builder();

        beer.id( dto.getId() );
        beer.beerName( dto.getBeerName() );
        if ( dto.getBeerStyle() != null ) {
            beer.beerStyle( Enum.valueOf( BeerStyleEnum.class, dto.getBeerStyle() ) );
        }
        beer.upc( dto.getUpc() );

        return beer.build();
    }
}
