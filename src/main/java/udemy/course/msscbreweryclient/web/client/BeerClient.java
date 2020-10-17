package udemy.course.msscbreweryclient.web.client;

import java.util.UUID;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import udemy.course.msscbreweryclient.web.model.BeerDto;

@FeignClient(value = "breweryClient", url = "${sfg.brewery.host}")
public interface BeerClient {

  @GetMapping(value = "${sfg.brewery.beer-path}/{beerId}")
  ResponseEntity<BeerDto> getBear(@PathVariable("beerId") UUID beerId);

  @PostMapping(value = "${sfg.brewery.beer-path}")
  void addBeer(@RequestBody BeerDto beerDto);

  @PutMapping(value = "${sfg.brewery.beer-path}/{beerId}")
  void updateBeer(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto);

  @DeleteMapping(value = "${sfg.brewery.beer-path}/{beerId}")
  void deleteBeer(@PathVariable("beerId") UUID beerId);
}
