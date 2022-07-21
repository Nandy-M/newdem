package interfaces;

public class runTimePolymorphism {

	public static void main(String[] args) {
		
		//Up casting-implicit
		AppleLaptop al = new MacBookAir();
		al.start();
		al.shutdown();
		
		MacBook macb=new MacBookAir();
		//down casting -explicit
	    MacBookAir obj=(MacBookAir) macb;
	    
	    MacBook pro=new MacBookPro();
	    MacBookPro obj2=(MacBookPro) pro;
	    obj2.prosmethod();
	    

}
}
