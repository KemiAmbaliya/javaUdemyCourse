
public class MotorBikeRunner {
	public static void main(String[]args) {
	MotorBike ducati = new MotorBike();
	MotorBike honda = new MotorBike();
	ducati.start();
	honda.start();
	ducati.speed=100;
	int ducatiSpeed = ducati.getSpeed();
	ducatiSpeed = ducatiSpeed + 100;
	ducati.setSpeed(ducatiSpeed);
	System.out.println(ducati.getSpeed());
	ducati.decreaseSpeed(50);
	

	
	ducati.speed=20;
	honda.speed=0; 
	ducati.setSpeed(0);
	
	}

}
