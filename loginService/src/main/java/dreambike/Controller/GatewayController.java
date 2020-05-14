package dreambike.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("test")
	public String test() {
		return "test";
	}
	
	@GetMapping("test2")
	public String test2() {
		return bikeService.getTest();
	}
	
	@GetMapping("getAllDocking")
	public String getAllDocking() throws IOException {
		return dockingstationService.getAll();
	}
	
	@GetMapping("getOneDocking")
	public DockingStation getOneDocking() {
		return dockingstationService.getOne();
	}
}
