public class Travel {
	
	public TravelGuide getTravelGuideOwner() {
		return travelGuideOwner;
	}
	public void setTravelGuideOwner(TravelGuide travelGuideOwner) {
		this.travelGuideOwner = travelGuideOwner;
	}
	public Travel(String destination, int week) {
		this.destination = destination;
		this.week = week;
	
	}
	private String destination;
	private int week; 
	private TravelGuide travelGuideOwner;
	private Agent agentOwner;
	private String travelID;
	
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
	public Agent getAgentOwner() {
		return agentOwner;
	}
	public void setAgentOwner(Agent agentOwner) {
		this.agentOwner = agentOwner;
	}
	public String getTravelID() {
		return travelID;
	}
	public void setTravelID(String travelID) {
		this.travelID = travelID;
	}
	
}
