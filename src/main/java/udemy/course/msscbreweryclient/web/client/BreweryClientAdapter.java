package udemy.course.msscbreweryclient.web.client;

import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import udemy.course.msscbreweryclient.web.model.BeerDto;

@Component
@RequiredArgsConstructor
public class BreweryClientAdapter {

  private BreweryClient breweryClient;

  public BeerDto getBeer(UUID uuid) {
    return breweryClient.getBear(uuid).getBody();
  }
}
