package udemy.course.msscbreweryclient.web.client;

import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import udemy.course.msscbreweryclient.web.model.CustomerDto;

@SpringBootTest
public class CustomerClientIntegrationTest {

  @Autowired
  private CustomerClientAdapter customerClientAdapter;

  @Test
  public void getCustomer() {
    CustomerDto customerDto = customerClientAdapter.getCustomer(UUID.randomUUID());

    System.out.println(customerDto);
  }

  @Test
  public void saveCustomer() {
    CustomerDto customerDto = CustomerDto.builder().build();

    customerClientAdapter.saveCustomer(customerDto);

    System.out.println("Saved Successfully");
  }

  @Test
  public void updateCustomer() {
    UUID uuid = UUID.randomUUID();
    CustomerDto customerDto = CustomerDto.builder().build();

    customerClientAdapter.updateCustomer(uuid, customerDto);

    System.out.println("Updated Successfully");
  }

  @Test
  public void deleteCustomer() {
    UUID uuid = UUID.randomUUID();

    customerClientAdapter.deleteCustomer(uuid);

    System.out.println("Deleted Successfully");
  }

}
