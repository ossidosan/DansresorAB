
public class TestClass {

	public static void main(String[] args) {
		
		AgentRegister ag = new AgentRegister();
		TravelGuideRegister tgr = new TravelGuideRegister();
		TravelRegister tr = new TravelRegister();
		
		Travel t1 = new Travel("Kina", 43);
	
		Agent a1 = new Agent("123", "Love", "070", "Malaysia");
		Agent a2 = new Agent("234", "Oscar", "076", "Kina");
		Agent a3 = new Agent("674", "Martin", "077", "Kina");
		
		ag.addAgent(a1);
		ag.addAgent(a2);
		ag.addAgent(a3);
		
		TravelGuide tg1 = new TravelGuide("345", "William", "+46", 42);
		TravelGuide tg2 = new TravelGuide("456", "Filip", "040", 43);
		TravelGuide tg3 = new TravelGuide("678", "Saga", "065", 43);
		
		tgr.addTravelGuide(tg1);
		tgr.addTravelGuide(tg2);
		tgr.addTravelGuide(tg3);
		
		
		System.out.println("Following agents are available for you travel:");
		for (Agent tmpAgent: ag.getAgentList()) {
			if(tmpAgent.getDestination().equals("Kina")){ //Fill in destination 
				System.out.println("Name: " + tmpAgent.getName() + ", Agent id: " + tmpAgent.getAgentID());
			}
		}
		
		System.out.println("Following travel guides are available for the travel:");
		for(TravelGuide tmpTravelGuide: tgr.getTravelGuideList()) {
			if(tmpTravelGuide.getWeek() != 42) { //Fill in week for travel
				System.out.println("Name: " + tmpTravelGuide.getName() + ", Travel Guide id: " + tmpTravelGuide.getTravelGuideID());
				
			}
		}
		
		t1.setAgentOwner(ag.findAgent("123")); //set an Agent to a travel with AgentID
		t1.setTravelGuideOwner(tgr.findTravelGuide("345"));// set a travel guide to a travel with travelGuideID
		System.out.println("Name: " + t1.getAgentOwner().getName() + " " + t1.getTravelGuideOwner().getName());
		
		
		
	}

}
