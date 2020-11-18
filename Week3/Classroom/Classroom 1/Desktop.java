package seleniumTraining;

public class Desktop implements Hardware,Software {
	public void desktopModel() {
		System.out.println("DELL");

	}

	public void softwareResources() {
		System.out.println("100");
		
	}

	public void hardwareResources() {
		System.out.println("50");
		
	}
	
	public static void main(String[] args) {
		Desktop des = new Desktop();
		des.desktopModel();
		des.softwareResources();
		des.hardwareResources();
		}
}
