package udemy.course.msscbreweryclient.web.client;

import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import udemy.course.msscbreweryclient.web.model.BeerDto;

@Component
@AllArgsConstructor
public class BeerClientAdapter {

  private BeerClient beerClient;

  public BeerDto getBeer(UUID uuid) {
    return beerClient.getBear(uuid).getBody();
  }

  public void saveBeer(BeerDto beerDto) {
    beerClient.addBeer(beerDto);
  }

  public void updateBeer(UUID uuid, BeerDto beerDto) {
    beerClient.updateBeer(uuid, beerDto);
  }

  public void deleteBeer(UUID uuid) {
    beerClient.deleteBeer(uuid);
  }
}
