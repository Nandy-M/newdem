package filehandle;

public class DriveFile {

	public static void main(String[] args) {
		
		CreateFile obj1=new CreateFile();
		WriteFile  obj2=new WriteFile();
		 ReadFile  obj3=new ReadFile();
		AppendFile  obj4=new AppendFile();
		obj1.create();
		obj2.write();
		obj3.read();
		obj4.append();
		
		

	}

}
