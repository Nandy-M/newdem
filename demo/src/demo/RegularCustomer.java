package demo;

public class RegularCustomer extends customerDetail {
	
	String CustomerID;
	String Customername;
	String Customertype;
	double amount;
	
	RegularCustomer(String custId,String custName,String custType,double amt)
	{
		super(custId,custName,custType);
		this.CustomerID=custId;
		this.Customername=custName;
		this.Customertype=custType;
		this.amount=amt;
	}
	double getfinalamount(double interest,int year)
	{
		double si=this.amount*interest*year;
		double amount=this.amount+si;
		
		if(this.Customertype=="Domestic")
		{
			return amount-500;
		}
		else if(this.Customertype=="Business")
		{
			return amount;
		}
		return amount;
	}
	

}
