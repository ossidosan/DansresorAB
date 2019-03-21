
public class Agent {
	
	private String agentID; 
	private String name;
	private String phoneNumber; 
	private String destination; 
	private Travel travelOwner;
	
	public Agent(String AgentID, String name, String phoneNumber, String destination) {
		this.setAgentID(AgentID);
		this.setName(name);
		this.setPhoneNumber(phoneNumber);
		this.setDestination(destination);
	}
	
	public String getAgentID() {
		return agentID;
	}
	public void setAgentID(String agentID) {
		this.agentID = agentID; 
	}
	public String getName() {
		return name; 
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber (String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination (String destination) {
		this.destination = destination;
	}
	public Travel getTravelOwner() {
		return travelOwner;
	}
	public void setTravelOwner(Travel travelOwner) {
		this.travelOwner = travelOwner;
	}


}
