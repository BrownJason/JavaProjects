public class FuelTank extends CarPart {
	
	private boolean isTankFull = true;
	private int fuelLevel = 100;

	@Override
	public void setCondition(int fuelLevel) {
		this.fuelLevel = fuelLevel;
	}
	
	@Override
	public int getCondition() {
		if(isTankFull) {
			if(fuelLevel >= 25 && fuelLevel < 100) {
				System.out.println("Tank is has a decent amount of fuel left: " + fuelLevel + "%.\n");
			} else if(fuelLevel >= 10 & fuelLevel < 25) {
				System.out.println("Tank is running low, might want to add fuel: " + fuelLevel + "%.\n");
			} else if (fuelLevel <= 0){
				System.out.println("Tank is empty, need to refuel: " + fuelLevel + "%.\n");
			}
		} else {
			System.out.println("Tank is ot full, please fill!\n");
		}
		return fuelLevel;
	}

	@Override
	public void status() {
		getCondition();
	}
}
