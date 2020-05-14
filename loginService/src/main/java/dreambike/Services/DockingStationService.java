package dreambike.Services;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dreambike.Classes.DockingStation;
import dreambike.Classes.DockingStations;
import dreambike.RestClient.DockingStationClient;

@Service
public class DockingStationService {
	@Autowired
	private DockingStationClient dockingstationClient;
	
	public String getAll() throws IOException {
		return dockingstationClient.getAll();
	}
	
	public DockingStation getOne() {
		return dockingstationClient.getOne();
	}
}
