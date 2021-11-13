package labs.module14;
import java.io.Serializable;

public class AgentEntity implements Serializable
{
	/* 
	 Properties of the class are private as we have getters and setters and we have two transient 
	properties as we do not want them to be serialised
	*/
	private int agentNumber;
	private int agentYearsOfService;
	private String agentFullName;
	private  transient String agentDOB;
	private  transient double agentCapitalInvestment;
	/*
	Create a constructor which will set the initial value for 
	properties when the AgentEntity class is being instantiated
	 */
	/*********************************************************************
  	Create a constructor for the AgentEntity class which will over-write the default constructor.
	The constructor is used to accept values passed into it from the code which instantiates the
	class. Values passed into the constructor are used to initialise the values of the properties
	(members, fields, variables!). The keyword this is used in front of the property names.
	 ********************************************************************/
	public AgentEntity(int agentNumber, int agentYearsOfService, String agentFullName, 
			String agentDOB, double agentCapitalInvestment) 
	{
		this.agentNumber = agentNumber;
		this.agentYearsOfService = agentYearsOfService;
		this.agentFullName = agentFullName;
		this.agentDOB = agentDOB;
		this.agentCapitalInvestment = agentCapitalInvestment;
	} // End of constructor

	/*********************************************************************
  	As the properties are marked private they are not accessible from outside  
	the class and to enable the properties to be accessed from outside the class we 
	use a getter method to get the value and a setter method to set the value of the property. 
	We do not need to have a getter and setter for all fields but we normally will. 
	This is what is done below.
	 ********************************************************************/	
	public int getAgentNumber() {
		return agentNumber;
	}
	public void setAgentNumber(int agentNumber) {
		this.agentNumber = agentNumber;
	}

	public int getAgentYearsOfService() {
		return agentYearsOfService;
	}

	public void setAgentYearsOfService(int agentYearsOfService) {
		this.agentYearsOfService = agentYearsOfService;
	}

	public String getAgentFullName() {
		return agentFullName;
	}

	public void setAgentFullName(String agentFullName) {
		this.agentFullName = agentFullName;
	}

	public String getAgentDOB() {
		return agentDOB;
	}

	public void setAgentDOB(String agentDOB) {
		this.agentDOB = agentDOB;
	}

	public double getAgentCapitalInvestment() {
		return agentCapitalInvestment;
	}

	public void setAgentCapitalInvestment(double agentCapitalInvestment) {
		this.agentCapitalInvestment = agentCapitalInvestment;
	}

	@Override
	public String toString() {
		return "AgentEntity [agentNumber=" + agentNumber + ", agentYearsOfService=" + agentYearsOfService
				+ ", agentFullName=" + agentFullName + ", agentDOB=" + agentDOB + ", agentCapitalInvestment=" + agentCapitalInvestment + "]";
	}	
} // End of class
