import java.util.ArrayList;

public class TravelGuideRegister {
	
	private ArrayList<TravelGuide> travelGuideList = new ArrayList<TravelGuide>();

	public ArrayList<TravelGuide> getTravelGuideList() {
		return travelGuideList;
	}

	public void setTravelGuideList(ArrayList<TravelGuide> travelGuideList) {
		travelGuideList = travelGuideList;
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

	
	

}
