package dreambike.Controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dreambike.Classes.DockingStation;
import dreambike.Services.BikeService;
import dreambike.Services.DockingStationService;

@RestController
@RequestMapping("/api/")
public class GatewayController {

	@Autowired
	BikeService bikeService;
	@Autowired
	DockingStationService dockingstationService;
	
	@GetMapping("getAll")
	public String getAll() throws IOException {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now) + " getAllDocking called.");
		return dockingstationService.getAll();
	}

	@GetMapping("getOneDocking")
	public DockingStation getOneDocking() {
		return dockingstationService.getOne();
	}
}
