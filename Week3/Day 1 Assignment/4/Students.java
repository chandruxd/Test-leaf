package week3.day1.assignments;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("id only");

	}
	public void getStudentInfo(int id,String name) {
		System.out.println("id and name");

	}
	public void getStudentInfo(String email,int phoneno) {
		System.out.println("email and phone number");

	}
	public static void main(String[] args) {
		Students stu = new Students();
		stu.getStudentInfo(1034);
		stu.getStudentInfo(1034, "chandru");
		stu.getStudentInfo("abc@gmail.com", 987654321);

	}

}
