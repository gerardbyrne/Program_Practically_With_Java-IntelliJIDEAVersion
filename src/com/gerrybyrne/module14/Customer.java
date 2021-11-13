package com.gerrybyrne.module14;

public class Customer implements java.io.Serializable
{
	/*******************************************************************
	 transient is a variable modifier which can be used in serialization. 
	 When we need to serialise there may be some values we do not want to save to 
	 the file. These may be sensitive data or data that can be  calculated again. 
	 Changing the variable modifier to transient means  that during the serialisation
	 process the Java Virtual Machine (JVM) will ignore the transient variable value
	 and save the default value 	 of the variable data type.
	 
	 The transient keyword assists us with the important role of meeting security
	 constraints e.g. when we do not want to save private data 	 in file. It is important
	 to use the transient keyword with private confidential fields (members) of a class 
	 during serialization.
	 ******************************************************************/
   private  int			customerAccountNumber;
   private  transient int	customerAge;
   private  String		customerName;
   private   String	customerAddress;
   private  int			customerYearsWithCompany;

	/*****************************************************************
	Create a constructor for the Customer class. The constructor will over-write the
	default constructor. The constructor is used to accept the value passed into it from
	the code used to instantiate the class. The values passed into the constructor are used
	to initialise the values of fields (members, variables!). The keyword this is used in 
	front of the field (member, variable!) names.
	********************************************************************/
	public Customer(int accountNumberPassedIn, int agePassedIn, String namePassedIn,
	 String addressPassedIn, int yearsPassedIn) {
	  this.customerAccountNumber = accountNumberPassedIn;
	  this.customerAge = agePassedIn;
	  this.customerName = namePassedIn;
	  this.customerAddress = addressPassedIn;
	  this.customerYearsWithCompany = yearsPassedIn;
	  } // End of constructor 

	/*********************************************************************
	As the fields (members, variables!) are marked as private they are not accessible  
	from outside the class. To enable the fields to be accessed from outside the class
	we use a getter method to get the value and a setter method to set the value of
	field. We do not need to have a getter and setter for all fields but we normally will. 	
	This is what we have done below.
	********************************************************************/
      public int getCustomerAccountNumber() {
          return customerAccountNumber;
      }
      public void setCustomerAccountNumber(int customerAccountNumber) {
          this.customerAccountNumber = customerAccountNumber;
      }
      public int getCustomerAge() {
          return customerAge;
      }
      public void setCustomerAge(int customerAge) {
          this.customerAge = customerAge;
      }
      public String getCustomerName() {
          return customerName;
      }
      public void setCustomerName(String customerName) {
          this.customerName = customerName;
      }
      public String getCustomerAddress() {
          return customerAddress;
      }
      public void setCustomerAddress(String customerAddress) {
          this.customerAddress = customerAddress;
      }
      public int getCustomerYearsWithCompany() {
          return customerYearsWithCompany;
      }
      public void setCustomerYearsWithCompany(int customerYearsWithCompany) {
          this.customerYearsWithCompany = customerYearsWithCompany;
      }

} // End of Customer class