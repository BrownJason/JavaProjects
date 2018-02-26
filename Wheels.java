public class Wheels extends CarPart {
	
	private int condition = 100;
	private int wheels = 4;
	
	@Override
	public void setCondition(int condition) {
		this.condition = condition;
	}
	
	@Override
	public int getCondition() {
		if(condition >= 50 && condition < 100) {
			System.out.println("Wheels are in great condition. Don't need to replace any wheels.\n");
		} else if (condition >= 25 && condition < 50) {
			wheels = 2;
			System.out.println("Wheels are starting to wear down, manu to to think about getting new ones.\nMight want to consider replacing at least " + wheels + " wheels.\n");
		} else if(condition >= 0 && condition < 25) {
			System.out.println("Wheels are in a bad condition, replace them now! Replace all " + wheels + " wheels NOW!\\n");
		}
		return condition;
	}
	
	@Override
	public void status() {
		getCondition();
	}
}
