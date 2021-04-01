package guru.springframework.msscbrewery.web.controller;

import guru.springframework.msscbrewery.services.BeerService;
import guru.springframework.msscbrewery.web.model.BeerDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/beer/")
@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @RequestMapping(value = "{beerId}", method = RequestMethod.GET)
    public BeerDTO getBeer(@PathVariable UUID beerId){

        return beerService.getBeerById(beerId);
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    BeerDTO saveBeer(BeerDTO beerDTO){

        return beerService.saveNewBeer(beerDTO);
    }

    @RequestMapping(value =  "{beerId}",method = RequestMethod.PUT)
    void updateBeer(@PathVariable UUID beerId, BeerDTO beerDTO){

        beerService.updateBeer(beerId,beerDTO);
    }

}
