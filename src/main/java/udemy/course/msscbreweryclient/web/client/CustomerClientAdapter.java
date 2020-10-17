package udemy.course.msscbreweryclient.web.client;

import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import udemy.course.msscbreweryclient.web.model.CustomerDto;

@Component
@AllArgsConstructor
public class CustomerClientAdapter {

  private CustomerClient customerClient;

  public CustomerDto getCustomer(UUID uuid) {
    return customerClient.getCustomer(uuid).getBody();
  }

  public void saveCustomer(CustomerDto customerDto) {
    customerClient.addCustomer(customerDto);
  }

  public void updateCustomer(UUID uuid, CustomerDto customerDto) {
    customerClient.updateCustomer(uuid, customerDto);
  }

  public void deleteCustomer(UUID uuid) {
    customerClient.deleteCustomer(uuid);
  }
}