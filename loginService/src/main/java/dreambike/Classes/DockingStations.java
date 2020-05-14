package dreambike.Classes;

import java.util.ArrayList;
import java.util.List;

public class DockingStations {
	
	private List<DockingStation> dockingStations;
	
	public DockingStations() {
		dockingStations = new ArrayList<DockingStation>();
	}

	public List<DockingStation> getDockingStations() {
		return dockingStations;
	}

	public void setDockingStations(List<DockingStation> dockingStations) {
		this.dockingStations = dockingStations;
	}
	
	
}
