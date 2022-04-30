package assignment4;

public class Students {
	
	

	public static void main(String[] args) {
		
		Students students=new Students();
		
		int studentid = students.getStudentInfo(1196182);
		System.out.println(studentid);
		
		String studentsid = students.getStudentInfo("bdfgdf","bdgdfg");
		System.out.println(studentsid);
		
		Long studentsids = students.getStudentInfo(123,8526536884l);
		System.out.println(studentsids);
		
		
	}

	public int getStudentInfo(int id)
	{
		return id;
		
	}
	
	public String getStudentInfo(String id, String name)
	{
		return id+name;
	}
	
	public long getStudentInfo(long email,long Phonenumber)
	{
		return Phonenumber+email;
	}
	
	
	
}
