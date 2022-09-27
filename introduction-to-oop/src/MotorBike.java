
public class MotorBike {
private	int speed;

MotorBike(int speed){
	this.speed=speed;
}

	
	
	
	
	void start() {
		System.out.println("Bike Started");
	}
	public void setSpeed(int speed) {
	this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	public void decreaseSpeed(int howMuch) {
		this.speed = this.speed - howMuch;
	}

}
