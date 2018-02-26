import java.util.ArrayList;
import java.util.List;

public class CarPart implements FunctionInterface{
	
	private int condition;
	private static List<Number> list = new ArrayList<Number>();
	private static List<String> classes = new ArrayList<String>();
	
	public void setCondition(int condition) {
		this.condition = condition;
	}
	
	public int getCondition() {
		return condition;
	}
	
	public void status() {
		getCondition();
	}
	
	public void add(Number status) {
		list.add(status);
	}

	public void addClasses(String simpleName) {
		classes.add(simpleName);
	}
	
	public List<String> getClassList(){
		return classes;
	}

	public List<Number> getList() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public void Function() {
		Object status = getList().get(condition);
		Object classes = getClassList().get(condition).toString();
		condition++;
		System.out.println("The condition of the " + classes + ", is at " + status + "%.");
	}
}

interface FunctionInterface {
	void Function();
}


