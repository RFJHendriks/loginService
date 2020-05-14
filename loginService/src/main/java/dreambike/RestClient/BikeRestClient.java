package dreambike.RestClient;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BikeRestClient {
	 public String getTest() {
		 String url = "http://localhost:9004/api/camping/test";
		 RestTemplate restTemplate = new RestTemplate();
		 return restTemplate.getForObject(url, String.class);
	 }
}
