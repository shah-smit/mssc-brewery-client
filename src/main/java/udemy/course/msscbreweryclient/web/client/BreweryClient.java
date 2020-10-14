package udemy.course.msscbreweryclient.web.client;

import java.util.UUID;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import udemy.course.msscbreweryclient.web.model.BeerDto;

@Component
@FeignClient(value = "breweryClient", url = "${sfg.brewery.host}")
public interface BreweryClient {

  @RequestMapping(method = RequestMethod.GET, value = "${sfg.brewery.beer-path}/{beerId}")
  ResponseEntity<BeerDto> getBear(@PathVariable("beerId") UUID beerId);
}