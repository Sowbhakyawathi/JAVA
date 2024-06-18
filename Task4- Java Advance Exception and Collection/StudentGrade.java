package Task4;

import java.util.HashMap;

import java.util.Map;

public class StudentGrade {
	public static void main(String arg[]) {

		HashMap<String, Integer> map = new HashMap<>();

		map.put("Sow", 98);
		map.put("Kavi", 85);
		map.put("Mano", 80);
		map.get(85);

		for (Map.Entry m : map.entrySet()) {
			System.out.println("Add a new student:" + m.getKey() + "; Student Grade:" + m.getValue());
		}
		System.out.println("Display up a student’s grade by name:" + map.get("Sow"));

		System.out.println("Remove a student:" + map.remove("Kavi"));

		System.out.println("Check Kalai:" + map.containsValue("Kavi"));

	}
}
