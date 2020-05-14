package dreambike.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dreambike.RestClient.BikeRestClient;

@Service
public class BikeService {
	@Autowired
	private BikeRestClient bikeRestClient;
	
	public String getTest() {
		String test = bikeRestClient.getTest();
		return test;
	}
}