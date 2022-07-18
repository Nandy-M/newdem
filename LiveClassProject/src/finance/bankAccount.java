package finance;

public class bankAccount {

		int accountNumber;
		int balanceTotal;
		static String bankName = "SBI";
		static double interstRate = 7.2;
		
		public bankAccount(int accountNum,int total)
		{
			this.accountNumber=accountNum;
			this.balanceTotal=total;
		}
	    public void printAccount()
	    {
	    	System.out.println("Welcome to "+bankAccount.bankName);
			System.out.println("Current Loan interst Rate "+bankAccount.interstRate);
			System.out.println("AccountNumber: " + this.accountNumber);
			System.out.println("Available Balance: " + this.balanceTotal);
			System.out.println("-------");
	    }

	}

//main method in defaultConstructorTest class in nonstaticcontext package