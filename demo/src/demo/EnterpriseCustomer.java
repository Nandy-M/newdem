package demo;

public class EnterpriseCustomer extends customerDetail {
	String CustomerID;
	String Customername;
	String Customertype;
	double amount;
	
	EnterpriseCustomer(String custId,String custName,String custType,double amt)
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
		
		amount=amount-100;//discount for all ec
		
		if(this.Customertype=="Smallscale")
		{
			return amount-100;
		}
		else if(this.Customertype=="Largescale")
		{
			return amount;
		}
		return amount;
	}
}
	

