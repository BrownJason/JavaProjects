public class Car {	
	CarPart eng = new Engine();
	CarPart ft = new FuelTank();
	CarPart wheel = new Wheels();
	
	public void run() {
		
		wheel.setCondition(65);
		ft.setCondition(45);
		eng.setCondition(24);
		
		CarPart cp = new CarPart();
		cp.add(eng.getCondition());
		cp.add(wheel.getCondition());
		cp.add(ft.getCondition());
		
		cp.addClasses(eng.getClass().getSimpleName());
		cp.addClasses(wheel.getClass().getSimpleName());
		cp.addClasses(ft.getClass().getSimpleName());
		
		for(int i = 0; i < cp.getList().size(); i++) {
			cp.status();
			cp.Function();
		}
	}
}