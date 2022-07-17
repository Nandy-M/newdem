package demo;

public abstract class customerDetail {
	String CustomerID;
	String Customername;
	String Customertype;
	
	
  customerDetail(String custId,String custName,String custType)
{
	this.CustomerID=custId;
	this.Customername=custName;
	this.Customertype=custType;
	
}
void showCustomerDetails()
{
	System.out.println("Customer ID: "+this.CustomerID);
	System.out.println("Customer Name: "+this.Customername);
	System.out.println("Customer Type: "+this.Customertype);
}
abstract double getfinalamount(double interest,int year);
	

}
