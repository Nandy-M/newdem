package dynamicbinding;

public class runTimePolymorphism {

	public static void main(String[] args) {
		MacBookPro pro=new MacBookPro();
		//operateMac(pro);
		pro.start();
		MacBookAir air=new MacBookAir();
        //operateMac(air);
        MacBook obj=new MacBookPro();
        obj.start();
        obj.shutdown();
        (new runTimePolymorphism()).operateMac(air);
	}
	static void operateMac(MacBook mac)
	{
		mac.start();
		mac.shutdown();
	}

}
