
public class TravelGuide {
	
	private String travelGuideID;
	private String name;
	private String phoneNumber;
	private String status;
	private int week;
	private Travel travelOwner;

	
	public TravelGuide(String travelGuideID, String name, String phoneNumber, int week) {
		this.travelGuideID = travelGuideID;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.week = week;
	}

	public void setTravelGuideID (String travelGuideID) {
		this.travelGuideID = travelGuideID;
	}
	
	public String getTravelGuideID() {
		return travelGuideID;
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

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public Travel getTravelOwner() {
		return travelOwner;		
	}
	public void setTravelOwner(Travel travelOwner) {
		this.travelOwner = travelOwner;
	}

	public int getWeek() {
		return week;
	}

	public void setWeek(int week) {
		this.week = week;
	}
	


}
