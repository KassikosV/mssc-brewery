package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return new BeerDTO(UUID.randomUUID(),"mamos","black",1L);
    }

    @Override
    public BeerDTO saveNewBeer(BeerDTO beerDTO) {
        return new BeerDTO(UUID.randomUUID(),"sec","sec",2L);
    }

    @Override
    public void updateBeer(UUID beerId, BeerDTO beerDTO) {

    }
}
