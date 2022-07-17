package demo;
class student{
	int registernumber;
	String studentname;
	student(int regno,String name)
	{
		this.registernumber=regno;
		this.studentname=name;
	}
}

public class studentDetails {

	public static void main(String[] args) {
		student[] arr ;
		arr =new student[3];
		arr[0]= new student(172,"Kavyashree");
		arr[1]= new student(196,"Nandhini");
		arr[2]= new student(197,"Nandu");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		System.out.println();
		
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("Student with register number="+ arr[i].registernumber+" is "+arr[i].studentname);
		System.out.println();
	}
		

	}

}
