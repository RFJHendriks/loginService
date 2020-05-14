package dreambike.Classes;
public class DockingStation {
	private long dockingStationId;
	private String dockingStationName;
	private Double longitude;
	private Double latitude;
	private int capacity;
	private Boolean active;
	
	public DockingStation() {
		
	}

	public long getDockingStationId() {
		return dockingStationId;
	}

	public void setDockingStationId(long dockingStationId) {
		this.dockingStationId = dockingStationId;
	}

	public String getDockingStationName() {
		return dockingStationName;
	}

	public void setDockingStationName(String dockingStationName) {
		this.dockingStationName = dockingStationName;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
}
