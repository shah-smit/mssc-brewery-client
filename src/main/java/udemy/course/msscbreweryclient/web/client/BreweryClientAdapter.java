package udemy.course.msscbreweryclient.web.client;

import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import udemy.course.msscbreweryclient.web.model.BeerDto;

@Component
@AllArgsConstructor
public class BreweryClientAdapter {

  private BreweryClient breweryClient;

  public BeerDto getBeer(UUID uuid) {
    return breweryClient.getBear(uuid).getBody();
  }

  public void saveBeer(BeerDto beerDto) {
    breweryClient.addBeer(beerDto);
  }

  public void updateBeer(UUID uuid, BeerDto beerDto) {
    breweryClient.updateBeer(uuid, beerDto);
  }

  public void deleteBeer(UUID uuid) {
    breweryClient.deleteBeer(uuid);
  }
}
