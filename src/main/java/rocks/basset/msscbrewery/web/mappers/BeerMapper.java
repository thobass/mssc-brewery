package rocks.basset.msscbrewery.web.mappers;

import org.mapstruct.Mapper;
import rocks.basset.msscbrewery.domain.Beer;
import rocks.basset.msscbrewery.web.model.BeerDto;

@Mapper
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
