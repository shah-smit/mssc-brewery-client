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
import udemy.course.msscbreweryclient.web.model.CustomerDto;

@FeignClient(value = "customerClient", url = "${sfg.brewery.host}")
public interface CustomerClient {

  @GetMapping(value = "${sfg.brewery.customer-path}/{customerId}")
  ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID customerId);

  @PostMapping(value = "${sfg.brewery.customer-path}")
  void addCustomer(@RequestBody CustomerDto customerDto);

  @PutMapping(value = "${sfg.brewery.customer-path}/{customerId}")
  void updateCustomer(@PathVariable("customerId") UUID customerId, @RequestBody CustomerDto customerDto);

  @DeleteMapping(value = "${sfg.brewery.customer-path}/{customerId}")
  void deleteCustomer(@PathVariable("customerId") UUID customerId);
}
