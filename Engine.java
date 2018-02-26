public class Engine extends CarPart{
	
	/**
	 * Set startCar to false because you haven't yet tried to start the car
	 * set isRunning to false because the car hasn't been started yet
	 * The engine Durability is 100 to start, and decreases overtime 
	 */
	private boolean startCar = false;
	private int engineDurability = 100;
	private int engineCylinders = 8;

	@Override
	public void setCondition(int engineDurability) {
		this.engineDurability = engineDurability;
	}
	
	@Override
	public int getCondition() {
		
		if (startCar){
			System.out.println("You haven't tried to start the car yet.");
			startCar = true;
		} else if (!startCar) {
			System.out.println("Starting Car..");
			System.out.println("Car is running..");
			if(engineDurability >= 50 && engineDurability < 100) {
				System.out.println("Engine durability is " + engineDurability + "%.\nCurrent cylinders working  " + engineCylinders + ".\n");
			} else if(engineDurability >= 25 && engineDurability < 50 ) {
				engineCylinders = 5;
				System.out.println("Engine durability is running low at " + engineDurability + "%. Current cylinders working  " + engineCylinders + ".\n");
			} else if(engineDurability >= 10 && engineDurability < 25 ) {
				engineCylinders = 3;
				System.out.println("Engine durability is running low at " + engineDurability + "%. Current cylinders working  " + engineCylinders + ".\n");
			} else {
				engineCylinders = 1;
				System.out.println("Engine durability is " + engineDurability + "%, need to repair the engine.  Current cylinders working " + engineCylinders + ".\n");
				System.out.println("Car ran out of fuel");
			}
		} 
		return engineDurability;
	}
	
	@Override
	public void status() {
		getCondition();
	}
}
