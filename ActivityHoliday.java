import java.util.HashMap;

public class ActivityHoliday extends Holiday {
	
	private  HashMap<String,Cost> activities;

	public ActivityHoliday(String destination,int days) {
		super(destination,days);
		activities = new HashMap<String,Cost>(10);
	}
	
	public void addActivity(String name,Cost cost){
		activities.put(name, cost);
	}
	
	public String toString(){
		String output = "";

		return output;
	}
	
	public static void main(String[] args) {
		ActivityHoliday act = new ActivityHoliday("Glasgow",14);
		Cost cost= new Cost();
		cost.setAmount(5);
		cost.setCurrency("pounds sterling");
		act.addActivity("Hunterian Museum", cost);
		act.addActivity("Mackintosh House", cost);
		System.out.println(act);
	}
}
