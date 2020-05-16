package dreambike.RestClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import dreambike.Classes.DockingStation;

@Component
public class DockingStationClient {

	
	public String getAll() throws IOException {
		String uri = "http://localhost:45702/api/getAll";
		URL url = new URL(uri);
//		String body = "id=1";
		HttpURLConnection con = (HttpURLConnection)url.openConnection();
		con.setRequestMethod("GET");
		BufferedReader reader = new BufferedReader(new InputStreamReader((con.getInputStream()), StandardCharsets.UTF_8));
		String json = reader.readLine();
		System.out.println(json);
		return json;
		
//		String url = "http://localhost:45702/api/getAll";
//		RestTemplate restTemplate = new RestTemplate();
//		ResponseEntity<DockingStation[]> response = restTemplate.getForEntity(url, DockingStation[].class);
//		return response.getBody();
		

//		DockingStations dockingstations = restTemplate.getForObject(url, DockingStations.class);
//		System.out.print(dockingstations);
//		List<DockingStation> dockings = dockingstations.getDockingStations();
//		return dockings;
	}
	
	public DockingStation getOne() {
		String url = "http:localhost:45702/api/getOne";
		RestTemplate restTemplate = new RestTemplate();
		DockingStation dockingstation = restTemplate.getForObject(url, DockingStation.class);
		return dockingstation;
	}
}
