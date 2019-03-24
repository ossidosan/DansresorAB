import java.util.ArrayList;

public class AgentRegister {
	
	private ArrayList<Agent> agentList = new ArrayList<Agent>();

	public ArrayList<Agent> getAgentList() {
		return agentList;
	}

	public void setAgentList(ArrayList<Agent> agentList) {
		this.agentList = agentList;
	}
	
	public void addAgent (Agent agent) {
		agentList.add(agent);
	}
	
	public Agent findAgent(String agentID) {
		for(Agent tmp: agentList) {
			if(tmp.getAgentID().equals(agentID)) {
			return tmp;
		}
	
	}
			return null;
	}	
	public void showAvailableAgents(String destination) {
		System.out.println("\nFollowing agents are available for you travel:");
		for(Agent tmpAgent: agentList) {
			if(tmpAgent.getDestination().equals(destination)){
				System.out.println("Name: " + tmpAgent.getName() + ", Agent id: " + tmpAgent.getAgentID());
			} 	
		}
	}
}
