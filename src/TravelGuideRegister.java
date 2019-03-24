import java.util.ArrayList;

public class TravelGuideRegister {
	
	private ArrayList<TravelGuide> travelGuideList = new ArrayList<TravelGuide>();

	public ArrayList<TravelGuide> getTravelGuideList() {
		return travelGuideList;
	}

	public void setTravelGuideList(ArrayList<TravelGuide> travelGuideList) {
		this.travelGuideList = travelGuideList;
	}
	
	public void addTravelGuide (TravelGuide travelGuide) {
		travelGuideList.add(travelGuide);
	}
	
	public TravelGuide findTravelGuide(String travelGuideID) {
		for(TravelGuide tmp: travelGuideList) {
			if(tmp.getTravelGuideID().equals(travelGuideID)) {
				return tmp;
			}
		}
		return null;
	}
	
	public void showAvailableTravelGuides(int week) {
		System.out.println("\nFollowing travel guides are available for the travel:");
			for(TravelGuide tmpTravelGuide: travelGuideList) {
				if(tmpTravelGuide.getWeek() != week) {
					System.out.println("Name: " + tmpTravelGuide.getName() + ", Travel Guide id: " + tmpTravelGuide.getTravelGuideID());
				}
			}
	}

	
	

}
