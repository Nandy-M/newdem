package demo;

public class BankAccount {

	public static void main(String[] args) {
		
		RegularCustomer regcustomer1=new RegularCustomer("R1","BALA","Domestic",10000);
		RegularCustomer regcustomer2=new RegularCustomer("R2","SIVA","Business",10000);
		
		EnterpriseCustomer entcustomer1=new EnterpriseCustomer("E1","KAVYA","Smallsacle",10000);
		EnterpriseCustomer entcustomer2=new EnterpriseCustomer("E2","NANDU","Largesacle",10000);
		
		regcustomer1.showCustomerDetails();
		System.out.println("Final amount: "+regcustomer1.getfinalamount(5,8));
		
		regcustomer2.showCustomerDetails();
		System.out.println("Final amount: "+regcustomer2.getfinalamount(5,8));
		
		entcustomer1.showCustomerDetails();
		System.out.println("Final amount: "+entcustomer1.getfinalamount(5,8));
		
		entcustomer2.showCustomerDetails();
		System.out.println("Final amount: "+entcustomer2.getfinalamount(5,8));
		
		
		
		

	}

}
