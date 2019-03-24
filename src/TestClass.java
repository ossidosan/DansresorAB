
public class TestClass {

	public static void main(String[] args) {
		
		AgentRegister ag = new AgentRegister();
		TravelGuideRegister tgr = new TravelGuideRegister();
		TravelRegister tr = new TravelRegister();
		
		Travel t1 = new Travel("Kuba", 43);
		Travel t2 = new Travel("Chile", 42);
	
		Agent a1 = new Agent("123", "Love", "070", "Chile");
		Agent a2 = new Agent("234", "Oscar", "076", "Kuba");
		Agent a3 = new Agent("674", "Martin", "077", "Kuba");
		Agent a4 = new Agent("453", "Christian", "070", "Chile");
		Agent a5 = new Agent("654", "Clara", "076", "Kuba");
		Agent a6 = new Agent("864", "Linnea", "077", "Brasilien");
		
		ag.addAgent(a1);
		ag.addAgent(a2);
		ag.addAgent(a3);
		ag.addAgent(a4);
		ag.addAgent(a5);
		ag.addAgent(a6);
		
		TravelGuide tg1 = new TravelGuide("345", "William", "+46", 42);
		TravelGuide tg2 = new TravelGuide("456", "Filip", "040", 43);
		TravelGuide tg3 = new TravelGuide("678", "Saga", "065", 44);
		TravelGuide tg4 = new TravelGuide("378", "Lisa", "+46", 42);
		TravelGuide tg5 = new TravelGuide("126", "Magnus", "040", 43);
		TravelGuide tg6 = new TravelGuide("986", "Josef", "065", 44);
		
		tgr.addTravelGuide(tg1);
		tgr.addTravelGuide(tg2);
		tgr.addTravelGuide(tg3);
		tgr.addTravelGuide(tg4);
		tgr.addTravelGuide(tg5);
		tgr.addTravelGuide(tg6);
		
		/*System.out.println("Following agents are available for you travel:");
		for (Agent tmpAgent: ag.getAgentList()) {
			if(tmpAgent.getDestination().equals("Kina")){ //Fill in destination 
				System.out.println("Name: " + tmpAgent.getName() + ", Agent id: " + tmpAgent.getAgentID());
			}
		}*/
		
		/*System.out.println("\nFollowing travel guides are available for the travel:");
		for(TravelGuide tmpTravelGuide: tgr.getTravelGuideList()) {
			if(tmpTravelGuide.getWeek() != 42) { //Fill in week for travel
				System.out.println("Name: " + tmpTravelGuide.getName() + ", Travel Guide id: " + tmpTravelGuide.getTravelGuideID());
				
			
		}*/
		
		tgr.showAvailableTravelGuides(42); // Fill in week for travel
		ag.showAvailableAgents("Kuba"); //Fill in destination
		
		t1.setAgentOwner(ag.findAgent("234")); //set an Agent to a travel with AgentID
		t1.setTravelGuideOwner(tgr.findTravelGuide("126"));// set a travel guide to a travel with travelGuideID
		tr.createTravel(t1); //Create travel
		tr.showTravel("T10000"); // Show travel information
		
		tgr.showAvailableTravelGuides(43);
		ag.showAvailableAgents("Chile");
		
		t2.setAgentOwner(ag.findAgent("123")); //set an Agent to a travel with AgentID
		t2.setTravelGuideOwner(tgr.findTravelGuide("986"));// set a travel guide to a travel with travelGuideID
		tr.createTravel(t2); //Create travel
		tr.showTravel("T10001"); // Show travel information*/
		
	
		
		
		
		
	
		
		
		
		
		
		
	}

}
