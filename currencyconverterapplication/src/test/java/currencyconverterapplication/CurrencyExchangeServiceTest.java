package currencyconverterapplication;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.genting.ram.entity.ExchangeCurrencyEntity;
import com.genting.ram.starter.CurrencyConversionBootStarter;


@SpringBootTest(classes=CurrencyConversionBootStarter.class)
public class CurrencyExchangeServiceTest {

	
	@Test
	public void getCurrentExchangeAmountTest(){
	 assertEquals(1,1);
	 
	 RestTemplate restTemplate = new RestTemplate();
     
	    final String baseUrl = "http://localhost:8080/exchange/get/usd/10/sgd";
	    URI uri;
		try {
			uri = new URI(baseUrl);
			 ResponseEntity<ExchangeCurrencyEntity> result = restTemplate.getForEntity(uri, ExchangeCurrencyEntity.class);
		     assertEquals(200, result.getStatusCodeValue());
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
