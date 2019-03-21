import java.util.ArrayList;

public class TravelGuideRegister {
	
	private ArrayList<TravelGuide> TravelGuideList = new ArrayList<TravelGuide>();

	public ArrayList<TravelGuide> getTravelGuideList() {
		return TravelGuideList;
	}

	public void setTravelGuideList(ArrayList<TravelGuide> travelGuideList) {
		TravelGuideList = travelGuideList;
	}
	
	public void addTravelGuide (TravelGuide travelGuide) {
		TravelGuideList.add(travelGuide);
	}

	
	

}
