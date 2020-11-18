package classroom2;

public class College extends University{

	public void ug() {
		System.out.println("unpaid Guest");
		
	}
	public static void main(String[] args) {
		College col = new College();
		col.pg();
		col.ug();
	}
	

}
