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
}
