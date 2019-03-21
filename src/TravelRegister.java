
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
		travelList.add(travel);
		}
		
}
