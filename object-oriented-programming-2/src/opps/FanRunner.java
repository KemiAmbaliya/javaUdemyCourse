package opps;

public class FanRunner {
	public static void main(String[]args) {
		fan fan1 = new fan("Manufacturer 1", 0.34567,"GREEN");
		fan1.switchOn();
		System.out.println(fan1);
		fan1.setSpeed((byte)5);
		System.out.println(fan1);
		fan1.switchOff();
		System.out.println(fan1);
	}

}