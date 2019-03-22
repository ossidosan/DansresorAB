
import java.util.ArrayList;

public class TravelRegister {
	
	private ArrayList<Travel> travelList = new ArrayList<Travel>();
	private static int id = 10000;
	

	public ArrayList<Travel> getTravelList() {
		return travelList;
	}

	public void setTravelList(ArrayList<Travel> travelList) {
		this.travelList = travelList;
	}

	public void addTravel (Travel travel) {
		travelList.add(travel);
	}
	
	public static String createTravelID() {
			return String.valueOf(id++);
	}
	public void createTravel(Travel travel) {
		travel.setTravelID("T" + createTravelID());
		/*AgentRegister ar = new AgentRegister();
		if(ar.findAgent(agentID) != null) {
			travel.setAgentOwner(ar.findAgent(agentID));
		}*/
		travelList.add(travel);
		System.out.println("\nTravel created with travelID: " + travel.getTravelID());
		}
	
	public Travel findTravel (String travelID) {
		for(Travel tmpTravel: travelList) {
			if(tmpTravel.getTravelID().equals(travelID)) {
				return tmpTravel;
			}
		}
		return null;
	}
	
	public void showTravel (String travelID) {
		Travel travel;
		if(this.findTravel(travelID) != null) {
			travel = this.findTravel(travelID);
			System.out.println("\nTravel information:\n" + "Travel ID: " + travel.getTravelID() + "\nDestination: " + travel.getDestnation() + "\nAgent:" + travel.getAgentOwner().getName() + "\nTravel guide:" + travel.getTravelGuideOwner().getName());
		}
	}
		
}
