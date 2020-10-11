import java.util.HashMap;
import java.util.Map;

public class SevenDwarvesHashMapApp {

	public static void main(String[] args) {
		
		System.out.println("Hello!");
		
		// HashMap of 7 dwarves
		HashMap<String,String> dwarves = new HashMap<>();
		
		// put method (key, value)
		dwarves.put("DC", "Doc");
		dwarves.put("SL", "Sleepy");
		dwarves.put("SN", "Sneezy");
		dwarves.put("BA", "Bashful");
		dwarves.put("DO", "Dopey");
		dwarves.put("HA", "Happy");
		dwarves.put("GR", "Grumpy");

		// output everything in list
		System.out.println("List of all Dwarves:");
		for(Map.Entry<String,String> dwarf: dwarves.entrySet()) {
			System.out.println(dwarf.getKey() + "\t" + dwarf.getValue());
		}
		
		// alternate way of printing
		System.out.println("Dwarves: " + dwarves);
		
		// lookup value when given key
		String str = "SN";
		System.out.println("Dwarf SN is " + dwarves.get(str));
		
		System.out.println("Bye~!");
	}

}
