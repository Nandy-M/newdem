package nonstaticcontext;

import finance.bankAccount;

public class defaultConstructorTest {

		
		public static void main(String[] args) {
			
			bankAccount account1 = new bankAccount(1001, 5000);
			
			bankAccount account2 = new bankAccount(1002, 6500);
			
			account1.printAccount();
			account2.printAccount();
			
			
			
		}


}
