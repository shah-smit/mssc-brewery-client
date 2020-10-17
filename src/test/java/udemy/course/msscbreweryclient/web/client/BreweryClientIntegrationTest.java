package udemy.course.msscbreweryclient.web.client;

import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import udemy.course.msscbreweryclient.web.model.BeerDto;

@SpringBootTest
public class BreweryClientIntegrationTest {

  @Autowired private BreweryClientAdapter breweryClientAdapter;

  @Test
  public void getBeer() {
    BeerDto beerDto = breweryClientAdapter.getBeer(UUID.randomUUID());

    System.out.println(beerDto);
  }

  @Test
  public void saveBeer() {
    BeerDto beerDto = BeerDto.builder().build();

    breweryClientAdapter.saveBeer(beerDto);

    System.out.println("Saved Successfully");
  }

  @Test
  public void updateBeer() {
    UUID uuid = UUID.randomUUID();
    BeerDto beerDto = BeerDto.builder().build();

    breweryClientAdapter.updateBeer(uuid, beerDto);

    System.out.println("Updated Successfully");
  }

  @Test
  public void deleteBeer() {
    UUID uuid = UUID.randomUUID();

    breweryClientAdapter.deleteBeer(uuid);

    System.out.println("Deleted Successfully");
  }
}
