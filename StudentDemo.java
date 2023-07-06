class Student{
int stuId;
String stuName;
	void getStu(int sid, String sname){
	stuId=sid;
	stuName=sname;
	}
	void displayStu(){
	System.out.println("ID:"+stuId+"/nNAME:"+stuName);
	}
}

class StudentDemo{
public static void main(){
Student s1=new Student();
s1.getStu(234,"Sanjitha");
s1.displayStu();
}
}
	
	