package udemy.course.msscbreweryclient.web.client;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import udemy.course.msscbreweryclient.web.model.BeerDto;

@ExtendWith(MockitoExtension.class)
class BeerClientAdapterTest {

  @InjectMocks private BeerClientAdapter beerClientAdapter;

  @Mock private BeerClient beerClient;

  @Test
  public void testShouldGetBrewery() {
    UUID uuid = UUID.randomUUID();
    BeerDto mockBeerDto = BeerDto.builder().build();
    when(beerClient.getBear(uuid)).thenReturn(ResponseEntity.ok(mockBeerDto));

    BeerDto beerDto = beerClientAdapter.getBeer(uuid);

    assertNotNull(beerDto);
    assertEquals(mockBeerDto, beerDto);
    Mockito.verify(beerClient, Mockito.times(1)).getBear(uuid);
  }
}
