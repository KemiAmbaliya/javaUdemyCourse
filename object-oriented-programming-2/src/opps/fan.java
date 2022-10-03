package opps;

public class fan {
	//state
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed;
	//creation
	public fan(String make, double radius, String color) {
		this.make = make;
		this.radius= radius;
		this.color=color;}
	//isOn
	public void switchOn() {
		this.isOn = true;
		setSpeed((byte)5);
	}
	public void switchOff() {
		this.isOn = false;
		setSpeed((byte)0);
	}
	public void setSpeed(byte speed) {
		this.speed=speed;
	}
		//print the status
		public String toString() {
			return String.format("make-%s, radius-%f, color-%s, isOn-%b, speed-%d", make, radius, color, isOn, speed);
			}
		
		
	}



