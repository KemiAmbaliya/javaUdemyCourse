package opps;

public class FanRunner {
	public static void main(String[]args) {
		fan fan1 = new fan("Manufacturer 1", 0.34567,"GREEN");
		fan.isOn(true);
		System.out.println(fan1);
	}

}