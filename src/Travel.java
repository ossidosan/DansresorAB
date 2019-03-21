public class Travel {
	
	public TravelGuide getTravelGuideOwner() {
		return travelGuideOwner;
	}
	public void setTravelGuideOwner(TravelGuide travelGuideOwner) {
		this.travelGuideOwner = travelGuideOwner;
	}
	private String travelID;
	private String destination;
	private int week; 
	private TravelGuide travelGuideOwner;
	
	public void setTravelID(String travelID) {
		this.travelID = travelID;
	}
	public String getTravelID() {
		return travelID;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDestnation() {
		return destination;
	}
	public void setWeek(int week) {
		this.week = week;
	}
	public int getWeek() {
		return week;
	}
}
